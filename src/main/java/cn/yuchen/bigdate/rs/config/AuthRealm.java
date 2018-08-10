package cn.yuchen.bigdate.rs.config;

import cn.yuchen.bigdate.rs.sysmanage.controller.SysUserController;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.sysmanage.service.SysPowerService;
import cn.yuchen.bigdate.rs.sysmanage.service.SysRoleService;
import cn.yuchen.bigdate.rs.sysmanage.service.SysUserRoleService;
import cn.yuchen.bigdate.rs.sysmanage.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/**
 * Created by wzx on 2018/8/9.
 */
public class AuthRealm extends AuthorizingRealm {


    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private SysPowerService sysPowerService;

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 认证回调函数,登录时调用
     * 首先根据传入的用户名获取User信息；然后如果user为空，那么抛出没找到帐号异常UnknownAccountException；
     * 如果user找到但锁定了抛出锁定异常LockedAccountException；最后生成AuthenticationInfo信息，
     * 交给间接父类AuthenticatingRealm使用CredentialsMatcher进行判断密码是否匹配，
     * 如果不匹配将抛出密码错误异常IncorrectCredentialsException；
     * 另外如果密码重试此处太多将抛出超出重试次数异常ExcessiveAttemptsException；
     * 在组装SimpleAuthenticationInfo信息时， 需要传入：身份信息（用户名）、凭据（密文密码）、盐（username+salt），
     * CredentialsMatcher使用盐加密传入的明文密码和此处的密文密码进行匹配。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {

//      这里获取的是调用者的username
        String principal = (String) token.getPrincipal();

        // todo 这里是验证 （查库）
//      这里使用DBCache是博客中为了充当数据库的获取
//        UserVo user = Optional.ofNullable(DBCache.USERS_CACHE.get(principal)).orElseThrow(UnknownAccountException::new);

        SysUserVo user =  sysUserService.findSysUserByUsername(principal);
//      这里是我的方法
//        UserVo user = userService.findUserVoById(2);
        //isLocked是否禁用，这个而是博客中的内容，我这里没有
//        if (!user.isLocked()) {
//            throw new LockedAccountException();
//        }
        // 从数据库查询出来的账号名和密码,与用户输入的账号和密码对比
        // 当用户执行登录时,在方法处理上要实现 user.login(token)
        // 然后会自动进入这个类进行认证
        // 交给 AuthenticatingRealm 使用 CredentialsMatcher 进行密码匹配，如果觉得人家的不好可以自定义实现
        // TODO 如果使用 HashedCredentialsMatcher 这里认证方式就要改一下 SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal, "密码", ByteSource.Util.bytes("密码盐"), getName());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal, user.getPassword(), getName());
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("USER_SESSION", user);
        return authenticationInfo;
    }

    /**
     * 只有需要验证权限时才会调用, 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.在配有缓存的情况下，只加载一次.
     * 如果需要动态权限,但是又不想每次去数据库校验,可以存在ehcache中.自行完善
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        Session session = SecurityUtils.getSubject().getSession();
        SysUserVo user = (SysUserVo) session.getAttribute("USER_SESSION");
        //这里用现有的user.id去查询role信息   和   power信息
        List<SysRoleVo> SysRoleVo = sysRoleService.findRolesByUserId(user.getId());
        List<Long> sysRoleIds = new ArrayList<>();
        // 将用户的角色设置到shiro中=========================start
        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 用户的角色集合

        Set<String> roles = new HashSet<>();
        SysRoleVo.forEach(sysRoleVo ->{
            sysRoleIds.add(sysRoleVo.getId());
            roles.add(sysRoleVo.getRoleCode());
        });
        info.setRoles(roles);
        // 用户的角色对应的所有权限，如果只使用角色定义访问权限，下面可以不要
        // 只有角色并没有颗粒度到每一个按钮 或 是操作选项  PERMISSIONS 是可选项
        // 将用户的角色设置到shiro中=========================end (这里因为高亮所以做下笔记 不需要做什么)
        // 将角色的权限设置到shiro中=========================start
        // 这里获取角色对应的权限
        List<SysPowerVo> sysPowerVos = sysPowerService.findPowersByRoleIds(sysRoleIds);
        List<String> permissions = new ArrayList<>();
        sysPowerVos.forEach(sysPowerVo -> {
            permissions.add(sysPowerVo.getPowerCode());
        });
//        final Map<String, Collection<String>> permissionsCache = DBCache.PERMISSIONS_CACHE;
//        final Collection<String> permissions = permissionsCache.get(user.getDesc());
        info.addStringPermissions(permissions);
        //将角色的权限设置到shiro中=========================end(这里因为高亮所以做下笔记 不需要做什么)
        return info;
    }
}

package cn.yuchen.bigdate.rs.config;

import cn.yuchen.bigdate.rs.service.sysmanage.controller.SysUserController;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysPowerService;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysRoleService;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysUserRoleService;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysUserService;
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
        String principal = (String) token.getPrincipal();
        SysUserVo user =  sysUserService.findSysUserByUsername(principal);
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
        List<SysRoleVo> SysRoleVo = sysRoleService.findRolesByUserId(user.getId());
        List<Long> sysRoleIds = new ArrayList<>();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 用户的角色集合
        Set<String> roles = new HashSet<>();
        SysRoleVo.forEach(sysRoleVo ->{
            sysRoleIds.add(sysRoleVo.getId());
            roles.add(sysRoleVo.getRoleCode());
        });
        info.setRoles(roles);
        // 这里获取角色对应的权限
        List<SysPowerVo> sysPowerVos = sysPowerService.findPowersByRoleIds(sysRoleIds);
        List<String> permissions = new ArrayList<>();
        sysPowerVos.forEach(sysPowerVo -> {
            permissions.add(sysPowerVo.getPowerCode());
        });
        info.addStringPermissions(permissions);
        return info;
    }
}

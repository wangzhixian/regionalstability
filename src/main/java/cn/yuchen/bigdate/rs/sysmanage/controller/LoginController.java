package cn.yuchen.bigdate.rs.sysmanage.controller;

import cn.yuchen.bigdate.rs.exception.GlobalExceptionHandler;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by wzx on 2018/8/9.
 */
@RestController
@CrossOrigin
public class LoginController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    /**
     * 用户未登录
     * @return
     */
    @GetMapping("/gologin")
    public ResponseResult<String> goLogin(){
        return new ResponseResult<>(RestResultEnum.USER_NOT_LOGIN,"/login");
    }

    /**
     * 登录成功
     * @return
     */
    @GetMapping("/loginsucces")
    public ResponseResult<String> loginsucces(){
        return new ResponseResult<>("登录成功");
    }

    /**
     * 权限不足
     * @return
     */
    @GetMapping("/denied")
    public ResponseResult<String> denied(){
        return new ResponseResult<>(RestResultEnum.USER_NOT_PERMISSION,"权限不足");
    }


    @PostMapping(value = "/login")
    public ResponseResult<String> login(@RequestBody SysUserVo sysUserVo) {

        // 想要得到 SecurityUtils.getSubject() 的对象．．访问地址必须跟 shiro 的拦截地址内．不然后会报空指针
        Subject sub = SecurityUtils.getSubject();
        // 用户输入的账号和密码,,存到UsernamePasswordToken对象中..然后由shiro内部认证对比,
        // 认证执行者交由 AuthRealm 中 doGetAuthenticationInfo 处理
        // 当以上认证成功后会向下执行,认证失败会抛出异常
        UsernamePasswordToken token = new UsernamePasswordToken(sysUserVo.getUsername(), sysUserVo.getPassword());
        try {
            sub.login(token);
        } catch (UnknownAccountException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,用户不存在", sysUserVo.getUsername());
            token.clear();
            return new ResponseResult<>(RestResultEnum.USER_LOGIN_ERROR,"验证未通过，用户不存在");
        } catch (LockedAccountException lae) {
            log.error("对用户[{}]进行登录验证,验证未通过,账户已锁定", sysUserVo.getUsername());
            token.clear();
            return new ResponseResult<>(RestResultEnum.USER_LOCK_ERROR,"验证未通过,账户已锁定");
        } catch (ExcessiveAttemptsException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,错误次数过多", sysUserVo.getUsername());
            token.clear();
            return new ResponseResult<>(RestResultEnum.USER_LOGIN_ERROR_SIZE,"验证未通过,错误次数过多");
        } catch (AuthenticationException e) {
            log.error("对用户[{}]进行登录验证,验证未通过,堆栈轨迹如下", sysUserVo.getUsername(), e);
            token.clear();
            return new ResponseResult<>(RestResultEnum.LOGIN_ERROR,"验证未通过");
        }
        return new ResponseResult<>("success");
    }

}

package cn.yuchen.bigdate.rs.usermanagement.controller;

import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public ResponseResult<UserVo> findUserVoById(@PathVariable("id") Integer id){
        UserVo userVo = new UserVo();
        try {
            userVo = userService.findUserVoById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseResult<>(userVo);
    }

    @PostMapping("/add")
    public ResponseResult<Boolean> addUser(@RequestBody UserVo userVo){
        if(Objects.isNull(userVo)){
            return new ResponseResult<>(RestResultEnum.ARGUMENT_ERROR.getKey(),"要添加的用户为null");
        }
        try {
            userService.addUserVo(userVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseResult<>(true);
    }
}

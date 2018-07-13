package cn.yuchen.bigdate.rs.usermanagement.controller;

import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;


@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @GetMapping("/getUser/{id}")
    public ResponseResult<UserVo> findUserVoById(@PathVariable("id") Integer id) {

        UserVo userVo = userService.findUserVoById(id);

//      测试redis缓存   start
        String keyStr = "rsName";
        String valueStr = "rsValue";
        log.info("stringRedisTemplate类操作redis缓存存储：key:{},value:{}", keyStr, valueStr);
        stringRedisTemplate.opsForValue().set(keyStr, valueStr);
        log.info("存储成功");
        String redisStr = stringRedisTemplate.opsForValue().get(keyStr);
        log.info("stringRedisTemplate类操作redis缓存获取：redisStr:key:{},value:{}", keyStr, redisStr);
        String keyforObject = "kfo";
        redisCacheTemplate.opsForValue().set(keyforObject, userVo);
        UserVo vo = (UserVo) redisCacheTemplate.opsForValue().get(keyforObject);
        log.info("redisCacheTemplate类操作redis存储对象:userVo:{}", vo);
//      测试redis缓存   end
        return new ResponseResult<>(userVo);
    }


    @PostMapping("/add")
    public ResponseResult<Boolean> addUser(@RequestBody UserVo userVo){
        if (Objects.isNull(userVo)) {
            return new ResponseResult<>(RestResultEnum.ARGUMENT_ERROR.getKey(), "要添加的用户为null");
        }
        userService.addUserVo(userVo);
        return new ResponseResult<>(true);
    }

}

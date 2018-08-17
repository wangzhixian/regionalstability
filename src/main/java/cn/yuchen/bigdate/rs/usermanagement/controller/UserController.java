package cn.yuchen.bigdate.rs.usermanagement.controller;

import cn.yuchen.bigdate.rs.usermanagement.pojo.mogopo.Tagdata;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.service.UserService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping( value = "/user")
@CrossOrigin
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @Autowired
    private SolrClient solrClient;

    @GetMapping("/getUser/{id}")
    public ResponseResult<UserVo> findUserVoById(@PathVariable("id") Integer id) {

        UserVo userVo = userService.findUserVoById(id);

//      测试redis缓存   start
//        String keyStr = "rsName";
//        String valueStr = "rsValue";
//        log.info("stringRedisTemplate类操作redis缓存存储：key:{},value:{}", keyStr, valueStr);
//        stringRedisTemplate.opsForValue().set(keyStr, valueStr);//存字符串
//        log.info("存储成功");
//        String redisStr = stringRedisTemplate.opsForValue().get(keyStr);
//        log.info("stringRedisTemplate类操作redis缓存获取：redisStr:key:{},value:{}", keyStr, redisStr);
//        String keyforObject = "kfo";
//        redisCacheTemplate.opsForValue().set(keyforObject, userVo);//存对象，但是对象必须实现序列化
//        UserVo vo = (UserVo) redisCacheTemplate.opsForValue().get(keyforObject);
//        log.info("redisCacheTemplate类操作redis存储对象:userVo:{}", vo);
//      测试redis缓存   end
        log.info("顺序2");
        return new ResponseResult<>(userVo);
    }

    @GetMapping("/getSolr/{id}")
    public ResponseResult<UserVo> findUserVoFromSolr(@PathVariable("id") Integer id) throws IOException, SolrServerException {
        UserVo userVo = null;
//        SolrDocument userVo1 = solrClient.getById("05c29b76-beb4-4a16-9619-9aff9a7ada64");//根据id获取
        ModifiableSolrParams params =new ModifiableSolrParams();
        params.add("q","userVo:*");
        QueryResponse query = solrClient.query(params);
        log.info("query:{}",query);
        List<UserVo> beans = query.getBeans(UserVo.class);
        log.info("beans:{}",beans);
        if(Objects.isNull(beans)){
            userVo = userService.findUserVoById(id);
            SolrInputDocument doc = new SolrInputDocument();
            doc.setField("wzx",userVo.getUserName());
            solrClient.add(doc);
            solrClient.commit();
        }else {
            userVo = beans.get(0);

        }
        return new ResponseResult<>(userVo);
    }

    @PostMapping("/add")
    public ResponseResult<Boolean> addUser(@RequestBody UserVo userVo){
        userService.addUserVo(userVo);
        return new ResponseResult<>(true);
    }


    @PostMapping("/addDB")
    public ResponseResult<String> addUserForDB(@RequestBody UserVo userVo){
        userService.addUserVoForDB(userVo);
        return new ResponseResult<>("存入MONGODB成功");
    }

    @PostMapping("/findDB")
    public ResponseResult<List<UserPo>> findUserForDB(){
        List<UserPo> userPos = userService.fundUserVoForDB();
        return new ResponseResult<>(userPos);
    }


    @PostMapping("/hello/{s}")
    public ResponseResult<String> sayHello(@PathVariable("s") String s){
        log.info("我被访问了");
        System.out.println(s);
        String result = "我是测试接口,接受了参数："+ s;
        return new ResponseResult<>(result);
    }

    @PostMapping("/findalldb")
    public ResponseResult<Page<Tagdata>> findAllDB(){
        log.info("我被访问了");
        Page<Tagdata> db = userService.findDB();
        return new ResponseResult<>(db);
    }

}

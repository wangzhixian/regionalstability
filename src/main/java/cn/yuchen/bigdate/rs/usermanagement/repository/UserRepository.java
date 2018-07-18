package cn.yuchen.bigdate.rs.usermanagement.repository;

import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * mongodb
 * 继承MongoRepository类实现了基本的CURD功能。
 * 如果想自定义一些查询，比如根据firstName查询，只需要定义一个方法即可。
 * 注意firstName严格按照存入的mongodb的字段对应。
 * 在典型的java的应用程序，写这样一个接口的方法，需要自己实现，但是在springboot中，你只需要按照格式写一个接口名和对应的参数就可以了，因为springboot已经帮你实现了。
 * Created by wzx on 2018/7/17.
 */
public interface UserRepository extends MongoRepository<UserPo,String> {

    UserPo findByUserName(String UserName);

    List<UserPo> findFirstByUserName(String UserName);
}

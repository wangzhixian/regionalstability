package cn.yuchen.bigdate.rs.usermanagement.repository.impl;

import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * Created by wzx on 2018/7/17.
 */
@Component
public class UserRepImpl implements UserRep {
    /**
     * mongodb的基本操作类
     */
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void savaUser(UserPo userPo) {
        mongoTemplate.save(userPo);
    }
}

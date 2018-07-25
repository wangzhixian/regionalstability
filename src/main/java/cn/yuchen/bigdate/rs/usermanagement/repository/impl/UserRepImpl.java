package cn.yuchen.bigdate.rs.usermanagement.repository.impl;

import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import cn.yuchen.bigdate.rs.usermanagement.pojo.vo.UserVo;
import cn.yuchen.bigdate.rs.usermanagement.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.util.List;

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

    @Override
    public UserPo getUserPo() {
        Query query = new Query();
        Criteria criteria = Criteria.where("userName").is("wzx");
        query.addCriteria(criteria);
        return  mongoTemplate.findOne(query, UserPo.class);
    }
}

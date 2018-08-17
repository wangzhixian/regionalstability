package cn.yuchen.bigdate.rs.usermanagement.repository;

import cn.yuchen.bigdate.rs.usermanagement.pojo.mogopo.Tagdata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by wzx on 2018/8/14.
 */
public interface TestRepository extends MongoRepository<Tagdata,String> {

}

package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.utility.PageUtils;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by wzx on 2018/8/16.
 */
public interface NewsRepository extends MongoRepository<Tagdata,ObjectId> {

//    ".*?\\" 要查询的字段 ".*"
    @Query("{'attr.area':{'$regex':?0}}")
    Page<Tagdata> findByAreaLike(String area,Pageable pageable);


//    (>) 大于 - $gt
//    (<) 小于 - $lt
//    (>=) 大于等于 - $gte
//    (<= ) 小于等于 - $lte
    @Query("{'attr.area':{'$regex':?0},'attr.publicDateTime':{'$gte':?1,'$lte':?2}}")
    List<Tagdata> findByAreaAndTime(String area, String startTime, String endTime);
}

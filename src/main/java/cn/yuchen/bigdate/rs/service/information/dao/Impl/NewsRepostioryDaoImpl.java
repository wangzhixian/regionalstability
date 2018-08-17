package cn.yuchen.bigdate.rs.service.information.dao.Impl;

import cn.yuchen.bigdate.rs.service.information.dao.NewsRepositoryDao;
import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import cn.yuchen.bigdate.rs.usermanagement.pojo.po.UserPo;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/17.
 */
@Component
public class NewsRepostioryDaoImpl implements NewsRepositoryDao {
    /**
     * mongodb的基本操作类
     */
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public List<Tagdata> findByNewsWebPage(NewsWeb newsWeb) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        Pageable pageable =PageRequest.of(newsWeb.getPageNum()-1,newsWeb.getPageSize());
        Criteria gteAndLte =null;
        if(Objects.nonNull(newsWeb.getStartTime())&&Objects.nonNull(newsWeb.getEndTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").gte(newsWeb.getStartTime()).lte(newsWeb.getEndTime());
            criteria.andOperator(
                    Criteria.where("attr.area").regex(newsWeb.getArea()),
                    gteAndLte);
        }else if(Objects.nonNull(newsWeb.getStartTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").gte(newsWeb.getStartTime());
            criteria.andOperator(
                    Criteria.where("attr.area").regex(newsWeb.getArea()),
                    gteAndLte);
        }else if(Objects.nonNull(newsWeb.getEndTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").lte(newsWeb.getEndTime());
            criteria.andOperator(
                    Criteria.where("attr.area").regex(newsWeb.getArea()),
                    gteAndLte);
        }else{
            criteria = Criteria.where("attr.area").regex(newsWeb.getArea());
        }
        query.addCriteria(criteria);
        query.with(pageable);
        return  mongoTemplate.find(query, Tagdata.class);
    }

    @Override
    public Tagdata findByObjectId(ObjectId id) {
        return mongoTemplate.findById(id,Tagdata.class);
    }

    @Override
    public UpdateResult update(Tagdata tagdata) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(tagdata.getId()));
        Update update = new Update();
        update.set("entity",tagdata.getEntity());
        update.set("tagging",tagdata.getTagging());
        update.set("attr",tagdata.getAttr());
        return mongoTemplate.updateMulti(query, update, Tagdata.class);
    }


}

package cn.yuchen.bigdate.rs.service.information.dao.Impl;

import cn.yuchen.bigdate.rs.service.information.dao.NewsRepositoryDao;
import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.NewsWeb;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

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
        initFind(newsWeb, query, criteria);
        query.with(pageable);
        return  mongoTemplate.find(query, Tagdata.class);
    }

    private void initFind(NewsWeb newsWeb, Query query, Criteria criteria) {
        Criteria gteAndLte =null;

        if(Objects.nonNull(newsWeb.getStartTime())&&Objects.nonNull(newsWeb.getEndTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").gte(newsWeb.getStartTime()).lte(newsWeb.getEndTime());
            criteria.andOperator(
                    Criteria.where("attr.region").regex(newsWeb.getArea()),
                    gteAndLte);
        }else if(Objects.nonNull(newsWeb.getStartTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").gte(newsWeb.getStartTime());
            criteria.andOperator(
                    Criteria.where("attr.region").regex(newsWeb.getArea()),
                    gteAndLte);
        }else if(Objects.nonNull(newsWeb.getEndTime())){
            gteAndLte = Criteria.where("attr.publicDateTime").lte(newsWeb.getEndTime());
            criteria.andOperator(
                    Criteria.where("attr.region").regex(newsWeb.getArea()),
                    gteAndLte);
        }else{
            criteria = Criteria.where("attr.region").regex(newsWeb.getArea());
        }
        if(Objects.nonNull(newsWeb.getStatus())){
            criteria.andOperator(
                    Criteria.where("attr.status").is(newsWeb.getStatus()));
        }
        query.addCriteria(criteria);
    }

    @Override
    public Tagdata findById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("attr.news_id").is(id);
        query.addCriteria(criteria);
        return  mongoTemplate.findOne(query,Tagdata.class);
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

    @Override
    public UpdateResult updateById(String id, Integer status) {
        Query query = Query.query(Criteria.where("attr.news_id").is(id));
        Update update = Update.update("attr.status",status);
        return mongoTemplate.updateFirst(query, update, Tagdata.class);
    }

    @Override
    public Long findAll(NewsWeb newsWeb) {
        Query query = new Query();
        Criteria criteria = new Criteria();
        initFind(newsWeb, query, criteria);
        return mongoTemplate.count(query, Tagdata.class);
    }


}

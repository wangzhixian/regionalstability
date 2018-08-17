package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.service.information.dao.NewsRepositoryDao;
import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import cn.yuchen.bigdate.rs.service.information.service.NewsInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wzx on 2018/8/16.
 */
@Service
public class NewsInformationServiceImpl implements NewsInformationService {


    @Autowired
    private NewsRepositoryDao newsRepositoryDao;


    @Override
    public List<Tagdata> findByNewsWebPage(NewsWeb newsWeb) {
        AssertUtils.notNull(newsWeb,"查询对象不能为空");
        List<Tagdata> tagdata = newsRepositoryDao.findByNewsWebPage(newsWeb);
        return tagdata;
    }

    @Override
    public Tagdata findByObjectId(ObjectId id) {
        AssertUtils.notNull(id,"查询id对象不能为空");
        return newsRepositoryDao.findByObjectId(id);
    }

    @Override
    public UpdateResult update(Tagdata tagdata) {
        AssertUtils.notNull(tagdata,"修改对象不能为空");
        AssertUtils.notNull(tagdata.getAttr(),"修改对象不能为空");
        AssertUtils.notNull(tagdata.getEntity(),"修改对象不能为空");
        AssertUtils.notNull(tagdata.getTagging(),"修改对象不能为空");
        tagdata.getAttr().setStatus(1);
        return newsRepositoryDao.update(tagdata);
    }
}

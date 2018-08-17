package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

/**
 * Created by wzx on 2018/8/17.
 */
public interface NewsRepositoryDao {

    /**
     * 根据国家、时间范围 分页查询新闻
     * @param newsWeb
     * @return
     */
    List<Tagdata> findByNewsWebPage(NewsWeb newsWeb);

    /**
     * 根据ObjectId查询
     * @param id
     * @return
     */
    Tagdata findByObjectId(ObjectId id);

    /**
     * 修改
     * @param tagdata
     * @return
     */
    UpdateResult update(Tagdata tagdata);


}

package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.NewsWeb;
import com.mongodb.client.result.UpdateResult;

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
     * 根据Id查询
     * @param id
     * @return
     */
    Tagdata findById(String id);

    /**
     * 修改
     * @param tagdata
     * @return
     */
    UpdateResult update(Tagdata tagdata);

    /**
     * 根据nues_id修改状态
     * @param id
     */
    UpdateResult updateById(String id, Integer status);

    /**
     * 查询总数
     * @return
     */
    Long findAll(NewsWeb newsWeb);


}

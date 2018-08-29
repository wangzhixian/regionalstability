package cn.yuchen.bigdate.rs.service.information.service;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.NewsPageVo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.NewsWeb;
import com.mongodb.client.result.UpdateResult;

/**
 * Created by wzx on 2018/8/16.
 */
public interface NewsInformationService {

    /**
     * 通过国家,时间范围  分页查询新闻
     * @param newsWeb
     * @return
     */
    NewsPageVo findByNewsWebPage(NewsWeb newsWeb);

    /**
     * 根据id  查询对象
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
     * 通过news_id修改状态为1
     * @param id
     */
    UpdateResult updateOneById(String id);

    /**
     * 通过news_id修改状态为2
     * @param id
     */
    UpdateResult updateTwoById(String id);
}

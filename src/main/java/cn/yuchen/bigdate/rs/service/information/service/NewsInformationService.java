package cn.yuchen.bigdate.rs.service.information.service;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by wzx on 2018/8/16.
 */
public interface NewsInformationService {
    /**
     * 分页查询新闻信息
     * @param newsWeb
     * @return
     */
    Page<Tagdata> findByPage(NewsWeb newsWeb);

    /**
     * 通过国家查询
     * @param newsWeb
     * @return
     */
    List<Tagdata> findByArea(NewsWeb newsWeb);
}

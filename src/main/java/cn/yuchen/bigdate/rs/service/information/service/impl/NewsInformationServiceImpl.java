package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.service.information.dao.NewsRepository;
import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import cn.yuchen.bigdate.rs.service.information.service.NewsInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/16.
 */
@Service
public class NewsInformationServiceImpl implements NewsInformationService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public Page<Tagdata> findByPage(NewsWeb newsWeb) {
        PageRequest pageRequest = PageRequest.of(newsWeb.getPageNum()-1, newsWeb.getPageSize());
        Page<Tagdata> tagdatas = newsRepository.findByAreaLike(newsWeb.getArea(),pageRequest);
        return tagdatas;
    }

    @Override
    public List<Tagdata> findByArea(NewsWeb newsWeb) {
        AssertUtils.notNull(newsWeb,"查询对象不能为空");
        List<Tagdata> byAreaAndTime = newsRepository.findByAreaAndTime(newsWeb.getArea(), newsWeb.getStartTime(), newsWeb.getEndTime());
        return byAreaAndTime;
    }
}

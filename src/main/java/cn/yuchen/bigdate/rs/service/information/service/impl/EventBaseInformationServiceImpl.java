package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.service.information.dao.EventBaseDao;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzx on 2018/8/24.
 */
@Service
public class EventBaseInformationServiceImpl implements EventBaseInformationService {
    @Autowired
    private EventBaseDao eventBaseDao;


    @Override
    public int add(EventBasePoWithBLOBs eventBasePoWithBLOBs) {
        AssertUtils.notNull(eventBasePoWithBLOBs,"添加原新闻对象不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getNid(),"新闻关联nid不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getEventName(),"事件名称不能为空");
        AssertUtils.greaterThanZero(eventBasePoWithBLOBs.getCountryId(),"国家ID不能为空");
        AssertUtils.notNull(eventBasePoWithBLOBs.getType(),"事件类型不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getLongitude(),"经度不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getLatitude(),"纬度不能为空");
        return eventBaseDao.insert(eventBasePoWithBLOBs);
    }

    @Override
    public EventBasePoWithBLOBs findByNid(String nid) {
        AssertUtils.hasText(nid,"查询源新闻ID不能为空");
        return eventBaseDao.selectByNid(nid);
    }


    @Override
    public int update(EventBasePoWithBLOBs eventBasePoWithBLOBs) {
        AssertUtils.notNull(eventBasePoWithBLOBs,"添加原新闻对象不能为空");
        AssertUtils.greaterThanZero(eventBasePoWithBLOBs.getId(),"主键ID不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getNid(),"新闻关联nid不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getEventName(),"事件名称不能为空");
        AssertUtils.greaterThanZero(eventBasePoWithBLOBs.getCountryId(),"国家ID不能为空");
        AssertUtils.notNull(eventBasePoWithBLOBs.getType(),"事件类型不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getLongitude(),"经度不能为空");
        AssertUtils.hasText(eventBasePoWithBLOBs.getLatitude(),"纬度不能为空");
        return eventBaseDao.updateByPrimaryKeySelective(eventBasePoWithBLOBs);
    }
}

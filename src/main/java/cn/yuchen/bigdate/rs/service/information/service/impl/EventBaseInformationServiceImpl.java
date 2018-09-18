package cn.yuchen.bigdate.rs.service.information.service.impl;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.information.dao.EventBaseDao;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePo;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.EventBaseVo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.EventBasePage;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        EventBasePoWithBLOBs flag = eventBaseDao.selectByNid(eventBasePoWithBLOBs.getNid());
        AssertUtils.isNull(flag,"该数据已存在");
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

    @Override
    public List<EventBaseVo> findByPage(EventBasePage eventBasePage) {
        if(Objects.isNull(eventBasePage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(eventBasePage.getPageNum(),eventBasePage.getPageSize());
        return eventBaseDao.selectByPage(eventBasePage);
    }



    @Override
    public EventBasePoWithBLOBs findById(Long id) {
        return eventBaseDao.selectByPrimaryKey(id);
    }

    @Override
    public int findTotal(Byte type) {

        return eventBaseDao.findTotalNumber(type);
    }

    @Override
    public List<EventBasePoWithBLOBs> findAllByType(EventBasePage eventBasePage) {
        PageHelper.startPage(eventBasePage.getPageNum(),eventBasePage.getPageSize());
        return eventBaseDao.selectAllForType(eventBasePage);
    }
}

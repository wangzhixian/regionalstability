package cn.yuchen.bigdate.rs.web.analyze.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.EventBaseVo;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.NewsPageVo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.EventBasePage;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.NewsWeb;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.service.information.service.NewsInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/9/3.
 */
@RestController
@RequestMapping("/event")
@CrossOrigin
public class EventController {

    @Autowired
    private EventBaseInformationService eventBaseInformationService;

    /**
     * 根据ID批量修改 事件 的起始时间，结束时间
     * @param eventWeb
     * @return
     */
    @PostMapping("/updatetime")
    public ResponseResult<Boolean> updateTime(@RequestBody EventWeb eventWeb) {
        AssertUtils.notNull(eventWeb,"参数对象不能为空");
        AssertUtils.notNull(eventWeb.getIds(),"ids组不能为空");
        AssertUtils.notNull(eventWeb.getEventTime(),"开始时间不能为空");
        AssertUtils.notNull(eventWeb.getEndTime(),"结束时间不能为空");
        eventWeb.getIds().forEach(id->{
            EventBasePoWithBLOBs eventBasePoWithBLOBs = eventBaseInformationService.findById(id);
            eventBasePoWithBLOBs.setEventTime(eventWeb.getEventTime());
            eventBasePoWithBLOBs.setEndTime(eventWeb.getEndTime());
            eventBaseInformationService.update(eventBasePoWithBLOBs);
        });
        return new ResponseResult<>(true);
    }

    @PostMapping("/updatetype")
    public ResponseResult<Boolean> updateType(@RequestBody EventWeb eventWeb) {
        AssertUtils.notNull(eventWeb,"参数对象不能为空");
        AssertUtils.notNull(eventWeb.getIds(),"ids组不能为空");
        AssertUtils.notNull(eventWeb.getType(),"事件类型不能为空");
        eventWeb.getIds().forEach(id->{
            EventBasePoWithBLOBs eventBasePoWithBLOBs = eventBaseInformationService.findById(id);
            eventBasePoWithBLOBs.setType(eventWeb.getType());
            eventBaseInformationService.update(eventBasePoWithBLOBs);
        });
        return new ResponseResult<>(true);
    }

    @PostMapping("/updatebyid")
    public ResponseResult<Boolean> updateById(@RequestBody EventWeb eventWeb) {
        AssertUtils.notNull(eventWeb,"参数对象不能为空");
        AssertUtils.notNull(eventWeb.getIds(),"ids组不能为空");
        eventWeb.getIds().forEach(id->{
            EventBasePoWithBLOBs eventBasePoWithBLOBs = eventBaseInformationService.findById(id);
            eventBasePoWithBLOBs.setEventName(eventWeb.getEventName());
            eventBasePoWithBLOBs.setEventTime(eventWeb.getEventTime());
            eventBasePoWithBLOBs.setEndTime(eventWeb.getEndTime());
            eventBasePoWithBLOBs.setRelevants(eventWeb.getRelevants());
            eventBasePoWithBLOBs.setSites(eventWeb.getSites());
            eventBaseInformationService.update(eventBasePoWithBLOBs);
        });
        return new ResponseResult<>(true);
    }


    /**
     * 分页条件查询
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<EventBaseVo>> findByPage(@RequestBody EventBasePage eventBasePage) {
        List<EventBaseVo> eventBaseVos = eventBaseInformationService.findByPage(eventBasePage);
        //使用PageInfo对查询结果进行封装
        return new ResponseResult<>(new PageInfo<>(eventBaseVos));
    }



}

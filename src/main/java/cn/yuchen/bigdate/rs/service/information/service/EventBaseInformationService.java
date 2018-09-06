package cn.yuchen.bigdate.rs.service.information.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.EventBaseVo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.EventBasePage;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;

import java.util.List;

/**
 * Created by wzx on 2018/8/24.
 */
public interface EventBaseInformationService {

    int add(EventBasePoWithBLOBs eventBasePoWithBLOBs);

    EventBasePoWithBLOBs findByNid(String nid);

    int update(EventBasePoWithBLOBs eventBasePoWithBLOBs);

    List<EventBaseVo> findByPage(EventBasePage eventBasePage);

    //int updateEvent(EventWeb eventWeb);

    EventBasePoWithBLOBs findById(Long id);


}

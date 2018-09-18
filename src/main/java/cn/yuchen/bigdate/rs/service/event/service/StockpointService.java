package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.StockpointVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.StockpointPage;

import java.util.List;

public interface StockpointService {

    List<StockpointVo> findByPage(StockpointPage stockpointPage);
}

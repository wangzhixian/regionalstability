package cn.yuchen.bigdate.rs.service.event.dao;


import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.StockpointVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.StockpointPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StockpointDao {

    List<StockpointVo> selectByPage(StockpointPage stockpointPage);

}
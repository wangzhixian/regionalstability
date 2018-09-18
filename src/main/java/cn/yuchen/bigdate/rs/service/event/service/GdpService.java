package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;

import java.util.List;

public interface GdpService {

    List<GdpVo> findByPage(GdpPage gdpPage);
}

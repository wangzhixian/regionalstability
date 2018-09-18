package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.CpiVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.CpiPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;

import java.util.List;

public interface CpiService {

    List<CpiVo> findByPage(CpiPage cpiPage);
}

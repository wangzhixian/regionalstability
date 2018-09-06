package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;

import java.util.List;

public interface GsvAreaService {

    int add(GsvAreaVo gsvAreaVo);

    int delete(Integer id);

    int update(GsvAreaVo gsvAreaVo);

    GsvAreaVo findById(Integer id);

    List<GsvAreaVo> findByPage(GsvAreaPage gsvAreaPage);

}

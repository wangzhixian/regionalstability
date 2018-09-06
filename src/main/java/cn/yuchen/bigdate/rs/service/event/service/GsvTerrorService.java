package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;

import java.util.List;

public interface GsvTerrorService {

    int add(GsvTerrorVo gsvTerrorVo);

    int delete(Integer id);

    int update(GsvTerrorVo gsvTerrorVo);

    GsvTerrorVo findById(Integer id);

    List<GsvTerrorVo> findByPage(GsvTerrorPage gsvTerrorPage);
}

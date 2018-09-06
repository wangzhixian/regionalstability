package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;

import java.util.List;

public interface GsvWeaponService {

    int add(PoliticsAreaVo politicsAreaVo);

    int delete(Integer id);

    int update(PoliticsAreaVo politicsAreaVo);

    PoliticsAreaVo findById(Integer id);

    List<PoliticsAreaVo> findByPage(PoliticsAreaPage politicsAreaPage);

}

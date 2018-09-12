package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

public interface GsvAreaService {

    int add(GsvAreaVo gsvAreaVo);

    int delete(Integer id);

    int update(GsvAreaVo gsvAreaVo);

    GsvAreaVo findById(Integer id);

    List<GsvAreaVo> findByPage(GsvAreaPage gsvAreaPage);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean deleteByIds(List<Integer> ids);

    /**
     * 批量修改
     * @param politicsWeb
     */
    void updateWeaponByIds(PoliticsWeb politicsWeb);

}

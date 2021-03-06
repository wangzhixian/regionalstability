package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

public interface GsvTerrorService {

    int add(GsvTerrorVo gsvTerrorVo);

    int delete(Integer id);

    int update(GsvTerrorVo gsvTerrorVo);

    GsvTerrorVo findById(Integer id);

    List<GsvTerrorVo> findByPage(GsvTerrorPage gsvTerrorPage);

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

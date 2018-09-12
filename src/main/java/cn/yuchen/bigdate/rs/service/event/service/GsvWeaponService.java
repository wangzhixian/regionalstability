package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

public interface GsvWeaponService {

    int add(GsvWeaponVo gsvWeaponVo);

    int delete(Integer id);

    int update(GsvWeaponVo gsvWeaponVo);

    GsvWeaponVo findById(Integer id);

    List<GsvWeaponVo> findByPage(GsvWeaponPage gsvWeaponPage);

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

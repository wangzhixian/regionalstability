package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsReligionService {

    int add(PoliticsReligionVo politicsReligionVo);

    int delete(Integer id);

    int update(PoliticsReligionVo politicsReligionVo);

    PoliticsReligionVo findById(Integer id);

    List<PoliticsReligionVo> findByPage(PoliticsReligionPage politicsReligionPage);

    /**
     * 根据id组批量删除  宗教组织
     * @param ids
     * @return
     */
    boolean deleteByIds(List<Integer> ids);

    /**
     * 根据id组批量修改  宗教组织 等级
     * @param politicsWeb
     */
    void updateReligionByIds(PoliticsWeb politicsWeb);
}

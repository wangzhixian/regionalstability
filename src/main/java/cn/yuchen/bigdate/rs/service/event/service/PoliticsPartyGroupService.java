package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPartyGroupPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsPartyGroupService {

    int add(PoliticsPartyGroupVo politicsPartyGroupVo);

    int delete(Integer id);

    int update(PoliticsPartyGroupVo politicsPartyGroupVo);

    PoliticsPartyGroupVo findById(Integer id);

    List<PoliticsPartyGroupVo> findByPage(PoliticsPartyGroupPage politicsPartyGroupPage);

    /**
     * 根据id组批量删除 政府及政党
     * @param ids
     * @return
     */
    boolean deleteByIds(List<Integer> ids);

    /**
     * 根据id组批量修改 政府及政党 等级
     * @param politicsWeb
     */
    void updatePartyGroupByIds(PoliticsWeb politicsWeb);
}

package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPersonPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsPersonService {

    int add(PoliticsPersonVo politicsPersonVo);

    int delete(Integer id);

    int update(PoliticsPersonVo politicsPersonVo);

    PoliticsPersonVo findById(Integer id);

    List<PoliticsPersonVo> findByPage(PoliticsPersonPage politicsPersonPage);

    /**
     * 根据id组批量删除 政治人物
     * @param ids
     * @return
     */
    boolean deleteByIds(List<Integer> ids);

    /**
     * 根据id组批量修改 政治人物 等级
     * @param politicsWeb
     */
    void updatePersonByIds(PoliticsWeb politicsWeb);
}

package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsAreaService {

    int add(PoliticsAreaVo politicsAreaVo);

    int delete(Integer id);

    int update(PoliticsAreaVo politicsAreaVo);

    PoliticsAreaVo findById(Integer id);

    List<PoliticsAreaVo> findByPage(PoliticsAreaPage politicsAreaPage);

    /**
     * 根据id组批量删除 行政区域
     * @param ids
     * @return
     */
    boolean deleteByIds(List<Integer> ids);

    /**
     * 根据id组批量修改 行政区域  等级
     * @param politicsWeb
     */
    void updateAreaByIds(PoliticsWeb politicsWeb);
}

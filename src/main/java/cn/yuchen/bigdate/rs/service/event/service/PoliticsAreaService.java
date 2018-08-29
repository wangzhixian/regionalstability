package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;

import java.util.List;

/**
 * Created by wzx on 2018/8/29.
 */
public interface PoliticsAreaService {
    int add(PoliticsAreaVo politicsAreaVo);

    int delete(Integer id);

    int update(PoliticsAreaVo politicsAreaVo);

    PoliticsAreaVo findById(Integer id);

    List<PoliticsAreaVo> findByPage(PoliticsAreaPage politicsAreaPage);
}

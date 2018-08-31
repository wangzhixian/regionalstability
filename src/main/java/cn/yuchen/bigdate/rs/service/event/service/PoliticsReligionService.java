package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;

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
}

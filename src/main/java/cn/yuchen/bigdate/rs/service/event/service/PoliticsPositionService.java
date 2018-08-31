package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPositionPage;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsPositionService {

    int add(PoliticsPositionVo politicsPositionVo);

    int delete(Integer id);

    int update(PoliticsPositionVo politicsPositionVo);

    PoliticsPositionVo findById(Integer id);

    List<PoliticsPositionVo> findByPage(PoliticsPositionPage politicsPositionPage);
}

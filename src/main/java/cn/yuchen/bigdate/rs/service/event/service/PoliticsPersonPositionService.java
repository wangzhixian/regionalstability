package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsPersonPositionService {

    int add(PoliticsPersonPositionVo politicsPersonPositionVo);

    int delete(Integer id);

    int update(PoliticsPersonPositionVo politicsPersonPositionVo);

    PoliticsPersonPositionVo findById(Integer id);

    //List<PoliticsDepartmentVo> findByPage(PoliticsDepartmentVo politicsDepartmentVo);
}

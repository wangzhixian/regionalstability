package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsDepartmentService {

    int add(PoliticsDepartmentVo politicsDepartmentVo);

    int delete(Integer id);

    int update(PoliticsDepartmentVo politicsDepartmentVo);

    PoliticsDepartmentVo findById(Integer id);

    List<PoliticsDepartmentVo> findByPage(PoliticsDepartmentPage politicsDepartmentPage);
}

package cn.yuchen.bigdate.rs.service.event.service;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GradeVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;

import java.util.List;

/**
 * Created by wzx on 2018/9/11.
 */
public interface GradeService {

    int add(GradeVo gradeVo);

    int delete(Integer id);

    int update(GradeVo gradeVo);

    GradeVo findById(Integer id);

    List<GradeVo> findByPage(PoliticsWeb politicsWeb);
}

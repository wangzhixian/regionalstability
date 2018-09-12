package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GradePo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GradeVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GradeDao {

    int insert(GradePo record);

    int delete(Integer id);

    int update(GradePo record);

    GradeVo selectById(Integer id);

    GradeVo selectByDimensionalityAndLevel(@Param("dimensionality") Integer dimensionality, @Param("level") Integer level);

    List<GradeVo> selectByPage(PoliticsWeb politicsWeb);

}
package cn.yuchen.bigdate.rs.service.model.dao;

import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelModulePo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelModuleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelModuleDao {

    int insert(ModelModulePo record);

    int deleteByPrimaryKey(Long id);

    int update(ModelModulePo record);

    List<ModelModuleVo> selectByPage(ModelPageVo modelPageVo);

    List<ModelModulePo> selectAll();
}
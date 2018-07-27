package cn.yuchen.bigdate.rs.model.dao;

import cn.yuchen.bigdate.rs.model.pojo.po.ModelModulePo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelModuleDao {
    int deleteByPrimaryKey(Long id);

    int insert(ModelModulePo record);

    int insertSelective(ModelModulePo record);

    ModelModulePo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModelModulePo record);

    int updateByPrimaryKey(ModelModulePo record);
}
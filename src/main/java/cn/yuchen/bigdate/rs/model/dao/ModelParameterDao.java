package cn.yuchen.bigdate.rs.model.dao;

import cn.yuchen.bigdate.rs.model.pojo.po.ModelParameterPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelParameterDao {
    int deleteByPrimaryKey(Long id);

    int insert(ModelParameterPo record);

    int insertSelective(ModelParameterPo record);

    ModelParameterPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModelParameterPo record);

    int updateByPrimaryKey(ModelParameterPo record);
}
package cn.yuchen.bigdate.rs.model.dao;

import cn.yuchen.bigdate.rs.model.pojo.po.ModelMethodPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelMethodDao {
    int deleteByPrimaryKey(Long id);

    int insert(ModelMethodPo record);

    int insertSelective(ModelMethodPo record);

    ModelMethodPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ModelMethodPo record);

    int updateByPrimaryKey(ModelMethodPo record);
}
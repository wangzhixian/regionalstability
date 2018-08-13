package cn.yuchen.bigdate.rs.service.model.dao;

import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelParameterPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModelParameterDao {

    int insert(ModelParameterPo record);

    int delete(Long id);

    int update(ModelParameterPo record);

    ModelParameterPo selectById(Long id);

}
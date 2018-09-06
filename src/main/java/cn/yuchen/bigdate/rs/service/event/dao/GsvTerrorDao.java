package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GsvTerrorDao{

    int deleteByPrimaryKey(Integer id);

    int insert(GsvTerrorPo record);

    int insertSelective(GsvTerrorPo record);

    GsvTerrorPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GsvTerrorPo record);

    int updateByPrimaryKey(GsvTerrorPo record);
}
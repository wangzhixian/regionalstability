package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPositionPo;

public interface PoliticsPositionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPositionPo record);

    int insertSelective(PoliticsPositionPo record);

    PoliticsPositionPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPositionPo record);

    int updateByPrimaryKey(PoliticsPositionPo record);
}
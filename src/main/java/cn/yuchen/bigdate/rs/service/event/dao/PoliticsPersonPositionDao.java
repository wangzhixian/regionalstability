package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;

public interface PoliticsPersonPositionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPersonPositionPo record);

    int insertSelective(PoliticsPersonPositionPo record);

    PoliticsPersonPositionPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPersonPositionPo record);

    int updateByPrimaryKey(PoliticsPersonPositionPo record);
}
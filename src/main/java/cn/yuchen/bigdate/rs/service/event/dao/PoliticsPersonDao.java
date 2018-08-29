package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;

public interface PoliticsPersonDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPersonPo record);

    int insertSelective(PoliticsPersonPo record);

    PoliticsPersonPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPersonPo record);

    int updateByPrimaryKey(PoliticsPersonPo record);
}
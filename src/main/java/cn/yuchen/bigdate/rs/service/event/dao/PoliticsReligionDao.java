package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsReligionPo;

public interface PoliticsReligionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsReligionPo record);

    int insertSelective(PoliticsReligionPo record);

    PoliticsReligionPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsReligionPo record);

    int updateByPrimaryKey(PoliticsReligionPo record);
}
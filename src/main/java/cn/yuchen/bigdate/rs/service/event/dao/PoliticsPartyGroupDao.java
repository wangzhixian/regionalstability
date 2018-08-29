package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;

public interface PoliticsPartyGroupDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPartyGroupPo record);

    int insertSelective(PoliticsPartyGroupPo record);

    PoliticsPartyGroupPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPartyGroupPo record);

    int updateByPrimaryKey(PoliticsPartyGroupPo record);
}
package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsDepartmentPo;

public interface PoliticsDepartmentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsDepartmentPo record);

    int insertSelective(PoliticsDepartmentPo record);

    PoliticsDepartmentPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsDepartmentPo record);

    int updateByPrimaryKey(PoliticsDepartmentPo record);
}
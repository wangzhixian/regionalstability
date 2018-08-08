package cn.yuchen.bigdate.rs.sysmanage.dao;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysPowerPo;

public interface SysPowerDao{

    int insert(SysPowerPo record);

    int delete(Long id);

    int update(SysPowerPo record);

    SysPowerPo selectByPrimaryKey(Long id);
}
package cn.yuchen.bigdate.rs.sysmanage.dao;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysRolePowerPo;

public interface SysRolePowerDao {

    int insert(SysRolePowerPo record);

    int delete(Long id);

    int update(SysRolePowerPo record);

    SysRolePowerPo selectByPrimaryKey(Long id);

}
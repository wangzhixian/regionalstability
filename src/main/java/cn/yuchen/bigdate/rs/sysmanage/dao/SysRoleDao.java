package cn.yuchen.bigdate.rs.sysmanage.dao;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysRolePo;

public interface SysRoleDao {

    int insert(SysRolePo record);

    int update(SysRolePo record);

    int delete(Long id);

    SysRolePo selectByPrimaryKey(Long id);
}
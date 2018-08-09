package cn.yuchen.bigdate.rs.sysmanage.dao;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysUserRolePo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRoleDao {

    int insert(SysUserRolePo record);

    int delete(Long id);

    int update(SysUserRolePo record);

    SysUserRolePo selectByPrimaryKey(Long id);

}
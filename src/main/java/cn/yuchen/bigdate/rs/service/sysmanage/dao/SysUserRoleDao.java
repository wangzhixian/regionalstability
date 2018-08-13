package cn.yuchen.bigdate.rs.service.sysmanage.dao;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysUserRolePo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserRoleDao {

    int insert(SysUserRolePo record);

    //删除用户下所有角色的关系
    int deleteByUserId(Long id);

    //查询用户下所有角色的关系
    List<SysUserRoleVo> selectByUserId(Long id);

    int update(SysUserRolePo record);

    SysUserRolePo selectByPrimaryKey(Long id);

}
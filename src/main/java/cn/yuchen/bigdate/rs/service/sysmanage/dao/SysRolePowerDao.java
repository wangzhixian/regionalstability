package cn.yuchen.bigdate.rs.service.sysmanage.dao;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysRolePowerPo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRolePowerVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRolePowerDao {

    int insert(SysRolePowerPo record);

    /**
     * 逻辑删除角色下所有权限关系
     * @param id
     * @return
     */
    int deleteByRoleId(Long id);

    /**
     * 查询角色下所有权限关系
     * @param id
     * @return
     */
    List<SysRolePowerVo> selectByRoleId(Long id);


    SysRolePowerPo selectByPrimaryKey(Long id);

}
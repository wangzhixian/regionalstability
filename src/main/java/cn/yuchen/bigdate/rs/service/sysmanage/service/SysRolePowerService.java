package cn.yuchen.bigdate.rs.service.sysmanage.service;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRolePowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
public interface SysRolePowerService {
    //只给增删查的操作

    int add(SysRolePowerVo sysRolePowerVo);

    /**
     * 逻辑删除角色下所有权限的关系
     * @param id
     * @return
     */
    int deleteByRoleId(Long id);

    /**
     * 查询角色下所有权限的关系
     * @param id
     * @return
     */
    List<SysRolePowerVo> findByRoleId(Long id);
}

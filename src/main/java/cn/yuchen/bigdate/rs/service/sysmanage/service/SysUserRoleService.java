package cn.yuchen.bigdate.rs.service.sysmanage.service;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
public interface SysUserRoleService {
    //只给增删查操作

    int add(SysUserRoleVo sysUserRoleVo);

    /**
     * 逻辑删除用户下的所有角色关系
     * @param id
     * @return
     */
    int deleteByUserId(Long id);

    /**
     * 查询用户下的所有角色关系
     * @param id
     * @return
     */
    List<SysUserRoleVo> findByUserId(Long id);

}

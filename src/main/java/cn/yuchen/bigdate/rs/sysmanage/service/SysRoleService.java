package cn.yuchen.bigdate.rs.sysmanage.service;

import cn.yuchen.bigdate.rs.sysmanage.dao.SysRoleDao;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.webvo.SysPageVo;

import java.util.List;

/**
 * Created by wzx on 2018/8/8.
 */
public interface SysRoleService {

    int add(SysRoleVo sysRoleVo);


    int update(SysRoleVo sysRoleVo);


    int delete(Long id);


    SysRoleVo findById(Long id);


    List<SysRoleVo> findByPage(SysPageVo sysPageVo);
}

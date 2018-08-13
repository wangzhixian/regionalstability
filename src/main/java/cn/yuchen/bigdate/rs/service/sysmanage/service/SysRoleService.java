package cn.yuchen.bigdate.rs.service.sysmanage.service;

import cn.yuchen.bigdate.rs.service.sysmanage.dao.SysRoleDao;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;

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

    List<SysRoleVo> findRolesByUserId(Long id);
}

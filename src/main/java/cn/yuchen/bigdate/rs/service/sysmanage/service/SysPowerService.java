package cn.yuchen.bigdate.rs.service.sysmanage.service;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;

import java.util.List;

/**
 * Created by wzx on 2018/8/8.
 */
public interface SysPowerService {

    int add(SysPowerVo sysPowerVo);


    int update(SysPowerVo sysPowerVo);


    int delete(Long id);


    SysPowerVo findById(Long id);


    List<SysPowerVo> findByPage(SysPageVo sysPageVo);

    /**
     * 根据角色ID集合查询权限关系
     * @param ids
     * @return
     */
    List<SysPowerVo> findPowersByRoleIds(List<Long> ids);
}

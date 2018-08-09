package cn.yuchen.bigdate.rs.sysmanage.service;

import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.webvo.SysPageVo;

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
}

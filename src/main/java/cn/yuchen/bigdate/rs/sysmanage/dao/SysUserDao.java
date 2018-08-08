package cn.yuchen.bigdate.rs.sysmanage.dao;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysUserPo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.webvo.SysPageVo;

import java.util.List;

public interface SysUserDao {

    int insert(SysUserPo record);

    int update(SysUserPo record);

    int delete(Long id);

    SysUserPo selectByPrimaryKey(Long id);

    List<SysUserVo> selectByPage(SysPageVo sysPageVo);

}
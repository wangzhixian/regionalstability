package cn.yuchen.bigdate.rs.service.sysmanage.dao;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysUserPo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SysUserDao {

    int insert(SysUserPo record);

    int update(SysUserPo record);

    int delete(Long id);

    SysUserPo selectByPrimaryKey(Long id);

    List<SysUserVo> selectByPage(SysPageVo sysPageVo);

    List<SysUserVo> selectByUsername(String Username);

    int initUpdate(Long id);

}
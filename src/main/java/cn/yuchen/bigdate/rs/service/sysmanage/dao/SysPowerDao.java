package cn.yuchen.bigdate.rs.service.sysmanage.dao;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysPowerPo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysPowerDao{

    int insert(SysPowerPo record);

    int delete(Long id);

    int update(SysPowerPo record);

    SysPowerVo selectByPrimaryKey(Long id);

    List<SysPowerVo> selectByPage(SysPageVo sysPageVo);
}
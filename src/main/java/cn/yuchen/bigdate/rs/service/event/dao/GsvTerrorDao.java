package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GsvTerrorDao{

    int insert(GsvTerrorPo record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(GsvTerrorPo record);

    GsvTerrorVo selectByPrimaryKey(Integer id);

    List<GsvTerrorVo> selectByPage(GsvTerrorPage gsvTerrorPage);



}
package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GsvAreaDao {

    int insert(GsvAreaPo record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(GsvAreaPo record);

    GsvAreaVo selectByPrimaryKey(Integer id);

    List<GsvAreaVo> selectByPage(GsvAreaPage gsvAreaPage);


}
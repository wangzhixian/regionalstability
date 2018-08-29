package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;

import java.util.List;

public interface PoliticsAreaDao {

    int insert(PoliticsAreaPo record);

    int deleteByPrimaryKey(Integer id);

    int update(PoliticsAreaPo record);

    PoliticsAreaPo selectByPrimaryKey(Integer id);

    List<PoliticsAreaVo> selectByPage(PoliticsAreaPage politicsAreaPage);

}
package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPositionPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticsPositionDao {

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPositionPo record);


    PoliticsPositionVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPositionPo record);

    int updateByPrimaryKey(PoliticsPositionPo record);

    List<PoliticsPositionVo> selectByPage(PoliticsPositionPage politicsPositionPage);

}
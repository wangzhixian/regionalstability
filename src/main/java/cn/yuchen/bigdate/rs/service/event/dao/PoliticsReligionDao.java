package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsReligionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticsReligionDao {

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsReligionPo record);

    int insertSelective(PoliticsReligionPo record);

    PoliticsReligionPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsReligionPo record);

    int updateByPrimaryKey(PoliticsReligionPo record);

    List<PoliticsReligionVo> selectByPage(PoliticsReligionPage politicsReligionPage);

}
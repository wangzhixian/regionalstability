package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PoliticsAreaDao {

    int insert(PoliticsAreaPo record);

    int deleteByPrimaryKey(Integer id);

    int update(PoliticsAreaPo record);

    PoliticsAreaVo selectByPrimaryKey(Integer id);

    List<PoliticsAreaVo> selectByPage(PoliticsAreaPage politicsAreaPage);

}
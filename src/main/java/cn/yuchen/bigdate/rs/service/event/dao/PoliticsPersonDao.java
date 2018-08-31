package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPersonPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticsPersonDao {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPersonPo record);

    int insertSelective(PoliticsPersonPo record);

    PoliticsPersonPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPersonPo record);

    int updateByPrimaryKey(PoliticsPersonPo record);

    List<PoliticsPersonVo> selectByPage(PoliticsPersonPage politicsPersonPage);

}
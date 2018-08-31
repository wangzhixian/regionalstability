package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPartyGroupPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticsPartyGroupDao {

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPartyGroupPo record);

    int insertSelective(PoliticsPartyGroupPo record);

    PoliticsPartyGroupPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsPartyGroupPo record);

    int updateByPrimaryKey(PoliticsPartyGroupPo record);

    List<PoliticsPartyGroupVo> selectByPage(PoliticsPartyGroupPage politicsPartyGroupPage);
}
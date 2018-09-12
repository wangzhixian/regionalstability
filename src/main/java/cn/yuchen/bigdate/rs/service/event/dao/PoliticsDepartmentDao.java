package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsDepartmentPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PoliticsDepartmentDao {

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsDepartmentPo record);

    PoliticsDepartmentVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticsDepartmentPo record);


    List<PoliticsDepartmentVo> selectByPage(PoliticsDepartmentPage politicsDepartmentPage);
}
package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.CpiVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.CpiPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CpiDao {

    List<CpiVo> selectByPage(CpiPage cpiPage);

}
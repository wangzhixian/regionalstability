package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.information.pojo.po.GtdPo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.GtdPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GtdDao {

    int insert(GtdPo record);

    //根据id主键查询
    GtdPo selectByPrimaryKey(Long id);
    //根据eventid查询
    GtdPo selectByEventId(String id);
    //条件分页查询
    List<GtdPo> selectByPage(GtdPage gtdPage);

    //以下预留，暂时用不到
    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GtdPo record);

    int updateByPrimaryKey(GtdPo record);
}
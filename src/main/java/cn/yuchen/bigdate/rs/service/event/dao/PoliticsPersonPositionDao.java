package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PoliticsPersonPositionDao {

    int deleteByPrimaryKey(Integer id);

    int insert(PoliticsPersonPositionPo record);

    PoliticsPersonPositionPo selectPoByVo(PoliticsPersonPositionVo vo);

    int deletedByPersonId(Integer id);
}
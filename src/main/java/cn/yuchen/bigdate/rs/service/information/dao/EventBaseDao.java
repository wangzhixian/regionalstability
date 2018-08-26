package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePo;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EventBaseDao {

    int insert(EventBasePoWithBLOBs record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventBasePoWithBLOBs record);

    EventBasePoWithBLOBs selectByPrimaryKey(Long id);

    //通过新闻id查询
    EventBasePoWithBLOBs selectByNid(String id);
}
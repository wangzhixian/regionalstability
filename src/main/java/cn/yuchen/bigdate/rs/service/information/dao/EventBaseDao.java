package cn.yuchen.bigdate.rs.service.information.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePo;
import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.pojo.vo.EventBaseVo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.EventBasePage;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventBaseDao {

    int insert(EventBasePoWithBLOBs record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EventBasePoWithBLOBs record);

    //通过新闻id查询
    EventBasePoWithBLOBs selectByNid(String id);

    EventBasePoWithBLOBs selectByPrimaryKey(Long id);

    List<EventBaseVo> selectByPage(EventBasePage eventBasePage);


    int findTotalNumber(@Param(value="type") Byte type);

    /**
     * 通过条件查询，新闻(政治、反恐)列表
     * @param eventBasePage
     * @return
     */
    List<EventBasePoWithBLOBs> selectAllForType(EventBasePage eventBasePage);

}
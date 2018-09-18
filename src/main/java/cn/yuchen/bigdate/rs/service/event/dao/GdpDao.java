package cn.yuchen.bigdate.rs.service.event.dao;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GdpDao {

    List<GdpVo> selectByPage(GdpPage gdpPage);
}
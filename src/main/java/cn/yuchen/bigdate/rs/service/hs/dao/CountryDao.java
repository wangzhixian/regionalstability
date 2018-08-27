package cn.yuchen.bigdate.rs.service.hs.dao;

import cn.yuchen.bigdate.rs.service.hs.pojo.po.CountryPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryDao {

    List<CountryPo> selectAll ();

}
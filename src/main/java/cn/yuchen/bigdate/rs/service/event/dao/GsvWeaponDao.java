package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvWeaponPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GsvWeaponDao {


    int insert(GsvWeaponPo record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(GsvWeaponPo record);

    GsvWeaponVo selectByPrimaryKey(Integer id);

    List<GsvWeaponVo> selectByPage(GsvWeaponPage gsvWeaponPage);
}
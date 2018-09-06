package cn.yuchen.bigdate.rs.service.event.dao;

import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvWeaponPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GsvWeaponDao {

    int deleteByPrimaryKey(Integer id);

    int insert(GsvWeaponPo record);

    int insertSelective(GsvWeaponPo record);

    GsvWeaponPo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GsvWeaponPo record);

    int updateByPrimaryKey(GsvWeaponPo record);
}
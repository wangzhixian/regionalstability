package cn.yuchen.bigdate.rs.service.sysmanage.dao;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysRolePo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface SysRoleDao {

    int insert(SysRolePo record);

    int update(SysRolePo record);

    int delete(Long id);

    SysRoleVo selectByPrimaryKey(Long id);

    /**
     * 角色名查重
     * @param id
     * @param rolename
     * @return
     */
    SysRolePo selectByIdAndRoleName(@Param("id")Long id, @Param("rolename") String rolename);

    List<SysRoleVo> selectByPage(SysPageVo sysPageVo);
}
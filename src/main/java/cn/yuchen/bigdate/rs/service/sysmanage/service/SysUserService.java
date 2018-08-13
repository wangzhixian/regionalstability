package cn.yuchen.bigdate.rs.service.sysmanage.service;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;

import java.util.List;

/**
 * Created by wzx on 2018/8/7.
 */
public interface SysUserService {
    /**
     * 添加用户
     * @param sysUserVo
     * @return
     */
    int add(SysUserVo sysUserVo);

    /**
     * 修改用户
     * @param
     * @return
     */
    int update(SysUserVo sysUserVo);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    SysUserVo findById(Long id);

    /**
     * 分页条件查询用户列表
     * @param sysPageVo
     * @return
     */
    List<SysUserVo> findByPage(SysPageVo sysPageVo);

    /**
     * 根据登录名查询用户
     * @param username
     * @return
     */
    SysUserVo findSysUserByUsername(String username);

    /**
     * 初始化用户密码
     * @param id
     * @return
     */
    int init(Long id);
}

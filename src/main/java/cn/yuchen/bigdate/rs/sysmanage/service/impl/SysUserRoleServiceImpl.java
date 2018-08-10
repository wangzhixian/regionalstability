package cn.yuchen.bigdate.rs.sysmanage.service.impl;

import cn.yuchen.bigdate.rs.sysmanage.dao.SysUserRoleDao;
import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysUserRolePo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.service.SysUserRoleService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public int add(SysUserRoleVo sysUserRoleVo) {
        AssertUtils.notNull(sysUserRoleVo,"添加用户角色关系对象不能为空");
        AssertUtils.greaterThanZero(sysUserRoleVo.getUserId(),"用户ID不能为空");
        AssertUtils.greaterThanZero(sysUserRoleVo.getRoleId(),"角色ID不能为空");
        sysUserRoleVo.setOperator("wzx");
        SysUserRolePo po = new SysUserRolePo();
        BeanUtils.copyProperties(sysUserRoleVo,po);
        return sysUserRoleDao.insert(po);
    }

    @Override
    public int deleteByUserId(Long id) {
        AssertUtils.greaterThanZero(id,"删除的用户ID不能为空");
        return sysUserRoleDao.deleteByUserId(id);
    }

    @Override
    public List<SysUserRoleVo> findByUserId(Long id) {
        AssertUtils.greaterThanZero(id,"查询的用户ID不能为空");
        return sysUserRoleDao.selectByUserId(id);
    }


}

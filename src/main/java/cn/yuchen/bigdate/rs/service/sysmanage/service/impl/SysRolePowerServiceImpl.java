package cn.yuchen.bigdate.rs.service.sysmanage.service.impl;

import cn.yuchen.bigdate.rs.service.sysmanage.dao.SysRolePowerDao;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysRolePowerPo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRolePowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysRolePowerService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wzx on 2018/8/9.
 */
@Service
public class SysRolePowerServiceImpl implements SysRolePowerService {

    @Autowired
    private SysRolePowerDao sysRolePowerDao;

    @Override
    public int add(SysRolePowerVo sysRolePowerVo) {
        AssertUtils.notNull(sysRolePowerVo,"添加角色权限关系对象不能为空");
        AssertUtils.greaterThanZero(sysRolePowerVo.getRoleId(),"角色ID不能为空");
        AssertUtils.greaterThanZero(sysRolePowerVo.getPowerId(),"权限ID不能为空");
        sysRolePowerVo.setOperator("wzx");
        SysRolePowerPo po = new SysRolePowerPo();
        BeanUtils.copyProperties(sysRolePowerVo,po);
        return sysRolePowerDao.insert(po);
    }

    @Override
    public int deleteByRoleId(Long id) {
        AssertUtils.greaterThanZero(id,"角色ID不能为空");
        return sysRolePowerDao.deleteByRoleId(id);
    }

    @Override
    public List<SysRolePowerVo> findByRoleId(Long id) {
        AssertUtils.greaterThanZero(id,"角色ID不能为空");
        return sysRolePowerDao.selectByRoleId(id);
    }
}

package cn.yuchen.bigdate.rs.service.sysmanage.service.impl;

import cn.yuchen.bigdate.rs.exception.ArgumentException;
import cn.yuchen.bigdate.rs.service.sysmanage.dao.SysRoleDao;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysRolePo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysRoleService;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysUserRoleService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/8.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysUserRoleService sysUserRoleService;


    @Override
    public int add(SysRoleVo sysRoleVo) {
        AssertUtils.notNull(sysRoleVo,"添加角色对象不能为空");
        AssertUtils.hasText(sysRoleVo.getRoleName(),"角色名称不能为空");
        AssertUtils.hasText(sysRoleVo.getRoleCode(),"角色代码不能为空");
        checkRoleName(0L,sysRoleVo.getRoleName());
        sysRoleVo.setOperator("wzx");
        SysRolePo po = new SysRolePo();
        BeanUtils.copyProperties(sysRoleVo,po);
        return sysRoleDao.insert(po);
    }

    @Override
    public int update(SysRoleVo sysRoleVo) {
        AssertUtils.notNull(sysRoleVo,"修改角色对象不能为空");
        AssertUtils.greaterThanZero(sysRoleVo.getId(),"修改角色ID不能为空");
        AssertUtils.hasText(sysRoleVo.getRoleName(),"角色名称不能为空");
        AssertUtils.hasText(sysRoleVo.getRoleCode(),"角色代码不能为空");
        //判断角色名不能重复
        checkRoleName(sysRoleVo.getId(),sysRoleVo.getRoleName());
        SysRolePo po = new SysRolePo();
        BeanUtils.copyProperties(sysRoleVo,po);
        return sysRoleDao.update(po);
    }

    /**
     * 判断角色名是否存在    0 不存在   1存在
     * @param id
     * @param rolename
     */
    private void checkRoleName(Long id ,String rolename) {
        SysRolePo sysRolePo = sysRoleDao.selectByIdAndRoleName(id, rolename);
        if(Objects.nonNull(sysRolePo)){
            throw new ArgumentException("角色名称已经存在");
        }
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"删除ID不能为空");
        return sysRoleDao.delete(id);
    }

    @Override
    public SysRoleVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"查询ID不能为空");
        return sysRoleDao.selectByPrimaryKey(id);
    }

    @Override
    public List<SysRoleVo> findByPage(SysPageVo sysPageVo) {
        if(Objects.isNull(sysPageVo)){
            return  new ArrayList<>();
        }
        PageHelper.startPage(sysPageVo.getPageNum(),sysPageVo.getPageSize());
        return sysRoleDao.selectByPage(sysPageVo);
    }

    @Override
    public List<SysRoleVo> findRolesByUserId(Long id) {
        List<SysUserRoleVo> sysUserRoleVos = sysUserRoleService.findByUserId(id);
        List<SysRoleVo> sysRoleVos = new ArrayList<>();
        sysUserRoleVos.forEach(sysUserRoleVo -> {
            SysRoleVo sysRoleVo = sysRoleDao.selectByPrimaryKey(sysUserRoleVo.getRoleId());
            sysRoleVos.add(sysRoleVo);
        });
        return sysRoleVos;
    }
}

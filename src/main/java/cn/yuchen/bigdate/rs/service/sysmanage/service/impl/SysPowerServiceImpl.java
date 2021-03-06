package cn.yuchen.bigdate.rs.service.sysmanage.service.impl;

import cn.yuchen.bigdate.rs.service.sysmanage.dao.SysPowerDao;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.po.SysPowerPo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRolePowerVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysPowerService;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysRolePowerService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/8.
 */
@Service
public class SysPowerServiceImpl implements SysPowerService {

    @Autowired
    private SysPowerDao sysPowerDao;

    @Autowired
    private SysRolePowerService sysRolePowerService;

    @Override
    public int add(SysPowerVo sysPowerVo) {
        AssertUtils.notNull(sysPowerVo,"添加权限对象不能为空");
        AssertUtils.hasText(sysPowerVo.getPowerName(),"权限名称不能为空");
        AssertUtils.hasText(sysPowerVo.getPowerCode(),"权限code不能为空");
        AssertUtils.greaterThanZero(sysPowerVo.getPowerStatus(),"权限状态不能为空");
        SysPowerPo po = new SysPowerPo();
        BeanUtils.copyProperties(sysPowerVo,po);
        return sysPowerDao.insert(po);
    }

    @Override
    public int update(SysPowerVo sysPowerVo) {
        AssertUtils.notNull(sysPowerVo,"修改权限对象不能为空");
        AssertUtils.greaterThanZero(sysPowerVo.getId(),"修改角色ID不能为空");
        AssertUtils.hasText(sysPowerVo.getPowerName(),"权限名称不能为空");
        AssertUtils.hasText(sysPowerVo.getPowerCode(),"权限code不能为空");
        AssertUtils.greaterThanZero(sysPowerVo.getPowerStatus(),"权限状态不能为空");
        SysPowerPo po = new SysPowerPo();
        BeanUtils.copyProperties(sysPowerVo,po);
        return sysPowerDao.update(po);
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"删除权限ID不能为空");
        return sysPowerDao.delete(id);
    }

    @Override
    public SysPowerVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"查询详情ID不能为空");
        return sysPowerDao.selectByPrimaryKey(id);
    }

    @Override
    public List<SysPowerVo> findByPage(SysPageVo sysPageVo) {
        if(Objects.isNull(sysPageVo)){
            return  new ArrayList<>();
        }
        PageHelper.startPage(sysPageVo.getPageNum(),sysPageVo.getPageSize());
        return sysPowerDao.selectByPage(sysPageVo);
    }

    @Override
    public List<SysPowerVo> findPowersByRoleIds(List<Long> ids) {
        List<SysPowerVo> sysPowerVos = new ArrayList<>();
        ids.forEach(id->{
            List<SysRolePowerVo> sysRolePowerVos = sysRolePowerService.findByRoleId(id);
            sysRolePowerVos.forEach(sysRolePowerVo -> {
                SysPowerVo sysPowerVo = sysPowerDao.selectByPrimaryKey(sysRolePowerVo.getPowerId());
                sysPowerVos.add(sysPowerVo);
            });
        });
        return sysPowerVos;
    }
}

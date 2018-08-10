package cn.yuchen.bigdate.rs.sysmanage.service.impl;

import cn.yuchen.bigdate.rs.exception.ArgumentException;
import cn.yuchen.bigdate.rs.sysmanage.dao.SysUserDao;
import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysUserPo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.sysmanage.service.SysUserService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/8/7.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public int add(SysUserVo sysUserVo) {
        checkParams(sysUserVo);
        AssertUtils.hasText(sysUserVo.getUsername(),"用户登录名不能为空");
        List<SysUserVo> sysUserVos = sysUserDao.selectByUsername(sysUserVo.getUsername());
        if(Objects.nonNull(sysUserVos) && sysUserVos.size() > 0){
           throw new ArgumentException("登录名已存在");
        }
        SysUserPo po = new SysUserPo();
        BeanUtils.copyProperties(sysUserVo,po);
        return sysUserDao.insert(po);
    }

    /**
     * 校验参数
     * @param sysUserVo
     */
    private void checkParams(SysUserVo sysUserVo) {
        AssertUtils.notNull(sysUserVo,"添加对象不能为空");
        AssertUtils.hasText(sysUserVo.getNickname(),"昵称不能为空");
        AssertUtils.hasText(sysUserVo.getTruename(),"真实姓名不能为空");
        AssertUtils.hasText(sysUserVo.getPassword(),"密码不能为空");
    }

    @Override
    public int update(SysUserVo sysUserVo) {
        checkParams(sysUserVo);
        AssertUtils.greaterThanZero(sysUserVo.getId(),"修改ID不能为空");
        SysUserPo po = new SysUserPo();
        BeanUtils.copyProperties(sysUserVo,po);
        return sysUserDao.update(po);
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"删除ID不能为空");
        return sysUserDao.delete(id);
    }

    @Override
    public SysUserVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"查询详情ID不能为空");
        SysUserPo sysUserPo = sysUserDao.selectByPrimaryKey(id);
        SysUserVo vo = new SysUserVo();
        BeanUtils.copyProperties(sysUserPo,vo);
        return vo;
    }

    @Override
    public List<SysUserVo> findByPage(SysPageVo sysPageVo) {
        if(Objects.isNull(sysPageVo)){
            return  new ArrayList<>();
        }
        PageHelper.startPage(sysPageVo.getPageNum(),sysPageVo.getPageSize());
        return sysUserDao.selectByPage(sysPageVo);
    }

    @Override
    public SysUserVo findSysUserByUsername(String username) {
        if(Objects.isNull(username) || "".equals(username)){
            return  new SysUserVo();
        }
        List<SysUserVo> sysUserVos = sysUserDao.selectByUsername(username);
        if(Objects.isNull(sysUserVos) || sysUserVos.size() < 1){
            return  new SysUserVo();
        }
        return sysUserVos.get(0);
    }

    @Override
    public int init(Long id) {
        return sysUserDao.initUpdate(id);
    }
}

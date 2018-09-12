package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GsvTerrorDao;
import cn.yuchen.bigdate.rs.service.event.dao.GsvWeaponDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvWeaponPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GsvWeaponService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class GsvWeaponServiceImpl implements GsvWeaponService {

    @Autowired
    private GsvWeaponDao gsvWeaponDao;


    @Override
    public int add(GsvWeaponVo gsvWeaponVo) {

        AssertUtils.notNull(gsvWeaponVo,"添加武器表对象不能为空");
        AssertUtils.hasText(gsvWeaponVo.getWeaponEnName(),"武器对象英文名不能为空");

        GsvWeaponPo po = new GsvWeaponPo();
        //将vo复制给po
        BeanUtils.copyProperties(gsvWeaponVo,po);
        //数据库操作po
        return gsvWeaponDao.insert(po);
    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");

        return gsvWeaponDao.deleteByPrimaryKey(id);

    }

    @Override
    public int update(GsvWeaponVo gsvWeaponVo) {
        AssertUtils.notNull(gsvWeaponVo,"修改武器对象不能为空");
        AssertUtils.hasText(gsvWeaponVo.getWeaponEnName(),"武器对象英文名不能为空");
        AssertUtils.greaterThanZero(gsvWeaponVo.getId(),"要修改的ID不能为空");
        GsvWeaponPo po = new GsvWeaponPo();
        BeanUtils.copyProperties(gsvWeaponVo,po);
        return gsvWeaponDao.updateByPrimaryKey(po);
    }

    @Override
    public GsvWeaponVo findById(Integer id) {

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        GsvWeaponVo gsvWeaponVo = gsvWeaponDao.selectByPrimaryKey(id);

        return gsvWeaponVo;
    }

    @Override
    public List<GsvWeaponVo> findByPage(GsvWeaponPage gsvWeaponPage) {

        if(Objects.isNull(gsvWeaponPage)){

            return new ArrayList<>();
        }
        PageHelper.startPage(gsvWeaponPage.getPageNum(),gsvWeaponPage.getPageSize());

        return gsvWeaponDao.selectByPage(gsvWeaponPage);
    }

    @Override
    @Transactional
    public boolean deleteByIds(List<Integer> ids) {
        ids.forEach(this::delete);
        return true;
    }

    @Override
    @Transactional
    public void updateWeaponByIds(PoliticsWeb politicsWeb) {
        politicsWeb.getIds().forEach(id->{
            GsvWeaponVo gsvWeaponVo = gsvWeaponDao.selectByPrimaryKey(id);
            gsvWeaponVo.setLevelId(politicsWeb.getLevelId());
            update(gsvWeaponVo);
        });
    }
}

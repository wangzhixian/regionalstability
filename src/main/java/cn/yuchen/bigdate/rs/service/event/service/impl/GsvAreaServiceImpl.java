package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GsvAreaDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GsvAreaService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class GsvAreaServiceImpl implements GsvAreaService {

    @Autowired
    private GsvAreaDao gsvAreaDao;

    @Override
    public int add(GsvAreaVo gsvAreaVo) {

        AssertUtils.notNull(gsvAreaVo,"添加地理位置对象不能为空");
        AssertUtils.greaterThanZero(gsvAreaVo.getId(),"地理对象的ID不能为空");
        AssertUtils.hasText(gsvAreaVo.getAreaEnName(),"地理对象英文名不能为空");
        GsvAreaPo po = new GsvAreaPo();
        //将vo复制给po
        BeanUtils.copyProperties(gsvAreaVo,po);
        //数据库操作po
        return gsvAreaDao.insert(po);

    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");

        return gsvAreaDao.deleteByPrimaryKey(id);

    }

    @Override
    public int update(GsvAreaVo gsvAreaVo) {

        AssertUtils.notNull(gsvAreaVo,"修改地理位置对象不能为空");
        AssertUtils.hasText(gsvAreaVo.getAreaEnName(),"地理对象英文名不能为空");
        AssertUtils.greaterThanZero(gsvAreaVo.getId(),"要修改的ID不能为空");
        GsvAreaPo po = new GsvAreaPo();
        BeanUtils.copyProperties(gsvAreaVo,po);
        return gsvAreaDao.updateByPrimaryKey(po);

    }

    @Override
    public GsvAreaVo findById(Integer id) {

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        GsvAreaVo gsvAreaVo = gsvAreaDao.selectByPrimaryKey(id);

        return gsvAreaVo;
    }

    @Override
    public List<GsvAreaVo> findByPage(GsvAreaPage gsvAreaPage) {

        if(Objects.isNull(gsvAreaPage)){

            return new ArrayList<>();
        }
        PageHelper.startPage(gsvAreaPage.getPageNum(),gsvAreaPage.getPageSize());

        return gsvAreaDao.selectByPage(gsvAreaPage);
    }

    @Override
    @Transactional
    public boolean deleteByIds(List<Integer> ids) {
        ids.forEach(this::delete);
        return true;
    }

    @Override
    public void updateWeaponByIds(PoliticsWeb politicsWeb) {
        politicsWeb.getIds().forEach(id->{
            GsvAreaVo gsvAreaVo = gsvAreaDao.selectByPrimaryKey(id);
            gsvAreaVo.setLevelId(politicsWeb.getLevelId());
            update(gsvAreaVo);
        });
    }
}

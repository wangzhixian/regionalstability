package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GsvAreaDao;
import cn.yuchen.bigdate.rs.service.event.dao.GsvTerrorDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GsvTerrorService;
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
public class GsvTerrorServiceImpl implements GsvTerrorService {

    @Autowired
    private GsvTerrorDao gsvTerrorDao;

    @Override
    public int add(GsvTerrorVo gsvTerrorVo) {

        AssertUtils.notNull(gsvTerrorVo,"添加恐怖组织对象不能为空");
        AssertUtils.hasText(gsvTerrorVo.getTerrorEnName(),"组织对象英文名不能为空");

        GsvTerrorPo po = new GsvTerrorPo();
        //将vo复制给po
        BeanUtils.copyProperties(gsvTerrorVo,po);
        //数据库操作po
        return gsvTerrorDao.insert(po);
    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");

        return gsvTerrorDao.deleteByPrimaryKey(id);

    }

    @Override
    public int update(GsvTerrorVo gsvTerrorVo) {

        AssertUtils.notNull(gsvTerrorVo,"修改恐怖组织对象不能为空");
        AssertUtils.hasText(gsvTerrorVo.getTerrorEnName(),"组织对象英文名不能为空");
        AssertUtils.greaterThanZero(gsvTerrorVo.getId(),"要修改的ID不能为空");
        GsvTerrorPo po = new GsvTerrorPo();
        BeanUtils.copyProperties(gsvTerrorVo,po);
        return gsvTerrorDao.updateByPrimaryKey(po);
    }

    @Override
    public GsvTerrorVo findById(Integer id) {

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        GsvTerrorVo gsvTerrorVo = gsvTerrorDao.selectByPrimaryKey(id);

        return gsvTerrorVo;
    }

    @Override
    public List<GsvTerrorVo> findByPage(GsvTerrorPage gsvTerrorPage) {

        if(Objects.isNull(gsvTerrorPage)){

            return new ArrayList<>();
        }
        PageHelper.startPage(gsvTerrorPage.getPageNum(),gsvTerrorPage.getPageSize());

        return gsvTerrorDao.selectByPage(gsvTerrorPage);
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
            GsvTerrorVo gsvTerrorVo = gsvTerrorDao.selectByPrimaryKey(id);
            gsvTerrorVo.setLevelId(politicsWeb.getLevelId());
            update(gsvTerrorVo);
        });
    }
}

package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPositionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPositionPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPositionService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lgd on 2018/8/30.
 */
@Service
public class PoliticsPositionServiceImpl implements PoliticsPositionService {


    @Autowired
    PoliticsPositionDao politicsPositionDao;

    @Override
    public int add(PoliticsPositionVo politicsPositionVo) {

        AssertUtils.notNull(politicsPositionVo,"添加部门对象不能为空");
        AssertUtils.greaterThanZero(politicsPositionVo.getId(),"所属部门的ID不能为空");
        PoliticsPositionPo po = new PoliticsPositionPo();
        BeanUtils.copyProperties(politicsPositionVo,po);
        return politicsPositionDao.insert(po);
    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsPositionDao.deleteByPrimaryKey(id);
    }

    @Override
    public int update(PoliticsPositionVo politicsPositionVo) {
        AssertUtils.notNull(politicsPositionVo,"修改政党对象不能为空");
        AssertUtils.greaterThanZero(politicsPositionVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsPositionVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsPositionPo po = new PoliticsPositionPo();
        BeanUtils.copyProperties(politicsPositionVo,po);
        return politicsPositionDao.updateByPrimaryKey(po);
    }

    public PoliticsPositionVo findById(Integer id){

        AssertUtils.greaterThanZero(id,"查询ID不能为空");
        PoliticsPositionPo politicsPositionPo = politicsPositionDao.selectByPrimaryKey(id);
        PoliticsPositionVo vo = new PoliticsPositionVo();
        BeanUtils.copyProperties(politicsPositionPo,vo);
        return vo;

    }

    @Override
    public List<PoliticsPositionVo> findByPage(PoliticsPositionPage politicsPositionPage) {

        if(Objects.isNull(politicsPositionPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsPositionPage.getPageNum(),politicsPositionPage.getPageSize());
        return politicsPositionDao.selectByPage(politicsPositionPage);
    }

}

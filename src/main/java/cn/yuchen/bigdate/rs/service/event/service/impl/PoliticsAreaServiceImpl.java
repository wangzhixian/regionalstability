package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.PoliticsAreaDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsAreaService;
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
public class PoliticsAreaServiceImpl implements PoliticsAreaService {

    @Autowired
    private PoliticsAreaDao politicsAreaDao;


    @Override
    public int add(PoliticsAreaVo politicsAreaVo) {

        AssertUtils.notNull(politicsAreaVo,"添加地区对象不能为空");
        AssertUtils.greaterThanZero(politicsAreaVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsAreaPo po = new PoliticsAreaPo();
        BeanUtils.copyProperties(politicsAreaVo,po);
        return politicsAreaDao.insert(po);
    }

    @Override
    public int delete(Integer id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsAreaDao.deleteByPrimaryKey(id);
    }

    @Override
    public int update(PoliticsAreaVo politicsAreaVo) {
        AssertUtils.notNull(politicsAreaVo,"修改地区对象不能为空");
        AssertUtils.greaterThanZero(politicsAreaVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsAreaVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsAreaPo po = new PoliticsAreaPo();
        BeanUtils.copyProperties(politicsAreaVo,po);
        return politicsAreaDao.update(po);
    }

    @Override
    public PoliticsAreaVo findById(Integer id) {
        AssertUtils.greaterThanZero(id,"查询ID不能为空");
        PoliticsAreaPo politicsAreaPo = politicsAreaDao.selectByPrimaryKey(id);
        PoliticsAreaVo vo = new PoliticsAreaVo();
        BeanUtils.copyProperties(politicsAreaPo,vo);
        return vo;
    }

    @Override
    public List<PoliticsAreaVo> findByPage(PoliticsAreaPage politicsAreaPage) {
        if(Objects.isNull(politicsAreaPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsAreaPage.getPageNum(),politicsAreaPage.getPageSize());
        return politicsAreaDao.selectByPage(politicsAreaPage);
    }


}

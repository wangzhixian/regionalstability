package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsReligionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsReligionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsReligionService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lgd on 2018/8/30.
 */
@Service
public class PoliticsReligionServiceImpl implements PoliticsReligionService {
    @Autowired
    PoliticsReligionDao politicsReligionDao;

    @Override
    public int add(PoliticsReligionVo politicsReligionVo) {

        AssertUtils.notNull(politicsReligionVo,"添加宗教对象不能为空");
        //AssertUtils.greaterThanZero(politicsReligionVo.getId(),"所属部门的ID不能为空");
        PoliticsReligionPo po = new PoliticsReligionPo();
        BeanUtils.copyProperties(politicsReligionVo,po);
        return politicsReligionDao.insert(po);
    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsReligionDao.deleteByPrimaryKey(id);
    }

    @Override
    public int update(PoliticsReligionVo politicsReligionVo) {

        AssertUtils.notNull(politicsReligionVo,"修改宗教对象不能为空");
        AssertUtils.greaterThanZero(politicsReligionVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsReligionVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsReligionPo po = new PoliticsReligionPo();
        BeanUtils.copyProperties(politicsReligionVo,po);
        return politicsReligionDao.updateByPrimaryKeySelective(po);
    }

    public PoliticsReligionVo findById(Integer id){

        AssertUtils.greaterThanZero(id,"查询ID不能为空");
        PoliticsReligionVo politicsPositionVo = politicsReligionDao.selectByPrimaryKey(id);
        return politicsPositionVo;

    }

    @Override
    public List<PoliticsReligionVo> findByPage(PoliticsReligionPage politicsReligionPage) {


        if(Objects.isNull(politicsReligionPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsReligionPage.getPageNum(),politicsReligionPage.getPageSize());
        return politicsReligionDao.selectByPage(politicsReligionPage);

    }

    @Override
    @Transactional
    public boolean deleteByIds(List<Integer> ids) {
        ids.forEach(id->{
            delete(id);
        });
        return true;
    }

    @Override
    @Transactional
    public void updateReligionByIds(PoliticsWeb politicsWeb) {
        politicsWeb.getIds().forEach(id->{
            PoliticsReligionVo politicsReligionVo = findById(id);
            politicsReligionVo.setLevelId(politicsWeb.getLevelId());
            update(politicsReligionVo);
        });
    }


}

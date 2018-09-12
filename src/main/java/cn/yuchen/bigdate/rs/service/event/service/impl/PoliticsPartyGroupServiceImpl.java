package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsAreaDao;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPartyGroupDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsDepartmentPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPartyGroupPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPartyGroupService;
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
public class PoliticsPartyGroupServiceImpl implements PoliticsPartyGroupService {

    @Autowired
    private PoliticsPartyGroupDao politicsPartyGroupDao;


    @Override
    public int add(PoliticsPartyGroupVo politicsPartyGroupVo) {

        AssertUtils.notNull(politicsPartyGroupVo,"添加政党对象不能为空");
        AssertUtils.greaterThanZero(politicsPartyGroupVo.getCountryId(),"政党所属国家ID不能为空");
        PoliticsPartyGroupPo po = new PoliticsPartyGroupPo();
        BeanUtils.copyProperties(politicsPartyGroupVo,po);
        return politicsPartyGroupDao.insertSelective(po);

    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");

        return politicsPartyGroupDao.deleteByPrimaryKey(id);

    }


    @Override
    public int update(PoliticsPartyGroupVo politicsPartyGroupVo) {

        AssertUtils.notNull(politicsPartyGroupVo,"修改政党对象不能为空");
        AssertUtils.greaterThanZero(politicsPartyGroupVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsPartyGroupVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsPartyGroupPo po = new PoliticsPartyGroupPo();
        BeanUtils.copyProperties(politicsPartyGroupVo,po);
        return politicsPartyGroupDao.update(po);
    }


    @Override
    public PoliticsPartyGroupVo findById(Integer id) {

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        PoliticsPartyGroupVo politicsPartyGroupVo = politicsPartyGroupDao.selectByPrimaryKey(id);

        return politicsPartyGroupVo;
    }

    @Override
    public List<PoliticsPartyGroupVo> findByPage(PoliticsPartyGroupPage politicsPartyGroupPage) {

        if(Objects.isNull(politicsPartyGroupPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsPartyGroupPage.getPageNum(),politicsPartyGroupPage.getPageSize());
        return politicsPartyGroupDao.selectByPage(politicsPartyGroupPage);
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
    public void updatePartyGroupByIds(PoliticsWeb politicsWeb) {
        politicsWeb.getIds().forEach(id->{
            PoliticsPartyGroupVo politicsPartyGroupVo = findById(id);
            politicsPartyGroupVo.setLevelId(politicsWeb.getLevelId());
            update(politicsPartyGroupVo);
        });
    }
}

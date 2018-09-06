package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPartyGroupDao;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPersonDao;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPersonPositionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPersonPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPartyGroupService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lgd on 2018/8/30.
 */
@Service
public class PoliticsPersonServiceImpl implements PoliticsPersonService {

    @Autowired
    private PoliticsPersonDao politicsPersonDao;

    @Autowired
    private PoliticsPersonPositionDao politicsPersonPositionDao;

    @Override
    public int add(PoliticsPersonVo politicsPersonVo) {

        AssertUtils.notNull(politicsPersonVo,"添加人物对象不能为空");
        //AssertUtils.greaterThanZero(politicsPersonVo.getId(),"所属部门的ID不能为空");
        PoliticsPersonPo po = new PoliticsPersonPo();
        BeanUtils.copyProperties(politicsPersonVo,po);
        return politicsPersonDao.insert(po);
    }


    @Override
    @Transactional
    public int delete(Integer id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        politicsPersonDao.deleteByPrimaryKey(id);
        politicsPersonPositionDao.deletedByPersonId(id);
        return 1;
    }

    @Override
    public int update(PoliticsPersonVo politicsPersonVo) {

        AssertUtils.notNull(politicsPersonVo,"修改政党对象不能为空");
        AssertUtils.greaterThanZero(politicsPersonVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsPersonVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsPersonPo po = new PoliticsPersonPo();
        BeanUtils.copyProperties(politicsPersonVo,po);
        return politicsPersonDao.updateByPrimaryKeySelective(po);

    }

    @Override
    public PoliticsPersonVo findById(Integer id) {

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        PoliticsPersonPo politicsPersonPo = politicsPersonDao.selectByPrimaryKey(id);

        PoliticsPersonVo vo = new PoliticsPersonVo();

        BeanUtils.copyProperties(politicsPersonPo,vo);

        return vo;

    }

    @Override
    public List<PoliticsPersonVo> findByPage(PoliticsPersonPage politicsPersonPage) {

        if(Objects.isNull(politicsPersonPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsPersonPage.getPageNum(),politicsPersonPage.getPageSize());
        return politicsPersonDao.selectByPage(politicsPersonPage);

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
    public void updatePersonByIds(PoliticsWeb politicsWeb) {
        politicsWeb.getIds().forEach(id->{
            PoliticsPersonVo politicsPersonVo = findById(id);
            politicsPersonVo.setLevelId(politicsWeb.getLevelId());
            update(politicsPersonVo);
        });
    }


}

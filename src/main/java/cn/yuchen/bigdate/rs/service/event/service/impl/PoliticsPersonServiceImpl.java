package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPartyGroupDao;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPersonDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPersonPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPartyGroupService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonService;
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
public class PoliticsPersonServiceImpl implements PoliticsPersonService {
    @Autowired
    private PoliticsPersonDao politicsPersonDao;

    @Override
    public int add(PoliticsPersonVo politicsPersonVo) {

        AssertUtils.notNull(politicsPersonVo,"添加人物对象不能为空");
        //AssertUtils.greaterThanZero(politicsPersonVo.getId(),"所属部门的ID不能为空");
        PoliticsPersonPo po = new PoliticsPersonPo();
        BeanUtils.copyProperties(politicsPersonVo,po);
        return politicsPersonDao.insert(po);
    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsPersonDao.deleteByPrimaryKey(id);
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


}

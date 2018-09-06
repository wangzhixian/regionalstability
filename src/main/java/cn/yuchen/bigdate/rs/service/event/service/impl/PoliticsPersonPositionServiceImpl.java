package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPersonPositionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonPositionService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Objects;

/**
 * Created by lgd on 2018/8/30.
 */
@Service
public class PoliticsPersonPositionServiceImpl implements PoliticsPersonPositionService {

    @Autowired
    private PoliticsPersonPositionDao politicsPersonPositionDao;

    @Override
    public int add(PoliticsPersonPositionVo politicsPersonPositionVo) {

        AssertUtils.notNull(politicsPersonPositionVo,"添加部门对象不能为空");

        AssertUtils.greaterThanZero(politicsPersonPositionVo.getPositionId(),"职位id不能为空");

        AssertUtils.greaterThanZero(politicsPersonPositionVo.getPersonId(),"人物id不能为空");

        PoliticsPersonPositionPo flagPo = politicsPersonPositionDao.selectPoByVo(politicsPersonPositionVo);

        AssertUtils.isNull(flagPo,"关联关系已存在");

        PoliticsPersonPositionPo po = new PoliticsPersonPositionPo();

        BeanUtils.copyProperties(politicsPersonPositionVo,po);

        return politicsPersonPositionDao.insert(po);

    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");

        return politicsPersonPositionDao.deleteByPrimaryKey(id);
    }


}

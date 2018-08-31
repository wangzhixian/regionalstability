package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsPersonPositionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPartyGroupPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPositionPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonPositionService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        AssertUtils.greaterThanZero(politicsPersonPositionVo.getId(),"所属部门的ID不能为空");
        PoliticsPersonPositionPo po = new PoliticsPersonPositionPo();
        BeanUtils.copyProperties(politicsPersonPositionVo,po);
        return politicsPersonPositionDao.insert(po);

    }

    @Override
    public int delete(Integer id) {

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsPersonPositionDao.deleteByPrimaryKey(id);

    }

    @Override
    public int update(PoliticsPersonPositionVo politicsPersonPositionVo) {

        AssertUtils.notNull(politicsPersonPositionVo,"修改政党对象不能为空");
        AssertUtils.greaterThanZero(politicsPersonPositionVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsPersonPositionVo.getPositionId(),"所属国家的ID不能为空");
        PoliticsPersonPositionPo po = new PoliticsPersonPositionPo();
        BeanUtils.copyProperties(politicsPersonPositionVo,po);
        return politicsPersonPositionDao.updateByPrimaryKey(po);
    }

    public PoliticsPersonPositionVo findById(Integer id){

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        PoliticsPersonPositionPo politicsPersonPositionPo = politicsPersonPositionDao.selectByPrimaryKey(id);

        PoliticsPersonPositionVo vo = new PoliticsPersonPositionVo();

        BeanUtils.copyProperties(politicsPersonPositionPo,vo);

        return vo;
    }

    //List<PoliticsDepartmentVo> findByPage(PoliticsDepartmentVo politicsDepartmentVo);
}

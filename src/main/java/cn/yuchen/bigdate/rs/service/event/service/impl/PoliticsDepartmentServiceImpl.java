package cn.yuchen.bigdate.rs.service.event.service.impl;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsDepartmentDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsDepartmentPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsDepartmentService;
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
public class PoliticsDepartmentServiceImpl implements PoliticsDepartmentService {

    @Autowired
    private PoliticsDepartmentDao politicsDepartmentDao;

    @Override
    public int add(PoliticsDepartmentVo politicsDepartmentVo){
        AssertUtils.notNull(politicsDepartmentVo,"添加部门对象不能为空");
        AssertUtils.greaterThanZero(politicsDepartmentVo.getId(),"所属部门的ID不能为空");
        AssertUtils.greaterThanZero(politicsDepartmentVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsDepartmentPo po = new PoliticsDepartmentPo();
        BeanUtils.copyProperties(politicsDepartmentVo,po);
        return politicsDepartmentDao.insert(po);

     }

    @Override
    public int delete(Integer id){

        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return politicsDepartmentDao.deleteByPrimaryKey(id);
    }
    @Override
     public int update(PoliticsDepartmentVo politicsDepartmentVo){

        AssertUtils.notNull(politicsDepartmentVo,"修改部门对象不能为空");
        AssertUtils.greaterThanZero(politicsDepartmentVo.getId(),"要修改的ID不能为空");
        AssertUtils.greaterThanZero(politicsDepartmentVo.getCountryId(),"所属国家的ID不能为空");
        PoliticsDepartmentPo po = new PoliticsDepartmentPo();
        BeanUtils.copyProperties(politicsDepartmentVo,po);
        return politicsDepartmentDao.updateByPrimaryKeySelective(po);
    }

    @Override
    public PoliticsDepartmentVo findById(Integer id){

        AssertUtils.greaterThanZero(id,"查询ID不能为空");

        PoliticsDepartmentPo politicsDepartmentPo = politicsDepartmentDao.selectByPrimaryKey(id);

        PoliticsDepartmentVo vo = new PoliticsDepartmentVo();

        BeanUtils.copyProperties(politicsDepartmentPo,vo);

        return vo;

    }


    @Override
    public List<PoliticsDepartmentVo> findByPage(PoliticsDepartmentPage politicsDepartmentPage) {
        if(Objects.isNull(politicsDepartmentPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(politicsDepartmentPage.getPageNum(),politicsDepartmentPage.getPageSize());
        return politicsDepartmentDao.selectByPage(politicsDepartmentPage);
    }
}

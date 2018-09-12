package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GradeDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GradePo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GradeVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GradeService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 等级业务层
 * Created by wzx on 2018/9/11.
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeDao gradeDao;


    @Override
    public int add(GradeVo gradeVo) {
        AssertUtils.notNull(gradeVo,"添加等级对象不能为空");
        AssertUtils.greaterThanZero(gradeVo.getDimensionality(),"维度不能为空");
        AssertUtils.greaterThanZero(gradeVo.getLevel(),"等级不能为空");
        byte flag =  checkParam(gradeVo);
        AssertUtils.isTrue(flag,"该等级对象已存在");
        GradePo po = new GradePo();
        BeanUtils.copyProperties(gradeVo,po);
        return gradeDao.insert(po);
    }


    @Override
    public int delete(Integer id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return gradeDao.delete(id);
    }

    @Override
    public int update(GradeVo gradeVo) {
        AssertUtils.notNull(gradeVo,"修改等级对象不能为空");
        AssertUtils.greaterThanZero(gradeVo.getId(),"修改ID不能为空");
        AssertUtils.greaterThanZero(gradeVo.getDimensionality(),"维度不能为空");
        AssertUtils.greaterThanZero(gradeVo.getLevel(),"等级不能为空");
        byte flag =  checkParam(gradeVo);
        AssertUtils.isTrue(flag,"该维度已存在此等级");
        GradePo po = new GradePo();
        BeanUtils.copyProperties(gradeVo,po);
        return gradeDao.update(po);
    }

    @Override
    public GradeVo findById(Integer id) {
        AssertUtils.greaterThanZero(id,"查询ID不能为空");
        return gradeDao.selectById(id);
    }

    @Override
    public List<GradeVo> findByPage(PoliticsWeb politicsWeb) {
        if(Objects.isNull(politicsWeb)){

            return new ArrayList<>();
        }
        PageHelper.startPage(politicsWeb.getPageNum(),politicsWeb.getPageSize());
        return gradeDao.selectByPage(politicsWeb);
    }

    /**
     * 校验查重
     * 不重复 0  重复 1
     * @param gradeVo
     * @return
     */
    private byte checkParam(GradeVo gradeVo) {
        byte result = 0;
        GradeVo vo =  gradeDao.selectByDimensionalityAndLevel(gradeVo.getDimensionality(),gradeVo.getLevel());
        if(Objects.nonNull(vo)){
            result = 1;
        }
        //若参数ID不为空为修改
        if(Objects.nonNull(gradeVo.getId()) && Objects.nonNull(vo) && gradeVo.getId() == vo.getId()){
            result =  0;
        }
        return result;
    }
}


package cn.yuchen.bigdate.rs.model.service.impl;

import cn.yuchen.bigdate.rs.model.dao.ModelMethodDao;
import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.po.ModelMethodPo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.model.service.ModelMethodService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/7/30.
 */
@Service
public class ModelMethodServiceImpl implements ModelMethodService {

    @Autowired
    private ModelMethodDao modelMethodDao;


    @Override
    public int add(ModelMethodVo modelMethodVo) {
        checkParams(modelMethodVo);
        modelMethodVo.setOperator("系统管理员");
        ModelMethodPo po = new ModelMethodPo();
        BeanUtils.copyProperties(modelMethodVo,po);
        modelMethodDao.insert(po);
//        po.getId();  这里获取到插入方法的id ，下面就将参数一起加入到表中
        return 0;
    }

    /**
     * 参数校验
     * @param modelMethodVo
     */
    private void checkParams(ModelMethodVo modelMethodVo) {
        AssertUtils.notNull(modelMethodVo,"对象不能为空");
        AssertUtils.hasText(modelMethodVo.getName(),"名称不能为空");
        AssertUtils.greaterThanZero(modelMethodVo.getModelId(),"模型ID不能为空（外键）");
    }

    @Override
    public int update(ModelMethodVo modelMethodVo) {
        checkParams(modelMethodVo);
        AssertUtils.greaterThanZero(modelMethodVo.getId(),"修改id不能为空");
        ModelMethodPo po = new ModelMethodPo();
        BeanUtils.copyProperties(modelMethodVo,po);
        return modelMethodDao.update(po);
    }

    @Override
    public int delete(Long id) {
        AssertUtils.notNull(id,"要删除的id不能为空");
        return modelMethodDao.delete(id);
    }

    @Override
    public List<ModelMethodVo> findByPage(ModelPageVo modelPageVo) {
        if(Objects.isNull(modelPageVo)||Objects.isNull(modelPageVo.getModelId())){
            return  new ArrayList<>();
        }
        PageHelper.startPage(modelPageVo.getPageNum(),modelPageVo.getPageSize());
        List<ModelMethodVo> modelModuleVos = modelMethodDao.selectByPage(modelPageVo);
        return modelModuleVos;
    }

    @Override
    public ModelMethodVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        ModelMethodPo modelMethodPo = modelMethodDao.selectById(id);
        ModelMethodVo vo = new ModelMethodVo();
        BeanUtils.copyProperties(modelMethodPo,vo);
        return vo;
    }
}

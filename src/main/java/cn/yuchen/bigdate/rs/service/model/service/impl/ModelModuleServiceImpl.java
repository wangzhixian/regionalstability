package cn.yuchen.bigdate.rs.service.model.service.impl;

import cn.yuchen.bigdate.rs.service.model.dao.ModelModuleDao;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelModulePo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelModuleVo;
import cn.yuchen.bigdate.rs.service.model.service.ModelModuleService;
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
public class ModelModuleServiceImpl implements ModelModuleService {

    @Autowired
    private ModelModuleDao modelModuleDao;


    @Override
    public int add(ModelModuleVo modelModuleVo) {
        checkParams(modelModuleVo);
        modelModuleVo.setOperator("系统管理员");
        ModelModulePo po = new ModelModulePo();
        BeanUtils.copyProperties(modelModuleVo,po);
        return  modelModuleDao.insert(po);
    }

    /**
     * 校验参数
     * @param modelModuleVo
     */
    private void checkParams(ModelModuleVo modelModuleVo) {
        AssertUtils.notNull(modelModuleVo,"要添加的对象不能为空");
        AssertUtils.hasText(modelModuleVo.getName(),"模块名称不能为空");
    }

    @Override
    public int update(ModelModuleVo modelModuleVo) {
        checkParams(modelModuleVo);
        AssertUtils.greaterThanZero(modelModuleVo.getId(),"id不能为空");
        ModelModulePo po = new ModelModulePo();
        BeanUtils.copyProperties(modelModuleVo,po);
        return  modelModuleDao.update(po);
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"要删除的id不能为空");
        return modelModuleDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<ModelModuleVo> findByPage(ModelPageVo modelPageVo) {
        if(Objects.isNull(modelPageVo)||Objects.isNull(modelPageVo.getModelId())){
            return  new ArrayList<>();
        }
        PageHelper.startPage(modelPageVo.getPageNum(),modelPageVo.getPageSize());
        List<ModelModuleVo> modelModuleVos = modelModuleDao.selectByPage(modelPageVo);
        return modelModuleVos;
    }

    @Override
    public List<ModelModuleVo> findAll() {
        List<ModelModulePo> modelModulePos = modelModuleDao.selectAll();
        List<ModelModuleVo> vos = new ArrayList<>(modelModulePos.size());
        modelModulePos.forEach(po->{
            ModelModuleVo vo = new ModelModuleVo();
            BeanUtils.copyProperties(po,vo);
            vos.add(vo);
        });
        return vos;
    }
}

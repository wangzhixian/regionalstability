package cn.yuchen.bigdate.rs.service.model.service.impl;

import cn.yuchen.bigdate.rs.service.model.dao.ModelMethodDao;
import cn.yuchen.bigdate.rs.service.model.dao.ModelParameterDao;
import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelParameterPo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelParameterVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelMethodParameterVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelMethodPo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.service.model.service.ModelMethodService;
import cn.yuchen.bigdate.rs.service.model.service.ModelParameterService;
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
 * Created by wzx on 2018/7/30.
 */
@Service
public class ModelMethodServiceImpl implements ModelMethodService {

    @Autowired
    private ModelMethodDao modelMethodDao;

    @Autowired
    private ModelParameterDao modelParameterDao;


    @Override
    public int add(ModelMethodVo modelMethodVo) {
        checkParams(modelMethodVo);
        modelMethodVo.setOperator("系统管理员");
        ModelMethodPo po = new ModelMethodPo();
        BeanUtils.copyProperties(modelMethodVo,po);
//        po.getId();  这里获取到插入方法的id ，下面就将参数一起加入到表中
        return modelMethodDao.insert(po);
    }

    @Override
    @Transactional
    public int addMethodAndParameter(ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo) {
        int flag = 1;
        //校验参数正确性
        checkParams(modelMethodVo);
        //添加方法
        modelMethodVo.setOperator("系统管理员");
        ModelMethodPo modelMethodPo = new ModelMethodPo();
        BeanUtils.copyProperties(modelMethodVo,modelMethodPo);
        int flagMethod = modelMethodDao.insert(modelMethodPo);
        //添加参数
        modelParameterVo.setMethodId(modelMethodPo.getId());
        checkParams(modelParameterVo);
        //todo 归属人这里做登录判断,如果是管理员则不添加，否则获取添加人的ID
        ModelParameterPo po = new ModelParameterPo();
        BeanUtils.copyProperties(modelParameterVo,po);
        int flagPar = modelParameterDao.insert(po);
        if(flagMethod < 0 && flagPar < 0){
            flag = 0;
        }
        return flag;
    }

    /**
     * 参数校验 ModelParameterVo
     * @param modelParameterVo 参数对象
     */
    private void checkParams(ModelParameterVo modelParameterVo) {
        AssertUtils.notNull(modelParameterVo,"添加参数对象不能为空");
        AssertUtils.greaterThanZero(modelParameterVo.getMethodId(),"方法ID（外键）不能为空");
        AssertUtils.hasText(modelParameterVo.getName(),"参数名称不能为空");
        AssertUtils.hasText(modelParameterVo.getCategory(),"参数类型不能为空");
    }

    /**
     * 参数校验 ModelMethodVo
     * @param modelMethodVo 方法对象
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
    public int updateMethodAndParameter(ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo) {
        int flag = 1;
        checkParams(modelMethodVo);
        AssertUtils.greaterThanZero(modelMethodVo.getId(),"修改方法id不能为空");
        checkParams(modelParameterVo);
        AssertUtils.greaterThanZero(modelParameterVo.getId(),"修改参数id不能为空");
        ModelMethodPo modelMethodPo = new ModelMethodPo();
        BeanUtils.copyProperties(modelMethodVo,modelMethodPo);
        int flagMethod = modelMethodDao.update(modelMethodPo);
        ModelParameterPo modelParameterPo = new ModelParameterPo();
        BeanUtils.copyProperties(modelParameterVo,modelParameterPo);
        int flagPar =  modelParameterDao.update(modelParameterPo);
        if(flagMethod < 0 && flagPar < 0){
            flag = 0;
        }
        return flag;
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

    @Override
    public List<ModelMethodParameterVo> findmmpvo(Long id) {
        AssertUtils.notNull(id,"方法ID不能为空");
        return modelMethodDao.selectMethodParameterById(id);
    }

    @Override
    public List<ModelMethodParameterVo> findAll(ModelPageVo modelPageVo) {
        if(Objects.isNull(modelPageVo)||Objects.isNull(modelPageVo.getModelId())){
            return  new ArrayList<>();
        }
        PageHelper.startPage(modelPageVo.getPageNum(),modelPageVo.getPageSize());
        List<ModelMethodParameterVo> modelMethodParameterVos = modelMethodDao.selectMethodParameter(modelPageVo);
        return modelMethodParameterVos;
    }
}

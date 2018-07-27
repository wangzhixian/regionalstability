package cn.yuchen.bigdate.rs.model.service.impl;

import cn.yuchen.bigdate.rs.model.dao.ModelDao;
import cn.yuchen.bigdate.rs.model.pojo.po.ModelPo;
import cn.yuchen.bigdate.rs.model.pojo.pagevo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.model.service.ModelService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Created by wzx on 2018/7/27.
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelDao modelDao;

    @Override
    public int add(ModelVo modelVo) {
        checkParam(modelVo);
        modelVo.setOperator("系统管理员");
        ModelPo modelPo = new ModelPo();
        BeanUtils.copyProperties(modelVo,modelPo);
        return modelDao.insert(modelPo);
    }

    /**
     * 校验参数
     * @param modelVo
     */
    private void checkParam(ModelVo modelVo) {
        AssertUtils.notNull(modelVo,"要添加的模型对象不能为空.");
        AssertUtils.hasText(modelVo.getName(),"模型名称不能为空.");
        AssertUtils.hasText(modelVo.getScene(),"模型分类不能为空.");
    }

    @Override
    public int update(ModelVo modelVo) {
        checkParam(modelVo);
        AssertUtils.notNull(modelVo.getId(),"要修改的对象id不能为空.");
        ModelPo modelPo = new ModelPo();
        BeanUtils.copyProperties(modelVo,modelPo);
        return modelDao.update(modelPo);
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空.");
        return modelDao.deleteByPrimaryKey(id);
    }

    @Override
    public List<ModelVo> findByPage(ModelPageVo modelPageVo) {
        if(Objects.isNull(modelPageVo)){
            return  new ArrayList<>();
        }
        PageHelper.startPage(modelPageVo.getPageNum(),modelPageVo.getPageSize());
        List<ModelVo> modelVos = modelDao.selectByPage(modelPageVo);
        return modelVos;
    }

    @Override
    public ModelVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"查询id不能为空.");
        ModelPo modelPo = modelDao.selectById(id);
        ModelVo modelVo = new ModelVo();
        BeanUtils.copyProperties(modelPo,modelVo);
        return modelVo;
    }


}

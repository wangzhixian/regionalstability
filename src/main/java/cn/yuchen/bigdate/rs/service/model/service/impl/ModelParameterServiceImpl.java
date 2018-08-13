package cn.yuchen.bigdate.rs.service.model.service.impl;

import cn.yuchen.bigdate.rs.service.model.dao.ModelParameterDao;
import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelParameterPo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelParameterVo;
import cn.yuchen.bigdate.rs.service.model.service.ModelParameterService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzx on 2018/7/31.
 */
@Service
public class ModelParameterServiceImpl implements ModelParameterService {

    @Autowired
    private ModelParameterDao modelParameterDao;

    @Override
    public int add(ModelParameterVo modelParameterVo) {
        checkParams(modelParameterVo);
        //todo 归属人这里做登录判断,如果是管理员则不添加，否则获取添加人的ID
        ModelParameterPo po = new ModelParameterPo();
        BeanUtils.copyProperties(modelParameterVo,po);
        return modelParameterDao.insert(po);
    }

    /**
     * 参数校验
     * @param modelParameterVo
     */
    private void checkParams(ModelParameterVo modelParameterVo) {
        AssertUtils.notNull(modelParameterVo,"添加参数对象不能为空");
        AssertUtils.greaterThanZero(modelParameterVo.getMethodId(),"方法ID（外键）不能为空");
        AssertUtils.hasText(modelParameterVo.getName(),"参数名称不能为空");
        AssertUtils.hasText(modelParameterVo.getCategory(),"参数类型不能为空");
    }

    @Override
    public int delete(Long id) {
        AssertUtils.greaterThanZero(id,"要删除的ID不能为空");
        return modelParameterDao.delete(id);
    }

    @Override
    public int update(ModelParameterVo modelParameterVo) {
        checkParams(modelParameterVo);
        AssertUtils.greaterThanZero(modelParameterVo.getId(),"修改ID不能为空");
        ModelParameterPo po = new ModelParameterPo();
        BeanUtils.copyProperties(modelParameterVo,po);
        return modelParameterDao.update(po);
    }

    @Override
    public ModelParameterVo findById(Long id) {
        AssertUtils.greaterThanZero(id,"查询详情ID不能为空");
        ModelParameterPo modelParameterPo = modelParameterDao.selectById(id);
        ModelParameterVo vo = new ModelParameterVo();
        BeanUtils.copyProperties(modelParameterPo,vo);
        return vo;
    }
}

package cn.yuchen.bigdate.rs.service.model.service;

import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelParameterVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelMethodParameterVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;

import java.util.List;

/**
 * Created by wzx on 2018/7/30.
 */
public interface ModelMethodService {

    int add(ModelMethodVo modelMethodVo);

    int addMethodAndParameter(ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo);

    int update(ModelMethodVo modelMethodVo);

    int updateMethodAndParameter(ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo);

    int delete(Long id);

    List<ModelMethodVo> findByPage(ModelPageVo modelPageVo);

    ModelMethodVo findById(Long id);

    List<ModelMethodParameterVo> findmmpvo(Long id);

    List<ModelMethodParameterVo> findAll(ModelPageVo modelPageVo);
}

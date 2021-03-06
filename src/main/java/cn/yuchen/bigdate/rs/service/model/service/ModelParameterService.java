package cn.yuchen.bigdate.rs.service.model.service;

import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelParameterVo;

/**
 * Created by wzx on 2018/7/31.
 */
public interface ModelParameterService {

    int add(ModelParameterVo modelParameterVo);

    int delete(Long id);

    int update(ModelParameterVo modelParameterVo);

    ModelParameterVo findById(Long id);
}

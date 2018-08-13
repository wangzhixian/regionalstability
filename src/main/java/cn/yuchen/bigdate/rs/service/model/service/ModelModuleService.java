package cn.yuchen.bigdate.rs.service.model.service;

import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelModuleVo;

import java.util.List;

/**
 * Created by wzx on 2018/7/30.
 */
public interface ModelModuleService {
    int add(ModelModuleVo modelModuleVo);

    int update(ModelModuleVo modelModuleVo);

    int delete(Long id);

    List<ModelModuleVo> findByPage(ModelPageVo modelPageVo);

    List<ModelModuleVo> findAll();
}

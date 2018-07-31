package cn.yuchen.bigdate.rs.model.service;

import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;

import java.util.List;

/**
 * Created by wzx on 2018/7/30.
 */
public interface ModelMethodService {
    int add(ModelMethodVo modelMethodVo);

    int update(ModelMethodVo modelMethodVo);

    int delete(Long id);

    List<ModelMethodVo> findByPage(ModelPageVo modelPageVo);

    ModelMethodVo findById(Long id);
}

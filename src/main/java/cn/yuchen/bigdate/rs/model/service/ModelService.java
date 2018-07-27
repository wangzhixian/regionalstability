package cn.yuchen.bigdate.rs.model.service;

import cn.yuchen.bigdate.rs.model.pojo.pagevo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelVo;

import java.util.List;

/**
 * Created by wzx on 2018/7/27.
 */
public interface ModelService {
    /**
     * 添加模型
     * @param modelVo
     * @return
     */
    int add(ModelVo modelVo);

    /**
     * 修改模型
     * @param modelVo
     * @return
     */
    int update(ModelVo modelVo);

    /**
     * 删除模型
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 分页条件查询
     * @param modelPageVo
     * @return
     */
    List<ModelVo> findByPage(ModelPageVo modelPageVo);

    /**
     * 根据id查询模型
     * @param id
     * @return
     */
    ModelVo findById(Long id);
}

package cn.yuchen.bigdate.rs.service.model.dao;


import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelMethodPo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelMethodParameterVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelMethodDao {

    int insert(ModelMethodPo record);

    int delete(Long id);

    int update(ModelMethodPo record);

    List<ModelMethodVo> selectByPage(ModelPageVo modelPageVo);

    ModelMethodPo selectById(Long id);

    List<ModelMethodParameterVo> selectMethodParameter(ModelPageVo modelPageVo);

    /**
     * 通过方法id 查询方法与参数显示对象
     * @param id  方法id
     * @return  模型参数对象
     */
    List<ModelMethodParameterVo> selectMethodParameterById(Long id);

}
package cn.yuchen.bigdate.rs.model.dao;

import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.po.ModelMethodPo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelMethodDao {

    void insert(ModelMethodPo record);

    int delete(Long id);

    int update(ModelMethodPo record);

    List<ModelMethodVo> selectByPage(ModelPageVo modelPageVo);

    ModelMethodPo selectById(Long id);
}
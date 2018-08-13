package cn.yuchen.bigdate.rs.service.model.dao;

import cn.yuchen.bigdate.rs.service.model.pojo.po.ModelPo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ModelDao {

    int deleteByPrimaryKey(Long id);

    int insert(ModelPo record);

    int update(ModelPo record);

    ModelPo selectById(Long id);

    List<ModelVo> selectByPage(ModelPageVo modelPageVo);
}
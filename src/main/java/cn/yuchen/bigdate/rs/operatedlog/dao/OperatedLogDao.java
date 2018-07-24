package cn.yuchen.bigdate.rs.operatedlog.dao;

import cn.yuchen.bigdate.rs.operatedlog.pojo.po.OperatedLogPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by wzx on 2018/7/24.
 */
@Mapper
public interface OperatedLogDao {
    /**
     * 分页查询操作日志
     * @return
     */
    List<OperatedLogPo> selectByPage();

    /**
     * 添加操作日志
     * @param operatedLogPo
     * @return
     */
    int insert(OperatedLogPo operatedLogPo);
}
package cn.yuchen.bigdate.rs.service.operatedlog.dao;

import cn.yuchen.bigdate.rs.service.operatedlog.pojo.po.OperatedLogPo;
import cn.yuchen.bigdate.rs.service.operatedlog.pojo.vo.OperatedLogVo;
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
    List<OperatedLogVo> selectByPage(OperatedLogVo operatedLogVo);

    /**
     * 添加操作日志
     * @param operatedLogPo
     * @return
     */
    int insert(OperatedLogPo operatedLogPo);
}

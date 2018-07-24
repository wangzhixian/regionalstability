package cn.yuchen.bigdate.rs.operatedlog.service;

import cn.yuchen.bigdate.rs.operatedlog.pojo.vo.OperatedLogVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by wzx on 2018/7/24.
 */
public interface OperatedLogService {
    /**
     * 分页查询操作日志
     * @return
     */
    PageInfo<OperatedLogVo> findOperatedLogVoByPage(OperatedLogVo operatedLogVo);

    /**
     * 添加操作日志
     * @param operatedLogVo
     * @return
     */
    int add(OperatedLogVo operatedLogVo);
}

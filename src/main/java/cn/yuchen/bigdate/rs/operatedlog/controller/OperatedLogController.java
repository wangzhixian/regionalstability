package cn.yuchen.bigdate.rs.operatedlog.controller;

import cn.yuchen.bigdate.rs.operatedlog.pojo.vo.OperatedLogVo;
import cn.yuchen.bigdate.rs.operatedlog.service.OperatedLogService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/7/24.
 */
@RestController
@RequestMapping("/log")
public class OperatedLogController {

    @Autowired
    private OperatedLogService  operatedLogService;

    /**
     * 添加操作日志
     * @param operatedLogVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody OperatedLogVo operatedLogVo){
        Boolean result = false;
        int addFlag = operatedLogService.add(operatedLogVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 分页条件查询操作日志
     * @param operatedLogVo
     * @return
     */
    @PostMapping("/findByPage")
    public ResponseResult<PageInfo<OperatedLogVo>> findByPage(@RequestBody OperatedLogVo operatedLogVo){
        PageInfo<OperatedLogVo> pageInfo = operatedLogService.findOperatedLogVoByPage(operatedLogVo);
        return new ResponseResult<>(pageInfo);
    }

}

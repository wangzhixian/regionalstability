package cn.yuchen.bigdate.rs.operatedlog.controller;

import cn.yuchen.bigdate.rs.operatedlog.pojo.vo.OperatedLogVo;
import cn.yuchen.bigdate.rs.operatedlog.service.OperatedLogService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzx on 2018/7/24.
 */
@RestController
@RequestMapping("/log")
public class OperatedLogController {

    private static final Logger log = LoggerFactory.getLogger(OperatedLogController.class);

    @Autowired
    private OperatedLogService  operatedLogService;

    /**
     * 添加操作日志
     * @param operatedLogVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(OperatedLogVo operatedLogVo){
        Boolean result = false;
        int addFlag = operatedLogService.add(operatedLogVo);
        if(addFlag == 1){
            result = true;
        }
        log.info("顺序1");
        log.info("这里使用了系统日志记录操作");
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

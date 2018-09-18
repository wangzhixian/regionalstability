package cn.yuchen.bigdate.rs.web.information.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.pojo.po.GtdPo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpage.EventBasePage;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/9/13.
 */
@RestController
@RequestMapping("/information")
@CrossOrigin
public class InformationController {
    @Autowired
    private EventBaseInformationService eventBaseInformationService;

    /**
     * 新闻、政治、反恐事件分析页面 根据类型查询所有接口
     * @param eventBasePage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<EventBasePoWithBLOBs>> findByPage(@RequestBody EventBasePage eventBasePage){
        List<EventBasePoWithBLOBs> eventBasePoWithBLOBsList = eventBaseInformationService.findAllByType(eventBasePage);
        return new ResponseResult<>(new PageInfo<>(eventBasePoWithBLOBsList));
    }

}

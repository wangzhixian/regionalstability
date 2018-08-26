package cn.yuchen.bigdate.rs.service.information.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 新闻源数据控制类
 * Created by wzx on 2018/8/24.
 */
@RestController
@RequestMapping("/eventbase")
@CrossOrigin
public class EventBaseInformationController {

    @Autowired
    private EventBaseInformationService eventBaseInformationService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody EventBasePoWithBLOBs eventBasePoWithBLOBs){
        Boolean result = false;
        int addFlag = eventBaseInformationService.add(eventBasePoWithBLOBs);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody EventBasePoWithBLOBs eventBasePoWithBLOBs){
        Boolean result = false;
        int updateFlag = eventBaseInformationService.update(eventBasePoWithBLOBs);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/find/{nid}")
    public ResponseResult<EventBasePoWithBLOBs> findById(@PathVariable("nid") String nid){
        EventBasePoWithBLOBs byNid = eventBaseInformationService.findByNid(nid);
        return new ResponseResult<>(byNid);
    }
}

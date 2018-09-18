package cn.yuchen.bigdate.rs.web.home.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.po.EventBasePoWithBLOBs;
import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.web.analyze.pojo.EventWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wzx on 2018/9/12.
 */
@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomeController {

    @Autowired
    private EventBaseInformationService eventBaseInformationService;

    //todo 查询政治总数
    @PostMapping("/getpoliticstotal")
    public ResponseResult<Integer> GetPoliticsTotal() {
        Byte b = 1;
        Integer result=eventBaseInformationService.findTotal(b);
        return new ResponseResult<>(result);
    }

    //todo 查询经济总数
    @PostMapping("/geteconomicstotal")
    public ResponseResult<Integer> GetEconomicsTotal() {
        Byte b = 2;
        Integer result=eventBaseInformationService.findTotal(b);
        return new ResponseResult<>(result);
    }

    //todo 查询反恐事件总数
    @PostMapping("/getterrorismtotal")
    public ResponseResult<Integer> GetTerrorismTotal() {
        Byte b = 3;
        Integer result=eventBaseInformationService.findTotal(b);
        return new ResponseResult<>(result);
    }


    //todo 查询新闻总量
    @PostMapping("/getnewstotal")
    public ResponseResult<Integer> GetNewsTotal() {
        Byte b1 = 1;
        Byte b2 = 2;
        Byte b3 = 3;
        Integer result1=eventBaseInformationService.findTotal(b1);
        Integer result2=eventBaseInformationService.findTotal(b2);
        Integer result3=eventBaseInformationService.findTotal(b3);
        Integer result=result1+result2+result3;
        return new ResponseResult<>(result);
    }


}

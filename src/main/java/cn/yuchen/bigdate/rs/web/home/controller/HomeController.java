package cn.yuchen.bigdate.rs.web.home.controller;

import cn.yuchen.bigdate.rs.service.information.service.EventBaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzx on 2018/9/12.
 */
@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomeController {

    @Autowired
    private EventBaseInformationService eventBaseInformationService;
    //todo 查询新闻总数

}

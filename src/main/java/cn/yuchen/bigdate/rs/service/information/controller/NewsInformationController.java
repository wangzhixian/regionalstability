package cn.yuchen.bigdate.rs.service.information.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import cn.yuchen.bigdate.rs.service.information.service.NewsInformationService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/8/16.
 */
@RestController
@RequestMapping("/news")
@CrossOrigin
public class NewsInformationController {

    @Autowired
    private NewsInformationService newsInformationService;

    //分页查询
    @PostMapping("/findbypage")
    public ResponseResult<Page<Tagdata>> findByPage(@RequestBody NewsWeb newsWeb){
        Page<Tagdata> tagdatas = newsInformationService.findByPage(newsWeb);
        return new ResponseResult<>(tagdatas);
    }

    @PostMapping("/findtest")
    public ResponseResult<List<Tagdata>> findTest(@RequestBody NewsWeb newsWeb){
        List<Tagdata> tagdatas = newsInformationService.findByArea(newsWeb);
        return new ResponseResult<>(tagdatas);
    }
    //查询详情
    //修改
    //文章
}

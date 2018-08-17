package cn.yuchen.bigdate.rs.service.information.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.NewsWeb;
import cn.yuchen.bigdate.rs.service.information.service.NewsInformationService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.types.ObjectId;
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

    /**
     * 分页查询
     * @param newsWeb
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<List<Tagdata>> findByPage(@RequestBody NewsWeb newsWeb){
        List<Tagdata> tagdatas = newsInformationService.findByNewsWebPage(newsWeb);
        return new ResponseResult<>(tagdatas);
    }

    /**
     * 根据ObjectId  查询对象
     * @param objectId
     * @return
     */
    @PostMapping("/findbyid")
    public ResponseResult<Tagdata> findById(@RequestBody ObjectId objectId){
        Tagdata tagdata = newsInformationService.findByObjectId(objectId);
        return new ResponseResult<>(tagdata);
    }

    /**
     * 修改
     * @param tagdata
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<UpdateResult> update(@RequestBody Tagdata tagdata){
        UpdateResult update = newsInformationService.update(tagdata);
        return new ResponseResult<>(update);
    }
    //文章
}

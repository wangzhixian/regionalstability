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
     * 根据Id  查询对象
     * @return
     */
    @PostMapping("/findbyid/{id}")
    public ResponseResult<Tagdata> findById(@PathVariable("id") String id){
        Tagdata tagdata = newsInformationService.findById(id);
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

    /**
     * 通过news_id 修改状态为1
     */
    @PostMapping("/updateone/{id}")
    public ResponseResult<UpdateResult> updateOneById(@PathVariable("id") String id){
        UpdateResult updateResult = newsInformationService.updateOneById(id);
        return new ResponseResult<>(updateResult);
    }

    /**
     * 通过news_id 修改状态为2
     */
    @PostMapping("/updatetwo/{id}")
    public ResponseResult<UpdateResult> updatetwoById(@PathVariable("id") String id){
        UpdateResult updateResult = newsInformationService.updateTwoById(id);
        return new ResponseResult<>(updateResult);
    }
}

package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsAreaService;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 地区控制类
 * Created by wzx on 2018/8/29.
 */
@RestController
@RequestMapping("/area")
@CrossOrigin
public class PoliticsAreaController {
    @Autowired
    private PoliticsAreaService politicsAreaService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsAreaVo politicsAreaVo){
        Boolean result = false;
        int addFlag = politicsAreaService.add(politicsAreaVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsAreaVo politicsAreaVo){
        Boolean result = false;
        int updateFlag = politicsAreaService.update(politicsAreaVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsAreaService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 分页条件查询
     * @param politicsAreaPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsAreaVo>> findByPage(@RequestBody PoliticsAreaPage politicsAreaPage){
        List<PoliticsAreaVo> politicsAreaVos = politicsAreaService.findByPage(politicsAreaPage);
        return new ResponseResult<>(new PageInfo<>(politicsAreaVos));
    }

    /**
     * 根据ID查询地区详情
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<PoliticsAreaVo> findById(@PathVariable("id") Integer id){
        PoliticsAreaVo politicsAreaVo = politicsAreaService.findById(id);
        return new ResponseResult<>(politicsAreaVo);
    }
}

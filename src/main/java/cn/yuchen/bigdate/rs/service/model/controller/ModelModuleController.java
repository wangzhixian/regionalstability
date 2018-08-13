package cn.yuchen.bigdate.rs.service.model.controller;

import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelModuleVo;
import cn.yuchen.bigdate.rs.service.model.service.ModelModuleService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/7/30.
 */
@RestController
@RequestMapping("/modelmodule")
@CrossOrigin
public class ModelModuleController {

    @Autowired
    private ModelModuleService modelModuleService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody ModelModuleVo modelModuleVo){
        Boolean result = false;
        int addFlag = modelModuleService.add(modelModuleVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody ModelModuleVo modelModuleVo){
        Boolean result = false;
        int updateFlag = modelModuleService.update(modelModuleVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = modelModuleService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<ModelModuleVo>> findByPage(@RequestBody ModelPageVo modelPageVo){
    List<ModelModuleVo> modelVos =  modelModuleService.findByPage(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(modelVos));
    }

    /**
     * 查询所有模块
     * @return
     */
    @PostMapping("/findall")
    public ResponseResult<List<ModelModuleVo>> findAll(){
        List<ModelModuleVo> modelVos =  modelModuleService.findAll();
        return new ResponseResult<>(modelVos);
    }
}

package cn.yuchen.bigdate.rs.model.controller;

import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelParameterVo;
import cn.yuchen.bigdate.rs.model.service.ModelParameterService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wzx on 2018/7/31.
 */
@RestController
@RequestMapping("/modelparameter")
@CrossOrigin
public class ModelParameterController {

    @Autowired
    private ModelParameterService modelParameterService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody ModelParameterVo modelParameterVo){
        Boolean result = false;
        int addFlag = modelParameterService.add(modelParameterVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody ModelParameterVo modelParameterVo){
        Boolean result = false;
        int updateFlag = modelParameterService.update(modelParameterVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = modelParameterService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/find/{id}")
    public ResponseResult<ModelParameterVo> findByPage(@PathVariable("id") Long id){
        ModelParameterVo modelParameterVo = modelParameterService.findById(id);
        return new ResponseResult<>(modelParameterVo);
    }
}

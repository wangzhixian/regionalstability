package cn.yuchen.bigdate.rs.model.controller;

import cn.yuchen.bigdate.rs.model.pojo.pagevo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.model.service.ModelService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/7/27.
 */
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody ModelVo modelVo){
        Boolean result = false;
        int addFlag = modelService.add(modelVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody ModelVo modelVo){
        Boolean result = false;
        int addFlag = modelService.update(modelVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int addFlag = modelService.delete(id);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/findByPage")
    public ResponseResult<PageInfo<ModelVo>> findByPage(@RequestBody ModelPageVo modelPageVo){
        List<ModelVo> modelVos =  modelService.findByPage(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(modelVos));
    }

    @PostMapping("/findById/{id}")
    public ResponseResult<ModelVo> findByPage(@PathVariable("id") Long id){
        ModelVo modelVo = modelService.findById(id);
        return new ResponseResult<>(modelVo);
    }
}

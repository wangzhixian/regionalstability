package cn.yuchen.bigdate.rs.model.controller;

import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.model.service.ModelMethodService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wzx on 2018/7/30.
 */
@RestController
@RequestMapping("/modelmethod")
public class ModelMethodController {

    @Autowired
    private ModelMethodService modelMethodService;
    //TODO 添加时同时添加参数
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody ModelMethodVo modelMethodVo){
        Boolean result = false;
        int addFlag = modelMethodService.add(modelMethodVo);
        if(addFlag > 0){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody ModelMethodVo modelMethodVo){
        Boolean result = false;
        int updateFlag = modelMethodService.update(modelMethodVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = modelMethodService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<ModelMethodVo>> findByPage(@RequestBody ModelPageVo modelPageVo){
        List<ModelMethodVo> modelVos =  modelMethodService.findByPage(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(modelVos));
    }

    @PostMapping("/find/{id}")
    public ResponseResult<ModelMethodVo> findByPage(@PathVariable("id") Long id){
        ModelMethodVo modelMethodVo = modelMethodService.findById(id);
        return new ResponseResult<>(modelMethodVo);
    }

}

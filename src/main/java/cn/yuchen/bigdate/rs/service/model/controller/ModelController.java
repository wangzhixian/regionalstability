package cn.yuchen.bigdate.rs.service.model.controller;

import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.service.model.service.ModelService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 模型控制类
 * Created by wzx on 2018/7/27.
 */
@RestController
@RequestMapping("/model")
@CrossOrigin   //解决了跨域问题
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
        int updateFlag = modelService.update(modelVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = modelService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 分页条件查询模型列表
     * @param modelPageVo
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<ModelVo>> findByPage(@RequestBody ModelPageVo modelPageVo){
        List<ModelVo> modelVos =  modelService.findByPage(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(modelVos));
    }

    /**
     * 查询模型详情
     * @param id
     * @return
     */
    //TODO 这里查询的时候需要查出ids、函数对象、参数对象，所以这里需要一个对象：包含函数与参数的字段对象
    @PostMapping("/find/{id}")
    public ResponseResult<ModelVo> findById(@PathVariable("id") Long id){
        ModelVo modelVo = modelService.findById(id);
        return new ResponseResult<>(modelVo);
    }
}

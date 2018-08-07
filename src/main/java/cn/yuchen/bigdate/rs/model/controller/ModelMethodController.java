package cn.yuchen.bigdate.rs.model.controller;

import cn.yuchen.bigdate.rs.model.pojo.vo.ModelParameterVo;
import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelMethodParameterVo;
import cn.yuchen.bigdate.rs.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.model.pojo.vo.ModelMethodVo;
import cn.yuchen.bigdate.rs.model.service.ModelMethodService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * Created by wzx on 2018/7/30.
 */
@RestController
    @RequestMapping("/modelmethod")
@CrossOrigin
public class ModelMethodController {

    @Autowired
    private ModelMethodService modelMethodService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody ModelMethodParameterVo modelMethodParameterVo){
        AssertUtils.notNull(modelMethodParameterVo,"要添加的对象不能为空");
        ModelMethodVo modelMethodVo = new ModelMethodVo();
        ModelParameterVo modelParameterVo = new ModelParameterVo();
        //初始化添加参数
        initAddMethodAndParameter(modelMethodParameterVo, modelMethodVo, modelParameterVo);
        Boolean result = false;
        int addFlag = modelMethodService.addMethodAndParameter(modelMethodVo,modelParameterVo);
        if(addFlag > 0){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody ModelMethodParameterVo modelMethodParameterVo){
        AssertUtils.notNull(modelMethodParameterVo,"要添加的对象不能为空");
        ModelMethodVo modelMethodVo = new ModelMethodVo();
        ModelParameterVo modelParameterVo = new ModelParameterVo();
        initUpdateMethodAndParameter(modelMethodParameterVo, modelMethodVo, modelParameterVo);
        Boolean result = false;
        int updateFlag = modelMethodService.updateMethodAndParameter(modelMethodVo,modelParameterVo);
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

    @PostMapping("/find/{id}")
    public ResponseResult<ModelMethodVo> findByPage(@PathVariable("id") Long id){
        ModelMethodVo modelMethodVo = modelMethodService.findById(id);
        return new ResponseResult<>(modelMethodVo);
    }

    @PostMapping("/findmmpvo/{id}")
    public ResponseResult<ModelMethodParameterVo> findModelMethodParameterVoByMethodId(@PathVariable("id") Long id){
        List<ModelMethodParameterVo> findmmpvo = modelMethodService.findmmpvo(id);
        if(Objects.isNull(findmmpvo)){
            return new ResponseResult<>();
        }
        return new ResponseResult<>(findmmpvo.get(0));
    }

    /**
     * 分页查询方法与参数列表
     * @param modelPageVo 分页查询条件对象
     * @return
     */
    @PostMapping("/findall")
    public ResponseResult<PageInfo<ModelMethodParameterVo>> findAll(@RequestBody ModelPageVo modelPageVo){
        List<ModelMethodParameterVo> all = modelMethodService.findAll(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(all));
    }

    /**
     * 分页查询方法列表
     * @param modelPageVo   分页查询条件对象
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<ModelMethodVo>> findByPage(@RequestBody ModelPageVo modelPageVo){
        List<ModelMethodVo> modelVos =  modelMethodService.findByPage(modelPageVo);
        return new ResponseResult<>(new PageInfo<>(modelVos));
    }

    /**
     * 初始化修改对象
     * @param modelMethodParameterVo
     * @param modelMethodVo
     * @param modelParameterVo
     */
    private void initUpdateMethodAndParameter(@RequestBody ModelMethodParameterVo modelMethodParameterVo, ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo) {
        modelMethodVo.setId(modelMethodParameterVo.getMethodId());
        modelParameterVo.setId(modelMethodParameterVo.getParameterId());
        modelParameterVo.setMethodId(modelMethodParameterVo.getMethodId());
        initAddMethodAndParameter(modelMethodParameterVo, modelMethodVo, modelParameterVo);
    }

    /**
     * 初始化添加对象
     * @param modelMethodParameterVo
     * @param modelMethodVo
     * @param modelParameterVo
     */
    private void initAddMethodAndParameter(ModelMethodParameterVo modelMethodParameterVo, ModelMethodVo modelMethodVo, ModelParameterVo modelParameterVo) {
        //      方法的属性赋值
        modelMethodVo.setModelId(modelMethodParameterVo.getModelId());
        modelMethodVo.setName(modelMethodParameterVo.getMethodName());
        modelMethodVo.setScript(modelMethodParameterVo.getMethodScript());
        modelMethodVo.setDisplay(modelMethodParameterVo.getDisplay());
        //      参数的属性赋值
        modelParameterVo.setName(modelMethodParameterVo.getParameterName());
        modelParameterVo.setScript(modelMethodParameterVo.getParameterScript());
        modelParameterVo.setCategory(modelMethodParameterVo.getParameterCategory());
    }
}

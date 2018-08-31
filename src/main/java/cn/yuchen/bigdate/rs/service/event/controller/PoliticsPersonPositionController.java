package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonPositionService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 人物控制类
 * Created by lgd on 2018/8/30.
 */
@RestController
@RequestMapping("/personposition")
@CrossOrigin
public class PoliticsPersonPositionController {

    @Autowired
    private PoliticsPersonPositionService politicsPersonPositionService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsPersonPositionVo politicsPersonPositionVo){
        Boolean result = false;
        int addFlag = politicsPersonPositionService.add(politicsPersonPositionVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsPersonPositionService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsPersonPositionVo politicsPersonPositionVo){
        Boolean result = false;
        int updateFlag = politicsPersonPositionService.update(politicsPersonPositionVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }



    /**
     * 根据ID查询部门详情
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<PoliticsPersonPositionVo> findById(@PathVariable("id") Integer id){

        PoliticsPersonPositionVo politicsPersonPositionVo = politicsPersonPositionService.findById(id);

        return new ResponseResult<>(politicsPersonPositionVo);
    }

}

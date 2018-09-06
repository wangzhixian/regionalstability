package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonPositionService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 人物部门关系控制类
 * Created by lgd on 2018/8/30.
 */
@RestController
@RequestMapping("/personposition")
@CrossOrigin
public class PoliticsPersonPositionController {

    @Autowired
    private PoliticsPersonPositionService politicsPersonPositionService;

    /**
     * 添加人物部门关系
     * @param politicsPersonPositionVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsPersonPositionVo politicsPersonPositionVo){
        Boolean result = false;
        int addFlag = politicsPersonPositionService.add(politicsPersonPositionVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据id删除人物部门关系
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsPersonPositionService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

}

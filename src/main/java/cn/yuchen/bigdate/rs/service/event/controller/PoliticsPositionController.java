package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPositionPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonPositionService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPositionService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 人物控制类
 * Created by lgd on 2018/8/30.
 */
@RestController
@RequestMapping("/position")
@CrossOrigin
public class PoliticsPositionController {

    @Autowired
    private PoliticsPositionService politicsPositionService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsPositionVo politicsPersonPositionVo){
        Boolean result = false;
        int addFlag = politicsPositionService.add(politicsPersonPositionVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsPositionService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsPositionVo positionVo){
        Boolean result = false;
        int updateFlag = politicsPositionService.update(positionVo);
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
    public ResponseResult<PoliticsPositionVo> findById(@PathVariable("id") Integer id){

        PoliticsPositionVo politicsPositionVo = politicsPositionService.findById(id);

        return new ResponseResult<>(politicsPositionVo);
    }

    /**
     * 分页条件查询
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsPositionVo>> findByPage(@RequestBody PoliticsPositionPage politicsPositionPage){
        List<PoliticsPositionVo> politicsPositionVos = politicsPositionService.findByPage(politicsPositionPage);
        return new ResponseResult<>(new PageInfo<>(politicsPositionVos));
    }

}

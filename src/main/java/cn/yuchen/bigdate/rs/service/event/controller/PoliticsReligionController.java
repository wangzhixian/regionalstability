package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPositionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPositionService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsReligionService;
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
@RequestMapping("/religion")
@CrossOrigin
public class PoliticsReligionController {

    @Autowired
    private PoliticsReligionService politicsReligionService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsReligionVo politicsReligionVo){
        Boolean result = false;
        int addFlag = politicsReligionService.add(politicsReligionVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsReligionService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsReligionVo politicsReligionVo){
        Boolean result = false;
        int updateFlag = politicsReligionService.update(politicsReligionVo);
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
    public ResponseResult<PoliticsReligionVo> findById(@PathVariable("id") Integer id){

        PoliticsReligionVo politicsReligionVo = politicsReligionService.findById(id);

        return new ResponseResult<>(politicsReligionVo);
    }

    /**
     * 分页条件查询
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsReligionVo>> findByPage(@RequestBody PoliticsReligionPage politicsReligionPage){
        List<PoliticsReligionVo> politicsReligionVos = politicsReligionService.findByPage(politicsReligionPage);
        return new ResponseResult<>(new PageInfo<>(politicsReligionVos));
    }

}

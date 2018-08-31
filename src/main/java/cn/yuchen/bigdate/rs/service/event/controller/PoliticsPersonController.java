package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.po.PoliticsPersonPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPersonVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPersonPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsDepartmentService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPersonService;
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
@RequestMapping("/person")
@CrossOrigin
public class PoliticsPersonController {

    @Autowired
    private PoliticsPersonService politicsPersonService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsPersonVo politicsPersonVo){
        Boolean result = false;
        int addFlag = politicsPersonService.add(politicsPersonVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsPersonService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsPersonVo politicsPersonVo){
        Boolean result = false;
        int updateFlag = politicsPersonService.update(politicsPersonVo);
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
    public ResponseResult<PoliticsPersonVo> findById(@PathVariable("id") Integer id){

        PoliticsPersonVo politicsPersonVo = politicsPersonService.findById(id);

        return new ResponseResult<>(politicsPersonVo);
    }

    /**
     * 分页条件查询
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsPersonVo>> findByPage(@RequestBody PoliticsPersonPage politicsPersonPage){
        List<PoliticsPersonVo> politicsPersonVos = politicsPersonService.findByPage(politicsPersonPage);
        return new ResponseResult<>(new PageInfo<>(politicsPersonVos));
    }

}

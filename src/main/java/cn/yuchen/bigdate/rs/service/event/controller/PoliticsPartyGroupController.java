package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPartyGroupPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsDepartmentService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsPartyGroupService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 政党控制类
 * Created by lgd on 2018/8/30.
 */
@RestController
@RequestMapping("/partygroup")
@CrossOrigin
public class PoliticsPartyGroupController {

    @Autowired
    private PoliticsPartyGroupService politicsPartyGroupService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsPartyGroupVo politicsPartyGroupVo){
        Boolean result = false;
        int addFlag = politicsPartyGroupService.add(politicsPartyGroupVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsPartyGroupService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }


    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsPartyGroupVo politicsPartyGroupVo){
        Boolean result = false;
        int updateFlag = politicsPartyGroupService.update(politicsPartyGroupVo);
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
    public ResponseResult<PoliticsPartyGroupVo> findById(@PathVariable("id") Integer id){

        PoliticsPartyGroupVo politicsPartyGroupVo = politicsPartyGroupService.findById(id);

        return new ResponseResult<>(politicsPartyGroupVo);
    }

    /**
     * 分页条件查询
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsPartyGroupVo>> findByPage(@RequestBody PoliticsPartyGroupPage politicsPartyGroupPage){
        List<PoliticsPartyGroupVo> politicsPartyGroupVos = politicsPartyGroupService.findByPage(politicsPartyGroupPage);
        return new ResponseResult<>(new PageInfo<>(politicsPartyGroupVos));
    }

}

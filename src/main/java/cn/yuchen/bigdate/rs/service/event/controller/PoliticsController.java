package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.*;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.*;
import cn.yuchen.bigdate.rs.service.event.service.*;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 经济参数控制类
 * Created by wzx on 2018/9/5.
 */
@RestController
@RequestMapping("/politics")
@CrossOrigin
public class PoliticsController {

    @Autowired
    private PoliticsAreaService politicsAreaService;

    @Autowired
    private PoliticsPersonService politicsPersonService;

    @Autowired
    private PoliticsPartyGroupService politicsPartyGroupService;

    @Autowired
    private PoliticsReligionService politicsReligionService;


    /**
     * 批量修改等级
     * @param politicsWeb
     * @return
     */
    @PostMapping("/updatebyids")
    public ResponseResult<Boolean> updateByIds(@RequestBody PoliticsWeb politicsWeb) {
        AssertUtils.notNull(politicsWeb,"参数对象不能为空");
        AssertUtils.notNull(politicsWeb.getIds(),"要修改的id不能为空");
        AssertUtils.greaterThanZero(politicsWeb.getLevelId(),"要修改的等级不能为空");
        switch (politicsWeb.getDimensionality()) {
            case 1:
                //政治人物
                politicsPersonService.updatePersonByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 2:
                //行政区域
                politicsAreaService.updateAreaByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 3:
                //政府及政党
                politicsPartyGroupService.updatePartyGroupByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 4:
                //宗教组织
                politicsReligionService.updateReligionByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 5:
                //政治会议
//                return new ResponseResult<>(byPage);
            default:
                return new ResponseResult<>(RestResultEnum.POLITICS_NULL_ERROR, false);
        }
    }


    /**
     * 批量删除
     * @param politicsWeb
     * @return
     */
    @PostMapping("/deletebyids")
    public ResponseResult<Boolean> deleteByIds(@RequestBody PoliticsWeb politicsWeb) {
        AssertUtils.notNull(politicsWeb,"参数对象不能为空");
        AssertUtils.notNull(politicsWeb.getIds(),"要删除的id不能为空");
        switch (politicsWeb.getDimensionality()) {
            case 1:
                //政治人物
                boolean deletePerson = politicsPersonService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deletePerson);
            case 2:
                //行政区域
                boolean deletedArea = politicsAreaService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deletedArea);
            case 3:
                //政府及政党
                boolean deletePartyGroup = politicsPartyGroupService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deletePartyGroup);
            case 4:
                //宗教组织
                boolean deleteReligion = politicsReligionService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deleteReligion);
            case 5:
                //政治会议
//                return new ResponseResult<>(byPage);
            default:
                return new ResponseResult<>(RestResultEnum.POLITICS_NULL_ERROR, false);
        }
    }

    /**
     * 根据维度 分页查询相应维度的对象
     * 1、政治人物；2、行政区域;3、政府及政党;4、宗教组织;
     * @param politicsWeb
     * @return
     */
    @PostMapping("/findbyparam")
    public ResponseResult<PageInfo> findByParam(@RequestBody PoliticsWeb politicsWeb) {
        AssertUtils.notNull(politicsWeb,"参数对象不能为空");
        switch (politicsWeb.getDimensionality()){
            case 1:
                //政治人物
                PageInfo<PoliticsPersonVo> politicsPersonVoPageInfo = findPersonByPage(politicsWeb);
                return new ResponseResult<>(politicsPersonVoPageInfo);
            case 2:
                //行政区域
                PageInfo<PoliticsAreaVo> politicsAreaVoPageInfo = findAreaByPage(politicsWeb);
                return new ResponseResult<>(politicsAreaVoPageInfo);
            case 3:
                //政府及政党
                PageInfo<PoliticsPartyGroupVo> partyGroupVoPageInfo = findPartyGroupByPage(politicsWeb);
                return new ResponseResult<>(partyGroupVoPageInfo);
            case 4:
                //宗教组织
                PageInfo<PoliticsReligionVo> religionVoPageInfo = findReligionByPage(politicsWeb);
                return new ResponseResult<>(religionVoPageInfo);
            case 5:
                //政治会议
//                return new ResponseResult<>(byPage);
            default:
               return new ResponseResult<>(RestResultEnum.POLITICS_NULL_ERROR,new PageInfo());
        }
    }

    /**
     * 分页查询地区信息
     * @param politicsWeb
     * @return
     */
    public PageInfo<PoliticsAreaVo> findAreaByPage(PoliticsWeb politicsWeb) {
        PoliticsAreaPage politicsAreaPage = new PoliticsAreaPage();
        BeanUtils.copyProperties(politicsWeb,politicsAreaPage);
        List<PoliticsAreaVo> politicsAreaVos = politicsAreaService.findByPage(politicsAreaPage);
        return new PageInfo<>(politicsAreaVos);
    }

    /**
     * 分页查询人物信息
     * @param politicsWeb
     * @return
     */
    public PageInfo<PoliticsPersonVo> findPersonByPage(PoliticsWeb politicsWeb){
        PoliticsPersonPage politicsPersonPage = new PoliticsPersonPage();
        BeanUtils.copyProperties(politicsWeb,politicsPersonPage);
        List<PoliticsPersonVo> politicsPersonVos = politicsPersonService.findByPage(politicsPersonPage);
        return new PageInfo<>(politicsPersonVos);
    }

    /**
     * 分页查询政党信息
     * @param politicsWeb
     * @return
     */
    public PageInfo<PoliticsPartyGroupVo> findPartyGroupByPage(PoliticsWeb politicsWeb){
        PoliticsPartyGroupPage politicsPartyGroupPage = new PoliticsPartyGroupPage();
        BeanUtils.copyProperties(politicsWeb,politicsPartyGroupPage);
        List<PoliticsPartyGroupVo> politicsPartyGroupVos = politicsPartyGroupService.findByPage(politicsPartyGroupPage);
        return new PageInfo<>(politicsPartyGroupVos);
    }

    /**
     * 分页查询部门信息(暂时没用到)
     * @param politicsWeb
     * @return
    public PageInfo<PoliticsDepartmentVo> findDepartmentByPage(PoliticsWeb politicsWeb){
        PoliticsDepartmentPage politicsDepartmentPage = new PoliticsDepartmentPage();
        BeanUtils.copyProperties(politicsWeb,politicsDepartmentPage);
        List<PoliticsDepartmentVo> politicsDepartmentVos = politicsDepartmentService.findByPage(politicsDepartmentPage);
        return new PageInfo<>(politicsDepartmentVos);
    }*/

    /**
     * 分页查询宗教信息
     * @param politicsWeb
     * @return
     */
    public PageInfo<PoliticsReligionVo> findReligionByPage(PoliticsWeb politicsWeb){
        PoliticsReligionPage politicsReligionPage = new PoliticsReligionPage();
        BeanUtils.copyProperties(politicsWeb,politicsReligionPage);
        List<PoliticsReligionVo> politicsReligionVos = politicsReligionService.findByPage(politicsReligionPage);
        return new PageInfo<>(politicsReligionVos);
    }
}

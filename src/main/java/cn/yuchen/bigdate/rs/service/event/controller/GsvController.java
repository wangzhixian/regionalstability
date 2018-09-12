package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GradeVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsWeb;
import cn.yuchen.bigdate.rs.service.event.service.GradeService;
import cn.yuchen.bigdate.rs.service.event.service.GsvAreaService;
import cn.yuchen.bigdate.rs.service.event.service.GsvTerrorService;
import cn.yuchen.bigdate.rs.service.event.service.GsvWeaponService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import cn.yuchen.bigdate.rs.utility.RestResultEnum;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 反恐参数控制类
 * Created by wzx on 2018/9/10.
 */
@RestController
@RequestMapping("/gsv")
@CrossOrigin
public class GsvController {

    @Autowired
    private GsvWeaponService gsvWeaponService;

    @Autowired
    private GsvTerrorService gsvTerrorService;

    @Autowired
    private GsvAreaService gsvAreaService;

    @Autowired
    private GradeService gradeService;


    /**
     * 批量修改
     * @param politicsWeb
     * @return
     */
    @PostMapping("/updateByIds")
    public ResponseResult<Boolean> updateByIds(@RequestBody PoliticsWeb politicsWeb) {
        AssertUtils.notNull(politicsWeb,"参数对象不能为空");
        AssertUtils.notNull(politicsWeb.getIds(),"要修改的id不能为空");
        AssertUtils.greaterThanZero(politicsWeb.getLevelId(),"要修改的等级不能为空");
        switch (politicsWeb.getDimensionality()) {
            case 7:
                //武器等级
                gsvWeaponService.updateWeaponByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 8:
                //恐怖组织
                gsvTerrorService.updateWeaponByIds(politicsWeb);
                return new ResponseResult<>(true);
            case 9:
                //地理位置
                gsvAreaService.updateWeaponByIds(politicsWeb);
                return new ResponseResult<>(true);
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
            case 7:
                //武器等级
                boolean deletedWeapon = gsvWeaponService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deletedWeapon);
            case 8:
                //恐怖组织
                boolean deleteTerror = gsvTerrorService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deleteTerror);
            case 9:
                //地理位置
                boolean deleteArea = gsvAreaService.deleteByIds(politicsWeb.getIds());
                return new ResponseResult<>(deleteArea);
            default:
                return new ResponseResult<>(RestResultEnum.POLITICS_NULL_ERROR, false);
        }
    }



    /**
     * 根据维度 分页查询相应维度的对象
     * @param politicsWeb
     * @return
     */
    @PostMapping("/findbyparam")
    public ResponseResult<PageInfo> findByParam(@RequestBody PoliticsWeb politicsWeb) {
        AssertUtils.notNull(politicsWeb,"参数对象不能为空");
        switch (politicsWeb.getDimensionality()){
            case 6:
                //伤亡人数
                PageInfo<GradeVo> gradeVoPageInfo = findGradeByPage(politicsWeb);
                return new ResponseResult<>(gradeVoPageInfo);
            case 7:
                //武器等级
                PageInfo<GsvWeaponVo> gsvWeaponVoPageInfo = findWeaponByPage(politicsWeb);
                return new ResponseResult<>(gsvWeaponVoPageInfo);
            case 8:
                //恐怖组织
                PageInfo<GsvTerrorVo> gsvTerrorVoPageInfo = findTerrorByPage(politicsWeb);
                return new ResponseResult<>(gsvTerrorVoPageInfo);
            case 9:
                //地理位置
                PageInfo<GsvAreaVo> gsvAreaVoPageInfo = findAreaByPage(politicsWeb);
                return new ResponseResult<>(gsvAreaVoPageInfo);
            default:
                return new ResponseResult<>(RestResultEnum.GSV_NULL_ERROR,new PageInfo());
        }
    }



    /**
     * 分页查询 等级
     * @param politicsWeb
     * @return
     */
    private PageInfo<GradeVo> findGradeByPage(PoliticsWeb politicsWeb) {
        List<GradeVo> gradeVos = gradeService.findByPage(politicsWeb);
        return new PageInfo<>(gradeVos);
    }

    /**
     * 分页查询 地理位置
     * @param politicsWeb
     * @return
     */
    private PageInfo<GsvAreaVo> findAreaByPage(PoliticsWeb politicsWeb) {
        GsvAreaPage gsvAreaPage = new GsvAreaPage();
        BeanUtils.copyProperties(politicsWeb,gsvAreaPage);
        List<GsvAreaVo> gsvAreaVos = gsvAreaService.findByPage(gsvAreaPage);
        return new PageInfo<>(gsvAreaVos);
    }

    /**
     * 分页查询 恐怖组织
     * @param politicsWeb
     * @return
     */
    private PageInfo<GsvTerrorVo> findTerrorByPage(PoliticsWeb politicsWeb) {
        GsvTerrorPage gsvTerrorPage = new GsvTerrorPage();
        BeanUtils.copyProperties(politicsWeb,gsvTerrorPage);
        List<GsvTerrorVo> gsvTerrorVos = gsvTerrorService.findByPage(gsvTerrorPage);
        return new PageInfo<>(gsvTerrorVos);
    }

    /**
     * 分页查询 武器等级
     * @param politicsWeb
     * @return
     */
    private PageInfo<GsvWeaponVo> findWeaponByPage(PoliticsWeb politicsWeb) {
        GsvWeaponPage gsvWeaponPage = new GsvWeaponPage();
        BeanUtils.copyProperties(politicsWeb,gsvWeaponPage);
        List<GsvWeaponVo> gsvWeaponVos = gsvWeaponService.findByPage(gsvWeaponPage);
        return new PageInfo<>(gsvWeaponVos);
    }

}

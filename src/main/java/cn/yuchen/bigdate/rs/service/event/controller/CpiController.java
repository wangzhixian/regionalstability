package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.CpiVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsReligionVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.CpiPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsReligionPage;
import cn.yuchen.bigdate.rs.service.event.service.CpiService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsReligionService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CPI控制类
 */
@RestController
@RequestMapping("/cpi")
@CrossOrigin
public class CpiController {

    @Autowired
    private CpiService cpiService;

    /**
     * 分页查询CPI信息
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<CpiVo>> findByPage(@RequestBody CpiPage cpiPage){
        List<CpiVo> cpiVos = cpiService.findByPage(cpiPage);
        return new ResponseResult<>(new PageInfo<>(cpiVos));
    }


}

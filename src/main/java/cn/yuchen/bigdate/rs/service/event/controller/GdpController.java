package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.CpiVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.CpiPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import cn.yuchen.bigdate.rs.service.event.service.CpiService;
import cn.yuchen.bigdate.rs.service.event.service.GdpService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * GDP控制类
 */

@RestController
@RequestMapping("/gdp")
@CrossOrigin
public class GdpController {

    @Autowired
    private GdpService gdpService;

    /**
     * 分页查询GDP信息
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GdpVo>> findByPage(@RequestBody GdpPage gdpPage){
        List<GdpVo> gdpVos = gdpService.findByPage(gdpPage);
        return new ResponseResult<>(new PageInfo<>(gdpVos));
    }

}

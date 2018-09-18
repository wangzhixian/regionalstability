package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.StockpointVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.StockpointPage;
import cn.yuchen.bigdate.rs.service.event.service.GdpService;
import cn.yuchen.bigdate.rs.service.event.service.StockpointService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 股指信息控制类
 */

@RestController
@RequestMapping("/stockpoint")
@CrossOrigin
public class StockpointController {

    @Autowired
    private StockpointService stockpointService;

    /**
     * 分页查询股指信息
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<StockpointVo>> findByPage(@RequestBody StockpointPage stockpointPage){
        List<StockpointVo> stockpointVos = stockpointService.findByPage(stockpointPage);
        return new ResponseResult<>(new PageInfo<>(stockpointVos));
    }

}

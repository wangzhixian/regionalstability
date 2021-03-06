package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.service.GsvAreaService;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsAreaService;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 反恐地理位置信息控制类
 */
@RestController
@RequestMapping("/gsvarea")
@CrossOrigin
public class GsvAreaController {
    @Autowired
    private GsvAreaService gsvAreaService;

    /**
     * 反恐地理位置信息添加
     * @param gsvAreaVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody GsvAreaVo gsvAreaVo) {
        Boolean result = false;
        int addFlag = gsvAreaService.add(gsvAreaVo);
        if (addFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 反恐地理位置信息删除
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id) {
        Boolean result = false;
        int deleteFlag = gsvAreaService.delete(id);
        if (deleteFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 反恐地理位置信息修改
     * @param gsvAreaVo
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody GsvAreaVo gsvAreaVo) {
        Boolean result = false;
        int updateFlag = gsvAreaService.update(gsvAreaVo);
        if (updateFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID查询反恐地理位置信息
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<GsvAreaVo> findById(@PathVariable("id") Integer id) {
        GsvAreaVo gsvAreaVo = gsvAreaService.findById(id);
        return new ResponseResult<>(gsvAreaVo);
    }

    /**
     * 分页查询反恐地理位置信息
     * @param gsvAreaPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GsvAreaVo>> findByPage(@RequestBody GsvAreaPage gsvAreaPage) {
        List<GsvAreaVo> gsvAreaVos = gsvAreaService.findByPage(gsvAreaPage);
        //使用PageInfo对查询结果进行封装
        return new ResponseResult<>(new PageInfo<>(gsvAreaVos));
    }
}

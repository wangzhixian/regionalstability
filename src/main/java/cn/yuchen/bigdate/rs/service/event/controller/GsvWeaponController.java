package cn.yuchen.bigdate.rs.service.event.controller;

import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import cn.yuchen.bigdate.rs.service.event.service.GsvAreaService;
import cn.yuchen.bigdate.rs.service.event.service.GsvWeaponService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 反恐武器信息控制类
 */
@RestController
@RequestMapping("/gsvweapon")
@CrossOrigin
public class GsvWeaponController {

    @Autowired
    private GsvWeaponService gsvWeaponService;

    /**
     * 添加反恐武器信息
     * @param gsvWeaponVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody GsvWeaponVo gsvWeaponVo) {
        Boolean result = false;
        int addFlag = gsvWeaponService.add(gsvWeaponVo);
        if (addFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID删除反恐武器信息
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id) {
        Boolean result = false;
        int deleteFlag = gsvWeaponService.delete(id);
        if (deleteFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 修改反恐武器信息
     * @param gsvWeaponVo
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody GsvWeaponVo gsvWeaponVo) {
        Boolean result = false;
        int updateFlag = gsvWeaponService.update(gsvWeaponVo);
        if (updateFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID查询反恐武器信息
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<GsvWeaponVo> findById(@PathVariable("id") Integer id) {
        GsvWeaponVo gsvWeaponVo = gsvWeaponService.findById(id);
        return new ResponseResult<>(gsvWeaponVo);
    }

    /**
     * 分页查询反恐武器信息
     * @param gsvWeaponPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GsvWeaponVo>> findByPage(@RequestBody GsvWeaponPage gsvWeaponPage) {
        List<GsvWeaponVo> gsvWeaponVos = gsvWeaponService.findByPage(gsvWeaponPage);
        //使用PageInfo对查询结果进行封装
        return new ResponseResult<>(new PageInfo<>(gsvWeaponVos));
    }

}

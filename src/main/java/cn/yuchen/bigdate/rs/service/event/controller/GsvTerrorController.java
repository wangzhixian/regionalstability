package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvWeaponVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvWeaponPage;
import cn.yuchen.bigdate.rs.service.event.service.GsvTerrorService;
import cn.yuchen.bigdate.rs.service.event.service.GsvWeaponService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 反恐组织信息控制类
 */
@RestController
@RequestMapping("/gsvterror")
@CrossOrigin
public class GsvTerrorController {

    @Autowired
    private GsvTerrorService gsvTerrorService;

    /**
     * 添加反恐组织信息
     * @param gsvTerrorVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody GsvTerrorVo gsvTerrorVo) {
        Boolean result = false;
        int addFlag = gsvTerrorService.add(gsvTerrorVo);
        if (addFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID删除反恐组织信息
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id) {
        Boolean result = false;
        int deleteFlag = gsvTerrorService.delete(id);
        if (deleteFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 修改反恐组织信息
     * @param gsvTerrorVo
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody GsvTerrorVo gsvTerrorVo) {
        Boolean result = false;
        int updateFlag = gsvTerrorService.update(gsvTerrorVo);
        if (updateFlag == 1) {
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID查询反恐组织信息
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<GsvTerrorVo> findById(@PathVariable("id") Integer id) {
        GsvTerrorVo gsvTerrorVo = gsvTerrorService.findById(id);
        return new ResponseResult<>(gsvTerrorVo);
    }

    /**
     * 分页查询反恐组织信息
     * @param gsvTerrorPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GsvTerrorVo>> findByPage(@RequestBody GsvTerrorPage gsvTerrorPage) {
        List<GsvTerrorVo> gsvTerrorVos = gsvTerrorService.findByPage(gsvTerrorPage);
        //使用PageInfo对查询结果进行封装
        return new ResponseResult<>(new PageInfo<>(gsvTerrorVos));
    }

}

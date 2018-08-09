package cn.yuchen.bigdate.rs.sysmanage.controller;

import cn.yuchen.bigdate.rs.sysmanage.pojo.po.SysPowerPo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysPowerVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.sysmanage.service.SysPowerService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 权限控制类
 * Created by wzx on 2018/8/8.
 */
@RestController
@RequestMapping("/syspower")
@CrossOrigin
public class SysPowerController {

    @Autowired
    private SysPowerService sysPowerService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody SysPowerVo sysPowerVo){
        Boolean result = false;
        int addFlag = sysPowerService.add(sysPowerVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody SysPowerVo sysPowerVo){
        Boolean result = false;
        int updateFlag = sysPowerService.update(sysPowerVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = sysPowerService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/find/{id}")
    public ResponseResult<SysPowerVo> findById(@PathVariable("id") Long id){
        SysPowerVo vo = sysPowerService.findById(id);
        return new ResponseResult<>(vo);
    }

    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<SysPowerVo>> findByPage(@RequestBody SysPageVo sysPageVo){
        List<SysPowerVo> sysPowerVos =  sysPowerService.findByPage(sysPageVo);
        return new ResponseResult<>(new PageInfo<>(sysPowerVos));
    }
}


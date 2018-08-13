package cn.yuchen.bigdate.rs.service.sysmanage.controller;

import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysRoleVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.vo.SysUserVo;
import cn.yuchen.bigdate.rs.service.sysmanage.pojo.webvo.SysPageVo;
import cn.yuchen.bigdate.rs.service.sysmanage.service.SysRoleService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色控制类
 * Created by wzx on 2018/8/8.
 */
@RestController
@RequestMapping("/sysrole")
@CrossOrigin
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody SysRoleVo sysRoleVo){
        Boolean result = false;
        int addFlag = sysRoleService.add(sysRoleVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody SysRoleVo sysRoleVo){
        Boolean result = false;
        int updateFlag = sysRoleService.update(sysRoleVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Long id){
        Boolean result = false;
        int deleteFlag = sysRoleService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    @PostMapping("/find/{id}")
    public ResponseResult<SysRoleVo> findById(@PathVariable("id") Long id){
        SysRoleVo vo = sysRoleService.findById(id);
        return new ResponseResult<>(vo);
    }

    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<SysRoleVo>> findByPage(@RequestBody SysPageVo sysPageVo){
        List<SysRoleVo> sysRoleVos =  sysRoleService.findByPage(sysPageVo);
        return new ResponseResult<>(new PageInfo<>(sysRoleVos));
    }

}

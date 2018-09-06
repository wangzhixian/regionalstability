package cn.yuchen.bigdate.rs.service.event.controller;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.service.PoliticsDepartmentService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门控制类
 * Created by lgd on 2018/8/30.
 */
@RestController
@RequestMapping("/department")
@CrossOrigin
public class PoliticsDepartmenController {

    @Autowired
    private PoliticsDepartmentService politicsDepartmentService;

    /**
     * 添加部门信息
     * @param politicsDepartmentVo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Boolean> add(@RequestBody PoliticsDepartmentVo politicsDepartmentVo){
        Boolean result = false;
        int addFlag = politicsDepartmentService.add(politicsDepartmentVo);
        if(addFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据id删除部门信息
     * @param id
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseResult<Boolean> delete(@PathVariable("id") Integer id){
        Boolean result = false;
        int deleteFlag = politicsDepartmentService.delete(id);
        if(deleteFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 修改部门信息
     * @param politicsDepartmentVo
     * @return
     */
    @PostMapping("/update")
    public ResponseResult<Boolean> update(@RequestBody PoliticsDepartmentVo politicsDepartmentVo){
        Boolean result = false;
        int updateFlag = politicsDepartmentService.update(politicsDepartmentVo);
        if(updateFlag == 1){
            result = true;
        }
        return new ResponseResult<>(result);
    }

    /**
     * 根据ID查询部门详情
     * @param id
     * @return
     */
    @PostMapping("/find/{id}")
    public ResponseResult<PoliticsDepartmentVo> findById(@PathVariable("id") Integer id){

        PoliticsDepartmentVo politicsDepartmentVo = politicsDepartmentService.findById(id);

        return new ResponseResult<>(politicsDepartmentVo);
    }

    /**
     * 分页条件查询部门信息
     * @param politicsDepartmentPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<PoliticsDepartmentVo>> findByPage(@RequestBody PoliticsDepartmentPage politicsDepartmentPage){
        List<PoliticsDepartmentVo> politicsDepartmentVos = politicsDepartmentService.findByPage(politicsDepartmentPage);
        return new ResponseResult<>(new PageInfo<>(politicsDepartmentVos));
    }
}

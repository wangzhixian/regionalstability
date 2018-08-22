package cn.yuchen.bigdate.rs.service.information.controller;

import cn.yuchen.bigdate.rs.service.information.pojo.po.GtdPo;
import cn.yuchen.bigdate.rs.service.information.pojo.webpo.GtdPage;
import cn.yuchen.bigdate.rs.service.information.service.GtdInformationService;
import cn.yuchen.bigdate.rs.service.model.pojo.vo.ModelVo;
import cn.yuchen.bigdate.rs.service.model.pojo.webvo.ModelPageVo;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.List;

/**
 * 反恐数据控制器
 * Created by wzx on 2018/8/15.
 */
@RestController
@RequestMapping("/gtd")
@CrossOrigin
public class GtdInformationController {

    @Autowired
    private GtdInformationService gtdInformationService;

    /**
     * 导入表格
     * @param file
     * @return
     */
    @PostMapping("/import")
    public ResponseResult<Boolean> importData(@RequestParam MultipartFile file) throws ParseException {
        System.out.println("读取中...");
        gtdInformationService.readExcel(file);
        System.out.println("读取结束...");
        return new ResponseResult<>(true);
    }

    /**
     * 分页查询GTD数据
     * @param gtdPage
     * @return
     */
    @PostMapping("/findbypage")
    public ResponseResult<PageInfo<GtdPo>> findByPage(@RequestBody GtdPage gtdPage){
        List<GtdPo> gtdPos =  gtdInformationService.findByPage(gtdPage);
        return new ResponseResult<>(new PageInfo<>(gtdPos));
    }

}

package cn.yuchen.bigdate.rs.service.hs.controller;

import cn.yuchen.bigdate.rs.service.hs.pojo.vo.CountryVo;
import cn.yuchen.bigdate.rs.service.hs.service.CountryService;
import cn.yuchen.bigdate.rs.utility.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wzx on 2018/8/27.
 */
@RestController
@RequestMapping("/hs")
@CrossOrigin
public class CountryController {
    @Autowired
    private CountryService countryService;

    /**
     * 获取所有国家编号与名称
     * @return
     */
    @PostMapping("/findall")
    public ResponseResult<List<CountryVo>> findAll(){
        List<CountryVo> vos = countryService.findAll();
        return new ResponseResult<>(vos);
    }
}

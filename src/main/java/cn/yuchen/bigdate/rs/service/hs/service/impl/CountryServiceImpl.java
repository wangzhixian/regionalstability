package cn.yuchen.bigdate.rs.service.hs.service.impl;

import cn.yuchen.bigdate.rs.service.hs.dao.CountryDao;
import cn.yuchen.bigdate.rs.service.hs.pojo.po.CountryPo;
import cn.yuchen.bigdate.rs.service.hs.pojo.vo.CountryVo;
import cn.yuchen.bigdate.rs.service.hs.service.CountryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzx on 2018/8/27.
 */
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;


    @Override
    public List<CountryVo> findAll() {
        List<CountryPo> countryPos = countryDao.selectAll();
        List<CountryVo> vos = new ArrayList<>();
        countryPos.forEach(countryPo -> {
            CountryVo vo = new CountryVo();
            BeanUtils.copyProperties(countryPo,vo);
            vos.add(vo);
        });
        return vos;
    }
}

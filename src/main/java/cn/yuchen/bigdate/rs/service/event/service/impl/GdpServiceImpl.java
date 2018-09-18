package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.CpiDao;
import cn.yuchen.bigdate.rs.service.event.dao.GdpDao;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GdpVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GdpPage;
import cn.yuchen.bigdate.rs.service.event.service.GdpService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class GdpServiceImpl implements GdpService {

    @Autowired
    GdpDao gdpDao;
    @Override
    public List<GdpVo> findByPage(GdpPage gdpPage) {

        if(Objects.isNull(gdpPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(gdpPage.getPageNum(),gdpPage.getPageSize());
        return gdpDao.selectByPage(gdpPage);
    }
}

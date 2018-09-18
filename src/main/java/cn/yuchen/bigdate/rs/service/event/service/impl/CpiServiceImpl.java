package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.CpiDao;
import cn.yuchen.bigdate.rs.service.event.dao.PoliticsReligionDao;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.CpiVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.CpiPage;
import cn.yuchen.bigdate.rs.service.event.service.CpiService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class CpiServiceImpl implements CpiService {

    @Autowired
    CpiDao cpiDao;
    @Override
    public List<CpiVo> findByPage(CpiPage cpiPage) {

        if(Objects.isNull(cpiPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(cpiPage.getPageNum(),cpiPage.getPageSize());
        return cpiDao.selectByPage(cpiPage);

    }
}

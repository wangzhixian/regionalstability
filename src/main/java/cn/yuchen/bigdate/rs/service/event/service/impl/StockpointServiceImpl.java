package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GdpDao;
import cn.yuchen.bigdate.rs.service.event.dao.StockpointDao;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.StockpointVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.StockpointPage;
import cn.yuchen.bigdate.rs.service.event.service.StockpointService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class StockpointServiceImpl implements StockpointService {
    @Autowired
    StockpointDao stockpointDao;
    @Override
    public List<StockpointVo> findByPage(StockpointPage stockpointPage) {
        if(Objects.isNull(stockpointPage)){
            return new ArrayList<>();
        }
        PageHelper.startPage(stockpointPage.getPageNum(),stockpointPage.getPageSize());
        return stockpointDao.selectByPage(stockpointPage);
    }
}

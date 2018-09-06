package cn.yuchen.bigdate.rs.service.event.service.impl;

import cn.yuchen.bigdate.rs.service.event.dao.GsvAreaDao;
import cn.yuchen.bigdate.rs.service.event.dao.GsvTerrorDao;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvAreaPo;
import cn.yuchen.bigdate.rs.service.event.pojo.po.GsvTerrorPo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.GsvTerrorVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsAreaVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvAreaPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.GsvTerrorPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsAreaPage;
import cn.yuchen.bigdate.rs.service.event.service.GsvTerrorService;
import cn.yuchen.bigdate.rs.utility.AssertUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GsvTerrorServiceImpl implements GsvTerrorService {

    @Autowired
    private GsvTerrorDao gsvAreaDao;

    @Override
    public int add(GsvTerrorVo gsvTerrorVo) {

        AssertUtils.notNull(gsvTerrorVo,"添加地理位置对象不能为空");

        GsvTerrorPo po = new GsvTerrorPo();
        //将vo复制给po
        BeanUtils.copyProperties(gsvTerrorVo,po);
        //数据库操作po
        return gsvAreaDao.insert(po);
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int update(GsvTerrorVo gsvTerrorVo) {
        return 0;
    }

    @Override
    public GsvTerrorVo findById(Integer id) {
        return null;
    }

    @Override
    public List<GsvTerrorVo> findByPage(GsvTerrorPage gsvTerrorPage) {
        return null;
    }
}

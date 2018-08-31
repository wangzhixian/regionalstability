package cn.yuchen.bigdate.rs.service.event.service;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsDepartmentVo;
import cn.yuchen.bigdate.rs.service.event.pojo.vo.PoliticsPartyGroupVo;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsDepartmentPage;
import cn.yuchen.bigdate.rs.service.event.pojo.webpage.PoliticsPartyGroupPage;

import java.util.List;

/**
 * Created by lgd on 2018/8/30.
 */
public interface PoliticsPartyGroupService {

    int add(PoliticsPartyGroupVo politicsPartyGroupVo);

    int delete(Integer id);

    int update(PoliticsPartyGroupVo politicsPartyGroupVo);

    PoliticsPartyGroupVo findById(Integer id);

    List<PoliticsPartyGroupVo> findByPage(PoliticsPartyGroupPage politicsPartyGroupPage);
}

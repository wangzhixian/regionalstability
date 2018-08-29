package cn.yuchen.bigdate.rs.service.information.pojo.vo;

import cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news.Tagdata;
import cn.yuchen.bigdate.rs.utility.PageUtils;

import java.util.List;

/**
 * Created by wzx on 2018/8/28.
 */
public class NewsPageVo extends PageUtils {
    /**
     * 总数
     */
    private long total;
    /**
     * 数据
     */
    private List<Tagdata> tagdatas;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Tagdata> getTagdatas() {
        return tagdatas;
    }

    public void setTagdatas(List<Tagdata> tagdatas) {
        this.tagdatas = tagdatas;
    }

    @Override
    public String toString() {
        return "NewsPageVo{" +
                "total=" + total +
                ", tagdatas=" + tagdatas +
                '}';
    }
}

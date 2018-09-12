package cn.yuchen.bigdate.rs.service.event.pojo.webpage;

import cn.yuchen.bigdate.rs.utility.PageUtils;

import java.util.List;

/**
 * 政治参数页面接受参数对象
 * Created by wzx on 2018/9/5.
 */
public class PoliticsWeb extends PageUtils {
    /**
     * 国家ID
     */
    private Integer countryId;
    /**
     * 维度:1、政治人物，2、行政区域，3、政府及政党，4、宗教组织，5、政治会议，6、伤亡人数，7、武器等级，8、恐怖组织，9、地理位置
     */
    private Integer dimensionality;
    /**
     * 等级
     */
    private Integer levelId;

    /**
     * 批量处理id组
     */
    private List<Integer> ids;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getDimensionality() {
        return dimensionality;
    }

    public void setDimensionality(Integer dimensionality) {
        this.dimensionality = dimensionality;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "PoliticsWeb{" +
                "countryId=" + countryId +
                ", dimensionality=" + dimensionality +
                ", levelId=" + levelId +
                '}';
    }
}

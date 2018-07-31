package cn.yuchen.bigdate.rs.model.pojo.webvo;

import cn.yuchen.bigdate.rs.utility.PageUtils;

/**
 * 用于分页条件查询的模型对象
 * Created by wzx on 2018/7/27.
 */
public class ModelPageVo extends PageUtils {
    /**
     * 名称
     */
    private String name;
    /**
     * 模型类型 :  politics 政治模型,economic 经济模型,terrorism 反恐模型 , stable 区域稳定性模型
     */
    private String scene;
    /**
     * 描述
     */
    private String script;
    /**
     * 模型id（外键）
     */
    private Integer modelId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Override
    public String toString() {
        return "ModelPageVo{" +
                "name='" + name + '\'' +
                ", scene='" + scene + '\'' +
                ", script='" + script + '\'' +
                ", modelId=" + modelId +
                '}';
    }
}

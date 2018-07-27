package cn.yuchen.bigdate.rs.model.pojo.pagevo;

import cn.yuchen.bigdate.rs.utility.PageUtils;

/**
 * 用于分页条件查询的模型对象
 * Created by wzx on 2018/7/27.
 */
public class ModelPageVo extends PageUtils {
    /**
     * 模型名称
     */
    private String name;
    /**
     * 模型类型 :  politics 政治模型,economic 经济模型,terrorism 反恐模型 , stable 区域稳定性模型
     */
    private String scene;
    /**
     * 模型描述
     */
    private String script;

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

    @Override
    public String toString() {
        return "ModelPageVo{" +
                "name='" + name + '\'' +
                ", scene='" + scene + '\'' +
                ", script='" + script + '\'' +
                '}';
    }
}

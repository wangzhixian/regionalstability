package cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news;

import org.bson.types.ObjectId;

import java.io.Serializable;

/**
 * Created by wzx on 2018/8/14.
 */
public class Tagdata implements Serializable {

    private static final long serialVersionUID = -4690657246900789092L;
    /**
     * id
     */
    private ObjectId id;
    /**
     * 命名实体识别
     */
    private Entity entity;
    /**
     * 词性标识
     */
    private Tagging tagging;
    /**
     * 原新闻属性
     */
    private Attr attr;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Tagging getTagging() {
        return tagging;
    }

    public void setTagging(Tagging tagging) {
        this.tagging = tagging;
    }

    public Attr getAttr() {
        return attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "Tagdata{" +
                "id=" + id +
                ", entity=" + entity +
                ", tagging=" + tagging +
                ", attr=" + attr +
                '}';
    }
}

package cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by wzx on 2018/8/14.
 */
public class Entity implements Serializable {
    public Entity() {
    }

    public Entity(ArrayList<String> PERSON, ArrayList<String> NORP, ArrayList<String> FAC, ArrayList<String> ORG, ArrayList<String> GPE, ArrayList<String> LOC, ArrayList<String> PRODUCT, ArrayList<String> EVENT, ArrayList<String> WORK_OF_ART, ArrayList<String> LAW, ArrayList<String> LANGUAGE, ArrayList<String> DATE, ArrayList<String> TIME, ArrayList<String> PERCENT, ArrayList<String> MONEY, ArrayList<String> QUANTITY, ArrayList<String> ORDINAL, ArrayList<String> CARDINAL, ArrayList<String> SPEC) {
        this.PERSON = PERSON;
        this.NORP = NORP;
        this.FAC = FAC;
        this.ORG = ORG;
        this.GPE = GPE;
        this.LOC = LOC;
        this.PRODUCT = PRODUCT;
        this.EVENT = EVENT;
        this.WORK_OF_ART = WORK_OF_ART;
        this.LAW = LAW;
        this.LANGUAGE = LANGUAGE;
        this.DATE = DATE;
        this.TIME = TIME;
        this.PERCENT = PERCENT;
        this.MONEY = MONEY;
        this.QUANTITY = QUANTITY;
        this.ORDINAL = ORDINAL;
        this.CARDINAL = CARDINAL;
        this.SPEC = SPEC;
    }

    private static final long serialVersionUID = -3452785441215615258L;
    /**
     * 人名
     */
    private ArrayList<String> PERSON;
    /**
     * 民族、宗教或者政治组织
     */
    private ArrayList<String> NORP;
    /**
     * 建筑、机场、铁路、桥梁等
     */
    private ArrayList<String> FAC;
    /**
     * 公司、代理、机构等
     */
    private ArrayList<String> ORG;
    /**
     * 国家、城市、州
     */
    private ArrayList<String> GPE;
    /**
     * 非GPE的位置，山脉、水体
     */
    private ArrayList<String> LOC;
    /**
     * 对象、交通工具、食物等
     */
    private ArrayList<String> PRODUCT;
    /**
     * 飓风、战争、冲突、体育事件等
     */
    private ArrayList<String> EVENT;
    /**
     * 书和歌曲的标题等
     */
    private ArrayList<String> WORK_OF_ART;
    /**
     * 法律相关文件
     */
    private ArrayList<String> LAW;
    /**
     * 语言名词
     */
    private ArrayList<String> LANGUAGE;
    /**
     * 绝对或者相对日期和年代
     */
    private ArrayList<String> DATE;
    /**
     * 小于一天的时间
     */
    private ArrayList<String> TIME;
    /**
     * 百分比
     */
    private ArrayList<String> PERCENT;
    /**
     * 货币相关，包括单位
     */
    private ArrayList<String> MONEY;
    /**
     * 测量单位，如重量、距离
     */
    private ArrayList<String> QUANTITY;
    /**
     * “第一”、“第二”等
     */
    private ArrayList<String> ORDINAL;
    /**
     * 不属于另一种类型的数字
     */
    private ArrayList<String> CARDINAL;
    /**
     * 特殊实体
     */
    private ArrayList<String> SPEC;

    public ArrayList<String> getPERSON() {
        return PERSON;
    }

    public void setPERSON(ArrayList<String> PERSON) {
        this.PERSON = PERSON;
    }

    public ArrayList<String> getNORP() {
        return NORP;
    }

    public void setNORP(ArrayList<String> NORP) {
        this.NORP = NORP;
    }

    public ArrayList<String> getFAC() {
        return FAC;
    }

    public void setFAC(ArrayList<String> FAC) {
        this.FAC = FAC;
    }

    public ArrayList<String> getORG() {
        return ORG;
    }

    public void setORG(ArrayList<String> ORG) {
        this.ORG = ORG;
    }

    public ArrayList<String> getGPE() {
        return GPE;
    }

    public void setGPE(ArrayList<String> GPE) {
        this.GPE = GPE;
    }

    public ArrayList<String> getLOC() {
        return LOC;
    }

    public void setLOC(ArrayList<String> LOC) {
        this.LOC = LOC;
    }

    public ArrayList<String> getPRODUCT() {
        return PRODUCT;
    }

    public void setPRODUCT(ArrayList<String> PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    public ArrayList<String> getEVENT() {
        return EVENT;
    }

    public void setEVENT(ArrayList<String> EVENT) {
        this.EVENT = EVENT;
    }

    public ArrayList<String> getWORK_OF_ART() {
        return WORK_OF_ART;
    }

    public void setWORK_OF_ART(ArrayList<String> WORK_OF_ART) {
        this.WORK_OF_ART = WORK_OF_ART;
    }

    public ArrayList<String> getLAW() {
        return LAW;
    }

    public void setLAW(ArrayList<String> LAW) {
        this.LAW = LAW;
    }

    public ArrayList<String> getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(ArrayList<String> LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public ArrayList<String> getDATE() {
        return DATE;
    }

    public void setDATE(ArrayList<String> DATE) {
        this.DATE = DATE;
    }

    public ArrayList<String> getTIME() {
        return TIME;
    }

    public void setTIME(ArrayList<String> TIME) {
        this.TIME = TIME;
    }

    public ArrayList<String> getPERCENT() {
        return PERCENT;
    }

    public void setPERCENT(ArrayList<String> PERCENT) {
        this.PERCENT = PERCENT;
    }

    public ArrayList<String> getMONEY() {
        return MONEY;
    }

    public void setMONEY(ArrayList<String> MONEY) {
        this.MONEY = MONEY;
    }

    public ArrayList<String> getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(ArrayList<String> QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public ArrayList<String> getORDINAL() {
        return ORDINAL;
    }

    public void setORDINAL(ArrayList<String> ORDINAL) {
        this.ORDINAL = ORDINAL;
    }

    public ArrayList<String> getCARDINAL() {
        return CARDINAL;
    }

    public void setCARDINAL(ArrayList<String> CARDINAL) {
        this.CARDINAL = CARDINAL;
    }

    public ArrayList<String> getSPEC() {
        return SPEC;
    }

    public void setSPEC(ArrayList<String> SPEC) {
        this.SPEC = SPEC;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "PERSON=" + PERSON +
                ", NORP=" + NORP +
                ", FAC=" + FAC +
                ", ORG=" + ORG +
                ", GPE=" + GPE +
                ", LOC=" + LOC +
                ", PRODUCT=" + PRODUCT +
                ", EVENT=" + EVENT +
                ", WORK_OF_ART=" + WORK_OF_ART +
                ", LAW=" + LAW +
                ", LANGUAGE=" + LANGUAGE +
                ", DATE=" + DATE +
                ", TIME=" + TIME +
                ", PERCENT=" + PERCENT +
                ", MONEY=" + MONEY +
                ", QUANTITY=" + QUANTITY +
                ", ORDINAL=" + ORDINAL +
                ", CARDINAL=" + CARDINAL +
                ", SPEC=" + SPEC +
                '}';
    }
}

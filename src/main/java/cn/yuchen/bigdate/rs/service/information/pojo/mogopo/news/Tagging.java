package cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by wzx on 2018/8/14.
 */
public class Tagging implements Serializable {


    private static final long serialVersionUID = -4647808533126434156L;
    /**
     * 未分类的词性
     */
    private Object raw;
    /**
     * 代词
     */
    private ArrayList<String> PRON;
    /**
     * 形容词
     */
    private ArrayList<String> ADJ;
    /**
     * 副词
     */
    private ArrayList<String> ADV;
    /**
     * 动词
     */
    private ArrayList<String> VERB;
    /**
     * 名词
     */
    private ArrayList<String> NOUN;
    /**
     * 连词
     */
    private ArrayList<String> CONJ;

    /**
     * 专有名词
     */
    private ArrayList<String> PROPN;

    /**
     * 符号
     */
    private ArrayList<String> SYM;
    /**
     * 其他
     */
    private ArrayList<String> X;

    /**
     * 其他
     */
    private ArrayList<String> Q;

    /**
     * 其他
     */
    private ArrayList<String> NUM;


    public Object getRaw() {
        return raw;
    }

    public void setRaw(Object raw) {
        this.raw = raw;
    }

    public ArrayList<String> getPRON() {
        return PRON;
    }

    public void setPRON(ArrayList<String> PRON) {
        this.PRON = PRON;
    }

    public ArrayList<String> getADJ() {
        return ADJ;
    }

    public void setADJ(ArrayList<String> ADJ) {
        this.ADJ = ADJ;
    }

    public ArrayList<String> getADV() {
        return ADV;
    }

    public void setADV(ArrayList<String> ADV) {
        this.ADV = ADV;
    }

    public ArrayList<String> getVERB() {
        return VERB;
    }

    public void setVERB(ArrayList<String> VERB) {
        this.VERB = VERB;
    }

    public ArrayList<String> getNOUN() {
        return NOUN;
    }

    public void setNOUN(ArrayList<String> NOUN) {
        this.NOUN = NOUN;
    }

    public ArrayList<String> getCONJ() {
        return CONJ;
    }

    public void setCONJ(ArrayList<String> CONJ) {
        this.CONJ = CONJ;
    }

    public ArrayList<String> getPROPN() {
        return PROPN;
    }

    public void setPROPN(ArrayList<String> PROPN) {
        this.PROPN = PROPN;
    }

    public ArrayList<String> getSYM() {
        return SYM;
    }

    public void setSYM(ArrayList<String> SYM) {
        this.SYM = SYM;
    }

    public ArrayList<String> getX() {
        return X;
    }

    public void setX(ArrayList<String> x) {
        X = x;
    }

    public ArrayList<String> getQ() {
        return Q;
    }

    public void setQ(ArrayList<String> q) {
        Q = q;
    }

    public ArrayList<String> getNUM() {
        return NUM;
    }

    public void setNUM(ArrayList<String> NUM) {
        this.NUM = NUM;
    }

    @Override
    public String toString() {
        return "Tagging{" +
                "raw=" + raw +
                ", PRON=" + PRON +
                ", ADJ=" + ADJ +
                ", ADV=" + ADV +
                ", VERB=" + VERB +
                ", NOUN=" + NOUN +
                ", CONJ=" + CONJ +
                ", PROPN=" + PROPN +
                ", SYM=" + SYM +
                ", X=" + X +
                ", Q=" + Q +
                ", NUM=" + NUM +
                '}';
    }
}

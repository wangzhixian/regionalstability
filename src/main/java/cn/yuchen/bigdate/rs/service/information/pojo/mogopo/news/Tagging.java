package cn.yuchen.bigdate.rs.service.information.pojo.mogopo.news;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by wzx on 2018/8/14.
 */
public class Tagging implements Serializable {

    public Tagging(Object raw, ArrayList<String> PRON, ArrayList<String> ADJ, ArrayList<String> ADV, ArrayList<String> VERB, ArrayList<String> NOUN, ArrayList<String> AUX, ArrayList<String> CONJ, ArrayList<String> CCONJ, ArrayList<String> DET, ArrayList<String> INTJ, ArrayList<String> PART, ArrayList<String> PROPN, ArrayList<String> SCONJ, ArrayList<String> SYM, ArrayList<String> x, ArrayList<String> SPACE) {
        this.raw = raw;
        this.PRON = PRON;
        this.ADJ = ADJ;
        this.ADV = ADV;
        this.VERB = VERB;
        this.NOUN = NOUN;
        this.AUX = AUX;
        this.CONJ = CONJ;
        this.CCONJ = CCONJ;
        this.DET = DET;
        this.INTJ = INTJ;
        this.PART = PART;
        this.PROPN = PROPN;
        this.SCONJ = SCONJ;
        this.SYM = SYM;
        this.X = x;
        this.SPACE = SPACE;
    }

    public Tagging() {
    }

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
     * 助动词
     */
    private ArrayList<String> AUX;
    /**
     * 连词
     */
    private ArrayList<String> CONJ;
    /**
     * 并列连词
     */
    private ArrayList<String> CCONJ;
    /**
     * 限定词
     */
    private ArrayList<String> DET;
    /**
     * 感叹词
     */
    private ArrayList<String> INTJ;
    /**
     * 小品词
     */
    private ArrayList<String> PART;
    /**
     * 专有名词
     */
    private ArrayList<String> PROPN;
    /**
     * 从属连词
     */
    private ArrayList<String> SCONJ;
    /**
     * 符号
     */
    private ArrayList<String> SYM;
    /**
     * 其他
     */
    private ArrayList<String> X;
    /**
     * 空格
     */
    private ArrayList<String> SPACE;

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

    public ArrayList<String> getAUX() {
        return AUX;
    }

    public void setAUX(ArrayList<String> AUX) {
        this.AUX = AUX;
    }

    public ArrayList<String> getCONJ() {
        return CONJ;
    }

    public void setCONJ(ArrayList<String> CONJ) {
        this.CONJ = CONJ;
    }

    public ArrayList<String> getCCONJ() {
        return CCONJ;
    }

    public void setCCONJ(ArrayList<String> CCONJ) {
        this.CCONJ = CCONJ;
    }

    public ArrayList<String> getDET() {
        return DET;
    }

    public void setDET(ArrayList<String> DET) {
        this.DET = DET;
    }

    public ArrayList<String> getINTJ() {
        return INTJ;
    }

    public void setINTJ(ArrayList<String> INTJ) {
        this.INTJ = INTJ;
    }

    public ArrayList<String> getPART() {
        return PART;
    }

    public void setPART(ArrayList<String> PART) {
        this.PART = PART;
    }

    public ArrayList<String> getPROPN() {
        return PROPN;
    }

    public void setPROPN(ArrayList<String> PROPN) {
        this.PROPN = PROPN;
    }

    public ArrayList<String> getSCONJ() {
        return SCONJ;
    }

    public void setSCONJ(ArrayList<String> SCONJ) {
        this.SCONJ = SCONJ;
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

    public ArrayList<String> getSPACE() {
        return SPACE;
    }

    public void setSPACE(ArrayList<String> SPACE) {
        this.SPACE = SPACE;
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
                ", AUX=" + AUX +
                ", CONJ=" + CONJ +
                ", CCONJ=" + CCONJ +
                ", DET=" + DET +
                ", INTJ=" + INTJ +
                ", PART=" + PART +
                ", PROPN=" + PROPN +
                ", SCONJ=" + SCONJ +
                ", SYM=" + SYM +
                ", X=" + X +
                ", SPACE=" + SPACE +
                '}';
    }
}

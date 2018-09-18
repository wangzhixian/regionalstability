package cn.yuchen.bigdate.rs.service.information.pojo.po;

public class EventBasePoWithBLOBs extends EventBasePo {
    private String orginizations;

    private String sites;

    private String relevants;

    private String people;

    private String bound;

    private String infrastructure;

    private String militaryfacor;

    private String naturefactor;

    private String keywords;

    private String parent;

    private String weapons;

    private String casualties;


    public String getOrginizations() {
        return orginizations;
    }

    public void setOrginizations(String orginizations) {
        this.orginizations = orginizations == null ? null : orginizations.trim();
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites == null ? null : sites.trim();
    }

    public String getRelevants() {
        return relevants;
    }

    public void setRelevants(String relevants) {
        this.relevants = relevants == null ? null : relevants.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound == null ? null : bound.trim();
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure == null ? null : infrastructure.trim();
    }

    public String getMilitaryfacor() {
        return militaryfacor;
    }

    public void setMilitaryfacor(String militaryfacor) {
        this.militaryfacor = militaryfacor == null ? null : militaryfacor.trim();
    }

    public String getNaturefactor() {
        return naturefactor;
    }

    public void setNaturefactor(String naturefactor) {
        this.naturefactor = naturefactor == null ? null : naturefactor.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons == null ? null : weapons.trim();
    }

    public String getCasualties() {
        return casualties;
    }

    public void setCasualties(String casualties) {
        this.casualties = casualties == null ? null : casualties.trim();
    }
}
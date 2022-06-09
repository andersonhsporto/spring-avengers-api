package com.apivengers.model;

public class Informations {
    private int name;
    private String  url;
    private String  alias;
    private String  aliasBr;
    private String  apearance;
    private String  current;
    private String  gender;
    private String  Probationary;
    private String  full;
    private String  year;
    private String  yearSinceJoining;
    private String  honorary;
    private String  death;
    private String  returns;
    private String  secondDeath;
    private String  secondReturns;
    private String  notes;

    public Informations(int name, String url, String alias, String aliasBr, String apearance, String current, String gender, String probationary, String full, String year, String yearSinceJoining, String honorary, String death, String returns, String secondDeath, String secondReturns, String notes) {
        this.name = name;
        this.url = url;
        this.alias = alias;
        this.aliasBr = aliasBr;
        this.apearance = apearance;
        this.current = current;
        this.gender = gender;
        Probationary = probationary;
        this.full = full;
        this.year = year;
        this.yearSinceJoining = yearSinceJoining;
        this.honorary = honorary;
        this.death = death;
        this.returns = returns;
        this.secondDeath = secondDeath;
        this.secondReturns = secondReturns;
        this.notes = notes;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAliasBr() {
        return aliasBr;
    }

    public void setAliasBr(String aliasBr) {
        this.aliasBr = aliasBr;
    }

    public String getApearance() {
        return apearance;
    }

    public void setApearance(String apearance) {
        this.apearance = apearance;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProbationary() {
        return Probationary;
    }

    public void setProbationary(String probationary) {
        Probationary = probationary;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYearSinceJoining() {
        return yearSinceJoining;
    }

    public void setYearSinceJoining(String yearSinceJoining) {
        this.yearSinceJoining = yearSinceJoining;
    }

    public String getHonorary() {
        return honorary;
    }

    public void setHonorary(String honorary) {
        this.honorary = honorary;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getReturns() {
        return returns;
    }

    public void setReturns(String returns) {
        this.returns = returns;
    }

    public String getSecondDeath() {
        return secondDeath;
    }

    public void setSecondDeath(String secondDeath) {
        this.secondDeath = secondDeath;
    }

    public String getSecondReturns() {
        return secondReturns;
    }

    public void setSecondReturns(String secondReturns) {
        this.secondReturns = secondReturns;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

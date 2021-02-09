package com.gsenc.api.model;

public class DateFormat {
    private String beforeDate;

    private String beforePattern;

    private String afterDate;

    private String afterPattern;

    public String getBeforeDate() {
        return beforeDate;
    }

    public void setBeforeDate(String beforeDate) {
        this.beforeDate = beforeDate;
    }

    public String getBeforePattern() {
        return beforePattern;
    }

    public void setBeforePattern(String beforePattern) {
        this.beforePattern = beforePattern;
    }

    public String getAfterPattern() {
        return afterPattern;
    }

    public void setAfterPattern(String afterPattern) {
        this.afterPattern = afterPattern;
    }

    public String getAfterDate() {
        return afterDate;
    }

    public void setAfterDate(String afterDate) {
        this.afterDate = afterDate;
    }
}

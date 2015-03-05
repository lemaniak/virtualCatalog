package com.codgen.virtualcatalog.domain;

/**
 * Created by vicente on 07/12/14.
 */
public enum SexType {
    MALE ("Male"),
    FEMALE ("Female");

    private SexType(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

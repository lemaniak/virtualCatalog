package com.codgen.virtualcatalog.domain;

/**
 * Created by vicente on 09/12/14.
 */
public enum Role {
    ADMIN ("Admin"),
    USER ("User");

    private Role(String value) {
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

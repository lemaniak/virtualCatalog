package com.codgen.virtualcatalog.domain;

/**
 * Created by vicente on 09/12/14.
 */
public enum Role {
    ADMIN ("admin"),
    USER ("user");

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

    public static Role fromValue(String v) {
        for (Role c : Role.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}

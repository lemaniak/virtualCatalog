package com.codgen.virtualcatalog.domain;

/**
 * Created by vicente on 07/12/14.
 */
public enum SexType {
    MALE ("male"),
    FEMALE ("female");

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

    public static SexType fromValue(String v) {
        for (SexType st : SexType.values()) {
            if (st.value.equals(v)) {
                return st;
            }
        }
        throw new IllegalArgumentException(v);
    }
}

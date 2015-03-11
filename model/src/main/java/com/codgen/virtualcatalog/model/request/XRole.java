package com.codgen.virtualcatalog.model.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by vicente on 10/03/15.
 */
@XmlType
@XmlEnum
public enum XRole {

    @XmlEnumValue("local")
    ADMIN("admin"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    XRole(String v) {
        value = v;
    }

    public  String value() {
        return value;
    }

    public static XRole fromValue(String v) {
        for (XRole c : XRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String toString(){
        return value;
    }
}

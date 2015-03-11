package com.codgen.virtualcatalog.model.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by vicente on 10/03/15.
 */
@XmlType
@XmlEnum
public enum XSexType {

    @XmlEnumValue("local")
    MALE("male"),
    @XmlEnumValue("facebook")
    FEMALE("female");
    private final String value;

    XSexType(String v) {
        value = v;
    }

    public  String value() {
        return value;
    }

    public static XSexType fromValue(String v) {
        for (XSexType c : XSexType.values()) {
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

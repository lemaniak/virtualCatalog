package com.codgen.virtualcatalog.model.response;

import com.codgen.virtualcatalog.model.request.XRole;
import com.codgen.virtualcatalog.model.request.XSexType;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by vicente on 10/03/15.
 */

@XmlRootElement
public class XSignupResponse {

    private Integer id;
    private String email;
    private String name;
    private String lastname;
    private Date createdAt;
    private Date lastLogin;
    private XSexType sexType;
    private XRole role;
    private String image;

    public XSignupResponse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public XSexType getSexType() {
        return sexType;
    }

    public void setSexType(XSexType sexType) {
        this.sexType = sexType;
    }

    public XRole getRole() {
        return role;
    }

    public void setRole(XRole role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

package com.codgen.virtualcatalog.model.request;

import com.codgen.virtualcatalog.model.validation.decl.ValidEmail;
import com.codgen.virtualcatalog.model.validation.decl.ValidRoleType;
import com.codgen.virtualcatalog.model.validation.decl.ValidSextype;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by vicente on 10/03/15.
 */
@XmlRootElement
public class XSignUp {

    @NotNull(message="{user.name.required}")
    @Size(min = 2, max = 100, message="{user.name.invalid.size}")
    private String name;
    @NotNull(message="{user.email.required}")
    @Size(min = 10, max = 200, message="{user.email.invalid.size}")
    @ValidEmail
    private String email;
    @NotNull(message="{user.password.required}")
    @Size(min = 8, max = 50, message="{user.password.invalid.size}")
    private String password;
    @ValidSextype
    private XSexType sexType;
    @ValidRoleType
    private XRole role;

    public XSignUp(String name, String email, String password, XSexType sexType, XRole role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.sexType = sexType;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}


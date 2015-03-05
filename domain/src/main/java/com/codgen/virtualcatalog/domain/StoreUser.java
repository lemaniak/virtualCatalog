/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codgen.virtualcatalog.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author vicente
 */
@Entity
@Table(name = "storeUser", catalog = "virtualCatalog", schema = "")
public class StoreUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "createdAt")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Column(name = "lastLogin")
    @Temporal(TemporalType.DATE)
    private Date lastLogin;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "sexType")
    @Enumerated(EnumType.STRING)
    private SexType sexType;
    @Column(name = "activationKey")
    private String activationKey;
    @Basic(optional = false)
    @Column(name = "active")
    private boolean active;
    @Basic(optional = false)
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @JoinColumn(name = "image", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Image image;

    public StoreUser() {
    }

    public StoreUser(Integer id) {
        this.id = id;
    }

    public StoreUser(String name, String lastName, String email, Date createdAt, Date lastLogin, String password, SexType sexType, String activationKey, boolean active, Role role, Image image) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
        this.lastLogin = lastLogin;
        this.password = password;
        this.sexType = sexType;
        this.activationKey = activationKey;
        this.active = active;
        this.role = role;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SexType getSexType() {
        return sexType;
    }

    public void setSexType(SexType sexType) {
        this.sexType = sexType;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder hcb = new HashCodeBuilder();
        hcb.append(this.id);
        return hcb.toHashCode();
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        if (StoreUser.class.isInstance(obj)) {
            StoreUser storeUser = StoreUser.class.cast(obj);
            EqualsBuilder eb = new EqualsBuilder();
            eb.append(this.id, storeUser.getId());
            equals = eb.isEquals();
        }
        return equals;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

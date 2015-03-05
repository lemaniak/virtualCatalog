package com.codgen.virtualcatalog.api.beans.user.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserFinder;
import com.codgen.virtualcatalog.api.exception.NotFoundException;
import com.codgen.virtualcatalog.api.util.Utils;
import com.codgen.virtualcatalog.domain.StoreUser;
import org.apache.commons.lang.StringUtils;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.text.MessageFormat;

/**
 * Created by vicente on 04/03/15.
 */
@Named
@Stateless
public class UserFinderImpl implements UserFinder {

    @PersistenceContext
    private EntityManager em;

    @Override
    public StoreUser find(Long id) throws IllegalArgumentException {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        } else {
            try {
                return  (StoreUser) em.createNamedQuery("User.findbyid").setParameter(1,id).getSingleResult();
            } catch (NoResultException nre) {
                return null;
            }
        }
    }

    @Override
    public StoreUser get(Long id) {
        StoreUser u = find(id);
        if (u == null) {
            throw new NotFoundException(MessageFormat.format(Utils.getMessage("user.not.found",null), id));
        }
        return u;
    }

    @Override
    public StoreUser findByEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            throw new IllegalArgumentException("email is required");
        } else {
            try {
                return  (StoreUser) em.createNamedQuery("User.findbyemail").setParameter(1,email).getSingleResult();
            } catch (NoResultException nre) {
                return null;
            }
        }
    }

    @Override
    public StoreUser getByEmail(String email) {
        StoreUser u = findByEmail(email);
        if (u == null) {
            throw new NotFoundException(MessageFormat.format(Utils.getMessage("user.not.found.by.email",null), email));
        }
        return u;
    }
}

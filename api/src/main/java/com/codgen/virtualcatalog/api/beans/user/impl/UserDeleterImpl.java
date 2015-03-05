package com.codgen.virtualcatalog.api.beans.user.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserDeleter;
import com.codgen.virtualcatalog.domain.StoreUser;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by vicente on 04/03/15.
 */
@Named
@Stateless
public class UserDeleterImpl  implements UserDeleter{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void delete(StoreUser storeUser) {
        if (storeUser == null) {
            throw new IllegalArgumentException("Entity is required");
        } else {
            em.remove(storeUser);
            em.flush();
        }
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Id is required");
        } else {
            em.createNamedQuery("User.deletebyid").setParameter(1,id).executeUpdate();
        }
    }
}

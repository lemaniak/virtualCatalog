package com.codgen.virtualcatalog.api.beans.user.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserCreator;
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
public class UserCreatorImpl implements UserCreator {

    @PersistenceContext
    private EntityManager em;

    @Override
    public StoreUser create(StoreUser storeUser) {
        if(storeUser == null){
            throw new IllegalArgumentException("Entity is required");
        }else{
            em.persist(storeUser);
            em.flush();
            return storeUser;
        }
    }
}

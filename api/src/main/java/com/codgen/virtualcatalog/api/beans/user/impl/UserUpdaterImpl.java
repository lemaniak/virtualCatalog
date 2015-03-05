package com.codgen.virtualcatalog.api.beans.user.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserUpdater;
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
public class UserUpdaterImpl implements UserUpdater {

    @PersistenceContext
    private EntityManager em;

    @Override
    public StoreUser update(StoreUser storeUser) {
        if(storeUser==null){
            throw new IllegalArgumentException("Entity is required");
        }else{
            em.merge(storeUser);
            return storeUser;
        }
    }
}

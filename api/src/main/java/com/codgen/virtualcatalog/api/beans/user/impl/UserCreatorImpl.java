package com.codgen.virtualcatalog.api.beans.user.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserCreator;
import com.codgen.virtualcatalog.domain.StoreUser;
import com.codgen.virtualcatalog.exceptions.ServiceException;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

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
            throw new ServiceException("Entity is required");
        }else{
            try{
                em.persist(storeUser);
                em.flush();
                return storeUser;
            }catch(PersistenceException pex){
                throw new ServiceException("Server error saving entity");
            }
        }
    }
}

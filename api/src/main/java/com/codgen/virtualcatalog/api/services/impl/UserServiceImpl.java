package com.codgen.virtualcatalog.api.services.impl;

import com.codgen.virtualcatalog.api.beans.user.decl.UserCreator;
import com.codgen.virtualcatalog.api.beans.user.decl.UserDeleter;
import com.codgen.virtualcatalog.api.services.decl.UserService;
import com.codgen.virtualcatalog.converter.mappers.UserXSignupMapper;
import com.codgen.virtualcatalog.domain.StoreUser;
import com.codgen.virtualcatalog.model.request.XSignUp;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by vicente on 10/03/15.
 */
@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    private UserCreator userCreator;
    @Inject
    private UserDeleter userDeleter;
    @Inject
    private UserXSignupMapper userXSignupMapper;


    @Override
    public Response signup(@NotNull(message = "{virtual.catalog.validation.empty.request}") @Valid XSignUp signUp) {
        StoreUser storeUser = userXSignupMapper.convertTo(signUp);
        storeUser.setCreatedAt(new Date());
        storeUser=userCreator.create(storeUser);
        return Response.status(Response.Status.CREATED)
                .entity(userXSignupMapper.convertFrom(storeUser))
                .build();
    }

    @Override
    public Response delete(Long id) {
        return null;
    }


}

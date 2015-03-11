package com.codgen.virtualcatalog.api.services.impl;

import com.codgen.virtualcatalog.api.services.decl.UserService;
import com.codgen.virtualcatalog.model.request.XSignUp;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.ws.Response;

/**
 * Created by vicente on 10/03/15.
 */
public class UserServiceImpl implements UserService {

    @Override
    public Response signup(@NotNull(message = "{com.petzila.api.validation.constraints.EmptyRequest.message}") @Valid XSignUp signUp) {
        return null;
    }
}

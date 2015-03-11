package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.converter.producer.DozerMapperProducer;
import com.codgen.virtualcatalog.domain.StoreUser;
import com.codgen.virtualcatalog.model.response.XSignupResponse;


import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by vicente on 10/03/15.
 */
@Stateless
public class UserXSignupMapper {
    @Inject
    private DozerMapperProducer mapper;

    public XSignupResponse convertFrom(StoreUser storeUser) {
        XSignupResponse signUpResponse= mapper.get().map(storeUser, XSignupResponse.class);

        return signUpResponse;
    }
}

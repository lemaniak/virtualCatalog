package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.domain.StoreUser;
import com.codgen.virtualcatalog.model.request.XSignUp;
import com.codgen.virtualcatalog.model.response.XSignupResponse;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;


import javax.ejb.Stateless;

/**
 * Created by vicente on 10/03/15.
 */
@Stateless
public class UserXSignupMapper {
    private Mapper mapper= DozerBeanMapperSingletonWrapper.getInstance();

    public XSignupResponse convertFrom(StoreUser storeUser) {
        XSignupResponse signUpResponse= mapper.map(storeUser, XSignupResponse.class);

        return signUpResponse;
    }

    public StoreUser convertTo(XSignUp signUp) {
        StoreUser storeUser= mapper.map(signUp, StoreUser.class);
        return storeUser;
    }
}

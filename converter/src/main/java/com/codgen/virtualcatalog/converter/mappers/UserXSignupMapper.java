package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.domain.StoreUser;
import com.codgen.virtualcatalog.exceptions.ServiceException;
import com.codgen.virtualcatalog.model.request.XSignUp;
import com.codgen.virtualcatalog.model.response.XSignupResponse;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.dozer.MappingException;


import javax.ejb.Stateless;

/**
 * Created by vicente on 10/03/15.
 */
@Stateless
public class UserXSignupMapper {
    private Mapper mapper= DozerBeanMapperSingletonWrapper.getInstance();

    public XSignupResponse convertFrom(StoreUser storeUser) {
        try{
            XSignupResponse signUpResponse= mapper.map(storeUser, XSignupResponse.class);
            return signUpResponse;
        }catch (MappingException me){
            throw new ServiceException("Business service exception error mapping objects");
        }

    }

    public StoreUser convertTo(XSignUp signUp) {
        try{
            StoreUser storeUser= mapper.map(signUp, StoreUser.class);
            return storeUser;
        }catch(MappingException me){
            throw new ServiceException("Business service exception error mapping objects");
        }
    }
}

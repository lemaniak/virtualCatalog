package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.domain.Role;
import com.codgen.virtualcatalog.exceptions.ServiceException;
import org.dozer.CustomConverter;

import javax.ejb.Stateless;

/**
 * Created by vicente on 17/03/15.
 */
@Stateless
public class RoleTypeConverter implements CustomConverter {

    @Override
    public Object convert(Object destination, Object source, Class destClass, Class sourceClass) {
        if (source == null) {
            return null;
        }

        try{
            if(source instanceof  String){
                return Role.fromValue((String) source);
            }else if(source instanceof  Role){
                return ((Role) source).getValue();
            }
        }catch(Exception ex){
            throw new ServiceException("bussiness exception error mapping objects");
        }
        return null;
    }
}

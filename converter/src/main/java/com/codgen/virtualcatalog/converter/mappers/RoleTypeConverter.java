package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.domain.Role;
import org.dozer.CustomConverter;
import org.dozer.MappingException;

/**
 * Created by vicente on 17/03/15.
 */
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
            throw new MappingException("Converter RoleTypeConverter "
                    + "used incorrectly. Arguments passed in were:"
                    + destination + " and " + source);
        }
        return null;
    }
}

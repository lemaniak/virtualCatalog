package com.codgen.virtualcatalog.converter.mappers;

import com.codgen.virtualcatalog.domain.SexType;
import com.codgen.virtualcatalog.exceptions.ServiceException;
import org.dozer.CustomConverter;
import org.dozer.MappingException;

import javax.ejb.Stateless;

/**
 * Created by vicente on 17/03/15.
 */
@Stateless
public class SexTypeConverter implements CustomConverter {

    @Override
    public Object convert(Object destination, Object source, Class destClass, Class sourceClass) {
        if (source == null) {
            return null;
        }

        try{
            if(source instanceof  String){
                return SexType.fromValue((String) source);
            }else if(source instanceof  SexType){
                return ((SexType) source).getValue();
            }
        }catch(Exception ex){
            throw new ServiceException("bussiness exception error mapping objects");
        }
        return null;
    }
}

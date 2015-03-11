package com.codgen.virtualcatalog.model.validation.impl;

import com.codgen.virtualcatalog.model.request.XSexType;
import com.codgen.virtualcatalog.model.validation.decl.ValidSexType;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by vicente on 10/03/15.
 */
public class ValidSexTypeValidator implements ConstraintValidator<ValidSexType, String> {

    @Override
    public void initialize(ValidSexType constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        try{
            if(StringUtils.isBlank(value)){
                return false;
            }else{
                XSexType.fromValue(value);
            }

        }catch(IllegalArgumentException iaex){
            return false;
        }
        return true;
    }
}

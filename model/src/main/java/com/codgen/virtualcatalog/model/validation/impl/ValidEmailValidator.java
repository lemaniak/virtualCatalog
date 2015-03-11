package com.codgen.virtualcatalog.model.validation.impl;


import com.codgen.virtualcatalog.model.validation.decl.ValidEmail;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by vicente on 10/03/15.
 */
public class ValidEmailValidator implements ConstraintValidator<ValidEmail, String> {
    @Override
    public void initialize(ValidEmail constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(!StringUtils.isBlank(value) && value.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            return true;
        }else{
            return false;
        }
    }
}

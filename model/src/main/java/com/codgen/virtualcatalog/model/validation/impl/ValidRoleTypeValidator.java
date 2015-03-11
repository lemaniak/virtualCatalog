package com.codgen.virtualcatalog.model.validation.impl;

import com.codgen.virtualcatalog.model.request.XRole;
import com.codgen.virtualcatalog.model.validation.decl.ValidRoleType;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by vicente on 10/03/15.
 */
public class ValidRoleTypeValidator implements ConstraintValidator<ValidRoleType, String> {

    @Override
    public void initialize(ValidRoleType validRoleType) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (StringUtils.isBlank(value)) {
                return false;
            } else {
                XRole.fromValue(value);
            }

        } catch (IllegalArgumentException iaex) {
            return false;
        }
        return true;
    }
}

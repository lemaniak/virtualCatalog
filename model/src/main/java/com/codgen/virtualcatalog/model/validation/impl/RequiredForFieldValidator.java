package com.codgen.virtualcatalog.model.validation.impl;

import com.codgen.virtualcatalog.model.validation.decl.RequiredForField;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by vicente on 31/01/15.
 */
public class RequiredForFieldValidator implements ConstraintValidator<RequiredForField, Object> {

    private String field;
    private String verifyField;

    @Override
    public void initialize(RequiredForField annotation) {
        this.field = annotation.field();
        this.verifyField = annotation.verifyField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        try {
            String field = BeanUtils.getProperty(value,this.field);
            String verifyField = BeanUtils.getProperty(value,this.verifyField);

            if(!StringUtils.isBlank(field) && !StringUtils.isBlank(verifyField)){
                return true;
            }else{
                return false;
            }

        } catch (IllegalAccessException e) {
            return false;
        } catch (InvocationTargetException e) {
            return false;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }
}
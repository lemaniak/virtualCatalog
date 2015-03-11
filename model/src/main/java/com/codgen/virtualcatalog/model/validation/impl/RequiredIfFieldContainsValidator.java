package com.codgen.virtualcatalog.model.validation.impl;

import com.codgen.virtualcatalog.model.validation.decl.RequiredIfFieldContains;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vicente on 31/01/15.
 */
public class RequiredIfFieldContainsValidator implements ConstraintValidator<RequiredIfFieldContains, Object> {

    private String field;
    private List<String> equals;
    private String requiredField;

    @Override
    public void initialize(RequiredIfFieldContains annotation) {
        this.field = annotation.field();
        this.equals = Arrays.asList(annotation.equals());
        this.requiredField = annotation.requiredField();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        try {
            String field = BeanUtils.getProperty(value, this.field);
            String verifyField = BeanUtils.getProperty(value, this.requiredField);

            if(!StringUtils.isBlank(field) && this.equals.contains(field)){
                if (StringUtils.isBlank(verifyField)) {
                    return false;
                }else{
                    return true;
                }
            }else{
                return true;
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
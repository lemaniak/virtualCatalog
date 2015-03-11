package com.codgen.virtualcatalog.model.validation.decl;

import com.codgen.virtualcatalog.model.validation.impl.RequiredIfFieldContainsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vicente on 31/01/15.
 */
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = RequiredIfFieldContainsValidator.class)
@Documented
public @interface RequiredIfFieldContains {

    String message() default "{virtual.catalog.validation.error}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String field();

    String[] equals();

    String requiredField();

    @Target({ TYPE, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        RequiredIfFieldContains[] value();
    }
}
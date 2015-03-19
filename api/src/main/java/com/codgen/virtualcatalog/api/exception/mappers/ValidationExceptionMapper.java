package com.codgen.virtualcatalog.api.exception.mappers;

import com.codgen.virtualcatalog.exceptions.ValidationException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by vicente on 19/03/15.
 */
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {
    @Override
    public Response toResponse(ValidationException se) {
        return Response.status(Response.Status.BAD_REQUEST).entity(se.getMessage()).build();
    }
}
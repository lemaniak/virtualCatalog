package com.codgen.virtualcatalog.api.exception.mappers;

import org.jboss.resteasy.api.validation.ResteasyViolationException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by vicente on 17/03/15.
 */
@Provider
public class ResteasyViolationExceptionMapper implements ExceptionMapper<ResteasyViolationException> {
    @Override
    public Response toResponse(ResteasyViolationException exception) {
        String message = exception.getParameterViolations().get(0).getMessage();
        return Response.status(Response.Status.BAD_REQUEST).entity(message).build();
    }
}
package com.codgen.virtualcatalog.api.exception.mappers;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by vicente on 17/03/15.
 */
@Provider
public class UnrecognizedPropertyExceptionMapper implements ExceptionMapper<UnrecognizedPropertyException> {
    @Override
    public Response toResponse(UnrecognizedPropertyException se) {
        return Response.status(Response.Status.BAD_REQUEST).entity("Unrecognized field "+se.getPropertyName()).build();
    }
}
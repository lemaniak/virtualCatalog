package com.codgen.virtualcatalog.api.exception.mappers;

import com.fasterxml.jackson.core.JsonParseException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by vicente on 17/03/15.
 */
@Provider
public class JsonParseExceptionMapper implements ExceptionMapper<JsonParseException> {
    @Override
    public Response toResponse(JsonParseException se) {
        return Response.status(Response.Status.BAD_REQUEST).entity(se.getOriginalMessage()).build();
    }
}
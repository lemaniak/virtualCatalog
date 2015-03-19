package com.codgen.virtualcatalog.api.exception.mappers;


import com.codgen.virtualcatalog.exceptions.ServiceException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by vicente on 17/03/15.
 */
@Provider
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException> {
    @Override
    public Response toResponse(ServiceException se) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(se.getMessage()).build();
    }
}
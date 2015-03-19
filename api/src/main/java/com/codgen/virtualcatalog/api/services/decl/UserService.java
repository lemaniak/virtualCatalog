package com.codgen.virtualcatalog.api.services.decl;

import com.codgen.virtualcatalog.model.request.XSignUp;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by vicente on 10/03/15.
 */
@Path("/user")
public interface UserService {

    @POST
    @Path("/signup")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response signup(@NotNull(message="{virtual.catalog.validation.empty.request}") @Valid XSignUp signUp);

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    Response delete(@PathParam("id") Long id);
}

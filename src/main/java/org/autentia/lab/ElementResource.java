package org.autentia.lab;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/element")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ElementResource {

	
	@Inject
	ElementService service;
	
    @GET
    public String hello() {
        return "Hello RESTEasy";
    }
    	
    @POST
    public Response createElement(@Valid ElementDto dto) {
    	return service.createElement(dto);
    }
}



















package coim.au.example.rest;

import coim.au.example.service.ApplicationScopeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by Ayhan.Ugurlu on 02/02/2018
 */

@RequestScoped
@Path("test")
public class RestEndpoint {

    @Inject
    ApplicationScopeService applicationScopeService;

    @GET
    public Response test() {
        return Response.ok().entity("Test example "+applicationScopeService.increment()).build();
    }
}
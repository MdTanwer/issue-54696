package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @GET
    @Path("/mongodb")
    @Produces(MediaType.TEXT_PLAIN)
    public String mongodb() {
        MyEntity entity = new MyEntity();
        entity.field = "ipv6";
        entity.persist();

        return "MongoDB documents: " + MyEntity.count();
    }
}

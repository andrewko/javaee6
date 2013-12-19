package javaee6.server.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/services")
public class HelloWorldRestService {

	@GET
	@Path("/helloworld")
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWorld(@QueryParam("text") String text) {
		return "Hello " + text;
	}
}

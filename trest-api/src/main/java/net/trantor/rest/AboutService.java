package net.trantor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/about")
public interface AboutService {

	@GET
	public String about();
}

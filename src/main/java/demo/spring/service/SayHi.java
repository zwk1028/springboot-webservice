package demo.spring.service;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public interface SayHi {
	
	@GET
	@Path("/hi")
	@Produces("application/json")
	public Map<String,String> sayHi();
}

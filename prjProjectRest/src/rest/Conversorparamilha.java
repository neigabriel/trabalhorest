package rest;

import javax.ws.rs.GET ;
import javax.ws.rs.Path ;
import javax.ws.rs.Produces ;
import javax.ws.rs.QueryParam ;

@Path("/echo2")
public class Conversorparamilha {
		double valorKm = 1.609;
		double resultado = 0.0;
	
	@GET
	@Produces("text/plain")
	public String converteParaMilha(@QueryParam("km") double km) {
		resultado = km / valorKm;
		String str = Double.toString(resultado);
		return str +  " Milhas";
	}}
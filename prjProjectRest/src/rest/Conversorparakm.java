package rest;

import javax.ws.rs.GET ;
import javax.ws.rs.Path ;
import javax.ws.rs.Produces ;
import javax.ws.rs.QueryParam ;

@Path("/echo")
public class Conversorparakm {
		double valorKm = 1.609;
		double resultado = 0.0;
	
	@GET
	@Produces("text/plain")
	public String converteParaKM(@QueryParam("milha") double milha) {
		resultado = valorKm * milha;
		String str = Double.toString(resultado);
		return str + " KM";
	
	}	}



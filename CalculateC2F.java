package com.c2f;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/calculate")

public class CalculateC2F {
	
	@GET
	@Produces("application/json")
	@Path("/{param}")
	
	public Response makeCalculation(@PathParam("param") int value) {
		
		
		   int temp = 0;
	     temp = ((value * 9)/5) +32;
	     
	     JSONObject jsonObject = new JSONObject();
	     
	     jsonObject.put("C Value", value);
	     jsonObject.put("F Value", temp); 
	    
	     
	     String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		 
		  //String output = "The tempreture in  Fahrenheit is:  " + Integer.toString(temp);
		 
		  return Response.status(200).entity(result).build();
		
		 }
	
	

}

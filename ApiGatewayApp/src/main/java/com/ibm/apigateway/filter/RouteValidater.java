package com.ibm.apigateway.filter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.Predicate;

@Component
public class RouteValidater {

	  public static final List<String> openApiEndpoints = List.of(
	            "/api/login/signup",
	            "/api/login/createtoken",
	            "/api/login/validatetoken",
				"/api/login/health",
				"/api/gateway/health",
				"/api/employee/health"
        //These endpoints are considered public and do not require authentication or authorization.
	    );

	    public Predicate<ServerHttpRequest> isSecured =
	                     request -> openApiEndpoints
	                    .stream()
	                    .noneMatch(uri -> request.getURI().getPath().contains(uri));
     
						//	If the request URI does not match any of the open API endpoints, 
                      //the isSecured predicate will return true, indicating that the request is secured.				

}

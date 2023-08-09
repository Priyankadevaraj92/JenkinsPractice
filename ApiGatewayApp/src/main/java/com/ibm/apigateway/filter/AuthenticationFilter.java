package com.ibm.apigateway.filter;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import com.ibm.apigateway.util.JwtUtil;


@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

	 @Autowired
    private RouteValidater validator;
	 
	 
	 @Autowired
    private JwtUtil javaUtil;

    public AuthenticationFilter() {
        super(Config.class);
    }
    
    public static class Config {

    }

    
    @Override
    public GatewayFilter apply(Config config) {

          	return ((exchange, chain) -> {       
            if (validator.isSecured.test(exchange.getRequest())) {       // use RouteValidator isSecured method to check if request is a secure route

                                
                      //check if header contains token or not, if not throws Exception
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new UnauthorizedException("missing authorization header");
                }

                    //if header is present -extract token from the header
             	String token = Objects.requireNonNull(exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION)).get(0);
                                    
                if (token != null && token.startsWith("Bearer ")) { // check if it contains bearer prefix, and remove it
                    token = token.substring(7);
                }
                try {
                     javaUtil.validateToken(token);

                } catch (Exception e) {
                    throw new UnauthorizedException("Un-Aauthorized Access");
                }
            }
            return chain.filter(exchange);               // the filter continues the request flow     

        });              

    }


    
    
    
    









    
    
    // The exchange parameter represents the current server exchange, containing the incoming request and response objects.
    //The chain parameter represents the chain of filters that will be applied to the request.
	// Return a GatewayFilter, a lambda which takes two parameters then passes to the next filter in the chain.


 
}
package com.ibm.apigateway.util;

import java.security.Key;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	 @Value("${application.security.jwt.secret-key}")
	  private String secretKey;
	  
	  //This validates the given JWT token by parsing and verifying its signature. 
	  
	  
	  public void validateToken(final String token) {
	        Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
	    }  
		//Jwts.parserBuilder() method to create a JWT parser, sets the signing key method, and builds the parser.
		//parseClaimsJws(token) on the parser, which will throw an exception if the token is invalid or has an invalid signature.
	 
	    private Key getSignKey() {
	        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
	        return Keys.hmacShaKeyFor(keyBytes);
	    }

	   
}

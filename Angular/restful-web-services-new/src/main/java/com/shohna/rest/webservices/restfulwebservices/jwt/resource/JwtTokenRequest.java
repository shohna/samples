package com.shohna.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    {
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU4NjY5NjU1NSwiaWF0IjoxNTg2MDkxNzU1fQ._xEH0j6SIS_iX_OYoR74x6EP0CvXIze_75ieAB2Nq0d8Tq1vPcSFjUZ0YP2Yjt3nHXfol1gJBBvGzV2_PMYXPg"
//    	}
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


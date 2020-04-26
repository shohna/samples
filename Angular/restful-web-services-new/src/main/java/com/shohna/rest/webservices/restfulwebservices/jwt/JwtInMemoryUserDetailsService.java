package com.shohna.rest.webservices.restfulwebservices.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "shohna",
        "$2a$10$3IuwLdUGh0NWztj5QrHmKOUJahI6WgeOy92VvhbPb2zWQC3fr0Ikm", "ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(2L, "ranga",
            "$2a$10$qEAaOocRIPvcrTEZe161Jeo137sVcRkoXqesfTYpEdo8IR/sNtj2e", "ROLE_USER_2"));
  }
  
  //$2a$10$qEAaOocRIPvcrTEZe161Jeo137sVcRkoXqesfTYpEdo8IR/sNtj2e

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}



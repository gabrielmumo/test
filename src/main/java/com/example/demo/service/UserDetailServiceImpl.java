package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    public record SystemUser(String username, String password, Set<String> roles){}
    // "secreto" after BCrypt = "$2a$10$56VCAiApLO8NQYeOPiu2De/EBC5RWrTZvLl7uoeC3r7iXinRR1iiq"
    private String password = "$2a$10$56VCAiApLO8NQYeOPiu2De/EBC5RWrTZvLl7uoeC3r7iXinRR1iiq";
    private Map<String, SystemUser> inMemoryUsers;

    {
        SystemUser admin = new SystemUser("gabrielmumo", password, Set.of("ADMIN"));
        SystemUser sales = new SystemUser("salesgabriel", password, Set.of("SALESMAN"));

        inMemoryUsers = new HashMap<>(Map.of(admin.username, admin, sales.username, sales));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    private Optional<SystemUser> getUserByUsername(String username) {
        return Optional.ofNullable(inMemoryUsers.get(username));
    }
}

package com.solution.gestion_tache.security.services;

import com.solution.gestion_tache.security.entities.Role;
import com.solution.gestion_tache.security.entities.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = accountService.loadUserByNom(username);
        if (user==null) throw new UsernameNotFoundException("user not found");
        return org.springframework.security.core.userdetails.User
                .withUsername(user.getNom())
                .password(user.getPassword())
                .roles(user.getRoles().stream().map(Role::getRole).toArray(String[]::new))
                .build();
    }
}

package com.solution.gestion_tache.security.services;

import com.solution.gestion_tache.security.entities.Role;
import com.solution.gestion_tache.security.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
     User createUser(String nom ,String password, String email ,String confirmPassword);
     Role createRole(String newRole);
     void addRoleToUser(String nom ,String newRole);
     void removeRoleFromUser (String nom ,String newRole);
     User loadUserByNom(String nom );
}

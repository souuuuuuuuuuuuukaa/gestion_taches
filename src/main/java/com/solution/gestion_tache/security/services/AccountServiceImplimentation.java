package com.solution.gestion_tache.security.services;

import com.solution.gestion_tache.security.entities.Role;
import com.solution.gestion_tache.security.entities.User;
import com.solution.gestion_tache.security.repositories.RoleRepository;
import com.solution.gestion_tache.security.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class AccountServiceImplimentation implements AccountService {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public User createUser(String nom, String password, String email, String confirmPassword) {
         User user1=userRepository.findByNom(nom);
         if (user1 !=null) throw new RuntimeException("User already exixts");
         if (!password.equals(confirmPassword)) throw new RuntimeException("Psswords do not match");
            user1 =User.builder()
                .nom(nom)
                .id(UUID.randomUUID().toString())
                .password(bCryptPasswordEncoder.encode(password))
                .email(email)
                .build();
     return userRepository.save(user1);

    }

    @Override
    public Role createRole(String newRole) {
        Role role1=roleRepository.findByRole(newRole);
        if (role1 !=null) throw new RuntimeException("Role already exixts");
          role1 =Role.builder()
                .role(newRole)
                .build();
        return roleRepository.save(role1);
    }

    @Override
    public void addRoleToUser(String nom, String newRole) {
        User user1 = userRepository.findByNom(nom);
        Role role1= roleRepository.findByRole(newRole);
        user1.getRoles().add(role1);
    }

    @Override
    public void removeRoleFromUser(String nom, String newRole) {
        User user1 = userRepository.findByNom(nom);
        Role role1= roleRepository.findByRole(newRole);
        user1.getRoles().remove(role1);
    }

    @Override
    public User loadUserByNom(String nom) {
        return userRepository.findByNom(nom);
    }
}

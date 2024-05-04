package com.solution.gestion_tache.security.repositories;

import com.solution.gestion_tache.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
     Role findByRole(String role);

}

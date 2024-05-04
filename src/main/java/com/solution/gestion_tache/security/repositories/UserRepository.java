package com.solution.gestion_tache.security.repositories;

import com.solution.gestion_tache.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
     User findByNom(String nom);


}

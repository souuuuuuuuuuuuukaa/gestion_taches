package com.solution.gestion_tache.reposirories;

import com.solution.gestion_tache.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
    //liaison entre projetRepository avec la classe projet (table projet)
}

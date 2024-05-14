package com.solution.gestion_tache.reposirories;

import com.solution.gestion_tache.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
//definir des methode pour l'interaction entre entity et  base base donnee
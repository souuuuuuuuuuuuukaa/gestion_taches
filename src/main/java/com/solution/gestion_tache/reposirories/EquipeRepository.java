package com.solution.gestion_tache.reposirories;

import com.solution.gestion_tache.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}

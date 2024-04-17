package com.solution.gestion_tache.reposirories;

import com.solution.gestion_tache.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TachesRepository extends JpaRepository<Tache,Long> {
}

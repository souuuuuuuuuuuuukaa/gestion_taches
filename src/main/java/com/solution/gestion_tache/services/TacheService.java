package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Projet;
import com.solution.gestion_tache.entities.Tache;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TacheService {

    Tache saveTache (Tache tache);
    Tache updateTache (Tache tache);
    void deleteTacheById (Long id);
    void deleteTache ();
    Tache getTacheById(Long id);
    List<Tache> getAllTache();

}

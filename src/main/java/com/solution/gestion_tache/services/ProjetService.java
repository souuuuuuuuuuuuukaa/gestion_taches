package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Projet;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjetService {
    Projet saveProjet (Projet projet);
    Projet updateProjet (Projet projet);
    void deleteProjetById (Long id);
    void deleteProjet ();
    Projet getProjetById(Long id);
    List<Projet>getAllProjet();

}

package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Projet;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
/*utilisée pour indiquer que la classe remplit un rôle de service dans l'application,
 généralement en implémentant une logique métier spécifique.*/
public interface ProjetService {
    Projet saveProjet (Projet projet);
    Projet updateProjet (Projet projet);
    void deleteProjetById (Long id);
    void deleteProjet ();
    Projet getProjetById(Long id);
    List<Projet>getAllProjet();

}

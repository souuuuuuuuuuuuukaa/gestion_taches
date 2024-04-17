package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService {
   Utilisateur saveUtilisateur (Utilisateur utilisateur);
    Utilisateur updateUtilisateur (Utilisateur utilisateur);
    void deletUtilisateurById(Long id);
    void deletAllUtilisateur();
    Utilisateur getUtilisateurById(Long id);
    List<Utilisateur>getAllUtilisateurs();

}

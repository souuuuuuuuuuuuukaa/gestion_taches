package com.solution.gestion_tache.services;

import com.solution.gestion_tache.entities.Utilisateur;
import com.solution.gestion_tache.reposirories.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImplimentation implements UtilisateurService{

    private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deletUtilisateurById(Long id) {
        utilisateurRepository.deleteById(id);

    }
    @Override
    public void deletAllUtilisateur() {
        utilisateurRepository.deleteAll();

    }


    @Override
    public Utilisateur getUtilisateurById(Long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}

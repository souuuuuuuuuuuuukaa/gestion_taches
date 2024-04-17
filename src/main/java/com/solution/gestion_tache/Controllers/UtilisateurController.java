package com.solution.gestion_tache.Controllers;

import com.solution.gestion_tache.entities.Utilisateur;
import com.solution.gestion_tache.reposirories.UtilisateurRepository;
import com.solution.gestion_tache.services.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class UtilisateurController {
    private UtilisateurService utilisateurService;
    @RequestMapping("/connexion")
    public String connexion(){
        String connexion = "Connexion";
        return connexion;
    }
    @RequestMapping("/createUtilisateur")
    public String createUtilisateur()
    {
        String createUtilisateur = "CreateUtilisateur";
        return createUtilisateur;
    }
    @RequestMapping("/saveUser")
    public String saveUser(){
        return connexion();
    }





  /*  @RequestMapping("saveUtilisateur")
    public String saveUtilisateur(@ModelAttribute("UtilisateurVue")Utilisateur UtilisateurController)
    {
        Utilisateur saveUtilisateur = utilisateurService.saveUtilisateur(UtilisateurController);
        return "CreateUtilisateur";
    }*/
}


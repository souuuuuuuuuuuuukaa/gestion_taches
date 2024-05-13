package com.solution.gestion_tache.Controllers;

import com.solution.gestion_tache.entities.Projet;
import com.solution.gestion_tache.entities.Tache;
import com.solution.gestion_tache.entities.Utilisateur;
import com.solution.gestion_tache.reposirories.ProjetRepository;
import com.solution.gestion_tache.reposirories.UtilisateurRepository;
import com.solution.gestion_tache.services.ProjetService;
import com.solution.gestion_tache.services.TacheService;
import com.solution.gestion_tache.services.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class TacheController {
     private TacheService tacheService;
    @Autowired
    private ProjetRepository projetRepository;

    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private ProjetService projetService;
    @Autowired
    private UtilisateurService utilisateurService;

    @RequestMapping("/createtache")
    public String createtache(ModelMap modelMap)
    {
        List<Projet> projets=projetService.getAllProjet();
        modelMap.addAttribute("projetsVue",projets );
        List<Utilisateur>utilisateurList=utilisateurService.getAllUtilisateurs();
        modelMap.addAttribute("utilisateursVue",utilisateurList );
        String createtache ="CreateTache";
        return createtache;
    }
    @RequestMapping("saveTache")
    public String saveTache(@ModelAttribute("tacheVue") Tache tachecontroller){
        Tache savetache = tacheService.saveTache(tachecontroller);
        return "CreateTache";
    }
    @RequestMapping("/listtache")
    public String listtache(ModelMap modelMap){
        List<Tache> taches=tacheService.getAllTache();

        modelMap.addAttribute("tacheVue",taches );
        return "ListTache";
    }
    @RequestMapping("/deleteTache")
    public String deleteTache(@RequestParam("id")Long id, ModelMap modelMap){
        tacheService.deleteTacheById(id);
        return listtache(modelMap);
    }
    @RequestMapping("/EditTache")
    public String EditTache(@RequestParam("id")Long id, ModelMap modelMap){
        Tache tachecontroller= tacheService.getTacheById(id);
        modelMap.addAttribute("tacheView",tachecontroller);
        return "EditTache";
    }
    @RequestMapping("/updatetache")
    public String update(@ModelAttribute("tache")Tache tacheController){
      tacheService.saveTache(tacheController);
        return "CreateTache";
    }
    @RequestMapping(value = "/formTache", method = RequestMethod.GET)
    public String afficherFormulaireTache(Model model) {
        model.addAttribute("projets", projetRepository.findAll());
        model.addAttribute("utilisateurs", utilisateurRepository.findAll());
        return "ListTache"; // Assurez-vous que "formTache" correspond au nom de votre vue
    }
}

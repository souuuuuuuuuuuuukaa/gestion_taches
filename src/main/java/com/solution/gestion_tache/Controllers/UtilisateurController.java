package com.solution.gestion_tache.Controllers;


import com.solution.gestion_tache.entities.Utilisateur;
import com.solution.gestion_tache.services.UtilisateurService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class UtilisateurController {
    private UtilisateurService utilisateurService;
    @RequestMapping("/createUtilisateur")
    public String createUtilisateur()
    {
        String createUtilisateur = "CreateUser";
        return createUtilisateur;
    }

   @RequestMapping("/membreequipe")
    public String membreequipe(ModelMap modelMap){
        List<Utilisateur>utilisateurList=utilisateurService.getAllUtilisateurs();
        modelMap.addAttribute("utilisateursVue",utilisateurList );
        //String membreequipe = "MembreEquipe";
        return "MembreEquipe";
    }
/*    @RequestMapping("/membreequipe")
    public String membres(ModelMap modelMap,
                          @RequestParam(name="page",defaultValue = "0") int page,
                          @RequestParam(name="size",defaultValue = "3") int size){
        Page<Utilisateur> utilisateurList=utilisateurService.getAllUtilisateurByPage(page,size);
        modelMap.addAttribute("utilisateursVue",utilisateurList );
        modelMap.addAttribute("pagrcourent",page );
        modelMap.addAttribute("pages",new int[utilisateurList] );
        String membreequipe = "MembreEquipe";
        return membreequipe;
    }*/
    @RequestMapping("/saveUser")
    public String saveUser(@Valid Utilisateur utilisateursController, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "CreateUser";
        Utilisateur saveUser =utilisateurService.saveUtilisateur(utilisateursController);
        //String createUtilisateur = "CreateUser";
        return "createUser";
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id")Long id, ModelMap modelMap){
        utilisateurService.deletUtilisateurById(id);
        return membreequipe(modelMap);
    }
    @RequestMapping("/update")
    public String update(@ModelAttribute("utilisateursVue")Utilisateur utilisateursController){
        utilisateurService.updateUtilisateur(utilisateursController);
        return createUtilisateur();
    }



}


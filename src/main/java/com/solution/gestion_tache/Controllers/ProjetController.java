package com.solution.gestion_tache.Controllers;
import com.solution.gestion_tache.entities.Projet;

import com.solution.gestion_tache.services.ProjetService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@AllArgsConstructor

public class ProjetController {

    private ProjetService projetService; //autowired

    @RequestMapping("/createprojet")
    public String createprojet()
    {
        String createprojet = "CreateProject"; //page html
        return createprojet ;
    }

   /*
   //POUR NE PAS AVOIR DES CHANPS VIDE

   @RequestMapping("/saveProjet")
    public String saveProjet(@Valid Projet projetController , BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "CreateProject";
        Projet saveProjet= projetService.saveProjet(projetController);
        String createprojet = "CreateProject"; //page html
        return createprojet;
    }*/



  @RequestMapping("saveProjet")

    public String saveProjet(@ModelAttribute("projetVue")Projet projetcontroller )  {

        Projet saveprojet = projetService.saveProjet(projetcontroller);
        //String createprojet = "CreateProject";
        return "CreateProject" ;
    }


 @RequestMapping("/listprojet")
    public String listprojet(ModelMap modelMap){
        List<Projet> projets=projetService.getAllProjet();
        modelMap.addAttribute("projetsVue",projets );
     // String listprojet = "ListProjet";
        return "ListProjet";
    }
    @RequestMapping("/deleteprojet")
    public String deleteprojet(@RequestParam("id")Long id , ModelMap modelMap){
        projetService.deleteProjetById(id);
        // String listprojet = "ListProjet";
        return listprojet(modelMap);

    }
    @RequestMapping("/EditProjet")
    public String EditProjet(@RequestParam("id")Long id, ModelMap modelMap){
        Projet projetcontroller= projetService.getProjetById(id);
        modelMap.addAttribute("projetView",projetcontroller);
        return "EditProjet";
    }
   @RequestMapping("/updateprojet")
    public String update(@ModelAttribute("projectsVue") Projet projetController){
        projetService.updateProjet(projetController);
        return createprojet();
    }
}



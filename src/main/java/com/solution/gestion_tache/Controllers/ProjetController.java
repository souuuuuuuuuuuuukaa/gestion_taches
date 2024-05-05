package com.solution.gestion_tache.Controllers;
import com.solution.gestion_tache.entities.Projet;
import com.solution.gestion_tache.entities.Utilisateur;
import com.solution.gestion_tache.services.ProjetService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor //pour injecter les dependances

// le controller ne parle pas au repository il parle au service
public class ProjetController {

    private ProjetService projetService; //autowired

    //je cree mtn la methode createprojet de jsp (html) dans le controller
    @RequestMapping("/createprojet") // si l url aie /createprojet il doit executer cette methode
    public String createprojet()
    {
        //String createprojet = "CreateProject"; //page html
        return "CreateProject" ;
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
    public String saveProjet(@ModelAttribute("projetVue")Projet projetcontroller)
    //contient l'objet projetVue qui vient du formulaire et le mettre dans une var maniabe dans controlleur projetController
  {
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
  /*  @RequestMapping("/update")
    public String update(@ModelAttribute("projectsVue") Projet projetController){
        projetService.updateProjet(projetController);
        return createprojet();
    }*/
}



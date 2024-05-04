package com.solution.gestion_tache.Controllers;

import com.solution.gestion_tache.entities.Tache;
import com.solution.gestion_tache.services.TacheService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class TacheController {
     private TacheService tacheService;

    @RequestMapping("/createtache")
    public String createtache()
    {
        return "CreateTache";
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
        modelMap.addAttribute("tachetView",tachecontroller);
        return "EditTache";
    }

}

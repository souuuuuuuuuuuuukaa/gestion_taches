package com.solution.gestion_tache.security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class SecurityController {
    @GetMapping("/")
    public String home(){
        return "redirect:/createUtilisateur";
    }
}

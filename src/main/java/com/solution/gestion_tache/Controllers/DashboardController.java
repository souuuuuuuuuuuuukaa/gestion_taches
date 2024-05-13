package com.solution.gestion_tache.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class DashboardController {
    @RequestMapping("/chart")
    public String chart()
    {
        String charts = "charts"; //page html
        return charts;
    }
    @RequestMapping("/dashboard")
    public String dashboard()
    {
        String dashboard = "Dashboard"; //page html
        return dashboard;
    }
}

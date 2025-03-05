package com.morgado.jardineria.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.morgado.jardineria.model.Services.GamasService;
import com.morgado.jardineria.model.Entity.Gamas;

@Controller
public class GamasController {
    @Autowired
    private GamasService gamasService;

    @GetMapping("/gamas")
    public String getGamas(Model modelo) {
        // System.out.println("Gamas------------");
        List<Gamas> gamas = this.gamasService.getAll();
        gamas.forEach(System.out::println);
       modelo.addAttribute("Lgamas", gamas);
        return "/www/gamas/listar";
    }
}

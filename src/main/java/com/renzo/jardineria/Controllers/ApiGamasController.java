package com.renzo.jardineria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renzo.jardineria.model.Entity.Gamas;
import com.renzo.jardineria.model.Services.GamasService;

@RestController
@RequestMapping("/api/gamas") // Ruta para acceder a la API
public class ApiGamasController {

    @Autowired
    private GamasService gamasService;

    @GetMapping("/")
    public List<Gamas> getGamas() {
        List<Gamas> gamas = this.gamasService.getAll();
        return gamas;
    }
    
}

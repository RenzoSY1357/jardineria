package com.renzo.jardineria.Controllers.Admin;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "/admin/site/index";
    }
    
}

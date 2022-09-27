package Equipode10a12.MinticC3.frontend.thymeleaf.controller;

import Equipode10a12.MinticC3.frontend.thymeleaf.entity.MovimientoDinero;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IMovimientoDineroService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG=Logger.getLogger(""+ IndexController.class);
@GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal User user){
    LOG.log(Level.INFO,"index");
    LOG.log(Level.INFO,"usuario : "+ user);
    System.out.println(IndexController.class + " - index");
    var mensaje="Bienvenidos al sistema de gestion de Ingresos Egresos";
    model.addAttribute("mensaje",mensaje);
    model.addAttribute("user", user);
    return "index";
    }
}

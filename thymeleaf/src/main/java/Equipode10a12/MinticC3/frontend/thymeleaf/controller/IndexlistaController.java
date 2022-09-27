package Equipode10a12.MinticC3.frontend.thymeleaf.controller;

import Equipode10a12.MinticC3.frontend.thymeleaf.entity.Empresa;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IEmpresaService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IMovimientoDineroService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IempleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexlistaController  {
    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IempleadoService empleadoService;

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/empresas/lista de empresas")
    public String getListUsuarios(Model model){
        LOG.log(Level.INFO,"getListEmpresas");
        List<Empresa> empresas = empresaService.findAll();
        model.addAttribute("empresas", empresas);
        return "empresas/lista de empresas";
    }

    @GetMapping("/empresas/crearempresa")
    public String crearEmpresa(Model modelo) {
        LOG.log(Level.INFO, "crearEmpresa");
        //Empresa
        Empresa empresa = new Empresa();
        modelo.addAttribute("empresa", empresa);
        //Roles
        //List<Roles> roles = new Roles();
        //modelo.addAttribute("roles", roles);
        // Tipo de documento
        return "empresas/editarempresa";
    }

    @PostMapping("/guardarem")
    public String guardarEmpresa(/*@Valid*/ Empresa empresa, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarEmpresa");

        //empresa.setClave(empresa.getClave());
        empresa = empresaService.Crearempresa(empresa);
        return "redirect:/empresas/lista de empresas";
    }

    @RequestMapping(value = "/editarem/{id}", method = RequestMethod.GET)
    public String editarEmpresa(@PathVariable("id") long Id, Model modelo){
        LOG.log(Level.INFO,"editarEmpresa");
        Empresa empresa = empresaService.findById(Id);
        modelo.addAttribute("empresa", empresa);
        //Roles
        //List<Roles> roles = rolService.findAll();
        //modelo.addAttribute("roles", roles);
        // Tipo de documento
        return "empresas/editarempresa";
    }

    @RequestMapping(value = "/eliminarem/{id}", method = RequestMethod.GET)
    public String elimiarEmpresa(@PathVariable("id") long Id, Model modelo) {
        LOG.log(Level.INFO, "eliminarEmpresa");
        empresaService.EliminarEmpresa(Id);
        return "redirect:/empresas/lista de empresas";
    }
}


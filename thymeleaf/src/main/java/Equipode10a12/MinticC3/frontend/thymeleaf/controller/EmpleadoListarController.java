package Equipode10a12.MinticC3.frontend.thymeleaf.controller;

import Equipode10a12.MinticC3.frontend.thymeleaf.entity.Empresa;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.MovimientoDinero;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IEmpresaService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IMovimientoDineroService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IempleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpleadoListarController {

    @Autowired
    private IempleadoService empleadoService;
    @Autowired
    private IEmpresaService EmpresaService;
    private final Logger LOG=Logger.getLogger(""+ EmpleadoListarController.class);
    @GetMapping("/Empleados/listar")
    public String getempleados(Model model){

        LOG.log(Level.INFO,"getempleados");
        List<empleado> empleados=empleadoService.findByIdAll();
        for (empleado emp:empleados)
            System.out.println(emp.toString());
        model.addAttribute("empleados",empleados);
        return "/Empleados/listar";

    }

    @GetMapping("/Empleados/modificare")
    public String crearempleados(Model model){

        LOG.log(Level.INFO,"crearempleados");
        //empleado
        empleado emp=new empleado();

        model.addAttribute("empleado",emp);

        //empresa
        List<Empresa> empresas= EmpresaService.findAll();
        model.addAttribute("empresas",empresas);
        return "/Empleados/modificare";

    }

    @PostMapping("/guardare")
    public String guardarempleado(empleado empleado, BindingResult error, Model modelo){

        LOG.log(Level.INFO,"guardarempleado");

        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {

            return "/Empleados/modificare";
        }
        System.out.println(empleado.toString());
        empleado.setFechaActualizacion(new Date());
        empleado = empleadoService.IngresarEmpleado(empleado);
        return "redirect:/Empleados/listar";
    }

    @RequestMapping(value = "/editare/{id}", method = RequestMethod.GET)
    public String editarEmpleado(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO,"editarEmpleado");
        empleado empleado = empleadoService.findById(id);
        model.addAttribute("empleado", empleado);
        //Empresa
        List<Empresa> empresas= EmpresaService.findAll();
        model.addAttribute("empresas",empresas);
        //empleado = empleadoService.Actualizar(id,empleado);
        return "/Empleados/modificare";
    }

    @RequestMapping(value = "/eliminare/{id}", method = RequestMethod.GET)
    public String deleteEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteEmpleado");
        empleadoService.EliminarEmpleado(id);
        return "redirect:/Empleados/listar";
    }
}

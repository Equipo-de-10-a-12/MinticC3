package Equipode10a12.MinticC3.frontend.thymeleaf.controller;

import Equipode10a12.MinticC3.frontend.thymeleaf.entity.MovimientoDinero;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IMovimientoDineroService;
import Equipode10a12.MinticC3.frontend.thymeleaf.service.IempleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientosReporteController{

    @Autowired
    private IMovimientoDineroService MovimientoDineroService;
    @Autowired
    private IempleadoService empleadoService;
    private final Logger LOG=Logger.getLogger(""+ MovimientosReporteController.class);
    @GetMapping("/Movimientos/reporte")
    public String getmovimientos(Model model){
        double suma=0;
        LOG.log(Level.INFO,"getmovimientos");
        List<MovimientoDinero> movimientos=MovimientoDineroService.findByAll();
        for (MovimientoDinero mov:movimientos) {
            System.out.println(mov.toString());
            suma=suma+mov.getMontoMovimiento();
            System.out.println(suma);
        }
           model.addAttribute("movimientos",movimientos);
           model.addAttribute("suma",suma);

        return "/Movimientos/reporte";

    }

    @GetMapping("/Movimientos/gestion")
    public String crearmovimientos(Model model){

        LOG.log(Level.INFO,"crearmovimientos");
        //movimiento
        MovimientoDinero mov=new MovimientoDinero();
        model.addAttribute("movimiento",mov);

        //empleado
        List<empleado> empleados= empleadoService.findByIdAll();
        model.addAttribute("empleados",empleados);
        return "/Movimientos/gestion";

    }

    @PostMapping("/guardar")
    public String guardarmovimiento(@Valid MovimientoDinero movimiento, BindingResult error, Model modelo){

        LOG.log(Level.INFO,"crearmovimientos");

        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {

            return "/Movimientos/gestion";
        }
        System.out.println(movimiento.toString());
        movimiento.setFechaCreacion(new Date());
        movimiento.setFechaActualizacion(new Date());
        movimiento = MovimientoDineroService.IngresarMonto(movimiento);
        return "redirect:/Movimientos/reporte";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editUsuario(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO,"editUsuario");
        MovimientoDinero movimiento = MovimientoDineroService.findById(id);
        movimiento.setFechaActualizacion(new Date());
        model.addAttribute("movimiento", movimiento);
        //Empleados
        List<empleado> empleados= empleadoService.findByIdAll();
        model.addAttribute("empleados",empleados);
        return "/Movimientos/gestion";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteUsuario(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteUsuario");
        MovimientoDineroService.EliminarMonto(id);
        return "redirect:/Movimientos/reporte";
    }

}

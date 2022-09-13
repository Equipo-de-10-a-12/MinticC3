package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;
import co.gov.mintic.equipo1012.ingresoegreso.repository.IMovimientoDineroRepository;
import co.gov.mintic.equipo1012.ingresoegreso.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")

public class MovimientoDineroRestController {

    @Autowired
    private IMovimientoDineroService MovimientoDineroService;
 @GetMapping("/MovimientoDinero/{id}")
 public MovimientoDinero findById(@PathVariable long id) {

     return MovimientoDineroService.findById(id);
 }

    @PostMapping("/MovimientoDinero")
    public MovimientoDinero IngresarMonto(@RequestBody MovimientoDinero md1){

       return MovimientoDineroService.IngresarMonto(md1);

    }
    @PutMapping("/MovimientoDinero/{id}")
    public MovimientoDinero ActualizarMonto(@PathVariable long id,@RequestBody MovimientoDinero md1 ){

        return MovimientoDineroService.ActualizarMonto(id,md1);

    }

    @PatchMapping("/MovimientoDinero/{id}/{oidEmpleado}")
    public MovimientoDinero ActualizarCampo(@PathVariable long id,@PathVariable empleado empleado){

      return MovimientoDineroService.ActualizarCampo(id,empleado);

    }

    @DeleteMapping ("/MovimientoDinero/{id}")
    public void EliminarMonto(@PathVariable long id){
    MovimientoDineroService.EliminarMonto(id);

    }

}
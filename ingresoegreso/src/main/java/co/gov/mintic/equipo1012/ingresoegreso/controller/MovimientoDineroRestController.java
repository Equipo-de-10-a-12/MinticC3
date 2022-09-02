package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class MovimientoDineroRestController {
 @GetMapping("/MovimientoDinero/{OidEmpleado}")

 public MovimientoDinero findById(@PathVariable int OidEmpleado) {

  MovimientoDinero md=new MovimientoDinero(50,1,"Ingreso");
md.setOidEmpleado(2);
md.setMontoMovimiento(30);
md.setConceptoMovimiento("Egreso");

  return md;
 }

    @PostMapping("/MovimientoDinero")
    public MovimientoDinero IngresarMonto(@RequestBody MovimientoDinero MovimientoDinero){
        MovimientoDinero md=new MovimientoDinero(50,1,"Ingreso");
        md.setOidEmpleado(2);
        md.setMontoMovimiento(20);
        md.setConceptoMovimiento("Egreso");

        return md;

    }
    @PutMapping("/MovimientoDinero")
    public MovimientoDinero ActualizarMonto(@PathVariable double MontoMovimiento,@RequestBody MovimientoDinero MovimientoDinero ){
        MovimientoDinero md=new MovimientoDinero(50,1,"Ingreso");
        md.setOidEmpleado(2);
        md.setMontoMovimiento(70);
        md.setConceptoMovimiento("Egreso");

        return md;

    }

}
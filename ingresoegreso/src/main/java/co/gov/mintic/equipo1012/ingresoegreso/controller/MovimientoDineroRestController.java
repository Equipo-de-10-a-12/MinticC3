package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
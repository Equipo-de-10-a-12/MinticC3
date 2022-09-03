package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")

public class MovimientoDineroRestController {
 @GetMapping("/MovimientoDinero/{id}")

 public MovimientoDinero findById(@PathVariable long id) {

     Date fechaCreacion  = new java.sql.Date(2022-1900,9-1,2);
     Date fechaActualizacion  = new java.sql.Date(2022-1900,9-1,3);

  MovimientoDinero md=new MovimientoDinero(50,1,"Ingreso",1,
          fechaCreacion, fechaActualizacion);
  md.setId(1);
  md.setOidEmpleado(2);
  md.setMontoMovimiento(30);
  md.setConceptoMovimiento("Egreso");
  md.setFechaCreacion(fechaCreacion);
  md.setFechaActualizacion(fechaActualizacion);

  return md;
 }

    @PostMapping("/MovimientoDinero")
    public MovimientoDinero IngresarMonto(@RequestBody MovimientoDinero md1){

        Date fechaCreacion = new java.sql.Date(2022-1900,8-1,5);
        Date fechaActualizacion = new java.sql.Date(2022-1900,8-1,15);

     MovimientoDinero md = new MovimientoDinero(50,1,"Ingreso",1,
             fechaCreacion, fechaActualizacion);
        md.setId(2);
        md.setOidEmpleado(md1.getOidEmpleado());
        md.setMontoMovimiento(md1.getMontoMovimiento());
        md.setConceptoMovimiento(md1.getConceptoMovimiento());
        md.setIdEmpresa(md1.getIdEmpresa());
        md.setFechaCreacion(fechaCreacion);
        md.setFechaActualizacion(fechaActualizacion);


        return md;

    }
    @PutMapping("/MovimientoDinero/{id}")
    public MovimientoDinero ActualizarMonto(@PathVariable long id,@RequestBody MovimientoDinero md1 ){

        Date fechaCreacion  = new java.sql.Date(2022,9,2);
        Date fechaActualizacion = new java.sql.Date(2022,9,3);

        MovimientoDinero md= findById(id);
        md.setId(3);
        md.setOidEmpleado(md1.getOidEmpleado());
        md.setMontoMovimiento(md1.getMontoMovimiento());
        md.setConceptoMovimiento(md1.getConceptoMovimiento());
        md.setIdEmpresa(md1.getIdEmpresa());
        md.setFechaCreacion(fechaCreacion);
        md.setFechaActualizacion(fechaActualizacion);

        return md;

    }

    @PatchMapping("/MovimientoDinero/{id}/{oidEmpleado}")
    public MovimientoDinero ActualizarCampo(@PathVariable long id,@PathVariable  int oidEmpleado){

        Date fechaCreacion  = new java.sql.Date(2022,9,2);
        Date fechaActualizacion = new java.sql.Date(2022,9,3);

        MovimientoDinero md= findById(id);
        md.setOidEmpleado(oidEmpleado);
        return md;

    }

    @DeleteMapping ("/MovimientoDinero/{id}")
    public void EliminarMonto(@PathVariable long id){

     MovimientoDinero md= findById(id);


    }

}
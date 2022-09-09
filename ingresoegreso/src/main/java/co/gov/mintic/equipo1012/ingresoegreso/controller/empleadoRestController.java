package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import co.gov.mintic.equipo1012.ingresoegreso.entity.Rol;
import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.util.Date;

@RestController
@RequestMapping("/api")

public class empleadoRestController {
    @GetMapping("/empleado/{id}")
    public empleado findById(@PathVariable int id) {

        Date fechaCreacion = new java.sql.Date(2022-1900,8-1,5);
        Date fechaActualizacion = new java.sql.Date(2022-1900,8-1,15);

        Rol rol1 = new Rol(100, "Admin", true);
        empleado emp = new empleado(1, "Maria", "midominio@midominio.com", rol1, fechaCreacion, fechaActualizacion);

        emp.setId(1);
        emp.setNombre("Jorge");
        emp.setEmail("midominio2@midominio2.com");
        emp.setFechaCreacion(fechaCreacion);
        emp.setFechaActualizacion(fechaActualizacion);

        return emp;
    }

    @GetMapping("/empleado")
    public List<empleado> findByIdAll() {

        List <empleado> mostrarem = new ArrayList<>();

        Date fechaCreacion = new java.sql.Date(2022-1900,8-1,5);
        Date fechaActualizacion = new java.sql.Date(2022-1900,8-1,15);

        Rol rol1 = new Rol(100, "Admin", true);
        empleado emp1 = new empleado(2, "Maria", "midominio@midominio.com", rol1, fechaCreacion, fechaActualizacion);
        mostrarem.add(emp1);
        empleado emp2 = new empleado(3, "Luis", "midominio2@midominio2.com", rol1, fechaCreacion, fechaActualizacion);
        mostrarem.add(emp2);

        return mostrarem;
    }

    @PostMapping("/empleado")
    public empleado IngresarEmpleado(@RequestBody empleado emp1){

        Date fechaCreacion = new java.sql.Date(2022-1900,8-1,5);
        Date fechaActualizacion = new java.sql.Date(2022-1900,8-1,15);

        Rol rol1 = new Rol(200, "User", true);
        empleado emp = new empleado(4, "Martha", "midominio@midominio.com", rol1, fechaCreacion, fechaActualizacion);

        emp1.setId(2);
        emp1.setNombre(emp1.getNombre());
        emp1.setEmail(emp1.getEmail());
        emp1.setFechaCreacion(fechaCreacion);
        emp1.setFechaActualizacion(fechaActualizacion);

        return emp1;
    }

    @PatchMapping("/empleado/{id}/{nombre}")
    public empleado Actualizar(@PathVariable int id, @PathVariable String nombre){

        Date fechaCreacion  = new java.sql.Date(2022,9,2);
        Date fechaActualizacion = new java.sql.Date(2022,9,3);

        empleado aemp= findById(id);
        aemp.setNombre(nombre);

        return aemp;
    }

    @DeleteMapping ("/empleado/{id}")
    public void EliminarEmpleado(@PathVariable int id){

        empleado em= findById(id);
    }
}


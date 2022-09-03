package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Rol;
import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class empleadoRestController {
    @GetMapping("/empleado/{id}")
    public empleado findById(@PathVariable int id) {
        Rol rol1 = new Rol(100, "Admin", true);
        empleado emp = new empleado(2, "Maria", "midominio@midominio.com", rol1);

        emp.setId(1);
        emp.setNombre("Jorge");
        emp.setEmail("midominio2@midominio2.com");

        return emp;
    }
}

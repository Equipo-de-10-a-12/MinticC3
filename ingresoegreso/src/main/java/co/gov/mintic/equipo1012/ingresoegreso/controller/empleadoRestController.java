package co.gov.mintic.equipo1012.ingresoegreso.controller;

import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;
import co.gov.mintic.equipo1012.ingresoegreso.service.IempleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class empleadoRestController {

    @Autowired
    private IempleadoService empleadoService;
    @GetMapping("/empleado/{id}")
    public empleado findById(@PathVariable long id) {

        return empleadoService.findById(id);

    }

    @GetMapping("/empleado")
    public List<empleado> findByIdAll() {

      return empleadoService.findByIdAll();
    }

    @PostMapping("/empleado")
    public empleado IngresarEmpleado(@RequestBody empleado emp1){

        return empleadoService.IngresarEmpleado(emp1);
    }

    @PatchMapping("/empleado/{id}/{nombre}")
    public empleado Actualizar(@PathVariable int id, @RequestBody empleado emp1){

        return empleadoService.Actualizar(id,emp1);
    }

    @DeleteMapping ("/empleado/{id}")
    public void EliminarEmpleado(@PathVariable int id){

        empleadoService.EliminarEmpleado(id);
        }
}


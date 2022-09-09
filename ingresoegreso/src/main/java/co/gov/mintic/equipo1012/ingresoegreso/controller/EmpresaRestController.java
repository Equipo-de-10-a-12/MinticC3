package co.gov.mintic.equipo1012.ingresoegreso.controller;


import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @GetMapping("/empresa/{nit}")
    public Empresa FindByNit(@PathVariable String nit){
        Empresa empresa1 = new Empresa("xiaomi","cra20#32-12","3344422","800844737");
        return empresa1;
    }
    @PostMapping("/empresa")
    public Empresa crearEmpresa(@RequestBody Empresa empresa){
        Empresa crearEmpresa = new Empresa("xiaomi","cra20#32-12","3344422","800844737");
        return crearEmpresa;

    }
    @PutMapping("/empresa")
    public Empresa actualizarEmpresa(@PathVariable String nit,@RequestBody Empresa empresa ){
        Empresa actualizarEmpresa = new Empresa("xiaomi","cra20#32-12","3344422","800844737");
        actualizarEmpresa.setNitEmpresa("900363746");
        actualizarEmpresa.setTelefonoEmpresa("4432232");
        actualizarEmpresa.setNombreEmpresa("apple");
        actualizarEmpresa.setDireccionEmpresa("cra2#3-2");
        return actualizarEmpresa;

    }
}

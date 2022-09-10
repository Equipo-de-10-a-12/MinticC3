package co.gov.mintic.equipo1012.ingresoegreso.controller;


import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import co.gov.mintic.equipo1012.ingresoegreso.service.IEmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @Autowired
    private IEmpresaService empressaService;

    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable long id) {

        return empressaService.findById(id);
    }
    @GetMapping("/empresa")
    public List<Empresa> findAll(){

            return empressaService.findAll();
    }

    @PostMapping("/empresa")
    public Empresa Crearempresa(@RequestBody Empresa empresa) {

        return empressaService.Crearempresa(empresa);

    }

    @PutMapping("/empresa/{id}")
    public Empresa Actualizarempresa(@PathVariable long id, @RequestBody Empresa empresa) {

        return empressaService.Actualizarempresa(id, empresa);

    }

    @PatchMapping("/empresa/{id}")
    public Empresa ActualizarCampo(@PathVariable long id, @RequestBody Empresa empresa) {

        return empressaService.ActualizarCampo(id, empresa);

    }

    @DeleteMapping("/empresa/{id}")
    public void EliminarEmpresa(@PathVariable long id) {
        empressaService.EliminarEmpresa(id);

    }
}


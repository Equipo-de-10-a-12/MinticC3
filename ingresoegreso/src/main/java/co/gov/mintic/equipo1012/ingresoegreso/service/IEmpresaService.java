package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;


import java.util.List;

public interface IEmpresaService {
    public Empresa findById(long id);
    public Empresa Crearempresa(Empresa empresa);
    public Empresa Actualizarempresa(long id,Empresa empresa );
    public Empresa ActualizarCampo(long id,Empresa empresa);
    public void EliminarEmpresa(long id);
    public List<Empresa> findAll();


}

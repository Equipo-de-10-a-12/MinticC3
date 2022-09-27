package Equipode10a12.MinticC3.frontend.thymeleaf.service;



import Equipode10a12.MinticC3.frontend.thymeleaf.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa findById(long id);
    public Empresa Crearempresa(Empresa empresa);
    public Empresa Actualizarempresa(long id,Empresa empresa );
    public Empresa ActualizarCampo(long id,Empresa empresa);
    public void EliminarEmpresa(long id);
    public List<Empresa> findAll();


}

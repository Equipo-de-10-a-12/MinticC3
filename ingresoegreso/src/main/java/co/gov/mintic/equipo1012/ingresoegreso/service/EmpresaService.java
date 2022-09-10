package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.repository.IempresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    public IempresaRepository empresaRepository;
    @Override
    public Empresa findById(long id) {
        Optional<Empresa> empresa = empresaRepository.findById(id);
        return empresa.get();
    }

    @Override
    public Empresa Crearempresa(Empresa empresa) {

        Empresa crearEmpresa = empresaRepository.save(empresa);
        return crearEmpresa;
    }

    @Override
    public Empresa Actualizarempresa(long id, Empresa empresa) {

        Empresa actualizarEmpresa = empresaRepository.save(empresa);
        return actualizarEmpresa;
    }

    @Override
    public Empresa ActualizarCampo(long id, Empresa empresa) {
        return null;
    }

    @Override
    public void EliminarEmpresa(long id) {
        empresaRepository.deleteById((long) id);
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = (List<Empresa>) empresaRepository.findAll();
        return empresas;
    }
}

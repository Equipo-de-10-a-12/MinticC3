package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;
import co.gov.mintic.equipo1012.ingresoegreso.repository.IMovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service

public class MovimientoDineroService implements IMovimientoDineroService{

    @Autowired
    private IMovimientoDineroRepository movimientoDineroRepository;

    @Override
    public  MovimientoDinero findById(long id){
        Optional<MovimientoDinero> md=movimientoDineroRepository.findById(id);
        return md.get();
         }
    @Override
    public MovimientoDinero IngresarMonto(MovimientoDinero md1){
        MovimientoDinero md = movimientoDineroRepository.save(md1);
        return md;
    }
    @Override
    public MovimientoDinero ActualizarMonto(long id, MovimientoDinero md1){

        MovimientoDinero md = movimientoDineroRepository.save(md1);
        return md;
    }
    @Override
    public MovimientoDinero ActualizarCampo(long id, empleado empleado){

        Optional<MovimientoDinero> md=movimientoDineroRepository.findById(id);
        md.get().setEmpleado(empleado);
        //MovimientoDinero md= findById(id);
        //md.setOidEmpleado(oidEmpleado);
        movimientoDineroRepository.save(md.get());
        return md.get();
    }
    @Override
    public void EliminarMonto(long id){
        movimientoDineroRepository.deleteById(id);
    }


}

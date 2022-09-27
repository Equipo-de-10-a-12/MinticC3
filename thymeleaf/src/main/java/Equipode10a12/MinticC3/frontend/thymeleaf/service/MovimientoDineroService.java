package Equipode10a12.MinticC3.frontend.thymeleaf.service;


import Equipode10a12.MinticC3.frontend.thymeleaf.entity.MovimientoDinero;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import Equipode10a12.MinticC3.frontend.thymeleaf.repository.IMovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovimientoDineroService implements IMovimientoDineroService{

    @Autowired
    private IMovimientoDineroRepository movimientoDineroRepository;

    @Override
    public List<MovimientoDinero> findByAll() {
        List<MovimientoDinero> movimientos = (List<MovimientoDinero>) movimientoDineroRepository.findAll();
        return movimientos;
    }

    @Override
    public MovimientoDinero findById(long id){
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

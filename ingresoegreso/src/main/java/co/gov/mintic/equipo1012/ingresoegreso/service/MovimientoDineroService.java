package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
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
        Date fechaCreacion  = new java.sql.Date(2022-1900,9-1,2);
        Date fechaActualizacion  = new java.sql.Date(2022-1900,9-1,3);

        Optional<MovimientoDinero> md=movimientoDineroRepository.findById(id);
        /*MovimientoDinero md=new MovimientoDinero(50,1,"Ingreso",1,
                fechaCreacion, fechaActualizacion);
        md.setId(1);
        md.setOidEmpleado(2);
        md.setMontoMovimiento(30);
        md.setConceptoMovimiento("Egreso");
        md.setFechaCreacion(fechaCreacion);
        md.setFechaActualizacion(fechaActualizacion);*/

        return md.get();
         }
    @Override
    public MovimientoDinero IngresarMonto(MovimientoDinero md1){
        Date fechaCreacion = new java.sql.Date(2022-1900,8-1,5);
        Date fechaActualizacion = new java.sql.Date(2022-1900,8-1,15);

      //  MovimientoDinero md = new MovimientoDinero(50,1,"Ingreso",1,
        //        fechaCreacion, fechaActualizacion);
        MovimientoDinero md = movimientoDineroRepository.save(md1);
        //MovimientoDinero md = new MovimientoDinero();
        //md.setId(2);
        //md.setOidEmpleado(md1.getOidEmpleado());
        //md.setMontoMovimiento(md1.getMontoMovimiento());
        //md.setConceptoMovimiento(md1.getConceptoMovimiento());
        //md.setIdEmpresa(md1.getIdEmpresa());
        //md.setFechaCreacion(fechaCreacion);
        //md.setFechaActualizacion(fechaActualizacion);
        return md;
    }
    @Override
    public MovimientoDinero ActualizarMonto(long id, MovimientoDinero md1){

        Date fechaCreacion  = new java.sql.Date(2022,9,2);
        Date fechaActualizacion = new java.sql.Date(2022,9,3);

        MovimientoDinero md = movimientoDineroRepository.save(md1);
        //MovimientoDinero md= findById(id);
        //md.setId(3);
        //md.setOidEmpleado(md1.getOidEmpleado());
        //md.setMontoMovimiento(md1.getMontoMovimiento());
        //md.setConceptoMovimiento(md1.getConceptoMovimiento());
        //md.setIdEmpresa(md1.getIdEmpresa());
        //md.setFechaCreacion(fechaCreacion);
        //md.setFechaActualizacion(fechaActualizacion);
        return md;
    }
    @Override
    public MovimientoDinero ActualizarCampo(long id,int oidEmpleado){
        Date fechaCreacion  = new java.sql.Date(2022,9,2);
        Date fechaActualizacion = new java.sql.Date(2022,9,3);

        MovimientoDinero md= findById(id);
        md.setOidEmpleado(oidEmpleado);
        return md;
    }
    @Override
    public void EliminarMonto(long id){
        movimientoDineroRepository.deleteById(id);
    }


}

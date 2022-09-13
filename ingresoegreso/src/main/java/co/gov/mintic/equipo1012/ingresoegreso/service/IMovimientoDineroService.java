package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;

public interface IMovimientoDineroService {

    public  MovimientoDinero findById(long id);
    public  MovimientoDinero IngresarMonto(MovimientoDinero md1);
    public  MovimientoDinero ActualizarMonto(long id, MovimientoDinero md1);
    public  MovimientoDinero ActualizarCampo(long id, empleado empleado);
    public  void EliminarMonto(long id);
}

package Equipode10a12.MinticC3.frontend.thymeleaf.service;


import Equipode10a12.MinticC3.frontend.thymeleaf.entity.Empresa;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.MovimientoDinero;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;

import java.util.List;

public interface IMovimientoDineroService {


    public List<MovimientoDinero> findByAll();
    public MovimientoDinero findById(long id);
    public  MovimientoDinero IngresarMonto(MovimientoDinero md1);
    public  MovimientoDinero ActualizarMonto(long id, MovimientoDinero md1);
    public  MovimientoDinero ActualizarCampo(long id, empleado empleado);
    public  void EliminarMonto(long id);
}

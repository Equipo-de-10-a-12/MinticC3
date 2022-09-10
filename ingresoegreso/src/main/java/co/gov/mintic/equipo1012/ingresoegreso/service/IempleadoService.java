package co.gov.mintic.equipo1012.ingresoegreso.service;

import co.gov.mintic.equipo1012.ingresoegreso.entity.empleado;

import java.util.List;

public interface IempleadoService {
    public empleado findById(long id);

    public List<empleado> findByIdAll();

    public empleado IngresarEmpleado(empleado emp1);

    public empleado Actualizar(long id, empleado emp1);

    public void EliminarEmpleado(long id);
}

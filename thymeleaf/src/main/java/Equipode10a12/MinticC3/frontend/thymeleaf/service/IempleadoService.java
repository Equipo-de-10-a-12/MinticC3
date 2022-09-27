package Equipode10a12.MinticC3.frontend.thymeleaf.service;



import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;

import java.util.List;

public interface IempleadoService {
    public empleado findById(long id);

    public List<empleado> findByIdAll();

    public empleado IngresarEmpleado(empleado emp1);

    public empleado Actualizar(long id, empleado emp1);

    public void EliminarEmpleado(long id);
}

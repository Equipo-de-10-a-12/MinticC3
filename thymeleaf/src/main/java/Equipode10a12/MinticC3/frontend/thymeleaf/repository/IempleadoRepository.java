package Equipode10a12.MinticC3.frontend.thymeleaf.repository;

import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import org.springframework.data.repository.CrudRepository;

public interface IempleadoRepository extends CrudRepository <empleado, Long>{

    empleado findByUsername(String username);
}

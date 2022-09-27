package Equipode10a12.MinticC3.frontend.thymeleaf.service;



import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import Equipode10a12.MinticC3.frontend.thymeleaf.repository.IempleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empleadoService implements IempleadoService {

    @Autowired
    private IempleadoRepository empleadoRepository;

    @Override

    public empleado findById(long id) {

        Optional<empleado> emp = empleadoRepository.findById(id);

        return emp.get();
    }


    public List<empleado> findByIdAll() {

        List <empleado> mostrarem = (List<empleado>) empleadoRepository.findAll();

        return mostrarem;
    }


    public empleado IngresarEmpleado(empleado emp1){

       empleado emp = empleadoRepository.save(emp1);
       return emp1;
    }


    public empleado Actualizar(long id, empleado emp1){


        empleado emp = empleadoRepository.save(emp1);

        return emp1;
    }


    public void EliminarEmpleado(long id){

        empleadoRepository.deleteById((long) id);
    }

}

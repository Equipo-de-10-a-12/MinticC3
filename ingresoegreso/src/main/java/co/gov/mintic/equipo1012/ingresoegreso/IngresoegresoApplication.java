package co.gov.mintic.equipo1012.ingresoegreso;

import co.gov.mintic.cartera.ingresoegreso.entity.empleado;
import co.gov.mintic.equipo1012.ingresoegreso.entity.Empresa;
import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngresoegresoApplication.class, args);
        //System.out.println("Ingreso Egreso!");
        double MontoMovimiento = 100;
        int OidEmpleado = 5;
        String ConceptoMovimiento = "Ingreso";

        //Instancia de la clase
        MovimientoDinero md = new MovimientoDinero(MontoMovimiento, OidEmpleado, ConceptoMovimiento);

        //Leer el monto del dinero
        System.out.println(md.getMontoMovimiento());

        //Modificar el Monto del dinero con valores positivos y negativos
        md.setMontoMovimiento(50);
        md.setConceptoMovimiento("Ingreso");
        md.setOidEmpleado(1);
        System.out.println("Ingreso de Movimiento de concepto ingreso positivo con usuario de oid 1");
        //System.out.println(md.getMontoMovimiento());
        //System.out.println(md.getConceptoMovimiento());
        //System.out.println(md.getOidEmpleado());
        System.out.println(md);
        System.out.println("Ingreso de Movimiento de concepto egreso negativo con usuario oid 2");
        md.setMontoMovimiento(-50);
        md.setConceptoMovimiento("Egreso");
        md.setOidEmpleado(2);
        //System.out.println(md.getMontoMovimiento());
        //System.out.println(md.getConceptoMovimiento());
        //System.out.println(md.getOidEmpleado());
        System.out.println(md);


        Empresa empresa1 = new Empresa("apple","cra22#11a","333442","80095748");

        empresa1.getDireccionEmpresa();
	    empresa1.getNitEmpresa();
	    empresa1.getNombreEmpresa();
	    empresa1.getTelefonoEmpresa();

	    System.out.println(empresa1);

	    empresa1.setDireccionEmpresa("cra22#00-1");
	    empresa1.setNitEmpresa("222333444");
	    empresa1.setNombreEmpresa("xioami");
	    empresa1.setTelefonoEmpresa("33344455");

	    System.out.println(empresa1);
        //Instancia de clase empleado
        empleado emp = new empleado(1, "Luis", "midominio@midominio.com", 10, 20);
        //Lectura y modificacion de nombre, email, empresa y rol de empleado
        System.out.println(emp);
        emp.setId(1);
        //System.out.println(emp.getId());
        emp.setNombre("Jorge");
        //System.out.println(emp.getNombre());
        emp.setEmail("midominio2@midominio2.com");
        //System.out.println(emp.getEmail());
        emp.setId_empresa(30);
        //System.out.println(emp.getId_empresa());
        emp.setId_rol(40);
        //System.out.println(emp.getId_rol());
         System.out.println(emp);

    }

}

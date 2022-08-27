package co.gov.mintic.equipo1012.ingresoegreso;

import co.gov.mintic.equipo1012.ingresoegreso.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IngresoegresoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngresoegresoApplication.class, args);
        System.out.println("Ingreso Egreso!");
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
        System.out.println(md.getMontoMovimiento());
        System.out.println(md.getConceptoMovimiento());
        System.out.println(md.getOidEmpleado());
        System.out.println("Ingreso de Movimiento de concepto egreso negativo con usuario oid 2");
        md.setMontoMovimiento(-50);
        md.setConceptoMovimiento("Egreso");
        md.setOidEmpleado(2);
        System.out.println(md.getMontoMovimiento());
        System.out.println(md.getConceptoMovimiento());
        System.out.println(md.getOidEmpleado());
    }
}

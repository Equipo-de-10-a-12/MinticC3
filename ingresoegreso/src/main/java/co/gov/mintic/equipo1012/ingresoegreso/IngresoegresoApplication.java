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

        MovimientoDinero md = new MovimientoDinero(MontoMovimiento, OidEmpleado, ConceptoMovimiento);
        System.out.println(md.getMontoMovimiento());
    }
}

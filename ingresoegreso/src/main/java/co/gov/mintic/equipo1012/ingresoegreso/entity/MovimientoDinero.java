package co.gov.mintic.equipo1012.ingresoegreso.entity;

public class MovimientoDinero {
    private double MontoMovimiento;
    private int OidEmpleado;
    private String ConceptoMovimiento;

    public MovimientoDinero(double montoMovimiento, int oidEmpleado, String conceptoMovimiento) {
        MontoMovimiento = montoMovimiento;
        OidEmpleado = oidEmpleado;
        ConceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoMovimiento() {
        return MontoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        MontoMovimiento = montoMovimiento;
    }

    public int getOidEmpleado() {
        return OidEmpleado;
    }

    public void setOidEmpleado(int oidEmpleado) {
        OidEmpleado = oidEmpleado;
    }

    public String getConceptoMovimiento() {
        return ConceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        ConceptoMovimiento = conceptoMovimiento;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "MontoMovimiento=" + MontoMovimiento +
                ", OidEmpleado=" + OidEmpleado +
                ", ConceptoMovimiento='" + ConceptoMovimiento + '\'' +
                '}';
    }
}

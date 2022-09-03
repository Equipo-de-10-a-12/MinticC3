package co.gov.mintic.equipo1012.ingresoegreso.entity;

import java.util.Date;

public class MovimientoDinero {

    private long id;
    private double montoMovimiento;
    private int oidEmpleado;
    private String conceptoMovimiento;

    private long idEmpresa;

    private Date fechaCreacion;

    private Date fechaActualizacion;

    public MovimientoDinero(double montoMovimiento, int oidEmpleado, String conceptoMovimiento, long idEmpresa,
                            Date fechaCreacion, Date fechaActualizacion) {
        this.montoMovimiento = montoMovimiento;
        this.oidEmpleado = oidEmpleado;
        this.conceptoMovimiento = conceptoMovimiento;
        this.idEmpresa = idEmpresa;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public int getOidEmpleado() {
        return oidEmpleado;
    }

    public void setOidEmpleado(int oidEmpleado) {
        this.oidEmpleado = oidEmpleado;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", MontoMovimiento=" + montoMovimiento +
                ", OidEmpleado=" + oidEmpleado +
                ", ConceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", idEmpresa=" + idEmpresa +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}

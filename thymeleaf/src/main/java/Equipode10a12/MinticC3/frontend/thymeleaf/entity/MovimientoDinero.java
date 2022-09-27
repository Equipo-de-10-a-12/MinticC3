package Equipode10a12.MinticC3.frontend.thymeleaf.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
@Entity
@Table(name="movimientos")

public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    //@javax.validation.constraints.NotEmpty
    @Column(nullable = false)
    private double montoMovimiento;
    @ManyToOne
    @JoinColumn(name="oid_empleado")
     private empleado empleado;
    @javax.validation.constraints.NotEmpty
    @Column(nullable = false)
    private String conceptoMovimiento;
    @Column(nullable = false)
    private Date fechaCreacion;
    @Column()
    private Date fechaActualizacion;

    //public MovimientoDinero(double montoMovimiento, int oidEmpleado, String conceptoMovimiento, long idEmpresa,
      //                      Date fechaCreacion, Date fechaActualizacion) {
    public MovimientoDinero() {

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

    public Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado getEmpleado() {
        return empleado;

    }

    public void setEmpleado(Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado empleado) {
        this.empleado = empleado;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
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
                ", montoMovimiento=" + montoMovimiento +
                ", empleado=" + empleado +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                '}';
    }
}

package Equipode10a12.MinticC3.frontend.thymeleaf.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="empleados")

public class empleado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Date fechaCreacion;
    @Column()
    private Date fechaActualizacion;
    @Column(nullable = false)
    private String imagen;
    @Column(nullable = false)
    private String telefono;

    @Column(name = "clave")
    private String clave;

    @Column(name = "username", unique = true)
    private String username;
    @Column(name="rol", nullable = false)
    //@Enumerated(value = EnumType.STRING)
    private Roles rol;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @ManyToOne
    @JoinColumn(name="id_empresa")
    private Empresa empresa;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public empleado() {

    }

    @Override
    public String toString() {
        return "empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clave='" + clave + '\'' +
                ", username='" + username + '\'' +
                ", rol=" + rol +
                ", empresa=" + empresa +
                '}';
    }
}


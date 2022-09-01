package co.gov.mintic.equipo1012.ingresoegreso.entity;

import co.gov.mintic.equipo1012.ingresoegreso.entity.Rol;


public class empleado{
    private int id;
    private String nombre;
    private String email;
    private Rol rol;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public empleado(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;

    }

    @Override
    public String toString() {
        return "empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


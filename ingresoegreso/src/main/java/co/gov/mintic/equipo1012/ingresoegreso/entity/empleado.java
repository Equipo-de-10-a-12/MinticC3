package co.gov.mintic.cartera.ingresoegreso.entity;

public class empleado{
    private int id;
    private String nombre;
    private String email;
    private int id_empresa;
    private int id_rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
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

    public empleado(int id, String nombre, String email, int id_empresa, int id_rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.id_empresa = id_empresa;
        this.id_rol = id_rol;
    }
}


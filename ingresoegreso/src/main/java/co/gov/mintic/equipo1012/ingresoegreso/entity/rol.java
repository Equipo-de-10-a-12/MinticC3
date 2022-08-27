package co.gov.mintic.cartera.ingresoegreso.entity;

public class rol {
    private long idRol;
    private String descripcion;
    private boolean estado;

    public rol(long idRol, String descripcion, boolean estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}


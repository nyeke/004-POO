package com.cice.biblioteca;

public class Producto implements Prestamo {

    private String fechaPublicacion;
    private String nombre;

    public Producto() {
    }

    public Producto(String fechaPublicacion, String nombre) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

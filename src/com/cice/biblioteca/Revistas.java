package com.cice.biblioteca;

public class Revistas extends Publicacion{

    private long numeroRevista;
    private String perioricidad;

    public Revistas(String fechaPublicacion, String nombre, long numeroRevista, String perioricidad) {
        super(fechaPublicacion, nombre);
        this.numeroRevista = numeroRevista;
        this.perioricidad = perioricidad;
    }

    public long getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(long numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String getPerioricidad() {
        return perioricidad;
    }

    public void setPerioricidad(String perioricidad) {
        this.perioricidad = perioricidad;
    }
}

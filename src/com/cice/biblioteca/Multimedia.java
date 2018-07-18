package com.cice.biblioteca;

public class Multimedia extends Item {

    private String titulo;
    private long formato;
    private long duracion;

    public Multimedia() {
    }

    public Multimedia(String titulo, long formato, long duracion) {
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getFormato() {
        return formato;
    }

    public void setFormato(long formato) {
        this.formato = formato;
    }

    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
    }
}

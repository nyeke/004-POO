package com.cice.biblioteca;

import com.cice.biblioteca.primer.orden.Publicacion;

public class Comics extends Publicacion {

    private long numeroComic;
    private String coleccionComic;


    public Comics(String fechaPublicacion, String nombre, long numeroComic, String coleccionComic) {
        super(fechaPublicacion, nombre);
        this.numeroComic = numeroComic;
        this.coleccionComic = coleccionComic;
    }

    public long getNumeroComic() {
        return numeroComic;
    }

    public void setNumeroComic(long numeroComic) {
        this.numeroComic = numeroComic;
    }

    public String getColeccionComic() {
        return coleccionComic;
    }

    public void setColeccionComic(String coleccionComic) {
        this.coleccionComic = coleccionComic;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "numeroComic=" + numeroComic +
                ", coleccionComic='" + coleccionComic + '\'' +
                "} " + super.toString();
    }
}

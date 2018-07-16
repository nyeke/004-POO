package com.cice.biblioteca;

public class Libros extends Producto{

        private String edicionLibro;
        private String isbn;
        private String autorLibro;


    public Libros(String fechaPublicacion, String nombre, String edicionLibro, String isbn, String autorLibro) {
        super(fechaPublicacion, nombre);
        this.edicionLibro = edicionLibro;
        this.isbn = isbn;
        this.autorLibro = autorLibro;
    }

    public String getEdicionLibro() {
        return edicionLibro;
    }

    public void setEdicionLibro(String edicionLibro) {
        this.edicionLibro = edicionLibro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
}

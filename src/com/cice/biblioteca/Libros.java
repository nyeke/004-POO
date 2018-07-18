package com.cice.biblioteca;

import com.cice.biblioteca.interfaces.Iprestable;
import com.cice.biblioteca.primer.orden.Publicacion;

public class Libros extends Publicacion implements Iprestable{

    private String edicionLibro;
    private String isbn;
    private String autorLibro;

    //Añadido debido a la implementacion de la interface. Nada obliga a creala
    private boolean estaPrestado;


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

    @Override
    public boolean prestar() {
        if (esPrestado()){
            return false;
        } else {
            this.estaPrestado = true;
            return this.estaPrestado;
        }
    }

    @Override
    public boolean devolver() {
        if (esPrestado()){
            this.estaPrestado = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean esPrestado() {
        return this.estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "fecha publicacion='" + getFechaPublicacion()+ '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edicionLibro='" + edicionLibro + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autorLibro='" + autorLibro + '\'' +
                ", estaPrestado=" + estaPrestado +
                "} " + super.toString();
    }
}

package com.cice.biblioteca;

import com.cice.biblioteca.interfaces.Iprestable;
import com.cice.biblioteca.primer.orden.Multimedia;

public class Disco extends Multimedia implements Iprestable{

    private String selloDiscografico;
    private String artista;
    private boolean estaPrestado;

    public Disco() {
    }

    public Disco(String titulo, String formato, String duracion, String selloDiscografico, String artista) {
        super(titulo, formato, duracion);
        this.selloDiscografico = selloDiscografico;
        this.artista = artista;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
        return "Disco{" +
                "titulo" + getTitulo() + '\'' +
                ", formato" + getFormato() + '\'' +
                ", duracion" + getDuracion() + '\'' +
                ", selloDiscografico='" + selloDiscografico + '\'' +
                ", artista='" + artista + '\'' +
                ", estaPrestado=" + estaPrestado +
                "} " + super.toString();
    }
}

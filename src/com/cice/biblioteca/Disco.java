package com.cice.biblioteca;

public class Disco extends Multimedia {

    private String sello;
    private String grupo;

    public Disco(String titulo, long formato, long duracion, String sello, String grupo) {
        super(titulo, formato, duracion);
        this.sello = sello;
        this.grupo = grupo;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}

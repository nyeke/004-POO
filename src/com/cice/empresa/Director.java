package com.cice.empresa;

public class Director extends Gerente{

    private String matricula;

    public Director(double salario, String nombre, String fechaNacimiento, String departamento, String matricula) {
        super(salario, nombre, fechaNacimiento, departamento);
        this.matricula = matricula;
        incrementarSalario();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private void incrementarSalario(){
        this.setSalario(this.getSalario()*1.10+100);
    }
}

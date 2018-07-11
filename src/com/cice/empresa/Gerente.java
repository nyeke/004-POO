package com.cice.empresa;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(double salario, String nombre, String fechaNacimiento, String departamento) {
        super(salario, nombre, fechaNacimiento);
        this.departamento = departamento;
        this.incrementarSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private void incrementarSalario(){
        this.setSalario(this.getSalario()*1.05);
    }

    /*
    public void incrementasSalarioB(double salario){
        this.setSalario(this.getSalario()*1.05);
    }

    public double incrementasSalarioC(double salario){
        return salario*0.05;
    }
    */

}

package com.cice;


import com.cice.biblioteca.Comics;
import com.cice.biblioteca.Disco;
import com.cice.biblioteca.Libros;
import com.cice.biblioteca.interfaces.Iprestable;
import com.cice.biblioteca.primer.orden.Recurso;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Recurso> lista = new ArrayList<>();
        List<Boolean> listaStatus = new ArrayList<>();

        Disco disco = new Disco("Disco", "CD", "60", "Warner", "Melendi");
        listaStatus.add(disco.prestar());

        lista.add(disco);

        lista.add(new Comics("01/01/2018", "Spiderman", 12, "Marvel"));
        lista.add(new Libros("1615", "El Quijote", "1615", "ISBN", "Miguel"));

        for (Recurso recurso : lista) {

/*            Iprestable iprestable = (Iprestable) recurso;

            if (iprestable.esPrestado()){
                System.out.println("Esta Prestado -> " + recurso.toString());
            } else {
                System.out.println("No esta Prestado -> " + recurso.toString());
            }*/

            if (recurso instanceof Iprestable) {
                if (((Iprestable) recurso).esPrestado()) {
                    System.out.println("Esta Prestado -> " + recurso.toString());
                } else {
                    System.out.println("No esta Prestado -> " + recurso.toString());
                }
            } else {
                System.out.println("No Prestable -> " + recurso.toString());
            }
        }

/*
        Empleado empleado = new Empleado(1000, "Gustavo", "04/05/1983");
        Gerente gerente = new Gerente(1000, "Gustavo", "04/05/1983", "TIC");
        Director director = new Director(1000, "Gustavo", "04/05/1983", "TIC", "4674BDL");

        Empleado[] empleados  = {empleado, gerente, director};

        for (Empleado emp : empleados){
            System.out.println(emp.getNombre() + " " + emp.getSalario());
        }
*/

        //System.out.println(empleado.getSalario());
        //System.out.println(gerente.getSalario());
        //System.out.println(director.getSalario());
    }
}

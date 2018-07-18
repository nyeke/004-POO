package com.cice.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {

    Scanner sc = new Scanner(System.in);
    private int opcion;

    public void iniciarApp() {
        do {
            mostrarMenu();
            validarOpcion(opcion);
        } while (opcion != 5);

    }

    public void mostrarMenu (){
        System.out.println("=========================================");
        System.out.println("1. Numero libros Prestados");
        System.out.println("2. Publicaciones anteriores a una fecha");
        System.out.println("3. Listado de Publicaciones y discos");
        System.out.println("4. Listado de Publicaciones y discos diferenciando por prestado");
        System.out.println("5. Salir");
        System.out.println("==========================================");
        opcion = sc.nextInt();
    }

    private void validarOpcion(int opcion){
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public void librosPrestados(){ }

    public void publicacionAnterior(){ }

    public void listado(){}

    public void listadoPestados(){}
}

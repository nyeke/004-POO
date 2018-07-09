package com.cice;

import com.cice.empresa.Director;
import com.cice.empresa.Empleado;
import com.cice.empresa.Gerente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Empleado empleado = new Empleado(1000, "Gustavo", "04/05/1983");
        Gerente gerente = new Gerente(1000, "Gustavo", "04/05/1983", "TIC");
        Director directo = new Director(1000, "Gustavo", "04/05/1983", "TIC", "4674BDL");
    }
}

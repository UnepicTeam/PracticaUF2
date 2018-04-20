package com.company.View;

import com.company.Mannager.ManagerTiendas;
import com.company.Model.Veterinario;

import java.util.Scanner;

public class PantallaBuscar {
    public void iniciar (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que desea buscar:");
        System.out.println();
        System.out.println("1-Tienda");
        System.out.println("2-Veterinario");

        //guardo la opcion en una variable
        String opcion = scanner.nextLine();
        String nombre="";
    }

    public static boolean comprobarTienda(String nombre) {
       return true;
    }

    public static boolean comprobarVeterinario(String nombre) {
        return true;
    }

}

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

//        if (opcion.equals("1")){
//            System.out.println("Nombre de la tienda:");
//            nombre = scanner.nextLine();
//            //String tienda = ManagerTiendas.buscarTienda(nombre);
//            System.out.println(tienda);
//        }else if (opcion.equals("2")){s
//            System.out.println("Nombre del veterinario:");
//            nombre = scanner.nextLine();
//            //List<Veterinario> veterianariosEncontrados = ManagerVeterinarios.buscarVeterinario(nombre);
//
//            for (Veterinario veterianario : veterianariosEncontrados) {
//                System.out.println(veterianario.nombre + " " + veterianario.direccion);
//            }
//        }
    }
}

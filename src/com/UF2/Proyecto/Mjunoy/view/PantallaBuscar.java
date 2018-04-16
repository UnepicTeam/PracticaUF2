package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.List;
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

        if (opcion.equals("1")){
            System.out.println("Nombre de la tienda:");
            nombre = scanner.nextLine();
           // String tienda = ManagerTiendas.buscarTienda(nombre);
           // System.out.println(tienda);
        }else if (opcion.equals("2")){
            System.out.println("Nombre del veterinario:");
            nombre = scanner.nextLine();
            List<Veterinario> veterianariosEncontrados = ManagerVeterianarios.buscarVeterinario(nombre);

            for (Veterinario veterinario : veterianariosEncontrados) {
                System.out.println(veterinario.nombre + " " + veterinario.direccion);
            }
        }
    }
}

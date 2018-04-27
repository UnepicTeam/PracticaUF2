package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.List;
import java.util.Scanner;

public class PantallaBuscar {

    public void iniciar (){

        Scanner scanner = new Scanner(System.in);

        boolean salir=false;

        do{
        System.out.println("Que desea buscar:");
        System.out.println();
        System.out.println("1-Tienda");
        System.out.println("2-Veterinario");
        System.out.println("3-Volver a la pantalla de inicio.");
        System.out.println("4-Salir.");

        //guardo la opcion en una variable
        String opcion = scanner.nextLine();

        if (opcion.equals("1")){
            new PantallaBuscarTienda().iniciar();
        }else if (opcion.equals("2")){
            new PantallaBuscarVeterinario().iniciar();
        }else if (opcion.equals("3")){
            new PantallaPrincipal().iniciar();
        }else if (opcion.equals("4")){
            System.out.println("Gracias por usar nuestra aplicacion");
            System.exit(0);
        }else{
            System.out.println("Opcion incorrecta seleccione otra vez");
        }

        }while (!salir);
    }
}

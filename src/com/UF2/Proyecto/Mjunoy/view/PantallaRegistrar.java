package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;

import java.util.Scanner;

public class PantallaRegistrar {

    public void iniciar (){

        Scanner scanner = new Scanner(System.in);
        boolean salir= false;

        do {

            //ahora pregunto al usuario si registrara una tienda
            //o un veterinario

            System.out.println("Que desea registrar:");
            System.out.println();
            System.out.println("1-Tienda.");
            System.out.println("2-Veterinario.");
            System.out.println("3-Volver a la pantalla de inicio.");
            System.out.println("4-Salir.");

            //guardo la opcion en una variable
            String opcion = scanner.nextLine();

            //compruevo que opcion a escogido el usuario
            if (opcion.equals("1")) {
                // si quiere registrar una tienda creo una
                // pantalla de registro de tiendad
                new PantallaRegitrarTienda().iniciar();
            } else if (opcion.equals("2")) {
                // si quiere registrar un veterinario creo una
                // pantalla de registro de veterinarios
                new PantallaRegistrarVeterinario().iniciar();
            } else if (opcion.equals("3")) {
                //si el usuario quiere volver al menu principal
                //creo una pantalla principal y la inicio.
                new PantallaPrincipal().iniciar();
            } else if (opcion.equals("4")) {
                System.out.println("Gracias por usar VeteriApp");
                salir=true;
            } else {
                System.out.println("Opcion incorrecta vuelva a seleccionar:");
            }
        }while (!salir);
    }
}

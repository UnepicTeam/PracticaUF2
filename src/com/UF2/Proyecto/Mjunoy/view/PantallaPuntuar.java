package com.UF2.Proyecto.Mjunoy.view;

import java.util.Scanner;

public class PantallaPuntuar {

    public  void iniciar(){

        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        do {

            //doy la bienvenida al usuario y le muestro el menu
            System.out.println("Seleccione que desea puntuar");
            System.out.println();
            System.out.println("1-Puntuar tienda.");
            System.out.println("2-Puntuar veterinario.");
            System.out.println("3-Menu principal");
            System.out.println("4-Salir.");

            // guardo en una variable la opcion seleccionada por el usuario
            String opcion = scanner.nextLine();

            if (opcion.equals("1")){
                new PantallaPuntuarTienda().iniciar();
            }else if (opcion.equals("2")){
                new PantallaPuntuarVeterinario().iniciar();
            }else if (opcion.equals("3")){
                new PantallaPrincipal().iniciar();
            }else if (opcion.equals("4")){
                System.out.println("Gracias por usar veterinapp.");
                System.exit(0);
            }else{
                System.out.println("Opcion incorrecta.");
                System.out.println("Seleccione otra vez.");
            }

        }while (!salir);
    }
}

package com.company.View;

import java.util.Scanner;

public class PantallaPuntuar {

    public void iniciar (){

        Scanner scanner = new Scanner(System.in);
        boolean salir= false;

        do {

            //ahora pregunto al usuario si registrara una tienda
            //o un veterinario

            System.out.println("¿Que deseas puntuar?:");
            System.out.println();
            System.out.println("1-Tienda.");
            System.out.println("2-Veterinario.");
            System.out.println("3-Volver a la pantalla de inicio.");
            System.out.println("4-Salir.");

            //guardo la opcion en una variable
            String opcion = scanner.nextLine();

            //compruevo que opcion a escogido el usuario
            if (opcion.equals("1")) {
                // si quiere puntuar una tienda creo una
                // pantalla de registro de tiendad
                new PantallaPuntuarTienda().iniciar();
            } else if (opcion.equals("2")) {
                // si quiere puntuar un veterinario creo una
                new PantallaPuntuarVeterinario().iniciar();
            } else if (opcion.equals("3")) {
                //si el usuario quiere volver al menu principal
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


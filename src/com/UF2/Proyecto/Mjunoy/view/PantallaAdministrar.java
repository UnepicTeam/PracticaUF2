package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerAdministrador;

import java.io.Console;
import java.util.Scanner;

public class PantallaAdministrar {
    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        do {

            //doy la bienvenida al usuario y le muestro el menu
            System.out.println("Seleccione que desea hacer");
            System.out.println();
            System.out.println("1-Admnistrar veterinario/tienda.");
            System.out.println("2-Volver atras.");
            System.out.println("3-Salir.");

            // guardo en una variable la opcion seleccionada por el usuario
            String opcion = scanner.nextLine();

            //compruevo que a seleccionado el usuario
            if (opcion.equals("1")) {
                new PantallaLogin().login();
            } else if (opcion.equals("2")) {
                new PantallaPrincipal().iniciar();
            }  else if (opcion.equals("3")) {
               System.out.println("Gracias por usar VeteriApp");
                salir = true;
            }else{
                System.out.println("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);

    }
}


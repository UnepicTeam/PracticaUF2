package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerAdministrador;

import java.util.Scanner;

public class PantallaLogin {

    public void login() {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = false;
        do {
            System.out.println("Introduzca su usuario:");
            String usuario = scanner.nextLine();
            System.out.println("Introduzca su contraseña:");
            //si da tiempo buscar informacion sobre Console.readPasword o
            // System.console().readPassword() esto da error pk trabaja con chars no con strings;
            String contraseña = scanner.nextLine();

            Boolean login = new ManagerAdministrador().login(usuario, contraseña);

            if (login) {

                boolean opc = false;
                do {
                    System.out.println("Que desea Administrar:");
                    System.out.println("1-Tiendas.");
                    System.out.println("2-Veterinarios.");
                    System.out.println("3-Salir.");

                    String opcion = scanner.nextLine();

                    if (opcion.equals("1")) {
                        new PantallaAdministrarTienda().iniciar();
                    } else if (opcion.equals("2")) {
                        new PantallaAdministrarVeterinario().iniciar();
                    } else if (opcion.equals("3")){
                        System.out.println("Gracias por usar VeteriApp");
                        continuar=true;
                        opc=true;
                    }else{
                        System.out.println("Opcion incorrecta");
                        System.out.println("Seleccione otra vez");
                    }
                }while (!opc);
            } else {
                boolean opc = false;
                do {
                    System.out.println("Usuario o contraseña incorrecto.");
                    System.out.println("Que desea hacer?");
                    System.out.println("1-Volver a intentarlo.");
                    System.out.println("2-Salir.");

                    String opcion = scanner.nextLine();

                    if (opcion.equals("1")) {
                        System.out.println("Recuerde que se distingue entre mayusculas y minusculas");
                    } else if (opcion.equals("2")) {
                        System.out.println("Gracias por usar VeteriApp");
                        continuar = true;
                        opc = true;
                    } else {
                        System.out.println("Opcion incorrecta");
                        System.out.println("Seleccione otra vez");
                    }
                }while (!opc);
            }
        }while (!continuar);
    }
}

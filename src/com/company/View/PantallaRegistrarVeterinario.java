package com.company.View;

import com.company.Mannager.ManagerVeterinarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PantallaRegistrarVeterinario {
    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        List<Double> precios = new ArrayList<>();

        System.out.println("Registro de Veterinarios");
        System.out.println();

        System.out.println("Nombre del veterinario:");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca la direccion:");
        String direccion = scanner.nextLine();

        System.out.println("Introduzca el numero de telefono:");
        int telefono = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el horario:");
        String horario = scanner.nextLine();

        System.out.println("Introduzca su web:");
        String web = scanner.nextLine();

        System.out.println("Introduzca su especializacion:");
        String especializacion = scanner.nextLine();

        System.out.println("Introduzca el precios de visita estandar:");
        precios.add(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca el precio de la visita de urgencias:");
        precios.add(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca precio vacunacion:");
        precios.add(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Introduzca el precio de implantacion microchip:");
        precios.add(scanner.nextDouble());
        scanner.nextLine();


        System.out.println("Tiene servicio de urgencias 24 horas:(conteste si/no)");
        String urg = scanner.nextLine();

        // como urgencias se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la cambio a true
        boolean urgencias24 = false;

        if (urg.equals("si")){
            urgencias24 = true;
        }

        ManagerVeterinarios.crearVeterinario(nombre,direccion,telefono,horario,web,especializacion,precios,urgencias24);

        System.out.println("Su Veterinario se a registrado de forma correcta");
        System.out.println();

        boolean salir=false;
        do {
            System.out.println("Que desea hacer a continuacion:");
            System.out.println();
            System.out.println("1-Registrar otra tienda o veterinario.");
            System.out.println("2-Ir al menu principal.");
            System.out.println("3-Buscar tienda o veterinario");
            System.out.println("4-Salir de la aplicacion");

            // guardo en una variable la opcion seleccionada por el usuario
            String opcion = scanner.nextLine();

            //compruevo que a seleccionado el usuario
            if (opcion.equals("1")) {
                // si la opcion es registrar un veterianario o tienda generare
                // una pantalla de registro y la iniciare
                new PantallaRegistrarVeterinario().iniciar();
            }else if (opcion.equals("2")) {
                //si el usuario a dedicido ir al menu principal creo una nueva pantalla principal y la inicio
                new PantallaPrincipal().iniciar();
            }else if (opcion.equals("3")) {
                //si la opcion es buscar creare una pantalla busqueda y la iniciare
                new PantallaBuscar().iniciar();
            } else if (opcion.equals("4")){
                System.out.println("Gracias por usar VeteriApp");
                salir = true;
            }else{
                System.out.println("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);
    }
}

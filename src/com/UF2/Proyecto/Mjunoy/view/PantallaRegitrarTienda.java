package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;

import java.util.Scanner;

public class PantallaRegitrarTienda {

    public void iniciar (){

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Registro de tiendas");
        System.out.println();

        System.out.println("Nombre de la tienda:");
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

        System.out.println("Tiene servicio de peluqueria:(conteste si/no)");
        String pelu = scanner.nextLine();
        System.out.println();

        // como peluqueria se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la camvio a true
        boolean peluqueria = false;

        if (pelu.equals("si")){
            peluqueria = true;
        }
        //Inicio el manager de tiendas y creo una tienda nueva.
        ManagerTiendas.crearTienda(nombre,direccion,telefono,horario,web,especializacion,peluqueria);


        System.out.println("Su tienda se a registrado de forma correcta");


        // una vez echo esto preguntaremos al usuario que desea hacer

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
                new PantallaRegistrar().iniciar();
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

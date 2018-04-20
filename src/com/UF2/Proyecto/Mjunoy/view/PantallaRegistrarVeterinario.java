package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PantallaRegistrarVeterinario {

    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        List<Double> precios = new ArrayList<>();

        //Aqui Declaramos variables//

        String nombre;
        String direccion;
        int telefono;
        String horario;
        String web;
        String especializacion;
        Boolean urgencias24 = false;
        String urg;



        boolean esValido = false;

        System.out.println("Registro de Veterinarios");
        System.out.println();


        while (!esValido) {

            System.out.println("Nombre del veterinario:");
            nombre = scanner.nextLine();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (nombre.length() > 101) {
                System.out.println("Maximo de 100");
                esValido = false;
            } else {
                esValido = true;
            }

            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//


            if (nombre.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo el Nombre");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;

        while (!esValido) {

            System.out.println("Introduzca la dirección:");
            direccion = scanner.nextLine();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (direccion.length() > 201) {
                System.out.println("Maximo de 200");
                esValido = false;
            } else {
                esValido = true;
            }



            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//


            if (direccion.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo la dirección");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;

        while (!esValido) {

        System.out.println("Introduzca el numero de telefono:");
        telefono = scanner.nextInt();
        scanner.nextLine();




            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (telefono.length() > 13) {
                System.out.println("Maximo de 12");
                esValido = false;
            } else {
                esValido = true;
            }



        // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//
        if (telefono.Empty()) {
            System.out.println("Valor no valido,Introduzca de nuevo el telefono");
            esValido = false;
        } else {
            esValido = true;

        }

    }

        while (!esValido) {


            System.out.println("Introduzca el horario:");
            horario = scanner.nextLine();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//



            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//
            if (horario.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo el horario");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;


        while (!esValido) {

            System.out.println("Introduzca su web:");
            web = scanner.nextLine();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//


            if (web.length() > 201) {
                System.out.println("Maximo de 200");
                esValido = false;
            } else {
                esValido = true;
            }

            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

            if (web.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo la web");
                esValido = false;
            } else {
                esValido = true;

            }
        }

        esValido = false;

        while (!esValido) {


            System.out.println("Introduzca su especialización:");
            especializacion = scanner.nextLine();


            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (especializacion.length() > 21) {
                System.out.println("Maximo de 20");
                esValido = false;
            } else {
                esValido = true;
            }


            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

            if (especializacion.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo la especialización");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;


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

        while (!esValido) {



            System.out.println("Tiene servicio de urgencias 24 horas:(conteste si/no)");
            urg = scanner.nextLine();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (urg.length() > 3) {
                System.out.println("Maximo de 2");
                esValido = false;
            } else {
                esValido = true;
            }



            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

            if (urg.isEmpty() || urg != "si" || urg != "no") {
                System.out.println("Valor no valido,Introduzca de nuevo el Servicio de peluqueria");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;

        // como urgencias se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la cambio a true
        urgencias24 = false;

        if (urg.equals("si")) {
            urgencias24 = true;
        }

    }

//
//    ManagerVeterianarios.crearVeterinario(nombre, direccion, telefono, horario, web, especializacion, precios, urgencias24);
//
//           System.out.println("Su Veterinario se a registrado de forma correcta");
//           System.out.println();
//
//           boolean salir = false;
//            do {
//              System.out.println("Que desea hacer a continuacion:");
//                System.out.println();
//               System.out.println("1-Registrar otra tienda o veterinario.");
//               System.out.println("2-Ir al menu principal.");
//               System.out.println("3-Buscar tienda o veterinario");
//               System.out.println("4-Salir de la aplicacion");
//
//                // guardo en una variable la opcion seleccionada por el usuario
//                String opcion = scanner.nextLine();
//
//               //compruevo que a seleccionado el usuario
//               if (opcion.equals("1")) {
//                   // si la opcion es registrar un veterianario o tienda generare
//                   // una pantalla de registro y la iniciare
//                    new PantallaRegistrar().iniciar();
//              } else if (opcion.equals("2")) {
//                   //si la opcion es buscar creare una pantalla busqueda y la iniciare
//                   new PantallaBuscar().iniciar();
//                } else if (opcion.equals("3")) {
//                    System.out.println("Gracias por usar VeteriApp");
//                    salir = true;
//                } else {
//                    System.out.println("Opcion incorrecta");
//                    System.out.println("Seleccione otra vez");
//                }
//            } while (!salir);
//}

package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;

import java.util.Scanner;

public class PantallaRegitrarTienda {

    public void iniciar() {

        //Aqui Declaramos variables//

        Scanner scanner = new Scanner(System.in);
        String nombre;
        String direccion;
        int telefono;
        String horario;
        String web;
        String especializacion;
        String pelu;
        boolean peluqueria;

        boolean esValido = false;

        System.out.println();
        System.out.println("Registro de tiendas");
        System.out.println();



        while (!esValido) {


            System.out.println("Nombre de la tienda:");
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
                System.out.println("Valor no valido,Introduzca de nuevo la dirección ");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;


        System.out.println("Introduzca el numero de telefono:");
        telefono = scanner.nextInt();
        scanner.nextLine();




        if (length() > 13) {
            System.out.println("Maximo de 200");
            esValido = false;
        } else {
            esValido = true;
        }



        while (!esValido) {

            System.out.println("Introduzca el horario:");
            horario = scanner.nextLine();




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

        while (!esValido) {


            System.out.println("Tiene servicio de peluqueria:(conteste si/no)");
            pelu = scanner.nextLine();
            System.out.println();

            // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

            if (pelu.length() > 3) {
                System.out.println("Maximo de 2");
                esValido = false;
            } else {
                esValido = true;
            }

            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

            if (pelu.isEmpty() || pelu != "si" || pelu != "no") {
                System.out.println("Valor no valido,Introduzca de nuevo el Servicio de peluqueria");
                esValido = false;
            } else {
                esValido = true;

            }

        }

        esValido = false;


        // como peluqueria se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la camvio a true
        peluqueria = false;

        if (pelu.equals("si"))

        {
            peluqueria = true;
        }
//
//                //creo una variable tipo boolean llamada registro que guardara el resultado del manager de tiendas
//                boolean registro = ManagerTiendas.crearTienda(nombre, direccion, telefono, horario, web, especializacion, peluqueria);
//
//                // si el manager de tiendas retorna true es que la tienda se a generado correctamente en caso contrario
//                // es por que a havido un error en el registro en los dos casos informaremos al usuario
//
//
//
//        if (registro){
//            System.out.println("Su tienda se a registrado de forma correcta");
//        }else{
//            System.out.println("Lo sentimos hemos tenido un problema y su tienda no se a podido registrar.");
//            System.out.println("Intentelo de nuevo mas tarde.");
//        }
//
//        // una vez echo esto preguntaremos al usuario que desea hacer
//
//        System.out.println();
//        System.out.println("Que desea hacer a continuacion:");
//        System.out.println();
//        System.out.println("1-Registrar otra tienda o veterinario.");
//        System.out.println("2-Ir al menu principal.");
//        System.out.println("3-Buscar tienda o veterinario");
//        System.out.println("4-Salir");
//
//        String opcion = scanner.nextLine();
//
//        //if (opcion.equals("1")){
//
//        //}
//        // aqui iran los if que comprovaran que a seleccionado el usuario por ahora solo cierro la app
//        System.exit(0);
//    }
    }
}
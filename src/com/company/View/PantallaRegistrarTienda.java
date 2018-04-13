package com.company.View;

import java.util.Scanner;

public class PantallaRegistrarTienda {

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
        //creo una variable tipo boolean llamada registro que guardara el resultado del manager de tiendas
        ManagerTiendas.(nombre,direccion,telefono,horario,web,especializacion,peluqueria);

        // si el manager de tiendas retorna true es que la tienda se a generado correctamente en caso contrario
        // es por que a havido un error en el registro en los dos casos informaremos al usuario

        System.out.println("Su tienda se a registrado de forma correcta");


        // una vez echo esto preguntaremos al usuario que desea hacer

        System.out.println();
        System.out.println("Que desea hacer a continuacion:");
        System.out.println();
        System.out.println("1-Registrar otra tienda o veterinario.");
        System.out.println("2-Ir al menu principal.");
        System.out.println("3-Buscar tienda o veterinario");
        System.out.println("4-Salir");

        String opcion = scanner.nextLine();

        //if (opcion.equals("1")){

        //}
        // aqui iran los if que comprovaran que a seleccionado el usuario por ahora solo cierro la app
        System.exit(0);
    }

    public class iniciar {
    }
}

package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerTiendas;
import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.view.widget.EditText;
import com.UF2.Proyecto.Mjunoy.view.widget.Menu;
import com.UF2.Proyecto.Mjunoy.view.widget.Message;
import com.UF2.Proyecto.Mjunoy.view.widget.Title;

import java.util.Scanner;

public class PantallaRegitrarTienda {

    public void iniciar (){

        Scanner scanner = new Scanner(System.in);
        Title title = new Title();
        Message message = new Message();
        EditText editText = new EditText();
        Menu menu = new Menu();

        title.show("Registro de tiendas");


        String nombre = editText.read("Nombre de la tienda:");
        String direccion = editText.read("Introduzca la direccion:");
        int telefono = editText.readInt("Introduzca el numero de telefono:");
        String horario = editText.read("Introduzca el horario:");

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


        message.showOk("Su tienda se a registrado de forma correcta");


        // una vez echo esto preguntaremos al usuario que desea hacer

        boolean salir=false;
        do {
            String opcion = menu.show("Que desea hacer a continuacion:",
                    "Registrar otra tienda o veterinario",
                    "Ir al menu principal",
                    "Buscar tienda o veterinario",
                    "Salir de la aplicacion");

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
                System.exit(0);
            }else{
                message.showError("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);
    }
}

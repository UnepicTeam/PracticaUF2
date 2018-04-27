package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.model.Tienda;
import com.UF2.Proyecto.Mjunoy.view.widget.Menu;

import java.util.List;
import java.util.Scanner;

public class PantallaMostrarTienda {

    static void iniciar(List<Tienda> tiendas) {
        Scanner scanner = new Scanner(System.in);

            int nombre =0;
        System.out.println
        //" | " + String.format("%-"+nombre+"s", "nombre") se podria hacer para medir la cadena mas larga de ese valor y que salga normalizado
                (" | " + String.format("%-10s", "nombre")
                        + " | " + String.format("%-10s", "direccion")
                        + " | " + String.format("%-10s", "telefono")
                        + " | " + String.format("%-10s", "horario")
                        + " | " + String.format("%-10s", "web")
                        + " | " + String.format("%-10s", "especializacion")
                        + " | " + String.format("%-4s", "peluqueria")
                        + " | " + String.format("%-4s", "puntuacion"));
        for (Tienda tienda : tiendas) {
            String pelu = "no";
            if (tienda.peluqueria) {
                pelu = "si";
            }

            System.out.println
                    (" | " + String.format("%-10s", tienda.nombre)
                            + " | " + String.format("%-10s", tienda.direccion)
                            + " | " + String.format("%-10s", tienda.telefono)
                            + " | " + String.format("%-10s", tienda.horario)
                            + " | " + String.format("%-10s", tienda.web)
                            + " | " + String.format("%-10s", tienda.especializacion)
                            + " | " + String.format("%-4s", pelu)
                            + " | " + String.format("%-4s", tienda.puntuacion));
        }

        do {
                String opcion = new Menu().show("Que desea hacer", "Volver a la pantalla principal", "Salir");

                if (opcion.equals("1")) {
                    new PantallaPrincipal().iniciar();
                } else if (opcion.equals("2")) {
                    System.out.println("Gracias por usar Veteriapp.");
                    System.exit(0);
                } else {
                    System.out.println("Opcion incorrecta buelva a elegir.");
                }

        } while (true);
    }
}


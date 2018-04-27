package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.List;
import java.util.Scanner;

public class PantallaMostrarVeterinario {

    static void iniciar(List<Veterinario> veterinarios) {
        Scanner scanner=new Scanner(System.in);
        System.out.println
                (" | " + String.format("%-10s", "nombre")
                        + " | " + String.format("%-10s", "direccion")
                        + " | " + String.format("%-10s", "telefono")
                        + " | " + String.format("%-10s", "horario")
                        + " | " + String.format("%-10s", "web")
                        + " | " + String.format("%-10s", "especializacion")
                        + " | " + String.format("%-6s", "visita_N")
                        + " | " + String.format("%-6s", "visita_U")
                        + " | " + String.format("%-6s", "vacuna")
                        + " | " + String.format("%-6s", "chipado")
                        + " | " + String.format("%-3s", "urgencias24")
                        + " | " + String.format("%-4s", "puntuacion"));
        for (Veterinario veterinario : veterinarios) {

                String urg = "no";

                if (veterinario.urgencias24 == true){
                urg = "si";
                }

                System.out.println
                        ( " | " + String.format("%-10s", veterinario.nombre)
                                + " | " + String.format("%-10s", veterinario.direccion)
                                + " | " + String.format("%-10s", veterinario.telefono)
                                + " | " + String.format("%-10s", veterinario.horario)
                                + " | " + String.format("%-10s", veterinario.web)
                                + " | " + String.format("%-10s", veterinario.especializacion)
                                + " | " + String.format("%-6s", veterinario.visita_N)+"€"
                                + " | " + String.format("%-6s", veterinario.visita_U)+"€"
                                + " | " + String.format("%-6s", veterinario.vacuna)+"€"
                                + " | " + String.format("%-6s", veterinario.chipado)+"€"
                                + " | " + String.format("%-3s", urg)
                                + " | " + String.format("%-4s", veterinario.puntuacion)
                                + " | ");
        }
        Boolean salir = false;
        do {
            System.out.println();
            System.out.println("Que desea hacer:");
            System.out.println("1-Volver a la pantalla principal.");
            System.out.println("2-Salir.");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                new PantallaPrincipal().iniciar();
            } else if (opcion.equals("2")) {
                System.out.println("Gracias por usar Veteriapp.");
                System.exit(0);
            } else {
                System.out.println("Opcion incorrecta buelva a elegir.");
            }

        } while (!salir);

    }
}


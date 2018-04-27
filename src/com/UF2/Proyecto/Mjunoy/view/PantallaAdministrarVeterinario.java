package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.List;
import java.util.Scanner;

public class PantallaAdministrarVeterinario {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        List<Veterinario> veterinarios = Database.selectAllVeterinarios();
        System.out.println
                ( " | " + String.format("%-4s","codigo")
                        + " | " + String.format("%-10s","nombre")
                        + " | " + String.format("%-10s","direccion")
                        + " | " + String.format("%-10s", "telefono")
                        + " | " + String.format("%-10s", "horario")
                        + " | " + String.format("%-10s", "web")
                        + " | " + String.format("%-10s", "especializacion")
                        + " | " + String.format("%-6s", "visita_N")
                        + " | " + String.format("%-6s", "visita_U")
                        + " | " + String.format("%-6s", "vacuna")
                        + " | " + String.format("%-6s", "chipado")
                        + " | " + String.format("%-6s", "urgencias24")
                        + " | " + String.format("%-4s", "puntuacion")
                        + " | " + String.format("%-6s", "mostrar"));
        for (Veterinario veterinario: veterinarios){
            if (veterinario.mostrar == false){
                System.out.println
                        ( " | " + String.format("%-4s", veterinario.codigo)
                                + " | " + String.format("%-10s", veterinario.nombre)
                                + " | " + String.format("%-10s", veterinario.direccion)
                                + " | " + String.format("%-10s", veterinario.telefono)
                                + " | " + String.format("%-10s", veterinario.horario)
                                + " | " + String.format("%-10s", veterinario.web)
                                + " | " + String.format("%-10s", veterinario.especializacion)
                                + " | " + String.format("%-6s", veterinario.visita_N)
                                + " | " + String.format("%-6s", veterinario.visita_U)
                                + " | " + String.format("%-6s", veterinario.vacuna)
                                + " | " + String.format("%-6s", veterinario.chipado)
                                + " | " + String.format("%-6s", veterinario.urgencias24)
                                + " | " + String.format("%-4s", veterinario.puntuacion)
                                + " | " + String.format("%-6s", veterinario.mostrar));

                System.out.println("Desea autorizar este Veterinario(si/no)?");
                String opcion = scanner.nextLine();

                if (opcion.equals("si")){

                    Boolean autorizar = Database.autorizarVeterinario(true,veterinario.codigo);
                    if (autorizar){
                        System.out.println("Tienda autorizada correctamente.");
                    }

                }else {
                    System.out.println("Siguiente Veterinario:");
                }
            }
        }
        Boolean salir=false;
        do {
            System.out.println("No hay mas veterinarios por autorizar");
            System.out.println("Que desea hacer:");
            System.out.println("1-Administrar Tiendas.");
            System.out.println("2-Volver al inicio.");
            System.out.println("3-Salir.");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")){
                new PantallaAdministrarTienda().iniciar();
            } else if (opcion.equals("2")){
                new PantallaPrincipal().iniciar();
            } else if (opcion.equals("3")){
                System.out.println("Gracias por usar Veteriapp.");
                System.exit(0);
            }else {
                System.out.println("Opcion incorrecta buelva a elegir.");
            }

        }while (!salir);

    }

}

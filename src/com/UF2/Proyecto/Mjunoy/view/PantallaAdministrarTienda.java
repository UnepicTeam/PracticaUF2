package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Tienda;

import java.util.List;
import java.util.Scanner;

public class PantallaAdministrarTienda {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        List<Tienda> tiendas = Database.selectAllTiendas();
        System.out.println
                ( " | " + String.format("%-4s","codigo")
                        + " | " + String.format("%-10s","nombre")
                        + " | " + String.format("%-10s","direccion")
                        + " | " + String.format("%-10s", "telefono")
                        + " | " + String.format("%-10s", "horario")
                        + " | " + String.format("%-10s", "web")
                        + " | " + String.format("%-10s", "especializacion")
                        + " | " + String.format("%-6s", "peluqueria")
                        + " | " + String.format("%-4s", "puntuacion")
                        + " | " + String.format("%-6s", "mostrar"));
        for (Tienda tienda:tiendas){
            if (tienda.mostrar == false){
                System.out.println
                        ( " | " + String.format("%-4s", tienda.codigo)
                                + " | " + String.format("%-10s", tienda.nombre)
                                + " | " + String.format("%-10s", tienda.direccion)
                                + " | " + String.format("%-10s", tienda.telefono)
                                + " | " + String.format("%-10s", tienda.horario)
                                + " | " + String.format("%-10s", tienda.web)
                                + " | " + String.format("%-10s", tienda.especializacion)
                                + " | " + String.format("%-6s", tienda.peluqueria)
                                + " | " + String.format("%-4s", tienda.puntuacion)
                                + " | " + String.format("%-6s", tienda.mostrar));

                System.out.println("Desea autorizar esta tienda(si/no)?");
                String opcion = scanner.nextLine();

                if (opcion.equals("si")){

                    Boolean autorizar = Database.autorizarTienda(true,tienda.codigo);
                    if (autorizar){
                        System.out.println("Tienda autorizada correctamente.");
                    }

                }else {
                    System.out.println("Siguiente Tienda:");
                }
            }
        }
        Boolean salir=false;
        do {
            System.out.println("No hay mas tiendas por autorizar");
            System.out.println("Que desea hacer:");
            System.out.println("1-Administrar Veterinarios.");
            System.out.println("2-Volver al inicio.");
            System.out.println("3-Salir.");

            String opcion = scanner.nextLine();

            if (opcion.equals("1")){
                new PantallaAdministrarVeterinario().iniciar();
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

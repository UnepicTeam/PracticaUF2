package com.UF2.Proyecto.Mjunoy;

import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.model.Administrador;
import com.UF2.Proyecto.Mjunoy.model.Tienda;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;
import com.UF2.Proyecto.Mjunoy.view.PantallaPrincipal;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database db = Database.get();

        Tienda tienda = new Tienda("que bestia", "alcampo",
                934571523, "de 10 a 22 de lunes a sabado",
                "www.quebestia.es", "exoticos", true,
                0, false, 0);
        db.insertTienda(tienda);
        Veterinario veterinario = new Veterinario("dualvet", "cubics",
                964521478, "de 9:20 a 20:35 de lunes a sabado",
                "www.dualvet.es", "domesticos y exoticos",
                25, 50, 60, 100, false, 0, false, 0);
        db.insertVeterinario(veterinario);

        Administrador administrador = new Administrador("admin", "admin");
        db.insertAdministrador(administrador);

        List<Tienda> tiendasBase = db.selectAllTiendas();

        for (Tienda tienda1 : tiendasBase) {
            System.out.println
                    (" | " + String.format("%-4s", tienda1.codigo)
                            + " | " + String.format("%-10s", tienda1.nombre)
                            + " | " + String.format("%-10s", tienda1.direccion)
                            + " | " + String.format("%-10s", tienda1.telefono)
                            + " | " + String.format("%-10s", tienda1.horario)
                            + " | " + String.format("%-10s", tienda1.web)
                            + " | " + String.format("%-10s", tienda1.especializacion)
                            + " | " + String.format("%-6s", tienda1.peluqueria)
                            + " | " + String.format("%-5s", tienda1.puntuacion)
                            + " | " + String.format("%-6s", tienda1.mostrar));
            System.out.println("Desea autorizar esta tienda 1-SI 2-NO.");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                boolean resulrado=Database.autorizarTienda(true, tienda1.codigo);
                if (resulrado){
                    System.out.println("tienda autorizada correctamente");
                }
            }
        }
        List<Tienda> tiendasBase2 = db.selectAllTiendas();

        for (Tienda tienda1 : tiendasBase2) {
            System.out.println
                    (" | " + String.format("%-10s", tienda1.codigo)
                            + " | " + String.format("%-10s", tienda1.nombre)
                            + " | " + String.format("%-10s", tienda1.direccion)
                            + " | " + String.format("%-10s", tienda1.telefono)
                            + " | " + String.format("%-10s", tienda1.horario)
                            + " | " + String.format("%-10s", tienda1.web)
                            + " | " + String.format("%-10s", tienda1.especializacion)
                            + " | " + String.format("%-10s", tienda1.peluqueria)
                            + " | " + String.format("%-10s", tienda1.puntuacion)
                            + " | " + String.format("%-10s", tienda1.mostrar));


        }
    }
}

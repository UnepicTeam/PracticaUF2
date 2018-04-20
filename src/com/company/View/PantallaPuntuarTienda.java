package com.company.View;

import java.util.Scanner;

public class PantallaPuntuarTienda {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        Boolean salir = false;

        do {

            System.out.println("¿Qué tienda quieres puntuar?");
            String tienda = scanner.nextLine();

            System.out.println("¿Qué puntuación quieres darle?(1 - 5)");
            int puntuacion = scanner.nextInt();

            Boolean resultado = new PantallaBuscar().comprobarTienda(tienda);
            if (resultado) {
                int valorInicial = 0;

                int valorFinal = valorInicial + puntuacion;

                //Enviaremos el resultado a la base de datos con las variables valorFinal y tienda.

                System.out.println("Tu puntuación se registró correctamente.");
                salir = true;
            } else {

                System.out.println("La tienda introducida no existe.");

            }

        }while (!salir);
    }
}

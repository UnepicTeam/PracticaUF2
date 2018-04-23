package com.company.View;

import java.util.Scanner;

public class PantallaPuntuarVeterinario {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        Boolean salir = false;

        do {

            System.out.println("¿Qué veterinario quieres puntuar?");
            String veterinario = scanner.nextLine();

            System.out.println("¿Qué puntuación quieres darle?(1 - 5)");
            int puntuacion = scanner.nextInt();

            Boolean resultado = new PantallaBuscar().comprobarVeterinario(veterinario);
            if (resultado) {
                int valorInicial = 0;

                int valorFinal = valorInicial + puntuacion;

                //Enviaremos el resultado a la base de datos con las variables valorFinal y veterinario.

                System.out.println("Tu puntuación se registró correctamente.");
                salir = true;
            } else {

                System.out.println("El veterinario introducido no existe.");

            }

        }while (!salir);





    }
}

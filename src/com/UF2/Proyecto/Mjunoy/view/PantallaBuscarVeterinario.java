package com.UF2.Proyecto.Mjunoy.view;

import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.List;
import java.util.Scanner;

public class PantallaBuscarVeterinario {

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);

        boolean salir=false;

        do{
            System.out.println("Que filtro desea usar?");
            System.out.println();
            System.out.println("1-Nombre.");
            System.out.println("2-Especializacion.");
            System.out.println("3-Puntuacion.");
            System.out.println("4-Volver atras.");
            System.out.println("5-Volver al inicio.");
            System.out.println("6-Salir");

            //guardo la opcion en una variable
            String opcion = scanner.nextLine();
            if (opcion.equals("1")){
                System.out.println("Que nombre desea buscar");
                String nombre = scanner.nextLine();
                List<Veterinario> veterinarios_encontrados= new ManagerVeterianarios().buscarNombreVeterianrio(nombre);
                new PantallaMostrarVeterinario().iniciar(veterinarios_encontrados);
            }else if (opcion.equals("2")){
                System.out.println("Que especializacion desea buscar");
                String especializacion = scanner.nextLine();
                List<Veterinario> veterinarios_encontrados= new ManagerVeterianarios().buscarespecializacionVeterinario(especializacion);
                new PantallaMostrarVeterinario().iniciar(veterinarios_encontrados);
            }else if (opcion.equals("3")){
                System.out.println("Que puntuacion minima desea buscar");
                int puntuacion = scanner.nextInt();
                scanner.nextLine();
                List<Veterinario> veterinarios_encontrados= new ManagerVeterianarios().buscarpuntuacionveterianrio(puntuacion);
                new PantallaMostrarVeterinario().iniciar(veterinarios_encontrados);
            }else if(opcion.equals("4")){
                new PantallaBuscar().iniciar();
            }else if (opcion.equals("5")){
                new PantallaPrincipal().iniciar();
            }else if (opcion.equals("6")){
                System.out.println("Gracias por usar nuestra aplicacion");
                salir=true;
            }else{
                System.out.println("Opcion incorrecta seleccione otra vez");
            }

        }while (!salir);
    }
}


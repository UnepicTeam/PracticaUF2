package com.UF2.Proyecto.Mjunoy.view;

import java.util.Scanner;

public class PantallaContacto {
    public void iniciar() {

        Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        String direccion;
        String email;
        String motivo;

        boolean esValido = false;

        while (!esValido) {


            System.out.println("Nombre:");
            nombre = scanner.nextLine();


            if (nombre.isEmpty()) {
                System.out.println("Valor no valido,Introduzca el Nombre");
                esValido = false;
            } else {
                esValido = true;

            }
        }
        esValido = false;


        while (!esValido) {


            System.out.println("Apellido:");
            apellido = scanner.nextLine();


            if (apellido.isEmpty()) {
                System.out.println("Valor no valido,Introduzca el Apellido");
                esValido = false;
            } else {
                esValido = true;

            }
        }

        esValido = false;

        while (!esValido) {

            System.out.println("Dirección:");
            direccion = scanner.nextLine();


            if (direccion.isEmpty()) {
                System.out.println("Valor no valido,Introduzca la dirección");
                esValido = false;
            } else {
                esValido = true;

            }

        }
        esValido = false;


        while (!esValido) {


            System.out.println("Email:");
            email = scanner.nextLine();


            if (email.isEmpty()) {
                System.out.println("Valor no valido,Introduzca el email");
                esValido = false;
            } else {
                esValido = true;

            }

        }
        esValido = false;

        while (!esValido) {


            System.out.println("Motivo:");
            motivo = scanner.nextLine();


            if (motivo.isEmpty()) {
                System.out.println("Valor no valido,Introduzca el Motivo");
                esValido = false;
            } else {
                esValido = true;

            }

        }
        esValido = false;




        System.out.println("---------------------------------------------------------");
        System.out.println("                  FICHA DE CONTACTO");
        System.out.println();
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido" + apellido);
        System.out.println("Dirección" + direccion);
        System.out.println("Email" + email);
        System.out.println("Motivo" + motivo);
        System.out.println("---------------------------------------------------------");

    }




    }







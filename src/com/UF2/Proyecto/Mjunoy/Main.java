package com.UF2.Proyecto.Mjunoy;

import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.view.PantallaPrincipal;

public class Main {

    public static void main(String[] args) {

        //ManagerVeterianarios.crearVeterinario("VETE1", "c/tal, 1", 224224, "7:00h", "http://web.ocom", "Perros", 5 , true);
        //ManagerVeterianarios.crearVeterinario("VETE2", "c/tal, 1", 224224, "7:00h", "http://web.ocom", "Perros", "5", true);
        //ManagerVeterianarios.crearVeterinario("VETE3", "c/tal, 1", 224224, "7:00h", "http://web.ocom", "Perros", "5", true);

        new PantallaPrincipal().iniciar();

    }
}

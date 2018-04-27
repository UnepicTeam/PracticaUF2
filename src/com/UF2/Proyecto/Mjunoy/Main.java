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

        Database db = Database.get();

        new PantallaPrincipal().iniciar();

    }
}

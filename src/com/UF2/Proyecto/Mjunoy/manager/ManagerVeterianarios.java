package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.model.Puntuar;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class ManagerVeterianarios {

    static List<Veterinario> veterinarios = new ArrayList<>();
    static List<Puntuar> puntuaciones = new ArrayList<>();

    public static void crearVeterinario(String nombre, String direccion,
                                    int telefono, String horario, String web,
                                    String especializacion,List precios,
                                    boolean urgencias24){



        Veterinario veterinario = new Veterinario();

        veterinario.nombre=nombre;
        veterinario.direccion=direccion;
        veterinario.telefono=telefono;
        veterinario.horario=horario;
        veterinario.web=web;
        veterinario.especializacion=especializacion;
        veterinario.precios=precios;
        veterinario.urgencias24=urgencias24;

        veterinarios.add(veterinario);

        return;
    }

    public static List<Veterinario> buscarVeterinario (String nombre){
        List<Veterinario> veterinariosEncotrados = new ArrayList<>();

        for (int i = 0; i < veterinarios.size() ; i++) {
            if (veterinarios.get(i).nombre.equals(nombre) ) {
                veterinariosEncotrados.add(veterinarios.get(i));
            }
        }

        return veterinariosEncotrados;
    }

}


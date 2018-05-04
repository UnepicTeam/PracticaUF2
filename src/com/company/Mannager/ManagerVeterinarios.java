package com.company.Mannager;

import com.company.Model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class ManagerVeterinarios {
    static List<Veterinario> veterinarios = new ArrayList<>();

    public static void crearVeterinario(String nombre, String direccion,
                                        int telefono, String horario, String web,
                                        String especializacion,List precios,
                                        boolean urgencias24){


        Veterinario veterianario= new Veterinario();

        veterianario.nombre=nombre;
        veterianario.direccion=direccion;
        veterianario.telefono=telefono;
        veterianario.horario=horario;
        veterianario.web=web;
        veterianario.especializacion=especializacion;
        //veterianario.precios=precios;
        veterianario.urgencias24=urgencias24;

        veterinarios.add(veterianario);

        return;
    }

    public static List<Veterinario> buscarVeterinario (String nombre){
        List<Veterinario> veterinariosEncotrados = new ArrayList<>();

        for (int i = 0; i <veterinarios.size() ; i++) {
            if (veterinarios.get(i).nombre.equals(nombre) ) {
                veterinariosEncotrados.add(veterinarios.get(i));
            }
        }

        return veterinariosEncotrados;
    }
}

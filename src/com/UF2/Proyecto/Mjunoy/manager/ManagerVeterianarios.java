package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class ManagerVeterianarios {

       public static void crearVeterinario(String nombre, String direccion,
                                    int telefono, String horario, String web,
                                    String especializacion, double visita_N, double visita_U,
                                    double vacuna, double chipado,boolean urgencias24){


      Veterinario veterinario = new Veterinario(nombre,direccion,telefono,horario,web,especializacion,
                                                visita_N,visita_U,vacuna,chipado,urgencias24,0);

      Database.insertVeterinario(veterinario);

        return;
    }

    public static List<Veterinario> buscarNombreVeterianrio(String nombre){
        List<Veterinario> todos_veterinarios = Database.selectAllVeterinarios();
        List<Veterinario> veterinarios = new ArrayList<>();

        for (Veterinario veterinario: todos_veterinarios) {
            if (veterinario.nombre.equals(nombre)){
                veterinarios.add(veterinario);
            }

        }
        return veterinarios;
    }
    public static List<Veterinario> buscarespecializacionVeterinario(String especializacion){
        List<Veterinario> todos_veterinarios = Database.selectAllVeterinarios();
        List<Veterinario> veterinarios = new ArrayList<>();

        for (Veterinario veterinario: todos_veterinarios) {
            if (veterinario.especializacion.equals(especializacion)){
                veterinarios.add(veterinario);
            }

        }
        return veterinarios;
    }

    public static List<Veterinario> buscarpuntuacionveterianrio(int puntuacion){
        List<Veterinario> todos_veterinarios = Database.selectAllVeterinarios();
        List<Veterinario> veterinarios = new ArrayList<>();

        for (Veterinario veterinario: todos_veterinarios) {
            if (veterinario.puntuacion >= puntuacion ){
                veterinarios.add(veterinario);
            }

        }
        return veterinarios;
    }

}


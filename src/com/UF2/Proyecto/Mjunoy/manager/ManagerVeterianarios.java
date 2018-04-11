package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.model.Veterianario;

import java.util.ArrayList;
import java.util.List;

public class ManagerVeterianarios {

    static List<Veterianario> veterianarios = new ArrayList<>();

    public static boolean crearVeterinario(String nombre, String direccion,
                                    int telefono, String horario, String web,
                                    String especializacion,List precios,
                                    boolean urgencias24){

        boolean registro=true;

        Veterianario veterianario= new Veterianario();

        veterianario.nombre=nombre;
        veterianario.direccion=direccion;
        veterianario.telefono=telefono;
        veterianario.horario=horario;
        veterianario.web=web;
        veterianario.especializacion=especializacion;
        veterianario.precios=precios;
        veterianario.urgencias24=urgencias24;

        veterianarios.add(veterianario);

        return registro;
    }

    public static List<Veterianario> buscarVeterinario (String nombre){
        List<Veterianario> veterinariosEncotrados = new ArrayList<>();

        for (int i = 0; i <veterianarios.size() ; i++) {
            if (veterianarios.get(i).nombre.equals(nombre) ) {
                veterinariosEncotrados.add(veterianarios.get(i));
            }
        }

        return veterinariosEncotrados;
    }
}


package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Tienda;

import java.util.ArrayList;
import java.util.List;

public class ManagerTiendas {


    public static void crearTienda(String nombre, String direccion,
                                   int telefono, String horario, String web,
                                   String especializacion, boolean peluqueria) {


        Tienda tienda = new Tienda(nombre, direccion, telefono, horario, web, especializacion,
                peluqueria, 0,false,0);
        Database.insertTienda(tienda);

        return;
    }


    public static List<Tienda> buscarNombreTienda(String nombre){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.mostrar == true) {
                if (tienda1.nombre.toLowerCase().contains(nombre.toLowerCase())) {
                    tiendas.add(tienda1);
                }
            }

        }
        return tiendas;
    }
    public static List<Tienda> buscarespecializacionTienda(String especializacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.mostrar == true) {
                if (tienda1.especializacion.toLowerCase().contains(especializacion.toLowerCase())) {
                    tiendas.add(tienda1);
                }
            }

        }
        return tiendas;
    }
//
    public static List<Tienda> buscarpuntuacionTienda(int puntuacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.mostrar == true) {
                if (tienda1.puntuacion >= puntuacion) {
                    tiendas.add(tienda1);
                }
            }

        }
        return tiendas;
    }

}



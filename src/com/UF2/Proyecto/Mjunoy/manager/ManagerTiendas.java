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
                peluqueria, 0);
        Database.insertTienda(tienda);

        return;
    }


    public static List<Tienda> buscarNombreTienda(String nombre){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.nombre.equals(nombre)){
                tiendas.add(tienda1);
            }

        }
        return tiendas;
    }
    public static List<Tienda> buscarespecializacionTienda(String especializacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.especializacion.equals(especializacion)){
                tiendas.add(tienda1);
            }

        }
        return tiendas;
    }
//
    public static List<Tienda> buscarpuntuacionTienda(int puntuacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (Tienda tienda1: todas_Tiendas) {
            if (tienda1.puntuacion >= puntuacion ){
                tiendas.add(tienda1);
            }

        }
        return tiendas;
    }

}



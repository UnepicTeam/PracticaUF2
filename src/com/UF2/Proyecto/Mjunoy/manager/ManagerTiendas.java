package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Tienda;

import java.util.ArrayList;
import java.util.List;

public class ManagerTiendas {



    public static void crearTienda(String nombre, String direccion,
                       int telefono, String horario, String web,
                       String especializacion, boolean peluqueria) {


        Tienda tienda = new Tienda(nombre,direccion,telefono,horario,web,especializacion,
                                    peluqueria,0);
        Database.insertTienda(tienda);

        return;
    }

    public static List<Tienda> buscarNombreTienda(String nombre){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (int i = 0; i <todas_Tiendas.size() ; i++) {
            if (todas_Tiendas.get(nombre).equals(nombre)){
                tiendas.add(todas_Tiendas.get(i));
            }

        }
        return tiendas;
    }
    public static List<Tienda> buscarespecializacionTienda(String especializacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (int i = 0; i <todas_Tiendas.size() ; i++) {
            if (todas_Tiendas.get(especializacion).equals(especializacion)){
                tiendas.add(todas_Tiendas.get(i));
            }

        }
        return tiendas;
    }

    public static List<Tienda> buscarpuntuacionTienda(int puntuacion){
        List<Tienda> todas_Tiendas = Database.selectAllTiendas();
        List<Tienda> tiendas = new ArrayList<>();

        for (int i = 0; i <todas_Tiendas.size() ; i++) {
            if (todas_Tiendas.get(puntuacion) >= puntuacion ){
                tiendas.add(todas_Tiendas.get(i));
            }

        }
        return tiendas;
    }

}



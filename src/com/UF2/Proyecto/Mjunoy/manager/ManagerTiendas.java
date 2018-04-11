package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.model.Tienda;

public class ManagerTiendas {
    static Tienda[] tiendas = new Tienda[10];

    public static boolean crearTienda(String nombre, String direccion,
                            int telefono, String horario, String web,
                            String especializacion, boolean peluqueria){
       boolean registro=false;

        Tienda tienda = new Tienda();

        tienda.nombre=nombre;
        tienda.direccion=direccion;
        tienda.telefono=telefono;
        tienda.horario=horario;
        tienda.web=web;
        tienda.especializacion=especializacion;
        tienda.peluqueria=peluqueria;


        for (int i = 0; i <tiendas.length ; i++) {
            if (tiendas[i] == null){
                tiendas[i]=tienda;
                registro=true;
                return registro;
            }

        }
        return registro;
    }

    // Lo ideal es que esto sea un array y devuelva lo
    // que hay dentro del array tiendas y que coincida con la
    // busqueda y procesarlo en la pantalla o simplemente
    // crear un manager de buscar aun no lo tengo claro

    public static String buscarTienda (String nombre){
        String encontrado="";

        for (int i = 0; i <tiendas.length ; i++) {

            if (tiendas[i] != null
                    || tiendas[i].nombre.equals(nombre) ) {
                encontrado+=tiendas[i].nombre;
            }
        }

        return encontrado;
    }
}

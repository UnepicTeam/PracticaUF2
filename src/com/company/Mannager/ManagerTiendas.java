package com.company.Mannager;

import com.company.Model.Tienda;

import java.util.ArrayList;
import java.util.List;

public class ManagerTiendas {

    //genero una nueva lista llamada tiendas de elementos tienda
    static List<Tienda> tiendas = new ArrayList<>();

    public static void crearTienda(String nombre, String direccion,
                              int telefono, String horario, String web,
                              String especializacion, boolean peluqueria){

        //creo un nuevo objeto tienda
        Tienda tienda = new Tienda();

        //asigno valores a los atributos de el objeto tienda que me han sido enviados al metodo crear tienda
        tienda.nombre=nombre;
        tienda.direccion=direccion;
        tienda.telefono=telefono;
        tienda.horario=horario;
        tienda.web=web;
        tienda.especializacion=especializacion;
        tienda.peluqueria=peluqueria;

        //una vez asigna
        tiendas.add(tienda);
        return;
    }

    // Lo ideal es que esto sea un array y devuelva lo
    // que hay dentro del array tiendas y que coincida con la
    // busqueda y procesarlo en la pantalla o simplemente
    // crear un manager de buscar aun no lo tengo claro

//    public static String buscarTienda (String nombre){
//        String encontrado="";
//
//        for (int i = 0; i <tiendas.length ; i++) {
//
//            if (tiendas[i] != null
//                    || tiendas[i].nombre.equals(nombre) ) {
//                encontrado+=tiendas[i].nombre;
//            }
//        }
//
//        return encontrado;
//    }
}
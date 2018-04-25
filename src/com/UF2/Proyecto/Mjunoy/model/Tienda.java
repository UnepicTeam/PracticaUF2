package com.UF2.Proyecto.Mjunoy.model;

public class Tienda {
    public String nombre;
    public String direccion;
    public int telefono;
    public String horario;
    public String web;
    public String especializacion;
    public boolean peluqueria;
    public int puntuacion;
    public boolean mostrar;
    public int codigo;

    public Tienda(){

    }

    public Tienda(String nombre, String direccion, int telefono,
                  String horario, String web, String especializacion,
                  boolean peluqueria, int puntuacion, boolean mostrar,int codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.web = web;
        this.especializacion = especializacion;
        this.peluqueria = peluqueria;
        this.puntuacion= puntuacion;
        this.mostrar=mostrar;
        this.codigo=codigo;
    }
}

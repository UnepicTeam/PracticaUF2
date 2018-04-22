package com.UF2.Proyecto.Mjunoy.model;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    public String nombre;
    public String direccion;
    public int telefono;
    public String horario;
    public String web;
    public String especializacion;
    public double visita_N;
    public double visita_U;
    public double vacuna;
    public double chipado;
    public boolean urgencias24;
    public int puntuacion;

    public Veterinario(){

    }

    public Veterinario(String nombre, String direccion, int telefono,
                       String horario, String web, String especializacion,
                       double visita_N,double visita_U, double vacuna,double chipado,
                       boolean peluqueria, int puntuacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.web = web;
        this.especializacion = especializacion;
        this.visita_N = visita_N;
        this.visita_U = visita_U;
        this.vacuna = vacuna;
        this.chipado = chipado;
        this.urgencias24 = peluqueria;
        this.puntuacion = puntuacion;
    }

}

package com.UF2.Proyecto.Mjunoy.model;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Veterianario {
    public String nombre;
    public String direccion;
    public int telefono;
    public String horario;
    public String web;
    public String especializacion;
    public List<Double> precios = new ArrayList<>();
    public boolean urgencias24;
}

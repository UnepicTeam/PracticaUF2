package com.company.Model;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {

    public String nombre;
    public String direccion;
    public int telefono;
    public String horario;
    public String web;
    public String especializacion;
    public List<Double> precios = new ArrayList<>();
    public boolean urgencias24;
}

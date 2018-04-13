package com.company;

import com.company.Model.Tienda;

public class LauraMain {

    public static void main(String[] args) {
        // write your code here
        Tienda pets = new Tienda();

        pets.setNombre("pets");
        pets.setDireccion("calle falsa 123");
        pets.setTelefono(666);
        pets.setUbicacion("narnia");

        Tienda pets2 = new Tienda();

        pets2.setNombre("pets 222");
        pets2.setDireccion("calle real 123");
        pets2.setTelefono(698);
        pets2.setUbicacion("narnia jamas");


    }
}

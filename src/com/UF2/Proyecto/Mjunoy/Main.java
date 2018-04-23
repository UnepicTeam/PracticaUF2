package com.UF2.Proyecto.Mjunoy;

import com.UF2.Proyecto.Mjunoy.manager.ManagerVeterianarios;
import com.UF2.Proyecto.Mjunoy.model.Administrador;
import com.UF2.Proyecto.Mjunoy.model.Tienda;
import com.UF2.Proyecto.Mjunoy.model.Veterinario;
import com.UF2.Proyecto.Mjunoy.view.PantallaPrincipal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = Database.get();

        Tienda tienda = new Tienda("que bestia","alcampo",
                934571523,"de 10 a 22 de lunes a sabado" ,
                "www.quebestia.es","exoticos",true,
                0);
        db.insertTienda(tienda);
        Veterinario veterinario = new Veterinario("dualvet","cubics",
                964521478,"de 9:20 a 20:35 de lunes a sabado",
                "www.dualvet.es","domesticos y exoticos",
                25,50,60,100,false,0);
        db.insertVeterinario(veterinario);

        Administrador administrador = new Administrador("admin","admin");
        db.insertAdministrador(administrador);

        List<Tienda> tiendasBase = db.selectAllTiendas();

        for (Tienda tienda1: tiendasBase) {
            System.out.println
                    (String.format("%-10s", tienda1.nombre) + " | " + String.format("%-10s", tienda1.direccion));
        }

    }
}

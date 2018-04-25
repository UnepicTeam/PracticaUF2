package com.UF2.Proyecto.Mjunoy.manager;

import com.UF2.Proyecto.Mjunoy.Database;
import com.UF2.Proyecto.Mjunoy.model.Administrador;

import java.util.List;

public class ManagerAdministrador {

    public static boolean login(String usuario,String contraseña){
        Boolean login= false;
        List<Administrador> administradores= Database.selectAllAdministradores();

        for (Administrador administrador : administradores) {

            if (administrador.usuario.equals(usuario) && administrador.contraseña.equals(contraseña)){
                login=true;
                return login;
            }

        }
        return login;
    }
}

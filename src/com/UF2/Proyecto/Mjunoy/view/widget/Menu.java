package com.UF2.Proyecto.Mjunoy.view.widget;

public class Menu {
    public String show(String titulo, String ...opciones){
        EditText editText = new EditText();
        Message message = new Message();
        System.out.println(titulo);

        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i+1) + " - " + opciones[i]);
        }
        boolean valido = true;
        int opcion;
        do {
            opcion = editText.readInt("opcion:");
            valido = true;

            if(opcion < 1 || opcion > opciones.length){
                message.showError("Opcion no valida");
                valido = false;
            }
        }while(!valido);

        return String.valueOf(opcion);
    }
}

package com.UF2.Proyecto.Mjunoy.view.widget;

import java.util.Scanner;

public class EditText {
    static Scanner scanner = new Scanner(System.in);

    public String read(String hint){
        System.out.println(hint);
        return scanner.nextLine();
    }

    public int readInt(String hint){
        int numero = 0;
        boolean valido = true;
        do {
            System.out.println(hint);
            valido = true;

            String leido = scanner.nextLine();
            try {
                numero = Integer.parseInt(leido);
            }catch (Exception e){
                new Message().showError("Inroduzca un numero");
                valido = false;
            }
        } while(!valido);
        return numero;
    }
}

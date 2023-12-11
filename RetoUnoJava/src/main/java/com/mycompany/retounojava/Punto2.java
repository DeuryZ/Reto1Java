/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounojava;

/**
 *
 * @author user
 */
public class Punto2 {

    public static void main(String[] args) {
        String password = "Ps000000!";
        boolean passwordHasNumbers = false,
                passwordHaslow = false,
                passwordHasCap = false,
                passwordHasSpe = false;

        for (int i = 0; i < password.length(); i++) {
            if (Integer.valueOf(password.charAt(i)) >= 48 && Integer.valueOf(password.charAt(i)) <= 60) {
                passwordHasNumbers = true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if ((Integer.valueOf(password.charAt(i)) >= 65 && Integer.valueOf(password.charAt(i)) <= 90)
                    || Integer.valueOf(password.charAt(i)) == 209) {
                passwordHasCap = true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if ((Integer.valueOf(password.charAt(i)) >= 97 && Integer.valueOf(password.charAt(i)) <= 122)
                    || Integer.valueOf(password.charAt(i)) == 241) {
                passwordHaslow = true;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (Integer.valueOf(password.charAt(i)) == 33
                    || Integer.valueOf(password.charAt(i)) == 64
                    || Integer.valueOf(password.charAt(i)) == 35
                    || Integer.valueOf(password.charAt(i)) == 36
                    || Integer.valueOf(password.charAt(i)) == 37
                    || Integer.valueOf(password.charAt(i)) == 94
                    || Integer.valueOf(password.charAt(i)) == 38
                    || Integer.valueOf(password.charAt(i)) == 42) {
                passwordHasSpe = true;
            }
        }
        if (password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        } else if (passwordHasNumbers == false) {
            System.out.println("La contraseña debe tener por lo menos un numero");
        } else if (passwordHasCap == false) {
            System.out.println("La contraseña debe tener por lo menos una letra mayuscula");
        } else if (passwordHaslow == false) {
            System.out.println("La contraseña debe tener por lo menos una letra minuscula");
        } else if (passwordHasSpe == false) {
            System.out.println("La contraseña debe tener por lo menos alguno de estos caracteres: !,@,#,$,%,^,&,*");
        } else {
            System.out.println("Contraseña creada con exito.");
        }

    }
}

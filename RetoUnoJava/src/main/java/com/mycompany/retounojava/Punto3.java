/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounojava;

/**
 *
 * @author user
 */
public class Punto3 {

    public static void main(String[] args) {
        String password = "";
        float numeroRandom;
        int intNumeroRandom,
                contador = 0,
                opcion = 8,
                tamanoContra=16;
        String letras = "qwertyuiopasdfghjklñzxcvbnm",
                letrasNumeros="qwertyuiopasdfghjklñzxcvbnm1234567890",
                letrasMayusculas="qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM",
                letrasSimbolos="qwertyuiopasdfghjklñzxcvbnm!#$%&*@",
                letrasNumerosMayusculas="qwertyuiopasdfghjklñzxcvbnm1234567890QWERTYUIOPASDFGHJKLÑZXCVBNM",
                letrasNumerosSimbolos="qwertyuiopasdfghjklñzxcvbnm1234567890!#$%&*@",
                letrasSimbolosMayusculas="qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM!#$%&*@",
                letrasNumerosSimbolosmayusculas="qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM!#$%&*@1234567890";
        switch (opcion) {
            case 1:
                //letras
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letras.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letras.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
                //letrasNumeros
            case 2:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasNumeros.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasNumeros.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
                //letrasMayusculas
            case 3:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasMayusculas.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasMayusculas.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
            case 4:
                //letrasSimbolos
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasSimbolos.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasSimbolos.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
                //letrasNumeroMayusculas
            case 5:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasNumerosMayusculas.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasNumerosMayusculas.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
                //letrasNumeroSimbolos
            case 6:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasNumerosSimbolos.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasNumerosSimbolos.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));    
                        contador++;
                    }
                }
                break;
                //letrasSimbolosMayusculas
            case 7:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasSimbolosMayusculas.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasSimbolosMayusculas.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
                //letrasNumerosSimbolosmayusculas
            case 8:
                while (contador < tamanoContra) {
                    numeroRandom = Math.round(Math.random() * 100);
                    if (numeroRandom < letrasNumerosSimbolosmayusculas.length()) {
                        intNumeroRandom = (int) numeroRandom;
                        password = password.concat(letrasNumerosSimbolosmayusculas.substring(Integer.valueOf(intNumeroRandom),Integer.valueOf(intNumeroRandom)+1));
                        contador++;
                    }
                }
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
        System.out.println("Tu contraseña es: " + password);

    }

}

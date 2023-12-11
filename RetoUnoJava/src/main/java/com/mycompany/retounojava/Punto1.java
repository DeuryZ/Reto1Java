/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounojava;

/**
 *
 * @author user
 */
public class Punto1 {

    public static void main(String[] args) {
        int n = 30;
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            } else if (i % 3 == 0 || i % 5 == 0) {
                suma = suma + i;
            } else {
                continue;
            }
        }
    }

}

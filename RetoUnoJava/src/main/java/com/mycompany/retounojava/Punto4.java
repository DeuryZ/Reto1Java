/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retounojava;

/**
 *
 * @author user
 */
public class Punto4 {
    public static void main(String[] args) {
        
        //es la serie de finobacci (con una sintaxis diferente)
        int a=0,
            b=1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            b=a+b;
            a=b;
            

            
        }
    }
}

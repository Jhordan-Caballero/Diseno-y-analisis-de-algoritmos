/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_inicio;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Prueba_inicio {

    public static void main(String[] args) {
       Scanner tilin = new Scanner(System.in);

        System.out.println("Escribe el número del que deseas el factorial:");
        int numero = tilin.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
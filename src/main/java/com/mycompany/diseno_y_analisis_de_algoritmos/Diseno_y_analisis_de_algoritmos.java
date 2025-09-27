/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diseno_y_analisis_de_algoritmos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jcaba
 */
public class Diseno_y_analisis_de_algoritmos {

    public static void main(String[] args) {
 
       Tablahash tabla = new Tablahash();
        
        tabla.explicarFuncionHash();
        tabla.mostrarEjemplosHash();
        tabla.mostrarColisiones();
        
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Esta tabla hash:");
        System.out.println("- Usa un array de tamaño 10");
        System.out.println("- La función hash suma solo los dígitos del modelo");
        System.out.println("- El índice = (suma dígitos) % 10");
        System.out.println("- Las colisiones ocurren cuando diferentes modelos");
        System.out.println("  tienen la misma suma de dígitos");
    }
}

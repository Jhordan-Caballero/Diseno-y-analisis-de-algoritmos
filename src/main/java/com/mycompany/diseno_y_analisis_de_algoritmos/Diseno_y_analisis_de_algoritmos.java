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
 
        // Crear lista de pasajeros para un vuelo
        List<Pasajero> pasajeros = Arrays.asList(
            new Pasajero("Ana", "García", 15, "Economica"),
            new Pasajero("Carlos", "Martínez", 3, "Ejecutiva"),
            new Pasajero("María", "López", 8, "Economica"),
            new Pasajero("Juan", "Rodríguez", 1, "Primera"),
            new Pasajero("Laura", "Sánchez", 12, "Economica"),
            new Pasajero("Pedro", "Fernández", 5, "Ejecutiva")
        );

        System.out.println("=== LISTA ORIGINAL DE PASAJEROS ===");
        imprimirPasajeros(pasajeros);

        // 1. TIMSORT POR ORDEN NATURAL (por apellido - implementado en compareTo)
        // Collections.sort() usa TimSort por defecto en Java
        Collections.sort(pasajeros);
        
        System.out.println("\n=== PASAJEROS ORDENADOS POR APELLIDO (Timsort) ===");
        imprimirPasajeros(pasajeros);

        // 2. TIMSORT CON COMPARATOR PERSONALIZADO (por número de asiento)
        Collections.sort(pasajeros, new Comparator<Pasajero>() {
            @Override
            public int compare(Pasajero p1, Pasajero p2) {
                return Integer.compare(p1.getNumeroAsiento(), p2.getNumeroAsiento());
            }
        });

        System.out.println("\n=== PASAJEROS ORDENADOS POR NÚMERO DE ASIENTO ===");
        imprimirPasajeros(pasajeros);

        // 3. TIMSORT CON COMPARATOR MÚLTIPLE (por clase y luego por apellido)
        Collections.sort(pasajeros, new Comparator<Pasajero>() {
            @Override
            public int compare(Pasajero p1, Pasajero p2) {
                // Primero por clase (orden personalizado)
                int comparacionClase = prioridadClase(p1.getClase()) - prioridadClase(p2.getClase());
                if (comparacionClase != 0) {
                    return comparacionClase;
                }
                // Si misma clase, ordenar por apellido
                return p1.getApellido().compareTo(p2.getApellido());
            }
            
            private int prioridadClase(String clase) {
                switch(clase) {
                    case "Primera": return 1;
                    case "Ejecutiva": return 2;
                    case "Economica": return 3;
                    default: return 4;
                }
            }
        });

        System.out.println("\n=== PASAJEROS ORDENADOS POR CLASE Y APELLIDO ===");
        imprimirPasajeros(pasajeros);

        // 4. Ejemplo adicional: ordenar con expresión lambda (Java 8+)
        System.out.println("\n=== PASAJEROS ORDENADOS POR NOMBRE (con lambda) ===");
        Collections.sort(pasajeros, (p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        imprimirPasajeros(pasajeros);
    }

    // Método auxiliar para imprimir la lista de pasajeros
    private static void imprimirPasajeros(List<Pasajero> pasajeros) {
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero);
        }
    }
}

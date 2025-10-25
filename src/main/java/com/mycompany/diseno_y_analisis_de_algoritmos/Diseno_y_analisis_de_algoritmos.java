/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diseno_y_analisis_de_algoritmos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jcaba
 */
public class Diseno_y_analisis_de_algoritmos {

    public static void main(String[] args) {
 
        List<Avion> aviones = new ArrayList<>();
        
        aviones.add(new Avion("Boeing 747", 400));
        aviones.add(new Avion("Airbus A320", 180));
        aviones.add(new Avion("Boeing 777", 350));
        aviones.add(new Avion("Airbus A380", 850));
        
        System.out.println("Aviones desordenados:");
        for (Avion avion : aviones) {
            System.out.println(avion);
        }
        
        // Ordenar por nombre - TimSort se usa automáticamente
        Collections.sort(aviones, new Comparator<Avion>() {
            @Override
            public int compare(Avion a1, Avion a2) {
                return a1.nombre.compareTo(a2.nombre);
            }
        });
        
        System.out.println("\nOrdenados por nombre:");
        for (Avion avion : aviones) {
            System.out.println(avion);
        }
        
        // Ordenar por capacidad
        Collections.sort(aviones, new Comparator<Avion>() {
            @Override
            public int compare(Avion a1, Avion a2) {
                return Integer.compare(a1.capacidad, a2.capacidad);
            }
        });
        
        System.out.println("\nOrdenados por capacidad:");
        for (Avion avion : aviones) {
            System.out.println(avion);
        }
        
        
        
    }
}
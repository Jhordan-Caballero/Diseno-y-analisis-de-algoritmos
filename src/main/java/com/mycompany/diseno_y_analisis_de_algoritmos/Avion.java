/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno_y_analisis_de_algoritmos;

/**
 *
 * @author jcaba
 */


public class Avion {
    String nombre;
    int capacidad;
    
    public Avion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString() {
        return nombre + " (" + capacidad + " pasajeros)";
    }
}




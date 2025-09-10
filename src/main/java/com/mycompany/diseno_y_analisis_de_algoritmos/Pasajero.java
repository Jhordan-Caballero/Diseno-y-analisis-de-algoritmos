package com.mycompany.diseno_y_analisis_de_algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jcaba
 */
public class Pasajero implements Comparable<Pasajero> {
    private String nombre;
    private String apellido;
    private int numeroAsiento;
    private String clase; 

    public Pasajero(String nombre, String apellido, int numeroAsiento, String clase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroAsiento = numeroAsiento;
        this.clase = clase;
    }

    @Override
    public int compareTo(Pasajero otro) {
        return this.apellido.compareTo(otro.apellido);
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - Asiento: " + numeroAsiento + " (" + clase + ")";
    }

  
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getNumeroAsiento() { return numeroAsiento; }
    public String getClase() { return clase; }
}

    


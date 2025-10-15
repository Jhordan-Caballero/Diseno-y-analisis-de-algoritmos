/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diseno_y_analisis_de_algoritmos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author jcaba
 */
public class Diseno_y_analisis_de_algoritmos {

    public static void main(String[] args) {
 
       HashMap<String, String> aviones = new HashMap<>();
        
        aviones.put("AV001", "Boeing 737");
        aviones.put("AV002", "Airbus A320");
        aviones.put("AV003", "Boeing 787");
        aviones.put("AV004", "Airbus A380");
        aviones.put("AV005", "Embraer E190");
        aviones.put("AV006", "Boeing 747");
        aviones.put("AV007", "Airbus A350");
        aviones.put("AV008", "Cessna 172");
        aviones.put("AV009", "Boeing 777");
        aviones.put("AV010", "Airbus A330");
        aviones.put("AV011", "Bombardier CRJ");
        aviones.put("AV012", "ATR 72");
        aviones.put("AV013", "Boeing 737 MAX");
        aviones.put("AV014", "Airbus A321");
        aviones.put("AV015", "Boeing 767");
        
        System.out.println("=== FLOTA DE AVIONES ===");
        for (String codigo : aviones.keySet()) {
            String modelo = aviones.get(codigo);
            System.out.println("Codigo: " + codigo + " -> Modelo: " + modelo);
        }
        
        System.out.println("\n=== BUSCAR AVION ===");
        String codigoBuscado = "AV007";
        if (aviones.containsKey(codigoBuscado)) {
            System.out.println("Avion encontrado: " + aviones.get(codigoBuscado));
        } else {
            System.out.println("Avion no encontrado");
        }
        
        System.out.println("\n=== ELIMINAR AVION ===");
        String codigoEliminar = "AV008";
        aviones.remove(codigoEliminar);
        System.out.println("Avion " + codigoEliminar + " eliminado");
        
        System.out.println("\nTotal de aviones en flota: " + aviones.size());
    }
}

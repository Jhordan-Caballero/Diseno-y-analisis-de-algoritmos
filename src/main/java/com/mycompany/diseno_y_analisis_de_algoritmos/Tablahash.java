/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno_y_analisis_de_algoritmos;

import java.util.Arrays;

/**
 *
 * @author jcaba
 */
public class Tablahash {
    private String[] tabla;
    private int tamaño;
    
    // Constructor - tamaño fijo de 10
    public Tablahash() {
        this.tamaño = 10;
        this.tabla = new String[tamaño];
     
    }
   
    private int funcionHash(String modeloAvion) {
        int suma = 0;
        
      
        for (int i = 0; i < modeloAvion.length(); i++) {
            char c = modeloAvion.charAt(i);
     
            if (Character.isDigit(c)) {
                suma += Character.getNumericValue(c);
            }
        }
        
       
        return suma % tamaño;
    }
    
   
    public void mostrarEjemplosHash() {
        String[] modelosAviones = {
            "Boeing747", "AirbusA320", "Boeing737", "AirbusA380",
            "Embraer190", "Boeing787", "AirbusA350", "Boeing777",
            "AirbusA330", "Embraer175"
        };
        
        System.out.println("=== CALCULO DE HASH PARA MODELOS DE AVIONES ===");
        System.out.println("Tamano de la tabla: " + tamaño);
        System.out.println("\nModelo Avión\t\tDígitos\t\tSuma\tÍndice");
        System.out.println("------------------------------------------------");
        
        for (String modelo : modelosAviones) {
            int suma = 0;
            StringBuilder digitos = new StringBuilder();
            
        
            for (int i = 0; i < modelo.length(); i++) {
                char c = modelo.charAt(i);
                if (Character.isDigit(c)) {
                    int valor = Character.getNumericValue(c);
                    digitos.append(valor).append("+");
                    suma += valor;
                }
            }
            
          
            if (digitos.length() > 0) {
                digitos.setLength(digitos.length() - 1);
            } else {
                digitos.append("0");
            }
            
            int indice = suma % tamaño;
            
            System.out.printf("%-15s\t%-10s\t%d\t%d\n", 
                modelo, digitos.toString(), suma, indice);
        }
    }
    
  
    public void mostrarColisiones() {
        System.out.println("\n=== DEMOSTRACION DE COLISIONES ===");
        
        
        String[][] gruposColisiones = {
            {"Boeing747", "Boeing7470", "A747"},  
            {"AirbusA320", "Boeing320", "A320"},   
            {"Boeing737", "A737", "X737"}          
        };
        
        for (String[] grupo : gruposColisiones) {
            System.out.println("\nGrupo de colisión:");
            for (String modelo : grupo) {
                int suma = 0;
                for (char c : modelo.toCharArray()) {
                    if (Character.isDigit(c)) {
                        suma += Character.getNumericValue(c);
                    }
                }
                int indice = suma % tamaño;
                System.out.printf("  %-12s → Dígitos suman: %d → Índice: %d\n", 
                    modelo, suma, indice);
            }
        }
    }
    
    
    public void explicarFuncionHash() {
        System.out.println("\n=== EXPLICACIÓN DE LA FUNCIÓN HASH ===");
        System.out.println("Formula: índice = (suma de digitos del modelo) % tamaño");
        System.out.println("Donde:");
        System.out.println("- tamaño = " + tamaño);
        System.out.println("- Solo se consideran los caracteres numericos");
        System.out.println("- Los caracteres de texto se ignoran en el calculo");
        System.out.println("\nEjemplo con 'Boeing747':");
        System.out.println("  Digitos: 7, 4, 7");
        System.out.println("  Suma: 7 + 4 + 7 = 18");
        System.out.println("  Indice: 18 % 10 = 8");
    }

}
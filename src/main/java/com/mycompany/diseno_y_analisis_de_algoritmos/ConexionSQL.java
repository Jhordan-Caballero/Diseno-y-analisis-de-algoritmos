/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diseno_y_analisis_de_algoritmos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jcaba
 */
public class ConexionSQL {
    public static void main(String[] args) {
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Prueba   ;encrypt=false";
        String user = "Silver\\SQLEXPRESS";         
        String pass = "12345";      

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            System.out.println("✅ Conexión exitosa a SQL Server");

            String query = "SELECT TOP 5 * FROM Clientes";  
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
             
                System.out.println(rs.getInt("id") + " - " + rs.getString("nombre"));
            }

        } catch (Exception e) {
            System.out.println("❌ Error al conectar o leer la base de datos:");
            e.printStackTrace();
        }
    }
}

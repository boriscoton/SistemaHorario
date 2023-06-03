/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class Conexion {
     public Connection getConection(){
    {
     Connection Conectar=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/Horario","root","1234");
           
            if(Conectar!=null){
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
               
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR A LA BASE DE DATOS"+ e.toString());
        }
        return Conectar;
    } 
     
 }

}

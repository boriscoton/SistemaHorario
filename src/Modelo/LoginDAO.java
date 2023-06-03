/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.mysql.cj.xdevapi.Result;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;


/**
 *
 * @author DELL
 */
public class LoginDAO {
    
    
    Conexion con;
    PreparedStatement in;
    ResultSet rs;
    
    private Object cn;
    
    public int log(String usuario, String pass) throws SQLException{
        login l = new login();
        String cn = "select * from usuario where usuario = ? AND pass = ?";
        try{
            in = con.getConexion();
            in = con.prepareStatement();
            in.setString(1, usuario);
            in.setString(2, pass);
            rs = in.executeQuery();
            if (rs.next()){
            l.setUsuario(rs.getString("usuario"));
            l.setPass(rs.getString("pass"));
    }
        }catch(Exception e){
          System.out.println(e.toString());  
        }
        return 0;
             
}
}


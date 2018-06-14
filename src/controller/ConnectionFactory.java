/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;

/**
 *
 * @author andrey
 */
public class ConnectionFactory {
       
   public static Connection getConnection() throws ClassNotFoundException, SQLException{   
        
       Class.forName("org.postgresql.Driver");
       return DriverManager.getConnection("jdbc:postgresql://Localhost:5432/obras", "root", "root");
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarvadnya;

/**
 *
 * @author Aditya
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class myconnection {
    public static Connection getConnection(){
     
        Connection con ;
        con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage()+ "iam error");
        }
        
        return con;
    }
    
    
}

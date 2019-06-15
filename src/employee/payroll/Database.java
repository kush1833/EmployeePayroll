/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kushagra
 */
public class Database {
    
    Connection con = null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Kushagra\\Documents\\NetBeansProjects\\Employee PayRoll\\my_database.sqlite");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}

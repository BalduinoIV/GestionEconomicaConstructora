/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiburcio
 */
public class SQLite {
    private static Connection conn = null;
    
    public static Connection getConnection(){

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:GestionEconomicaConstructora.sqlite");
            //JOptionPane.showMessageDialog(null,"Conectado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage());
        }
        return conn;
    }
}

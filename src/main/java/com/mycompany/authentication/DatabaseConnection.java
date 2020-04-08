/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.authentication;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Arif Ikhsanudin
 */
public class DatabaseConnection {
    Connection connection;
    Statement statement;
    
    public void config() {
        try {
            System.out.println("Congrats - Seems your MySQL JDBC Driver Registered!");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/netbeans_authentication", "root", "");
            statement = connection.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

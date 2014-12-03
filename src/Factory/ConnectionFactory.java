/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luís Paulo
 */
public class ConnectionFactory {
    
    public static Connection getConnection() {
        try {
            //Registra JDBC driver
           Class.forName("com.mysql.jdbc.Driver");

           //Abrindo a conexão
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/myfit", "root", "1234");   
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}

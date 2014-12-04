package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Prog03
 */
public class UsuarioDAO {
    
    private Connection connection;
    
    public UsuarioDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public boolean validaLogin(String login, String senha) {
        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            if (login.equals(rs.getString("login")) && senha.equals(rs.getString("senha"))) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}

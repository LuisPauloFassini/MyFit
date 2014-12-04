package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    private Connection connection;
    private Usuario usuario;
    
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
                this.usuario = new Usuario(rs.getInt("Id"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("login"), rs.getString("senha"));
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean alterarSenha(int id, String login, String senhaAnt, String senhaNov) {
        try {
            String sql = "SELECT * FROM usuario where id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            if (login.equals(rs.getString("login")) && senhaAnt.equals(rs.getString("senha"))) {
                String sqlUp = "UPDATE usuario set senha=? where id=?";
                PreparedStatement stmtUp = connection.prepareStatement(sqlUp);
                stmtUp.setString(1, senhaNov);
                stmtUp.setInt(2, id);
                stmtUp.execute();
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }  
    }
    
    public Usuario getUsuario() {
        return this.usuario;
    }
}

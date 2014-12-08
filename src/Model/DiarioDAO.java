package Model;

import Factory.ConnectionFactory;
import Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiarioDAO {
    
    private Connection connection = null;
    
    public DiarioDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(Diario diario) {
        try {
            PreparedStatement stmt;

            String sql = "insert into diariodetreino (dtCri, observacao) values (?, ?)";
            stmt = connection.prepareStatement(sql);
            
            stmt.setDate(1, Utilidades.formataData(diario.getDtCri()));
            stmt.setString(2, diario.getObs());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public int getId(String data) {
        try {
            String dtCri = "";
            try {
                dtCri = String.valueOf(Utilidades.formataData(data));
            } catch (Exception ex) {
                Logger.getLogger(DiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "select * from diariodetreino where dtCri='" + dtCri + "'";
            PreparedStatement stmt;
            
            stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            
            return rs.getInt("id");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
    public void inserirIdTreino(int id, int idTreino) {
        try {
            String sql = "update diariodetreino set idTreino=? where id=?";
            PreparedStatement stmt;
            
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idTreino);
            stmt.setInt(2, id);
            
            System.out.println("update diariodetreino set idTreino="+ idTreino +" where id=" + id);
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

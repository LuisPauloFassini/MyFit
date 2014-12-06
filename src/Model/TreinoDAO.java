package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TreinoDAO {
    
    private Connection connection;
    
    public TreinoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public boolean salvar(Treino treino) {
        try {
            String sql = "";
            PreparedStatement stmt = null;

            sql = "insert into treino (nome) values (?)";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, treino.getNome());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public int getId(String nome) {
        try {
            PreparedStatement stmt = null;
            String sql = "select * from treino where nome=?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            
            return rs.getInt("id");
        } catch (Exception e) {
            return 0;
        }
    }
}

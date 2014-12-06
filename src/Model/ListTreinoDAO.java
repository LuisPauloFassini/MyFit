package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListTreinoDAO {
    private Connection connection;
    
    public ListTreinoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
     public boolean salvar(ListTreino listTreino) {
        try {
            String sql = "";
            PreparedStatement stmt = null;

            sql = "insert into listtreino (idTreino, idExercicio, nome, tipoMemb) values (?, ?, ?, ?)";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, listTreino.getIdTreino());
            stmt.setInt(2, listTreino.getIdExercicio());
            stmt.setString(3, listTreino.getNome());
            stmt.setString(4, listTreino.getTipo());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean apagar(ListTreino listTreino) {
        String sql = "delete from listtreino where idTreino = ? and idExercicio = ?";
         try {
            // Cria a PreparedStatement com o SQL
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, listTreino.getIdTreino());
            stmt.setInt(2, listTreino.getIdExercicio());
            stmt.execute();
            stmt.close();
            
            return true;
         } catch (SQLException e) {
            System.out.println(e.getMessage());
            
            return false;
        }
    }
    
}

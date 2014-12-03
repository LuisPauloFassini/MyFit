package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExercicioDAO {
    private Connection connection;

    public ExercicioDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void salvar(Exercicio exercicio) {
        
        try {
            String sql = "";
            PreparedStatement stmt = null;

            if (exercicio.getId() == 0) {
                sql = "insert into exercicio (nome, tipoMemb, ativo) values (?,?, ?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, exercicio.getNome());
                stmt.setString(2, exercicio.getTipoMemb());
                if (exercicio.isAtivo()) {
                    stmt.setInt(3, 0);
                } else {
                    stmt.setInt(3, 1);
                }
            } else {
                sql = "insert into exercico (nome, tipoMemb, ativo) values (?,?, ?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, exercicio.getNome());
                stmt.setString(2, exercicio.getTipoMemb());
                if (exercicio.isAtivo()) {
                    stmt.setInt(3, 0);
                } else {
                    stmt.setInt(3, 1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void apagar(Exercicio exercicio) {
        String sql = "delete from exercicio where id = ?";
         try {
            // Cria a PreparedStatement com o SQL
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, exercicio.getId());
            stmt.execute();
            stmt.close();

         } catch (SQLException e) {
            System.out.println(e.getMessage());
           
        }
    }
    
}

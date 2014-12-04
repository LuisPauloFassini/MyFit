package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExercicioDAO {
    private Connection connection;

    public ExercicioDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public ArrayList<Exercicio> listar(String nome) {
        ArrayList<Exercicio> listaExercicio = new ArrayList<>();
        String sql = "select * from exercicio where nome like ?";

        try {
            // Cria a PreparedStatement com o SQL
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, "%" + nome + "%");
            
            //Executa a query de seleção
            ResultSet rs = stmt.executeQuery();   

            while (rs.next()) {  
                Exercicio exercicio = new Exercicio();
                exercicio.setId(rs.getInt("Id"));
                exercicio.setNome(rs.getString("Nome"));
                exercicio.setTipoMemb(rs.getString("tipoMemb"));
                exercicio.setAtivo(rs.getBoolean("Ativo"));

                listaExercicio.add(exercicio);
            }  

            return listaExercicio;            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void salvar(Exercicio exercicio) {
        
        try {
            String sql = "";
            PreparedStatement stmt = null;

            if (exercicio.getId() == 0) {
                sql = "insert into exercicio (nome, tipoMemb, ativo) values (?, ?, ?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, exercicio.getNome());
                stmt.setString(2, exercicio.getTipoMemb());
                stmt.setBoolean(3, exercicio.isAtivo());
            } else {
                sql = "insert into exercico (nome, tipoMemb, ativo) values (?, ?, ?)";
                stmt = connection.prepareStatement(sql);
                stmt.setString(1, exercicio.getNome());
                stmt.setString(2, exercicio.getTipoMemb());
                stmt.setBoolean(3, exercicio.isAtivo());
            }
            stmt.execute();
            stmt.close();
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
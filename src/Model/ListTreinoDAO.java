package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
     
    public ArrayList<ListTreino> listar(int idTreino) {
        ArrayList<ListTreino> listaTreino = new ArrayList<>();
        String sql = "select * from listtreino where idTreino=?";

        try {
            // Cria a PreparedStatement com o SQL
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, idTreino);
            
            //Executa a query de seleção
            ResultSet rs = stmt.executeQuery();   

            while (rs.next()) {  
                ListTreino listTreino = new ListTreino();
                listTreino.setIdTreino(rs.getInt("idTreino"));
                listTreino.setIdExercicio(rs.getInt("idExercicio"));
                listTreino.setNome(rs.getString("Nome"));
                listTreino.setTipo(rs.getString("tipoMemb"));
               

                listaTreino.add(listTreino);
            }  

            return listaTreino;            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
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

package Model;

import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListaDiarioTreinoDAO {
    private Connection connection = null;
    
    public ListaDiarioTreinoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }
    
    public void salvar(ListaDiarioTreino listaDiarioTreino) {
        try {
            PreparedStatement stmt;
            String sql = "insert into listadiariotreino (idDiario, idExercicio, nomeExerc, series, repeticoes, peso) values(?, ?, ?, ?, ?, ?)";
            
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, listaDiarioTreino.getIdDiario());
            stmt.setInt(2, listaDiarioTreino.getIdExercicio());
            stmt.setString(3, listaDiarioTreino.getNome());
            stmt.setInt(4, listaDiarioTreino.getSerie());
            stmt.setInt(5, listaDiarioTreino.getRepeticoes());
            stmt.setInt(6, listaDiarioTreino.getPeso());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void excluir(int idDiario, int idExercicio) {
        String sql = "delete from listadiariotreino where idDiario = ? and idExercicio = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, idDiario);
            stmt.setInt(2, idExercicio);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
        }
    }
}

package Model;

import Factory.ConnectionFactory;
import Utilidades.Utilidades;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FichaTecnicaDAO {
    Connection connection = null;
    
    public FichaTecnicaDAO() {
        this.connection = ConnectionFactory.getConnection();    
    }
    
    public boolean salvar(FichaTecnica ficTec) {
        try {
            String sql = "";
            PreparedStatement stmt = null;

            sql = "insert into fichatec (dtCri, altura, peso, percGordura, abdomen, torax, quadril, cintura, antDir, antEsq, bracoDir, bracoEsq, coxaDir, coxaEsq, pantDir, pantEsq) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = connection.prepareStatement(sql);
            
            stmt.setDate(1, Utilidades.formataData(ficTec.getData()));
            stmt.setDouble(2, ficTec.getAltura());
            stmt.setDouble(3, ficTec.getPeso());
            stmt.setDouble(4, ficTec.getPercGordura());
            stmt.setDouble(5, ficTec.getAbdomen());
            stmt.setDouble(6, ficTec.getTorax());
            stmt.setDouble(7, ficTec.getQuadril());
            stmt.setDouble(8, ficTec.getCintura());
            stmt.setDouble(9, ficTec.getAntDir());
            stmt.setDouble(10, ficTec.getAntEsq());
            stmt.setDouble(11, ficTec.getBracoDir());
            stmt.setDouble(12, ficTec.getBracoEsq());
            stmt.setDouble(13, ficTec.getCoxaDir());
            stmt.setDouble(14, ficTec.getCoxaEsq());
            stmt.setDouble(15, ficTec.getPantDir());
            stmt.setDouble(16, ficTec.getPantEsq());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ArrayList<FichaTecnica> listar() {
        ArrayList<FichaTecnica> listaFichaTecnicas = new ArrayList<>();
        String sql = "select * from fichatec";

        try {
            // Cria a PreparedStatement com o SQL
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //Executa a query de seleção
            ResultSet rs = stmt.executeQuery();   

            while (rs.next()) {  
                FichaTecnica ficTec = new FichaTecnica();
                ficTec.setData(String.valueOf(rs.getDate("dtCri")));
                ficTec.setAltura(rs.getDouble("altura"));
                ficTec.setPeso(rs.getDouble("peso"));
                ficTec.setPercGordura(rs.getDouble("percGordura"));
                ficTec.setAbdomen(rs.getDouble("abdomen"));
                ficTec.setTorax(rs.getDouble("torax"));
                ficTec.setQuadril(rs.getDouble("quadril"));
                ficTec.setCintura(rs.getDouble("cintura"));
                ficTec.setAntDir(rs.getDouble("antDir"));
                ficTec.setAntEsq(rs.getDouble("antEsq"));
                ficTec.setBracoDir(rs.getDouble("bracoDir"));
                ficTec.setBracoEsq(rs.getDouble("bracoEsq"));
                ficTec.setCoxaDir(rs.getDouble("coxaDir"));
                ficTec.setCoxaEsq(rs.getDouble("coxaEsq"));
                ficTec.setPantDir(rs.getDouble("pantDir"));
                ficTec.setPantEsq(rs.getDouble("pantEsq"));

                listaFichaTecnicas.add(ficTec);
            }  

            return listaFichaTecnicas;            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

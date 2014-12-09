package Utilidades;

import Factory.ConnectionFactory;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Utilidades {

    public static Date formataData(String data) throws Exception {   
        if (data == null || data.equals("")) return null;  
        else {
            try {  
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
                java.sql.Date date = new java.sql.Date(format.parse(data).getTime());  
                return date;
            } catch (ParseException e) {              
                return null;
            }    
        }
    } 
    
    //Função utilizada para centralizar um JFrame
    public static void centralizarFrame (JFrame obj) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation(dimension.width/2-obj.getSize().width/2, dimension.height/2-obj.getSize().height/2);
    }
    
    //Função utilizada para centralizar um JDialog
    public static void centralizarDialog (JDialog obj) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        obj.setLocation(dimension.width/2-obj.getSize().width/2, dimension.height/2-obj.getSize().height/2);
    }
    
    //Função utilizada para incluir um ícone na tela 
    public static Image adicionarIcone (String sIcone) {
        return (Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + sIcone));
    }
    
    public static void ImprimeRelatorio(String caminho) throws JRException, Exception {
        Connection conn = ConnectionFactory.getConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + caminho;
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
}

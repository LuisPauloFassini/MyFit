package Controller;

import Model.FichaTecnica;
import Model.FichaTecnicaDAO;
import View.ConsultaFichaTecnicaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ConsultaFichaTecnicaController implements ActionListener{

    private FichaTecnica fichaTec = null;
    private FichaTecnicaDAO fichaDAO = new FichaTecnicaDAO();
    private ConsultaFichaTecnicaView consultaFichaView = null;
    private DefaultTableModel model = null;
    
    public ConsultaFichaTecnicaController(ConsultaFichaTecnicaView view) {
        this.consultaFichaView = view;
    }
    
    public ConsultaFichaTecnicaView getConsultaFichaTecnicaView() {
        return this.consultaFichaView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void carregarTabela() {
        this.model = (DefaultTableModel) this.consultaFichaView.getjTableFicha().getModel();
        ArrayList<FichaTecnica> listaFicha = this.fichaDAO.listar();

        this.model.setNumRows(0);

        for (FichaTecnica ficha : listaFicha) {
            this.model.addRow(new Object[]{ficha.getData(),ficha.getAltura(), ficha.getPeso(), ficha.getPercGordura()});
        }
    }
}

package Controller;

import Model.Treino;
import Model.TreinoDAO;
import View.ConsultaExerciciosView;
import View.ConsultaTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ConsultaTreinoController implements ActionListener {
    
    private TreinoController treinoController;
    private ConsultaTreinoView consultaTreinoView = null;
    private Treino treino = new Treino();
    private TreinoDAO treinoDAO = new TreinoDAO();
    private DefaultTableModel model;
    
    public ConsultaTreinoController(ConsultaTreinoView view, TreinoController treinoController) {
        this.consultaTreinoView = view;
        this.treinoController = treinoController;
        
        this.consultaTreinoView.getjButtonPesquisar().addActionListener(this);
        this.consultaTreinoView.getjButtonConfirma().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == consultaTreinoView.getjButtonPesquisar()) {
            listar(consultaTreinoView.getjTextFieldNome().getText());
        } else if (e.getSource() == consultaTreinoView.getjButtonConfirma()) {
            this.treino.setId((int) this.consultaTreinoView.getjTableTreinos().getValueAt(consultaTreinoView.getjTableTreinos().getSelectedRow(), 0));
            this.treino.setNome((String) this.consultaTreinoView.getjTableTreinos().getValueAt(consultaTreinoView.getjTableTreinos().getSelectedRow(), 1));
            this.treinoController.setCampos(this.treino);
            this.consultaTreinoView.dispose();
        }
    }
    
    public ConsultaTreinoView getConsultaTreinoView() {
        return this.consultaTreinoView;
    }
    
    public void listar(String nome){
       ArrayList<Treino> listaTreino = this.treinoDAO.listar(nome);
       this.model = (DefaultTableModel) this.consultaTreinoView.getjTableTreinos().getModel();

       this.model.setNumRows(0);

       for (Treino treino : listaTreino) {
           this.model.addRow(new Object[]{treino.getId(),treino.getNome()});
       }
    }
    
}

package Controller;

import Model.DiarioDAO;
import Model.ListTreino;
import Model.ListTreinoDAO;
import Model.Treino;
import Model.TreinoDAO;
import View.ConsultaTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AdicionarTreinoController implements ActionListener {
    
    private DiarioDeTreinoController diarioController;
    private ConsultaTreinoView consultaTreinoView = null;
    private Treino treino = new Treino();
    private TreinoDAO treinoDAO = new TreinoDAO();
    private DiarioDAO diarioDAO = new DiarioDAO();
    private ListTreinoDAO listTreinoDAO = new ListTreinoDAO();
    private ListTreino listTreino = null;
    private DefaultTableModel model;
    
    public AdicionarTreinoController(ConsultaTreinoView view, DiarioDeTreinoController diarioController) {
        this.consultaTreinoView = view;
        this.diarioController = diarioController;
        
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
            this.diarioDAO.inserirIdTreino(Integer.valueOf(this.diarioController.getDiarioDeTreinoView().getjTextFieldidDiario().getText()), this.treino.getId());
            this.diarioController.getDiarioDeTreinoView().getjTextFieldIdTreino().setText(String.valueOf(this.treino.getId()));
            this.diarioController.listar(this.treino.getId());
            this.consultaTreinoView.dispose();
        }
    }
    
    public ConsultaTreinoView getAdicionarTreinoView() {
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

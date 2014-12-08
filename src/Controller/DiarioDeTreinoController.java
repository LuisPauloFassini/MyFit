package Controller;

import Model.Diario;
import Model.DiarioDAO;
import Model.ListTreino;
import Model.ListTreinoDAO;
import Model.Treino;
import View.ConsultaTreinoView;
import View.DiarioDeTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DiarioDeTreinoController implements ActionListener {
   
    private DiarioDeTreinoView diarioView = null;
    private Diario diario = null;
    private DiarioDAO diarioDAO = new DiarioDAO();
    private ListTreinoDAO listTreinoDAO = new ListTreinoDAO();
    private DefaultTableModel model = null;

    public DiarioDeTreinoView getDiarioDeTreinoView() {
        return this.diarioView;
    }

    public DiarioDeTreinoController(DiarioDeTreinoView view) {
        this.diarioView = view;
        
        this.diarioView.getjButtonSalvarDiario().addActionListener(this);
        this.diarioView.getjButtonAdicionarTreino().addActionListener(this);
        this.diarioView.getjButtonExcluir().addActionListener(this);
        this.diarioView.getjButtonSalvarListDiario().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.diarioView.getjButtonSalvarDiario()) {
            this.diario = new Diario();
            this.diario.setDtCri(this.diarioView.getjFormattedTextFieldData().getText());
            this.diario.setObs(this.diarioView.getjTextArea1().getText());
            
            if (this.diarioDAO.salvar(this.diario)) {
                this.diarioView.getjTextFieldidDiario().setText(String.valueOf(this.diarioDAO.getId(this.diarioView.getjFormattedTextFieldData().getText())));
                this.diarioView.getjButtonAdicionarTreino().setEnabled(true);
                this.diarioView.getjButtonExcluir().setEnabled(true);
                this.diarioView.getjTableListDiario().setEnabled(true);
                this.diarioView.getjButtonSalvarListDiario().setEnabled(true);
                this.diarioView.getjTextArea1().setEnabled(false);
                this.diarioView.getjFormattedTextFieldData().setEnabled(false);
                this.diarioView.getjButtonSalvarDiario().setEnabled(false);
            } else JOptionPane.showMessageDialog(diarioView, "Diário não cadastrado!");
        } else if (e.getSource() == this.diarioView.getjButtonAdicionarTreino()) {
            ConsultaTreinoView consultatreinoView = new ConsultaTreinoView();
            AdicionarTreinoController adicionarTreinoController = new AdicionarTreinoController(consultatreinoView, this);
            adicionarTreinoController.listar("");
            adicionarTreinoController.getAdicionarTreinoView().setVisible(true);
        } else if (e.getSource() == this.diarioView.getjButtonExcluir()) {
            this.model.setNumRows(0);
        }
    }
    
    public void listar(int idTreino) {
        ArrayList<ListTreino> listaTreino = this.listTreinoDAO.listar(idTreino);
       this.model = (DefaultTableModel) this.diarioView.getjTableListDiario().getModel();

       this.model.setNumRows(0);

       for (ListTreino listTreino : listaTreino) {
           this.model.addRow(new Object[]{this.diarioView.getjTextFieldidDiario().getText(), listTreino.getIdExercicio(), listTreino.getNome()});
       }
    }
    
    
}

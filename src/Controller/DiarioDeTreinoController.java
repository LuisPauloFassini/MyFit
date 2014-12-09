package Controller;

import Model.Diario;
import Model.DiarioDAO;
import Model.ListTreino;
import Model.ListTreinoDAO;
import Model.ListaDiarioTreino;
import Model.ListaDiarioTreinoDAO;
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
    private ListaDiarioTreinoDAO listaDiarioTreinoDAO = new ListaDiarioTreinoDAO();

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
                this.diarioView.getjTableListDiario().setEnabled(true);
                this.diarioView.getjButtonSalvarListDiario().setEnabled(false);
                this.diarioView.getjTextArea1().setEnabled(false);
                this.diarioView.getjFormattedTextFieldData().setEnabled(false);
                this.diarioView.getjButtonSalvarDiario().setEnabled(false);
            } else JOptionPane.showMessageDialog(diarioView, "Diário não cadastrado!");
            
        } else if (e.getSource() == this.diarioView.getjButtonAdicionarTreino()) {
            ConsultaTreinoView consultatreinoView = new ConsultaTreinoView();
            AdicionarTreinoController adicionarTreinoController = new AdicionarTreinoController(consultatreinoView, this);
            adicionarTreinoController.listar("");
            adicionarTreinoController.getAdicionarTreinoView().setVisible(true);
            this.diarioView.getjButtonAdicionarTreino().setEnabled(false);
            this.diarioView.getjButtonExcluir().setEnabled(true);
            this.diarioView.getjButtonSalvarListDiario().setEnabled(true);
            
        } else if (e.getSource() == this.diarioView.getjButtonExcluir()) {          
            excluirListaDiarioTreino();
        } else if (e.getSource() == this.diarioView.getjButtonSalvarListDiario()) {
            salvarListaDiarioTreino();
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
    
    public void excluirListaDiarioTreino() {
        this.model = (DefaultTableModel) this.diarioView.getjTableListDiario().getModel();
        
        for (int i=0; i < this.model.getRowCount(); i++) {
            Object idDiario = this.model.getValueAt(i, 0);
            Object idTreino = this.model.getValueAt(i, 1);
            this.listaDiarioTreinoDAO.excluir(Integer.valueOf(idDiario.toString()), Integer.valueOf(idTreino.toString()));
        }
        
        this.model.setNumRows(0);
        this.diarioView.getjButtonAdicionarTreino().setEnabled(true);
        this.diarioView.getjButtonExcluir().setEnabled(false);
        this.diarioView.getjButtonSalvarListDiario().setEnabled(false);
    }
    
    public void salvarListaDiarioTreino() {
        this.model = (DefaultTableModel) this.diarioView.getjTableListDiario().getModel();
        this.listaDiarioTreinoDAO = new ListaDiarioTreinoDAO();
        
        for (int i=0; i < this.model.getRowCount(); i++) {
            Object idDiario = this.model.getValueAt(i, 0);
            Object idTreino = this.model.getValueAt(i, 1);
            Object nome = this.model.getValueAt(i, 2);
            Object series = this.model.getValueAt(i, 3);
            Object repeticoes = this.model.getValueAt(i, 4);
            Object peso = this.model.getValueAt(i, 5);
            ListaDiarioTreino listaTreino = new ListaDiarioTreino();
            listaTreino.setIdDiario(Integer.valueOf(idDiario.toString()));
            listaTreino.setIdExercicio(Integer.valueOf(idTreino.toString()));
            listaTreino.setNome(nome.toString());
            listaTreino.setSerie(Integer.valueOf(series.toString()));
            listaTreino.setRepeticoes(Integer.valueOf(repeticoes.toString()));
            listaTreino.setPeso(Integer.valueOf(peso.toString()));
            
            this.listaDiarioTreinoDAO.salvar(listaTreino);
        }
        
        this.diarioView.getjButtonExcluir().setEnabled(true);
        this.diarioView.getjButtonSalvarListDiario().setEnabled(false);
        this.diarioView.getjTableListDiario().setEnabled(false);
    }
    
}

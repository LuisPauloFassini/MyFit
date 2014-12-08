package Controller;

import Model.Exercicio;
import Model.ListTreino;
import Model.ListTreinoDAO;
import Model.Treino;
import Model.TreinoDAO;
import View.ConsultaExerciciosView;
import View.ConsultaTreinoView;
import View.TreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TreinoController implements ActionListener {

    private Treino treino = null;
    private TreinoDAO treinoDAO = new TreinoDAO();
    private ListTreino listTreino = null;
    private ListTreinoDAO listTreinoDAO = new ListTreinoDAO();
    private TreinoView treinoView = null;
    private DefaultTableModel model;
    
    public TreinoController(Treino treino, TreinoView view) {
        this.treino = treino;
        this.treinoView = view;
        
        this.treinoView.getjButtonAdicionarExercicio().addActionListener(this);
        this.treinoView.getjButtonExcluir().addActionListener(this);
        this.treinoView.getjButtonPesquisar().addActionListener(this);
        this.treinoView.getjButtonSalvarTreino().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.treinoView.getjButtonAdicionarExercicio()) {
            ConsultaExerciciosView consultaView = new ConsultaExerciciosView();
            int idTreino = Integer.valueOf(this.treinoView.getjTextFieldId().getText());
            AdicionarExercicioController consultaController = new AdicionarExercicioController(consultaView, this, idTreino);
            consultaController.listar("");
            consultaController.getConsultaExercicioView().setVisible(true);
        } else if (e.getSource() == this.treinoView.getjButtonExcluir()) {
            this.listTreino = new ListTreino();
            this.listTreino.setIdTreino((int) this.treinoView.getjTableListTreino().getValueAt(this.treinoView.getjTableListTreino().getSelectedRow(), 0));
            this.listTreino.setIdExercicio((int) this.treinoView.getjTableListTreino().getValueAt(this.treinoView.getjTableListTreino().getSelectedRow(), 1));
            
            if (this.listTreinoDAO.apagar(this.listTreino)) {
                this.model = (DefaultTableModel) this.treinoView.getjTableListTreino().getModel();
                this.model.removeRow(this.treinoView.getjTableListTreino().getSelectedRow());
                JOptionPane.showMessageDialog(treinoView, "Exercício Excluído!");
            }
        } else if (e.getSource() == this.treinoView.getjButtonPesquisar()) {
            ConsultaTreinoView consultaTreino = new ConsultaTreinoView();
            ConsultaTreinoController consultaTreinoController = new ConsultaTreinoController(consultaTreino, this);
            consultaTreinoController.listar("");
            consultaTreinoController.getConsultaTreinoView().setVisible(true);
        } else if (e.getSource() == this.treinoView.getjButtonSalvarTreino()) {
            if (this.treinoView.getjTextFieldNome().equals("")) {
                JOptionPane.showMessageDialog(treinoView, "O nome do treino deve ser preenchido!");
                this.treinoView.getjTextFieldNome().setFocusable(true);
            } else {
                this.treino.setNome(this.treinoView.getjTextFieldNome().getText());
                if (this.treinoDAO.salvar(this.treino)) {
                    this.treinoView.getjTextFieldId().setText(String.valueOf(this.treinoDAO.getId(this.treinoView.getjTextFieldNome().getText())));
                    this.treinoView.getjTextFieldNome().setEnabled(false);
                    this.treinoView.getjButtonSalvarTreino().setEnabled(false);
                    this.treinoView.getjButtonAdicionarExercicio().setEnabled(true);
                    this.treinoView.getjButtonExcluir().setEnabled(true);
                }
            }
        }        
    }
    
    public TreinoView getTreinoView(){
        return this.treinoView;
    }
    
    public void addExercicio(Exercicio exercicio, int idTreino) {
        this.listTreino = new ListTreino();
        this.listTreino.setIdTreino(idTreino);
        this.listTreino.setIdExercicio(exercicio.getId());
        this.listTreino.setNome(exercicio.getNome());
        this.listTreino.setTipo(exercicio.getTipoMemb());
        
        if (listTreinoDAO.salvar(this.listTreino)) {
            this.model = (DefaultTableModel) this.treinoView.getjTableListTreino().getModel();
            this.model.addRow(new Object[]{this.listTreino.getIdTreino(), this.listTreino.getIdExercicio(), this.listTreino.getNome(), this.listTreino.getTipo()});
        } else {
            JOptionPane.showMessageDialog(treinoView, "Não salvou!");
        }
    }
    
    public void setCampos(Treino treino) {
        this.treinoView.getjTextFieldId().setText(String.valueOf(treino.getId()));
        this.treinoView.getjTextFieldNome().setText(treino.getNome());
        ArrayList<ListTreino> listaTreino = this.listTreinoDAO.listar(treino.getId());
        this.model = (DefaultTableModel) this.treinoView.getjTableListTreino().getModel();

        this.model.setNumRows(0);

        for (ListTreino listTreino : listaTreino) {
            this.model.addRow(new Object[]{listTreino.getIdTreino(),listTreino.getIdExercicio(), listTreino.getNome(), listTreino.getTipo()});
        }
        this.treinoView.getjTextFieldNome().setEnabled(false);
        this.treinoView.getjButtonSalvarTreino().setEnabled(false);
        this.treinoView.getjButtonAdicionarExercicio().setEnabled(true);
        this.treinoView.getjButtonExcluir().setEnabled(true);
    }
    
}

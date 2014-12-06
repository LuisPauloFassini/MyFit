package Controller;

import Model.Exercicio;
import Model.ExercicioDAO;
import View.ConsultaExerciciosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ConsultaExercicioController implements ActionListener {
    
    private CadastrarExercicioController controllerExerc;
    private ConsultaExerciciosView consultaView = null;
    private Exercicio exercicio = new Exercicio();
    private ExercicioDAO exercicioDAO = new ExercicioDAO();
    private DefaultTableModel model;
    
    public ConsultaExercicioController(ConsultaExerciciosView view, CadastrarExercicioController controllerExercicio) {
        this.consultaView = view;
        this.controllerExerc = controllerExercicio;
        
        this.consultaView.getjTextFieldNome().addActionListener(this);
        this.consultaView.getjButtonPesquisar().addActionListener(this);
        this.consultaView.getjButtonConfirma().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == consultaView.getjButtonPesquisar()) {
            listar(consultaView.getjTextFieldNome().getText());
        } else if (e.getSource() == consultaView.getjButtonConfirma()) {
            this.exercicio.setId((int) this.consultaView.getjTableExercicios().getValueAt(consultaView.getjTableExercicios().getSelectedRow(), 0));
            this.exercicio.setNome((String) this.consultaView.getjTableExercicios().getValueAt(consultaView.getjTableExercicios().getSelectedRow(), 1));
            this.exercicio.setTipoMemb((String) this.consultaView.getjTableExercicios().getValueAt(consultaView.getjTableExercicios().getSelectedRow(), 2));
            this.exercicio.setAtivo((boolean) this.consultaView.getjTableExercicios().getValueAt(consultaView.getjTableExercicios().getSelectedRow(), 3));
            this.controllerExerc.setCampos(this.exercicio);
            this.consultaView.dispose();
        }
    }
    
    public ConsultaExerciciosView getConsultaExercicioView() {
        return this.consultaView;
    }
    
    public void listar(String nome){
       ArrayList<Exercicio> listaExercicio = this.exercicioDAO.listar(nome);
       this.model = (DefaultTableModel) this.consultaView.getjTableExercicios().getModel();

       this.model.setNumRows(0);

       for (Exercicio ex : listaExercicio) {
           this.model.addRow(new Object[]{ex.getId(),ex.getNome(), ex.getTipoMemb(), ex.isAtivo()});
       }
    }
    
}

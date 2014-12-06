package Controller;

import Model.Exercicio;
import Model.ExercicioDAO;
import View.CadastroExercicioView;
import View.ConsultaExerciciosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CadastrarExercicioController implements ActionListener{

    private CadastroExercicioView exercicioView = null;
    private Exercicio exercicio = null;
    private ExercicioDAO exercicioDAO = new ExercicioDAO();
    
    public CadastrarExercicioController(CadastroExercicioView view, Exercicio exercicio) {
        this.exercicioView = view;
        this.exercicio = exercicio;
        
        this.exercicioView.getjButtonPesquisa().addActionListener(this);
        this.exercicioView.getjButtonLimpar().addActionListener(this);
        this.exercicioView.getjButtonSalvar().addActionListener(this);
    }
    
    public CadastroExercicioView getCadastrarExercicioView() {
        return this.exercicioView;
    }
    
    public void carregarExercicio(Exercicio exerc) {
        this.exercicio = exerc;
    }
    
    public void limpar() {
        this.exercicioView.getjTextFieldId().setText("");
        this.exercicioView.getjTextFieldNome().setText("");
        this.exercicioView.getjComboBoxTipo().setSelectedIndex(0);
        this.exercicioView.getjCheckBoxAtivo().setSelected(false);
    }
    
    public void setCampos(Exercicio exercicio) {
        this.exercicioView.getjTextFieldId().setText(String.valueOf(exercicio.getId()));
        this.exercicioView.getjTextFieldNome().setText(exercicio.getNome());
        this.exercicioView.getjComboBoxTipo().setSelectedItem(exercicio.getTipoMemb());
        this.exercicioView.getjCheckBoxAtivo().setSelected(exercicio.isAtivo());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exercicioView.getjButtonSalvar()) {
            salvarExercicio();
        } else if (e.getSource() == exercicioView.getjButtonPesquisa()) {
            ConsultaExerciciosView consultaView = new ConsultaExerciciosView();
            ConsultaExercicioController consultaController = new ConsultaExercicioController(consultaView, this);
            consultaController.listar("");
            consultaController.getConsultaExercicioView().setVisible(true);
        } else if (e.getSource() == exercicioView.getjButtonLimpar()) {
            limpar();
        }
    }
    
    public void salvarExercicio() {
        String mgm;
        if (validaTela()) {
            if (this.exercicioView.getjTextFieldId().getText().equals("")) {
                this.exercicio.setId(0);
                mgm = "Exercício cadastrado com sucesso!";
            } else {
                this.exercicio.setId(Integer.valueOf(this.exercicioView.getjTextFieldId().getText()));
                mgm = "Exercício alterado com sucesso!";
            }
            this.exercicio.setNome(this.exercicioView.getjTextFieldNome().getText());
            this.exercicio.setTipoMemb(this.exercicioView.getjComboBoxTipo().getSelectedItem().toString());
            this.exercicio.setAtivo(this.exercicioView.getjCheckBoxAtivo().isSelected());
            boolean val = this.exercicioDAO.salvar(exercicio);
            if (val) {
                JOptionPane.showMessageDialog(exercicioView, mgm);
                limpar();
            }
            else JOptionPane.showMessageDialog(exercicioView, "Exercício não cadastrado!");
        } else {
            JOptionPane.showMessageDialog(exercicioView, "ERRO \n O nome do exerxíxio deve ser preenchido!");
        }
    }  
    
    public boolean validaTela() {
        boolean valido = true;
        
        if (this.exercicioView.getjTextFieldNome().getText().equals("")) valido = false;
        
        return valido;
    }
}

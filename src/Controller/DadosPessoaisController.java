package Controller;

import Model.Usuario;
import Model.UsuarioDAO;
import View.DadosPessoaisView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DadosPessoaisController implements ActionListener{
    
    private Usuario usuario = null;
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private DadosPessoaisView dadosPessoaisView = null;
    
    public DadosPessoaisController (DadosPessoaisView view) {
        this.dadosPessoaisView = view;     
        
        this.dadosPessoaisView.getjButtonAlterarSenha().addActionListener(this);
    }
    
    public DadosPessoaisView getDadosPessoais() {
        return this.dadosPessoaisView;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.dadosPessoaisView.getjButtonAlterarSenha()) {
            if (validaSenha()) {
                this.usuarioDAO.alterarSenha(this.dadosPessoaisView.getjTextFieldLogin().getText(), this.dadosPessoaisView.getjPasswordFieldAntiga().getText(), this.dadosPessoaisView.getjPasswordFieldNova().getText());
                JOptionPane.showMessageDialog(dadosPessoaisView, "Senha alterada com sucesso!");
            }
        }
    }
    
    public boolean validaSenha() {
        if (this.dadosPessoaisView.getjPasswordFieldNova().getText().equals(this.dadosPessoaisView.getjPasswordFieldConfir().getText())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(dadosPessoaisView, "A senha nova não foi confirmada!");
            return false;
        }
    }
}

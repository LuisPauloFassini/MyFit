package Controller;

import Model.FichaTecnica;
import Model.FichaTecnicaDAO;
import View.ConsultaFichaTecnicaView;
import View.FichaTecnicaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

public class FichaTecnicaController implements ActionListener {
    private FichaTecnica fichaTecnica = null;
    private FichaTecnicaDAO fichaTecnicaDAO = new FichaTecnicaDAO();
    private FichaTecnicaView fichaTecnicaView = null;
    
    public FichaTecnicaController(FichaTecnica ficha, FichaTecnicaView view) {
        this.fichaTecnica = ficha;
        this.fichaTecnicaView = view;
        
        this.fichaTecnicaView.getjBuutonSalvar().addActionListener(this);
        this.fichaTecnicaView.getjButtonPesquisar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.fichaTecnicaView.getjBuutonSalvar()) {
            salvarFichaTecnica();
        } else if (e.getSource() == this.fichaTecnicaView.getjButtonPesquisar()) {
            ConsultaFichaTecnicaView consultaView = new ConsultaFichaTecnicaView();
            ConsultaFichaTecnicaController consultaController = new ConsultaFichaTecnicaController(consultaView);
            consultaController.carregarTabela();
            consultaController.getConsultaFichaTecnicaView().setVisible(true);
        }
    }
    
    public FichaTecnicaView getFichaTecnicaView() {
        return this.fichaTecnicaView;
    }
    
    public boolean validaTela() {
        boolean valido = true;
        
        if (this.fichaTecnicaView.getjFormattedTextFieldData().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldAltura().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldPeso().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldPercGordura().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldAbdomen().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldTorax().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldCintura().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldQuadril().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldAnteDir().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldAnteEsq().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldBracoDireito().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldBracoEsq().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldCoxaDir().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldCoxaEsq().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldPantDir().getText().equals("")) valido = false;
        if (this.fichaTecnicaView.getjFormattedTextFieldPantEsq().getText().equals("")) valido = false;
        
        return valido;
    }
    
    public void limpar() {
        this.fichaTecnicaView.getjFormattedTextFieldData().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldAltura().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldPeso().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldPercGordura().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldAbdomen().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldTorax().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldCintura().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldQuadril().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldAnteDir().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldAnteEsq().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldBracoDireito().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldBracoEsq().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldCoxaDir().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldCoxaEsq().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldPantDir().setText("");
        this.fichaTecnicaView.getjFormattedTextFieldPantEsq().setText("");
    }
    
    public void salvarFichaTecnica() {
        if (validaTela()) {
            this.fichaTecnica.setData(this.fichaTecnicaView.getjFormattedTextFieldData().getText());
            this.fichaTecnica.setAltura(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldAltura().getText()));
            this.fichaTecnica.setPeso(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldPeso().getText()));
            this.fichaTecnica.setPercGordura(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldPercGordura().getText()));
            this.fichaTecnica.setAbdomen(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldAbdomen().getText()));
            this.fichaTecnica.setTorax(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldTorax().getText()));
            this.fichaTecnica.setCintura(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldCintura().getText()));
            this.fichaTecnica.setQuadril(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldQuadril().getText()));
            this.fichaTecnica.setAntDir(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldAnteDir().getText()));
            this.fichaTecnica.setAntEsq(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldAnteEsq().getText()));
            this.fichaTecnica.setBracoDir(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldBracoDireito().getText()));
            this.fichaTecnica.setBracoEsq(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldBracoEsq().getText()));
            this.fichaTecnica.setCoxaDir(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldCoxaDir().getText()));
            this.fichaTecnica.setCoxaEsq(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldCoxaEsq().getText()));
            this.fichaTecnica.setPantDir(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldPantDir().getText()));
            this.fichaTecnica.setPantEsq(Double.valueOf(this.fichaTecnicaView.getjFormattedTextFieldPantEsq().getText()));
            
            boolean valido = this.fichaTecnicaDAO.salvar(this.fichaTecnica);
            if (valido) {
                limpar();
                JOptionPane.showMessageDialog(fichaTecnicaView, "Ficha Técnica cadastrada!");
            }              
            else JOptionPane.showMessageDialog(fichaTecnicaView, "Ficha Técnica não cadastrada!");
        } else {
            JOptionPane.showMessageDialog(fichaTecnicaView, "ERRO \n Todos os campos devem estar preenchidos!");
        }
    }
}

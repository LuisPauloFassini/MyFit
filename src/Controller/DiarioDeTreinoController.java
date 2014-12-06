package Controller;

import View.DiarioDeTreinoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiarioDeTreinoController implements ActionListener {
   
    private DiarioDeTreinoView diarioView = null;

    public DiarioDeTreinoView getDiarioDeTreinoView() {
        return this.diarioView;
    }

    public DiarioDeTreinoController(DiarioDeTreinoView view) {
        this.diarioView = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}

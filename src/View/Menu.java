package View;

import Controller.CadastrarExercicioController;
import Controller.DadosPessoaisController;
import Controller.DiarioDeTreinoController;
import Controller.FichaTecnicaController;
import Controller.TreinoController;
import Model.Exercicio;
import Model.FichaTecnica;
import Model.Treino;
import Model.Usuario;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    
    private Usuario usuario = null;

    public Menu() {
        initComponents();
        this.setIconImage(Utilidades.Utilidades.adicionarIcone("/src/Images/Fitness3.png"));
        Utilidades.Utilidades.centralizarFrame(this);
    }
    
    public Menu(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.setIconImage(Utilidades.Utilidades.adicionarIcone("/src/Images/Fitness3.png"));
        Utilidades.Utilidades.centralizarFrame(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMeusDadosMenu = new javax.swing.JMenu();
        jMeusDadosMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jFichaTecMenuItem = new javax.swing.JMenuItem();
        jExercicioMenu = new javax.swing.JMenu();
        jCadExercMenuItem = new javax.swing.JMenuItem();
        jTreinosMenu = new javax.swing.JMenu();
        jCadTreinoMenuItem = new javax.swing.JMenuItem();
        jDiarioMenu = new javax.swing.JMenu();
        jCadDiarioTreiMenuItem = new javax.swing.JMenuItem();
        jRelatoriosMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyFit");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MyFitMenu.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenuBar1.setForeground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setToolTipText("");

        jMeusDadosMenu.setText("Meus Dados");

        jMeusDadosMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMeusDadosMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ficha.png"))); // NOI18N
        jMeusDadosMenuItem.setText("Dados Pessoais");
        jMeusDadosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeusDadosMenuItemActionPerformed(evt);
            }
        });
        jMeusDadosMenu.add(jMeusDadosMenuItem);
        jMeusDadosMenu.add(jSeparator3);

        jFichaTecMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jFichaTecMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meusDados3.png"))); // NOI18N
        jFichaTecMenuItem.setText("Ficha Técnica");
        jFichaTecMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFichaTecMenuItemActionPerformed(evt);
            }
        });
        jMeusDadosMenu.add(jFichaTecMenuItem);

        jMenuBar1.add(jMeusDadosMenu);

        jExercicioMenu.setText("Exercícios");

        jCadExercMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jCadExercMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exercicio3.png"))); // NOI18N
        jCadExercMenuItem.setText("Cadastro de exercício");
        jCadExercMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadExercMenuItemActionPerformed(evt);
            }
        });
        jExercicioMenu.add(jCadExercMenuItem);

        jMenuBar1.add(jExercicioMenu);

        jTreinosMenu.setText("Treinos");

        jCadTreinoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jCadTreinoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Execicios21.png"))); // NOI18N
        jCadTreinoMenuItem.setText("Cadastro de treino diário");
        jCadTreinoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadTreinoMenuItemActionPerformed(evt);
            }
        });
        jTreinosMenu.add(jCadTreinoMenuItem);

        jMenuBar1.add(jTreinosMenu);

        jDiarioMenu.setText("Diários");

        jCadDiarioTreiMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jCadDiarioTreiMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Diario.png"))); // NOI18N
        jCadDiarioTreiMenuItem.setText("Cadastro de diário de treino");
        jCadDiarioTreiMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadDiarioTreiMenuItemActionPerformed(evt);
            }
        });
        jDiarioMenu.add(jCadDiarioTreiMenuItem);

        jMenuBar1.add(jDiarioMenu);

        jRelatoriosMenu.setText("Relatórios");
        jMenuBar1.add(jRelatoriosMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCadDiarioTreiMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadDiarioTreiMenuItemActionPerformed
        DiarioDeTreinoView diarioView = new DiarioDeTreinoView();
        DiarioDeTreinoController diarioController = new DiarioDeTreinoController(diarioView);
        diarioController.getDiarioDeTreinoView().getjButtonAdicionarTreino().setEnabled(false);
        diarioController.getDiarioDeTreinoView().getjButtonExcluir().setEnabled(false);
        diarioController.getDiarioDeTreinoView().getjTableListDiario().setEnabled(false);
        diarioController.getDiarioDeTreinoView().getjButtonSalvarListDiario().setEnabled(false);
        diarioController.getDiarioDeTreinoView().setVisible(true);
    }//GEN-LAST:event_jCadDiarioTreiMenuItemActionPerformed

    private void jCadExercMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadExercMenuItemActionPerformed
        CadastroExercicioView cad = new CadastroExercicioView();
        Exercicio exerc = new Exercicio();
        CadastrarExercicioController controllerExercicio = new CadastrarExercicioController(cad, exerc);
        controllerExercicio.getCadastrarExercicioView().setVisible(true);
    }//GEN-LAST:event_jCadExercMenuItemActionPerformed

    private void jFichaTecMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFichaTecMenuItemActionPerformed
        FichaTecnicaView fichaView = new FichaTecnicaView();
        FichaTecnica fichaTecnica = new FichaTecnica();
        FichaTecnicaController fichaController = new FichaTecnicaController(fichaTecnica, fichaView);
        fichaController.getFichaTecnicaView().setVisible(true);
    }//GEN-LAST:event_jFichaTecMenuItemActionPerformed

    private void jMeusDadosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeusDadosMenuItemActionPerformed
        DadosPessoaisView dadosPessoaisView = new DadosPessoaisView();
        DadosPessoaisController dadosPessoaisController = new DadosPessoaisController(dadosPessoaisView);
        dadosPessoaisController.getDadosPessoais().getjTextFieldNome().setText(this.usuario.getNome() + " " + this.usuario.getSobrenome());
        dadosPessoaisController.getDadosPessoais().getjTextFieldLogin().setText(this.usuario.getLogin());
        dadosPessoaisController.getDadosPessoais().setVisible(true);
    }//GEN-LAST:event_jMeusDadosMenuItemActionPerformed

    private void jCadTreinoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadTreinoMenuItemActionPerformed
        Treino treino = new Treino();
        TreinoView treinoView = new TreinoView();
        TreinoController treinoController = new TreinoController(treino, treinoView);
        treinoController.getTreinoView().getjButtonAdicionarExercicio().setEnabled(false);
        treinoController.getTreinoView().getjButtonExcluir().setEnabled(false);
        treinoController.getTreinoView().setVisible(true);
    }//GEN-LAST:event_jCadTreinoMenuItemActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCadDiarioTreiMenuItem;
    private javax.swing.JMenuItem jCadExercMenuItem;
    private javax.swing.JMenuItem jCadTreinoMenuItem;
    private javax.swing.JMenu jDiarioMenu;
    private javax.swing.JMenu jExercicioMenu;
    private javax.swing.JMenuItem jFichaTecMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMeusDadosMenu;
    private javax.swing.JMenuItem jMeusDadosMenuItem;
    private javax.swing.JMenu jRelatoriosMenu;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu jTreinosMenu;
    // End of variables declaration//GEN-END:variables
}

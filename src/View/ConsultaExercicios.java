package View;

import Model.Exercicio;
import Model.ExercicioDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ConsultaExercicios extends javax.swing.JDialog {
    private Exercicio exercicio = new Exercicio();
    private ExercicioDAO exercicioDAO = new ExercicioDAO();
    private DefaultTableModel model;
    private CadastroExercicio cadastroExercicio;

    public ConsultaExercicios(CadastroExercicio cadastroExerc) {
        initComponents();
        listar("");
        this.cadastroExercicio = cadastroExerc;
    }
    
    public ConsultaExercicios() {
        initComponents();
    }
    
    public void listar(String nome){
        ArrayList<Exercicio> listaExercicio = this.exercicioDAO.listar(nome);
        this.model = (DefaultTableModel) jTable1.getModel();
        
        this.model.setRowCount(0);
            
        for (Exercicio ex : listaExercicio) {
            this.model.addRow(new Object[]{ex.getId(),ex.getNome(), ex.getTipoMemb(), ex.isAtivo()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPesquisar = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonConfirma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Exercícios");
        setResizable(false);

        jPanelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabelNome.setText("Nome:");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa2.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addContainerGap())
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPesquisarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonPesquisar, jLabelNome, jTextFieldNome});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/confirmar.png"))); // NOI18N
        jButtonConfirma.setText("Confirmar");
        jButtonConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirma)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonConfirma)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        listar(this.jTextFieldNome.getText());
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmaActionPerformed

    }//GEN-LAST:event_jButtonConfirmaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaExercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirma;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}

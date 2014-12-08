package View;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DiarioDeTreinoView extends javax.swing.JFrame {

    public DiarioDeTreinoView() {
        initComponents();
        this.jTextFieldidDiario.setVisible(false);
        this.jTextFieldIdTreino.setVisible(false);
        Utilidades.Utilidades.centralizarFrame(this);
        this.setIconImage(Utilidades.Utilidades.adicionarIcone("/src/Images/treinoDiario.png"));
    }

    public JButton getjButtonAdicionarTreino() {
        return jButtonAdicionarTreino;
    }

    public JTextField getjTextFieldIdTreino() {
        return jTextFieldIdTreino;
    }

    public void setjTextFieldIdTreino(JTextField jTextFieldIdTreino) {
        this.jTextFieldIdTreino = jTextFieldIdTreino;
    }

    public JButton getjButtonSalvarListDiario() {
        return jButtonSalvarListDiario;
    }

    public JTextField getjTextFieldidDiario() {
        return jTextFieldidDiario;
    }

    public void setjTextFieldidDiario(JTextField jTextFieldidDiario) {
        this.jTextFieldidDiario = jTextFieldidDiario;
    }

    public void setjButtonSalvarListDiario(JButton jButtonSalvarListDiario) {
        this.jButtonSalvarListDiario = jButtonSalvarListDiario;
    }

    public void setjButtonAdicionarTreino(JButton jButtonAdicionarTreino) {
        this.jButtonAdicionarTreino = jButtonAdicionarTreino;
    }

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public void setjButtonExcluir(JButton jButtonExcluir) {
        this.jButtonExcluir = jButtonExcluir;
    }

    public JButton getjButtonSalvarDiario() {
        return jButtonSalvarDiario;
    }

    public void setjButtonSalvarDiario(JButton jButtonSalvarDiario) {
        this.jButtonSalvarDiario = jButtonSalvarDiario;
    }

    public JFormattedTextField getjFormattedTextFieldData() {
        return jFormattedTextFieldData;
    }

    public void setjFormattedTextFieldData(JFormattedTextField jFormattedTextFieldData) {
        this.jFormattedTextFieldData = jFormattedTextFieldData;
    }

    public JTable getjTableListDiario() {
        return jTableListDiario;
    }

    public void setjTableListDiario(JTable jTableListDiario) {
        this.jTableListDiario = jTableListDiario;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelData = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jLabelObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAdicionarTreino = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableListDiario = new javax.swing.JTable();
        jButtonSalvarDiario = new javax.swing.JButton();
        jButtonSalvarListDiario = new javax.swing.JButton();
        jTextFieldidDiario = new javax.swing.JTextField();
        jTextFieldIdTreino = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diário de Treino");
        setResizable(false);

        jLabelData.setText("Data:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelObs.setText("Observação:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonAdicionarTreino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        jButtonAdicionarTreino.setText("Adicionar Treino");

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deletar.png"))); // NOI18N
        jButtonExcluir.setText("Excluir Treino");

        jTableListDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Diario", "Id Exercicio", "Nome", "Series", "Repetições", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableListDiario);

        jButtonSalvarDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButtonSalvarDiario.setText("Salvar Diário");

        jButtonSalvarListDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButtonSalvarListDiario.setText("Salvar Lista de Exercícios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdicionarTreino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarListDiario))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvarDiario)
                                .addGap(26, 26, 26)
                                .addComponent(jTextFieldidDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarDiario)
                    .addComponent(jTextFieldidDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonAdicionarTreino)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvarListDiario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarTreino;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvarDiario;
    private javax.swing.JButton jButtonSalvarListDiario;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelObs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableListDiario;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldIdTreino;
    private javax.swing.JTextField jTextFieldidDiario;
    // End of variables declaration//GEN-END:variables
}

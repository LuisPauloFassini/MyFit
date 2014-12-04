package View;

import Model.Usuario;
import Model.UsuarioDAO;
import javax.swing.JOptionPane;

public class AlterarSenha extends javax.swing.JFrame {
    
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public AlterarSenha(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAntigaSenha = new javax.swing.JLabel();
        jLabelSenhaNova = new javax.swing.JLabel();
        jLabelConfir = new javax.swing.JLabel();
        jPasswordFieldAntiga = new javax.swing.JPasswordField();
        jPasswordFieldNova = new javax.swing.JPasswordField();
        jPasswordFieldConfirm = new javax.swing.JPasswordField();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");

        jLabelAntigaSenha.setText("Senha Antiga:");

        jLabelSenhaNova.setText("Senha Nova:");

        jLabelConfir.setText("Confirmar Senha:");

        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/confirmar.png"))); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAntigaSenha)
                            .addComponent(jLabelSenhaNova)
                            .addComponent(jLabelConfir))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldAntiga)
                            .addComponent(jPasswordFieldNova)
                            .addComponent(jPasswordFieldConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAntigaSenha)
                    .addComponent(jPasswordFieldAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenhaNova)
                    .addComponent(jPasswordFieldNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfir)
                    .addComponent(jPasswordFieldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        if (validaSenha()) this.usuarioDAO.alterarSenha(this.usuario.getId(), this.usuario.getLogin(), this.jPasswordFieldAntiga.getText(), this.jPasswordFieldNova.getText());
        else JOptionPane.showMessageDialog(rootPane, "A nova senha não foi confirmada!");
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    public boolean validaSenha() {
        if (this.jPasswordFieldNova.getText().equals(this.jPasswordFieldConfirm.getText()))  return true;
        else return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabelAntigaSenha;
    private javax.swing.JLabel jLabelConfir;
    private javax.swing.JLabel jLabelSenhaNova;
    private javax.swing.JPasswordField jPasswordFieldAntiga;
    private javax.swing.JPasswordField jPasswordFieldConfirm;
    private javax.swing.JPasswordField jPasswordFieldNova;
    // End of variables declaration//GEN-END:variables
}

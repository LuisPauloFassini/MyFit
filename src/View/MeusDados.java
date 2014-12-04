package View;

import Model.Usuario;
import javax.swing.ImageIcon;

public class MeusDados extends javax.swing.JFrame {

    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public MeusDados(Usuario usuario) {
        initComponents();
        this.setUsuario(usuario);
        setarCampos();
    }
    
    public MeusDados() {
        initComponents();
    }

    public void setarCampos() {
        this.jTextFieldNome.setText(usuario.getNome());
        this.jTextFieldLogin.setText(usuario.getLogin());
        this.jTextFieldSobrenome.setText(usuario.getSobrenome());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelSobrenome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonAltSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Meus Dados");
        setIconImage(new ImageIcon("C:\\Users\\Luís Paulo\\Documents\\NetBeansProjects\\MyFit\\src\\Images\\MeusDados3.png").getImage());
        setResizable(false);

        jLabelNome.setText("Nome:");

        jLabelSobrenome.setText("Sobrenome:");

        jLabel1.setText("Login:");

        jTextFieldLogin.setEnabled(false);

        jButtonAltSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/senha.png"))); // NOI18N
        jButtonAltSenha.setText("Alterar Senha");
        jButtonAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltSenhaActionPerformed(evt);
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
                            .addComponent(jLabelSobrenome)
                            .addComponent(jLabel1)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldSobrenome)
                            .addComponent(jTextFieldLogin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 231, Short.MAX_VALUE)
                        .addComponent(jButtonAltSenha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSobrenome)
                    .addComponent(jTextFieldSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAltSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltSenhaActionPerformed
        AlterarSenha alterar = new AlterarSenha(this.usuario);
        alterar.setVisible(true);
    }//GEN-LAST:event_jButtonAltSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MeusDados().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSobrenome;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}

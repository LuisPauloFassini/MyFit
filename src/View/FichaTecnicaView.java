package View;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class FichaTecnicaView extends javax.swing.JFrame {

    public FichaTecnicaView() {
        initComponents();
        Utilidades.Utilidades.centralizarFrame(this);
        this.setIconImage(Utilidades.Utilidades.adicionarIcone("/src/Images/meusDados3.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelData = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jPanelDadosGerais = new javax.swing.JPanel();
        jLabelAltura = new javax.swing.JLabel();
        jFormattedTextFieldAltura = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldPeso = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldPercGordura = new javax.swing.JFormattedTextField();
        jPanelPerimetros = new javax.swing.JPanel();
        jLabelAbdomen = new javax.swing.JLabel();
        jFormattedTextFieldAbdomen = new javax.swing.JFormattedTextField();
        jLabelTorax = new javax.swing.JLabel();
        jFormattedTextFieldTorax = new javax.swing.JFormattedTextField();
        jLabelQuadril = new javax.swing.JLabel();
        jFormattedTextFieldQuadril = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCintura = new javax.swing.JFormattedTextField();
        jPanelAnteBraco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldAnteDir = new javax.swing.JFormattedTextField();
        jFormattedTextFieldAnteEsq = new javax.swing.JFormattedTextField();
        jPanelBraco = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextFieldBracoDireito = new javax.swing.JFormattedTextField();
        jFormattedTextFieldBracoEsq = new javax.swing.JFormattedTextField();
        jPanelCoxa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextFieldCoxaDir = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCoxaEsq = new javax.swing.JFormattedTextField();
        jPanelPanturrilha = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextFieldPantDir = new javax.swing.JFormattedTextField();
        jFormattedTextFieldPantEsq = new javax.swing.JFormattedTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ficha Técnica");
        setResizable(false);

        jLabelData.setText("Data da Avaliação:");

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanelDadosGerais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Gerais"));

        jLabelAltura.setText("Altura (cm):");

        try {
            jFormattedTextFieldAltura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Peso (Kg):");

        try {
            jFormattedTextFieldPeso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("% de Gordura:");

        try {
            jFormattedTextFieldPercGordura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelDadosGeraisLayout = new javax.swing.GroupLayout(jPanelDadosGerais);
        jPanelDadosGerais.setLayout(jPanelDadosGeraisLayout);
        jPanelDadosGeraisLayout.setHorizontalGroup(
            jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelAltura)
                    .addComponent(jFormattedTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldPercGordura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanelDadosGeraisLayout.setVerticalGroup(
            jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosGeraisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelAltura)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jFormattedTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPercGordura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelPerimetros.setBorder(javax.swing.BorderFactory.createTitledBorder("Perímetros (cm)"));

        jLabelAbdomen.setText("Abdomen:");

        try {
            jFormattedTextFieldAbdomen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelTorax.setText("Tórax:");

        try {
            jFormattedTextFieldTorax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelQuadril.setText("Quadril:");

        try {
            jFormattedTextFieldQuadril.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Cintura:");

        try {
            jFormattedTextFieldCintura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanelAnteBraco.setBorder(javax.swing.BorderFactory.createTitledBorder("Antebraço"));

        jLabel4.setText("Direito:");

        jLabel5.setText("Esquerdo:");

        try {
            jFormattedTextFieldAnteDir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldAnteEsq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelAnteBracoLayout = new javax.swing.GroupLayout(jPanelAnteBraco);
        jPanelAnteBraco.setLayout(jPanelAnteBracoLayout);
        jPanelAnteBracoLayout.setHorizontalGroup(
            jPanelAnteBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnteBracoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldAnteDir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldAnteEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAnteBracoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldAnteDir, jFormattedTextFieldAnteEsq});

        jPanelAnteBracoLayout.setVerticalGroup(
            jPanelAnteBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnteBracoLayout.createSequentialGroup()
                .addGroup(jPanelAnteBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldAnteDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldAnteEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBraco.setBorder(javax.swing.BorderFactory.createTitledBorder("Braço"));

        jLabel6.setText("Direito:");

        jLabel7.setText("Esquerdo:");

        try {
            jFormattedTextFieldBracoDireito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldBracoEsq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelBracoLayout = new javax.swing.GroupLayout(jPanelBraco);
        jPanelBraco.setLayout(jPanelBracoLayout);
        jPanelBracoLayout.setHorizontalGroup(
            jPanelBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBracoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(jFormattedTextFieldBracoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldBracoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBracoLayout.setVerticalGroup(
            jPanelBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBracoLayout.createSequentialGroup()
                .addGroup(jPanelBracoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldBracoDireito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldBracoEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanelCoxa.setBorder(javax.swing.BorderFactory.createTitledBorder("Coxa"));

        jLabel8.setText("Direito:");

        jLabel9.setText("Esquerdo:");

        try {
            jFormattedTextFieldCoxaDir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldCoxaEsq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelCoxaLayout = new javax.swing.GroupLayout(jPanelCoxa);
        jPanelCoxa.setLayout(jPanelCoxaLayout);
        jPanelCoxaLayout.setHorizontalGroup(
            jPanelCoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoxaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCoxaDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCoxaLayout.setVerticalGroup(
            jPanelCoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoxaLayout.createSequentialGroup()
                .addGroup(jPanelCoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextFieldCoxaDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldCoxaEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanelPanturrilha.setBorder(javax.swing.BorderFactory.createTitledBorder("Panturrilha"));

        jLabel10.setText("Direito:");

        jLabel11.setText("Esquerdo:");

        try {
            jFormattedTextFieldPantDir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldPantEsq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelPanturrilhaLayout = new javax.swing.GroupLayout(jPanelPanturrilha);
        jPanelPanturrilha.setLayout(jPanelPanturrilhaLayout);
        jPanelPanturrilhaLayout.setHorizontalGroup(
            jPanelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanturrilhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldPantDir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldPantEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPanturrilhaLayout.setVerticalGroup(
            jPanelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanturrilhaLayout.createSequentialGroup()
                .addGroup(jPanelPanturrilhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jFormattedTextFieldPantDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldPantEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPerimetrosLayout = new javax.swing.GroupLayout(jPanelPerimetros);
        jPanelPerimetros.setLayout(jPanelPerimetrosLayout);
        jPanelPerimetrosLayout.setHorizontalGroup(
            jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerimetrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelPanturrilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPerimetrosLayout.createSequentialGroup()
                        .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuadril, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAbdomen, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPerimetrosLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabelTorax))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldTorax)
                            .addComponent(jFormattedTextFieldCintura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelBraco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAnteBraco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCoxa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPerimetrosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldAbdomen, jFormattedTextFieldQuadril, jFormattedTextFieldTorax});

        jPanelPerimetrosLayout.setVerticalGroup(
            jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerimetrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbdomen)
                    .addComponent(jFormattedTextFieldAbdomen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTorax)
                    .addComponent(jFormattedTextFieldTorax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPerimetrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuadril)
                    .addComponent(jFormattedTextFieldQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldCintura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAnteBraco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBraco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCoxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPanturrilha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelPerimetrosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanelAnteBraco, jPanelBraco, jPanelCoxa, jPanelPanturrilha});

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa2.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jPanelDadosGerais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelPerimetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanelDadosGerais, jPanelPerimetros});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPerimetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjBuutonSalvar() {
        return jButtonSalvar;
    }

    public void setjButtonSalvar(JButton jButtonConfirmar) {
        this.jButtonSalvar = jButtonConfirmar;
    }

    public JFormattedTextField getjFormattedTextFieldTorax() {
        return jFormattedTextFieldTorax;
    }

    public void setjFormattedTextFieldTorax(JFormattedTextField jFormattedTextFieldTorax) {
        this.jFormattedTextFieldTorax = jFormattedTextFieldTorax;
    }

    public JFormattedTextField getjFormattedTextFieldPercGordura() {
        return jFormattedTextFieldPercGordura;
    }

    public void setjFormattedTextFieldPercGordura(JFormattedTextField jFormattedTextFieldPercGordura) {
        this.jFormattedTextFieldPercGordura = jFormattedTextFieldPercGordura;
    }

    public JButton getjButtonPesquisar() {
        return jButtonPesquisar;
    }

    public void setjButtonPesquisar(JButton jButtonPesquisar) {
        this.jButtonPesquisar = jButtonPesquisar;
    }

    public JFormattedTextField getjFormattedTextFieldAbdomen() {
        return jFormattedTextFieldAbdomen;
    }

    public void setjFormattedTextFieldAbdomen(JFormattedTextField jFormattedTextFieldAbdomen) {
        this.jFormattedTextFieldAbdomen = jFormattedTextFieldAbdomen;
    }

    public JFormattedTextField getjFormattedTextFieldAltura() {
        return jFormattedTextFieldAltura;
    }

    public void setjFormattedTextFieldAltura(JFormattedTextField jFormattedTextFieldAltura) {
        this.jFormattedTextFieldAltura = jFormattedTextFieldAltura;
    }

    public JFormattedTextField getjFormattedTextFieldAnteDir() {
        return jFormattedTextFieldAnteDir;
    }

    public void setjFormattedTextFieldAnteDir(JFormattedTextField jFormattedTextFieldAnteDir) {
        this.jFormattedTextFieldAnteDir = jFormattedTextFieldAnteDir;
    }

    public JFormattedTextField getjFormattedTextFieldAnteEsq() {
        return jFormattedTextFieldAnteEsq;
    }

    public void setjFormattedTextFieldAnteEsq(JFormattedTextField jFormattedTextFieldAnteEsq) {
        this.jFormattedTextFieldAnteEsq = jFormattedTextFieldAnteEsq;
    }

    public JFormattedTextField getjFormattedTextFieldBracoDireito() {
        return jFormattedTextFieldBracoDireito;
    }

    public void setjFormattedTextFieldBracoDireito(JFormattedTextField jFormattedTextFieldBracoDireito) {
        this.jFormattedTextFieldBracoDireito = jFormattedTextFieldBracoDireito;
    }

    public JFormattedTextField getjFormattedTextFieldBracoEsq() {
        return jFormattedTextFieldBracoEsq;
    }

    public void setjFormattedTextFieldBracoEsq(JFormattedTextField jFormattedTextFieldBracoEsq) {
        this.jFormattedTextFieldBracoEsq = jFormattedTextFieldBracoEsq;
    }

    public JFormattedTextField getjFormattedTextFieldCintura() {
        return jFormattedTextFieldCintura;
    }

    public void setjFormattedTextFieldCintura(JFormattedTextField jFormattedTextFieldCintura) {
        this.jFormattedTextFieldCintura = jFormattedTextFieldCintura;
    }

    public JFormattedTextField getjFormattedTextFieldCoxaDir() {
        return jFormattedTextFieldCoxaDir;
    }

    public void setjFormattedTextFieldCoxaDir(JFormattedTextField jFormattedTextFieldCoxaDir) {
        this.jFormattedTextFieldCoxaDir = jFormattedTextFieldCoxaDir;
    }

    public JFormattedTextField getjFormattedTextFieldCoxaEsq() {
        return jFormattedTextFieldCoxaEsq;
    }

    public void setjFormattedTextFieldCoxaEsq(JFormattedTextField jFormattedTextFieldCoxaEsq) {
        this.jFormattedTextFieldCoxaEsq = jFormattedTextFieldCoxaEsq;
    }

    public JFormattedTextField getjFormattedTextFieldData() {
        return jFormattedTextFieldData;
    }

    public void setjFormattedTextFieldData(JFormattedTextField jFormattedTextFieldData) {
        this.jFormattedTextFieldData = jFormattedTextFieldData;
    }

    public JFormattedTextField getjFormattedTextFieldPantDir() {
        return jFormattedTextFieldPantDir;
    }

    public void setjFormattedTextFieldPantDir(JFormattedTextField jFormattedTextFieldPantDir) {
        this.jFormattedTextFieldPantDir = jFormattedTextFieldPantDir;
    }

    public JFormattedTextField getjFormattedTextFieldPantEsq() {
        return jFormattedTextFieldPantEsq;
    }

    public void setjFormattedTextFieldPantEsq(JFormattedTextField jFormattedTextFieldPantEsq) {
        this.jFormattedTextFieldPantEsq = jFormattedTextFieldPantEsq;
    }

    public JFormattedTextField getjFormattedTextFieldPeso() {
        return jFormattedTextFieldPeso;
    }

    public void setjFormattedTextFieldPeso(JFormattedTextField jFormattedTextFieldPeso) {
        this.jFormattedTextFieldPeso = jFormattedTextFieldPeso;
    }

    public JFormattedTextField getjFormattedTextFieldQuadril() {
        return jFormattedTextFieldQuadril;
    }

    public void setjFormattedTextFieldQuadril(JFormattedTextField jFormattedTextFieldQuadril) {
        this.jFormattedTextFieldQuadril = jFormattedTextFieldQuadril;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldAbdomen;
    private javax.swing.JFormattedTextField jFormattedTextFieldAltura;
    private javax.swing.JFormattedTextField jFormattedTextFieldAnteDir;
    private javax.swing.JFormattedTextField jFormattedTextFieldAnteEsq;
    private javax.swing.JFormattedTextField jFormattedTextFieldBracoDireito;
    private javax.swing.JFormattedTextField jFormattedTextFieldBracoEsq;
    private javax.swing.JFormattedTextField jFormattedTextFieldCintura;
    private javax.swing.JFormattedTextField jFormattedTextFieldCoxaDir;
    private javax.swing.JFormattedTextField jFormattedTextFieldCoxaEsq;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JFormattedTextField jFormattedTextFieldPantDir;
    private javax.swing.JFormattedTextField jFormattedTextFieldPantEsq;
    private javax.swing.JFormattedTextField jFormattedTextFieldPercGordura;
    private javax.swing.JFormattedTextField jFormattedTextFieldPeso;
    private javax.swing.JFormattedTextField jFormattedTextFieldQuadril;
    private javax.swing.JFormattedTextField jFormattedTextFieldTorax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAbdomen;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelQuadril;
    private javax.swing.JLabel jLabelTorax;
    private javax.swing.JPanel jPanelAnteBraco;
    private javax.swing.JPanel jPanelBraco;
    private javax.swing.JPanel jPanelCoxa;
    private javax.swing.JPanel jPanelDadosGerais;
    private javax.swing.JPanel jPanelPanturrilha;
    private javax.swing.JPanel jPanelPerimetros;
    // End of variables declaration//GEN-END:variables
}

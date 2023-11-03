
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class CadastroVeiculo extends javax.swing.JFrame {

    public CadastroVeiculo() {

        initComponents();

    }

    private TelaInicial parent;

    public String obterHora() {

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
        String dataFormatada = formatar.format(data);
        return dataFormatada;
    }

    public CadastroVeiculo(TelaInicial t) {
        this.parent = t;
        initComponents();
        labelTeste.setText(obterHora());
        setTitle("EasyPark Software");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/trabalho.png"));
        setIconImage(icon.getImage());

    }

    public CadastroVeiculo(TelaInicial t, Veiculo v) {
        this(t);
        if (v != null) {
            tfnomeCondutor.setText(v.getNomeCondutor());
            seletorAutomovel.setSelectedItem(v.getAutomovel());
            tfPlaca.setText(v.getPlacaVeiculo());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfnomeCondutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        seletorAutomovel = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        labelTeste = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cadastro de Automóvel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 6, -1, -1));

        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Informe os dados cadastrais!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 721, -1));

        tfnomeCondutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomeCondutorActionPerformed(evt);
            }
        });
        getContentPane().add(tfnomeCondutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 364, -1));

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Nome do Condutor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(tfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 364, -1));

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Placa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Hora de Entrada:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText("Tipo de Automóvel");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        seletorAutomovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        seletorAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletorAutomovelActionPerformed(evt);
            }
        });
        getContentPane().add(seletorAutomovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 100, 30));

        labelTeste.setForeground(new java.awt.Color(242, 242, 242));
        labelTeste.setText("jLabel7");
        getContentPane().add(labelTeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fundoeasy.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnomeCondutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomeCondutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomeCondutorActionPerformed

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void seletorAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletorAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seletorAutomovelActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = tfnomeCondutor.getText();
        String tipo = (String) seletorAutomovel.getSelectedItem();
        String placa = tfPlaca.getText();
        int deuCerto = 1;
        int valorLabel = 20;
        String horas = labelTeste.getText();

        if (nome.isEmpty() || tipo.isEmpty() || placa.isEmpty() || horas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Os campos devem ser preenchidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            VeiculoFactory factory;
            Veiculo v;

            if (tipo.equals("Carro")) {
                factory = new CarroFactory();
                v = factory.criarVeiculo(nome, horas, placa);
            } else if (tipo.equals("Moto")) {
                factory = new MotoFactory();
                v = factory.criarVeiculo(nome, horas, placa);
            } else {
                JOptionPane.showMessageDialog(this, "Tipo de automóvel inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //cria um Visitor (VeiculoInfoVisitor)
            VeiculoInfoVisitor infoVisitor = new VeiculoInfoVisitor();
            v.accept(infoVisitor);
            if (parent.addVeiculo(v)) {
                salvarVeiculo(v);
                deuCerto = 2;
                int novoValor = Integer.parseInt(parent.vagasLabel.getText()) - 1;
                parent.atualizaLabel(novoValor);
                JOptionPane.showMessageDialog(parent, "Cadastro efetuado com sucesso!");
                JOptionPane.showMessageDialog(this, "Ticket sendo impresso.");

                TicketDialog ticketDialog = new TicketDialog(v, infoVisitor);
                ticketDialog.setVisible(true);
                this.dispose();

                // chama o método accept no veículo para realizar a visita
                v.accept(infoVisitor);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void salvarVeiculo(Veiculo v) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados.txt", true))) {
            String linha = v.getNomeCondutor() + ";" + v.getAutomovel() + ";" + v.getPlacaVeiculo() + ";" + v.getHoraEntrada();
            writer.write(linha);
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent, "Erro ao salvar os dados no arquivo.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel labelTeste;
    private javax.swing.JComboBox<String> seletorAutomovel;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfnomeCondutor;
    // End of variables declaration//GEN-END:variables
}

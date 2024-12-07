/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.ControllerArquivoTextoPartidas;
import java.util.ArrayList;
import model.Partidas;

/**
 *
 * @author Taynara Garcia Teixeira
 */
public class TelaBuscarPartidas extends javax.swing.JFrame {
    
    ControllerArquivoTextoPartidas controle = new ControllerArquivoTextoPartidas();
    Partidas partida = new Partidas();

    /**
     * Creates new form TelaBuscarJogador
     */
    public TelaBuscarPartidas() {
        initComponents();
    }
    
    public void listaPartidas(){
        try{
            DefaultTableModel model = (DefaultTableModel)tabelaPartidas.getModel();
            model.setNumRows(0);

            for(Partidas p: controle.getPartidas()){
                model.addRow(new Object[]{
                        p.getId(),
                        p.getJogador(),
                        p.getCampeao(),
                        p.getPosicao(),
                        p.getFuncao_part(),
                        p.getTipo()
                    });
            }
        }
        catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro ao listar dados!");
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

        buscaJogador = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelBusca = new javax.swing.JLabel();
        cBoxTipoBusca = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPartidas = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        jButtonLer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Buscar Partidas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        buscaJogador.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        buscaJogador.setForeground(new java.awt.Color(51, 51, 51));
        buscaJogador.setText("BUSCAR PARTIDAS");
        buscaJogador.setIconTextGap(5);

        buttonSair.setBackground(new java.awt.Color(0, 51, 51));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 0), null));

        jLabelBusca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBusca.setText("Buscar por:");

        cBoxTipoBusca.setBackground(new java.awt.Color(204, 204, 204));
        cBoxTipoBusca.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        cBoxTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jogador", "Campeão", "ID" }));

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tabelaPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PARTIDA", "JOGADOR", "CAMPEÃO ESCOLHIDO", "ROTA", "FUNÇÃO", "TIPO DO JOGO"
            }
        ));
        tabelaPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPartidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPartidas);
        if (tabelaPartidas.getColumnModel().getColumnCount() > 0) {
            tabelaPartidas.getColumnModel().getColumn(0).setPreferredWidth(75);
            tabelaPartidas.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        buttonEditar.setBackground(new java.awt.Color(0, 102, 52));
        buttonEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEditar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setBackground(new java.awt.Color(211, 0, 0));
        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        jButtonLer.setBackground(new java.awt.Color(0, 102, 153));
        jButtonLer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonLer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLer.setText("Ler");
        jButtonLer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLerMouseClicked(evt);
            }
        });
        jButtonLer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Selecione uma partida para Editar ou Excluir!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cBoxTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelBusca)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLer, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelBusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscaJogador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(834, 529));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        DefaultTableModel model = (DefaultTableModel) tabelaPartidas.getModel();
        model.setNumRows(0); 

        String escolha = cBoxTipoBusca.getSelectedItem().toString(); //obtém o tipo de busca por Nome ou ID
        String pesquisa = txtPesquisa.getText().toLowerCase(); 

        List<Partidas> listaFiltrada = new ArrayList<>();
        
        if (pesquisa.isEmpty()) {
            listaFiltrada = controle.getPartidas(); //se o campo estiver vazio, mostra todos os dados
        } else if (escolha.equals("Jogador")) {
            listaFiltrada = controle.getPartidas().stream()
                    .filter(p -> p.getJogador().toLowerCase().contains(pesquisa))
                    .toList();
        } else if (escolha.equals("Campeão")) {
            listaFiltrada = controle.getPartidas().stream()
                    .filter(p -> p.getCampeao().toLowerCase().contains(pesquisa))
                    .toList();
        } else if (escolha.equals("ID")) {
            try {
                int idPesquisa = Integer.parseInt(pesquisa);
                listaFiltrada = controle.getPartidas().stream()
                        .filter(p -> p.getId() == idPesquisa)
                        .toList();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Insira um código válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        for (Partidas p : listaFiltrada) {
            model.addRow(new Object[]{
                p.getId(),
                p.getJogador(),
                p.getCampeao(),
                p.getPosicao(),
                p.getFuncao_part(),
                p.getTipo()
            });
        }

        tabelaPartidas.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabelaPartidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPartidasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPartidasMouseClicked

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (tabelaPartidas.getSelectedRow() != -1) {
            int linha = tabelaPartidas.getSelectedRow();
            int idPartida = (int) tabelaPartidas.getValueAt(linha, 0);
            
            Partidas partidaSelecionada = controle.buscarPartidas(idPartida);
            
            if (partidaSelecionada != null) {
                TelaPartidas telaPartida = new TelaPartidas(); //envia os dados da partida selecionada para a telaPartidas
                telaPartida.recebeDadosPartida(partidaSelecionada);
                telaPartida.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Partida não encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma partida para editar.");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
      int confirma = JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja excluir partida?", "CONFIRMAÇÃO DE EXCLUSÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(confirma == JOptionPane.YES_OPTION){
            if(tabelaPartidas.getSelectedRow() != -1){
                int id = (int) tabelaPartidas.getValueAt(tabelaPartidas.getSelectedRow(), 0);
                
                controle.removePartida(id);
                carregarTabela();
                JOptionPane.showMessageDialog(this, "Partida excluída com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Selecione uma partida para excluir!");
            }
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 
    }//GEN-LAST:event_formWindowActivated

    private void jButtonLerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLerMouseClicked

    }//GEN-LAST:event_jButtonLerMouseClicked

    private void jButtonLerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLerActionPerformed
        controle.lerPartida(-1);
        listaPartidas();
    }//GEN-LAST:event_jButtonLerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscarPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscarPartidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscaJogador;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonSair;
    private javax.swing.JComboBox<String> cBoxTipoBusca;
    private javax.swing.JButton jButtonLer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPartidas;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    //atualiza a tabela apos exclusão da partida
    private void carregarTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelaPartidas.getModel();
        model.setNumRows(0);

        for (Partidas p : controle.getPartidas()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getJogador(),
                p.getCampeao(),
                p.getPosicao(),
                p.getFuncao_part(),
                p.getTipo()
            });
        }
    }

}

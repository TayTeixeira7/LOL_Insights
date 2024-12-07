/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerArquivoTextoPartidas;
import javax.swing.JOptionPane;
import model.Partidas;

/**
 *
 * @author Taynara Garcia Teixeira
 */
public class TelaPartidas extends javax.swing.JFrame {
    
    ControllerArquivoTextoPartidas controle = new ControllerArquivoTextoPartidas();
    Partidas partida = new Partidas();

    /**
     * Creates new form TelaPartidas
     */
    public TelaPartidas() {
        initComponents();
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
        ButtonSairUser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelJogador = new javax.swing.JLabel();
        jLabelFuncao = new javax.swing.JLabel();
        jTextFieldJogador = new javax.swing.JTextField();
        jTextFieldCampeao = new javax.swing.JTextField();
        jLabelCampeao = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jComboBoxFuncao = new javax.swing.JComboBox<>();
        jLabelRota = new javax.swing.JLabel();
        jComboBoxRota = new javax.swing.JComboBox<>();
        jLabelIDPartida = new javax.swing.JLabel();
        jTextFieldIDPartida = new javax.swing.JTextField();
        jButtonGravar = new javax.swing.JButton();
        jButtonSalvarEdicao = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Partidas");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 40)); // NOI18N
        jLabel1.setText("PARTIDAS");
        jLabel1.setMaximumSize(new java.awt.Dimension(382, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(382, 41));
        jLabel1.setPreferredSize(new java.awt.Dimension(382, 41));

        ButtonSairUser.setBackground(new java.awt.Color(0, 51, 51));
        ButtonSairUser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ButtonSairUser.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSairUser.setText("Sair");
        ButtonSairUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairUserActionPerformed(evt);
            }
        });

        jLabelJogador.setText("Jogador:");
        jLabelJogador.setMaximumSize(new java.awt.Dimension(30, 36));
        jLabelJogador.setMinimumSize(new java.awt.Dimension(30, 36));

        jLabelFuncao.setText("Função:");

        jLabelCampeao.setText("Campeão:");

        jLabelTipo.setText("Tipo de Jogo:");
        jLabelTipo.setPreferredSize(new java.awt.Dimension(105, 20));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o jogo", "Summoner's Rift", "Aram", "Teamfight Tactics" }));

        jComboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a função", "Assassino", "Mago", "Lutador", "Atirador", "Tanque", "Suporte" }));

        jLabelRota.setText("Rota:");

        jComboBoxRota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione sua rota", "Rota Superior", "Selva", "Rota do Meio", "Rota Inferior", "Suporte" }));

        jLabelIDPartida.setText("ID:");

        jTextFieldIDPartida.setEditable(false);
        jTextFieldIDPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDPartidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCampeao)
                    .addComponent(jLabelJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFuncao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCampeao)
                    .addComponent(jComboBoxFuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRota, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIDPartida, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxRota, 0, 189, Short.MAX_VALUE)
                    .addComponent(jTextFieldIDPartida))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCampeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxRota, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIDPartida)
                    .addComponent(jTextFieldIDPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jButtonGravar.setBackground(new java.awt.Color(0, 102, 153));
        jButtonGravar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGravar.setText("Gravar");
        jButtonGravar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGravarMouseClicked(evt);
            }
        });
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonSalvarEdicao.setBackground(new java.awt.Color(0, 102, 153));
        jButtonSalvarEdicao.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarEdicao.setText("Salvar Alteração");
        jButtonSalvarEdicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarEdicaoMouseClicked(evt);
            }
        });
        jButtonSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarEdicaoActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSairUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonSalvarEdicao)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSairUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(638, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairUserActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonSairUserActionPerformed

    private void jButtonGravarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGravarMouseClicked
        try {
            Partidas novaPartida = new Partidas();

            novaPartida.setJogador(jTextFieldJogador.getText());
            novaPartida.setCampeao(jTextFieldCampeao.getText());
            novaPartida.setPosicao(String.valueOf(jComboBoxRota.getSelectedItem()));
            novaPartida.setFuncao_part(String.valueOf(jComboBoxFuncao.getSelectedItem()));
            novaPartida.setTipo(String.valueOf(jComboBoxTipo.getSelectedItem()));

            // faz a validação dos dados. Verefica se os campos estão vazios
            if ((jTextFieldJogador.getText().isEmpty()) || (jTextFieldCampeao.getText().isEmpty()) ) {
                JOptionPane.showMessageDialog(this, "Os campos não podem retornar vazios");
            }

            controle.gravarPartida(novaPartida);
            JOptionPane.showMessageDialog(this, "Partida salva com sucesso!");

            // limpa os campos novamente
            jTextFieldJogador.setText("");
            jTextFieldCampeao.setText("");
            jComboBoxRota.setSelectedItem("Selecione sua rota");
            jComboBoxFuncao.setSelectedItem("Selecione a função");      
            jComboBoxTipo.setSelectedItem("Selecione o jogo");

        }
        catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO AO CADASTRAR PARTIDA!");
        }
    }//GEN-LAST:event_jButtonGravarMouseClicked

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonSalvarEdicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarEdicaoMouseClicked
        try {
            Partidas partidaAtualizada = new Partidas();
            partidaAtualizada.setJogador(jTextFieldJogador.getText());
            partidaAtualizada.setCampeao(jTextFieldCampeao.getText());
            partidaAtualizada.setPosicao(String.valueOf(jComboBoxRota.getSelectedItem()));
            partidaAtualizada.setFuncao_part(String.valueOf(jComboBoxFuncao.getSelectedItem()));           
            partidaAtualizada.setTipo(String.valueOf(jComboBoxTipo.getSelectedItem()));
            partidaAtualizada.setId(Integer.parseInt(jTextFieldIDPartida.getText()));

            // Verifica se os campos estão preenchidos corretamente
            if (jTextFieldJogador.getText().isEmpty() ||
                jTextFieldCampeao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Os campos não podem ser vazios!");
                return;
            }

            // Chama o método de atualização
            controle.atualizarPartida(partidaAtualizada);

            JOptionPane.showMessageDialog(this, "Partida atualizada com sucesso!");

            // Limpa os campos após a atualização
            jTextFieldJogador.setText("");
            jTextFieldCampeao.setText("");
            jComboBoxRota.setSelectedItem("Selecione sua rota");
            jComboBoxFuncao.setSelectedItem("Selecione a função");      
            jComboBoxTipo.setSelectedItem("Selecione o jogo");
            jTextFieldIDPartida.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar partida " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarEdicaoMouseClicked

    private void jButtonSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarEdicaoActionPerformed

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        jTextFieldJogador.setText("");
        jTextFieldCampeao.setText("");
        jComboBoxRota.setSelectedItem("Selecione sua rota");
        jComboBoxFuncao.setSelectedItem("Selecione a função");      
        jComboBoxTipo.setSelectedItem("Selecione o jogo");
        jTextFieldIDPartida.setText("");
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldIDPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPartidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSairUser;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonSalvarEdicao;
    private javax.swing.JComboBox<String> jComboBoxFuncao;
    private javax.swing.JComboBox<String> jComboBoxRota;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCampeao;
    private javax.swing.JLabel jLabelFuncao;
    private javax.swing.JLabel jLabelIDPartida;
    private javax.swing.JLabel jLabelJogador;
    private javax.swing.JLabel jLabelRota;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCampeao;
    private javax.swing.JTextField jTextFieldIDPartida;
    private javax.swing.JTextField jTextFieldJogador;
    // End of variables declaration//GEN-END:variables

    public void recebeDadosPartida(Partidas partidaSelect) {
        jTextFieldIDPartida.setText(String.valueOf(partidaSelect.getId()));
        jTextFieldJogador.setText(partidaSelect.getJogador());
        jTextFieldCampeao.setText(partidaSelect.getCampeao());
        jComboBoxRota.setSelectedItem(partidaSelect.getPosicao());
        jComboBoxFuncao.setSelectedItem(partidaSelect.getFuncao_part()); 
        jComboBoxTipo.setSelectedItem(partidaSelect.getTipo());
    }
}

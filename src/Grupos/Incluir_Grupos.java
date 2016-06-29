package Grupos;

import Conexao_BD.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Incluir_Grupos extends javax.swing.JFrame {

    Statement stmt = Conexao.stmt;
    public Incluir_Grupos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Nome_Grupo = new javax.swing.JLabel();
        Entrada_Nome_Grupo = new java.awt.TextField();
        Button_Ok = new javax.swing.JButton();
        Button_Cancel = new javax.swing.JButton();
        Button_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Grupos");

        Label_Nome_Grupo.setText("Nome do Grupo de Material");
        Label_Nome_Grupo.setToolTipText("");

        Entrada_Nome_Grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrada_Nome_GrupoActionPerformed(evt);
            }
        });
        Entrada_Nome_Grupo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Entrada_Nome_GrupoInputMethodTextChanged(evt);
            }
        });

        Button_Ok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Button_Ok.setText("Ok");
        Button_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_OkActionPerformed(evt);
            }
        });

        Button_Cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Button_Cancel.setText("Desfazer");
        Button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelActionPerformed(evt);
            }
        });

        Button_Sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Button_Sair.setText("Sair");
        Button_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrada_Nome_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button_Sair)))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Label_Nome_Grupo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Label_Nome_Grupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Entrada_Nome_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void Button_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SairActionPerformed
        dispose();
    }//GEN-LAST:event_Button_SairActionPerformed
    private void Entrada_Nome_GrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrada_Nome_GrupoActionPerformed
    }//GEN-LAST:event_Entrada_Nome_GrupoActionPerformed
    private void Entrada_Nome_GrupoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Entrada_Nome_GrupoInputMethodTextChanged
    }//GEN-LAST:event_Entrada_Nome_GrupoInputMethodTextChanged
    private void Button_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_OkActionPerformed
        GruposInsert Insert = new GruposInsert();
        String Nome = Entrada_Nome_Grupo.getText();
        Insert.adiciona(Nome);
        Entrada_Nome_Grupo.setText("");
    }//GEN-LAST:event_Button_OkActionPerformed
    private void Button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelActionPerformed
        Entrada_Nome_Grupo.setText("");
    }//GEN-LAST:event_Button_CancelActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Incluir_Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incluir_Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incluir_Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incluir_Grupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Incluir_Grupos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancel;
    private javax.swing.JButton Button_Ok;
    private javax.swing.JButton Button_Sair;
    private java.awt.TextField Entrada_Nome_Grupo;
    private javax.swing.JLabel Label_Nome_Grupo;
    // End of variables declaration//GEN-END:variables
}
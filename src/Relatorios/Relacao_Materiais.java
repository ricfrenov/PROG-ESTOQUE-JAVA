/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Relatorios;

import Conexao_BD.Conexao;
import static Materiais.MaterialInsert.rs;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class Relacao_Materiais extends javax.swing.JFrame {

    /**
     * Creates new form Relacao_Materiais
     */
        private DefaultTableModel Pesquisa;
    private Object[] Linhas;
    Statement stmt = Conexao.stmt;

    public Relacao_Materiais() {
        initComponents();
          Pesquisa = new DefaultTableModel(null, new String[]{"CODIGO_MATERIAL","NOME_MATERIAL",
              "CODIGO_GRUPO","UNIDADE","CODIGO_DE_BARRAS","VALOR","CODIGO_FORNECEDOR"});
        jTable1.setModel(Pesquisa);
            try {
         rs = stmt.executeQuery("SELECT * FROM MATERIAIS ;");
            while (rs.next()) {

                int CODIGO_MATERIAL = rs.getInt("CODIGO_MATERIAL");
                String NOME_MATERIAL = rs.getString("NOME_MATERIAL");
                String CODIGO_GRUPO = rs.getString("CODIGO_GRUPO");
                String UNIDADE = rs.getString("UNIDADE");
                String CODIGO_DE_BARRAS = rs.getString("CODIGO_DE_BARRAS");
                String VALOR = rs.getString("VALOR");
                String CODIGO_FORNECEDOR = rs.getString("CODIGO_FORNECEDOR");
                
                Linhas = new Object[]{CODIGO_MATERIAL,NOME_MATERIAL,CODIGO_GRUPO,
                    UNIDADE,CODIGO_DE_BARRAS,VALOR,CODIGO_FORNECEDOR};
                Pesquisa.addRow(Linhas);
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERRO: " + ex);
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

        CarregarTabela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CarregarTabela2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        CarregarTabela.setText("Carregar Tabela");
        CarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarTabelaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relação de Materiais");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME ", "GRUPO", "UNIDADE", "COD. BARRAS", "VALOR", "FORNECEDOR"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MATERIAIS");

        CarregarTabela2.setText("Atualizar");
        CarregarTabela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarTabela2ActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(CarregarTabela2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarregarTabela2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarTabelaActionPerformed
        // TODO add your handling code here:
        Pesquisa = new DefaultTableModel(null, new String[]{"CODIGO_MATERIAL","NOME_MATERIAL",
            "CODIGO_GRUPO","UNIDADE","CODIGO_DE_BARRAS","VALOR","CODIGO_FORNECEDOR"});
    jTable1.setModel(Pesquisa);
    try {
        rs = stmt.executeQuery("SELECT * FROM MATERIAIS ;");
        while (rs.next()) {

            int CODIGO_MATERIAL = rs.getInt("CODIGO_MATERIAL");
            String NOME_MATERIAL = rs.getString("NOME_MATERIAL");
            String CODIGO_GRUPO = rs.getString("CODIGO_GRUPO");
            String UNIDADE = rs.getString("UNIDADE");
            String CODIGO_DE_BARRAS = rs.getString("CODIGO_DE_BARRAS");
            String VALOR = rs.getString("VALOR");
            String CODIGO_FORNECEDOR = rs.getString("CODIGO_FORNECEDOR");

            Linhas = new Object[]{CODIGO_MATERIAL,NOME_MATERIAL,CODIGO_GRUPO,
                UNIDADE,CODIGO_DE_BARRAS,VALOR,CODIGO_FORNECEDOR};
            Pesquisa.addRow(Linhas);
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERRO: " + ex);
        }

    }//GEN-LAST:event_CarregarTabelaActionPerformed

    private void CarregarTabela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarTabela2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarregarTabela2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Relacao_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relacao_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relacao_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relacao_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relacao_Materiais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarregarTabela;
    private javax.swing.JButton CarregarTabela2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

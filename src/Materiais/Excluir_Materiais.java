package Materiais;

import Conexao_BD.Conexao;
import static Materiais.MaterialInsert.rs;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Excluir_Materiais extends javax.swing.JFrame {
    
     /**
     * Creates new form Alterar_Materiais
     */         
    
     
    private DefaultTableModel Pesquisa2;
    private Object[] Linhas;
    Statement stmt = Conexao.stmt;
 
    
    public Excluir_Materiais() {
        initComponents();
        
         Pesquisa2 = new DefaultTableModel(null, new String[]{"CODIGO_MATERIAL","NOME_MATERIAL",
              "CODIGO_GRUPO","UNIDADE","CODIGO_DE_BARRAS","VALOR","CODIGO_FORNECEDOR"});
        jTable2.setModel(Pesquisa2);
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
                Pesquisa2.addRow(Linhas);
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

        Opções_busca = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Entrada_Nome_Material = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Pesquisa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CarregarTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Materiais");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Informe Nome do Material a ser Excluido");

        Pesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pesquisa.setText("Pesquisar");
        Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Entrada_Nome_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pesquisa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada_Nome_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Excluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME ", "GRUPO", "UNIDADE", "COD. BARRAS", "VALOR", "FORNECEDOR"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        CarregarTabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CarregarTabela.setText("Carregar Tabela");
        CarregarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarregarTabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarregarTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaActionPerformed

        
        
        String nome = Entrada_Nome_Material.getText();
          Pesquisa2 = new DefaultTableModel(null, new String[]{"CODIGO_MATERIAL","NOME_MATERIAL",
              "CODIGO_GRUPO","UNIDADE","CODIGO_DE_BARRAS","VALOR","CODIGO_FORNECEDOR"});
        jTable2.setModel(Pesquisa2);
            try {
         rs = stmt.executeQuery("SELECT * FROM MATERIAIS WHERE NOME_MATERIAL = '"+nome+"';");
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
                Pesquisa2.addRow(Linhas);
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERRO: " + ex);
        }
        Entrada_Nome_Material.setText("");
    }//GEN-LAST:event_PesquisaActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_SairActionPerformed

    private void CarregarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarTabelaActionPerformed

         Pesquisa2 = new DefaultTableModel(null, new String[]{"CODIGO_MATERIAL","NOME_MATERIAL",
              "CODIGO_GRUPO","UNIDADE","CODIGO_DE_BARRAS","VALOR","CODIGO_FORNECEDOR"});
        jTable2.setModel(Pesquisa2);
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
                Pesquisa2.addRow(Linhas);
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERRO: " + ex);
        }
        

    }//GEN-LAST:event_CarregarTabelaActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed


             
        int LinhaSelecionada = this.jTable2.getSelectedRow();
        String CODIGO_MATERIAL = this.jTable2.getValueAt(LinhaSelecionada, 0).toString();
        String NOME_MATERIAL = this.jTable2.getValueAt(LinhaSelecionada, 1).toString();
        String CODIGO_GRUPO = this.jTable2.getValueAt(LinhaSelecionada, 2).toString();
        String UNIDADE = this.jTable2.getValueAt(LinhaSelecionada, 3).toString();
        String CODIGO_DE_BARRAS = this.jTable2.getValueAt(LinhaSelecionada, 4).toString();
        String VALOR = this.jTable2.getValueAt(LinhaSelecionada, 5).toString();
        String CODIGO_FORNECEDOR = this.jTable2.getValueAt(LinhaSelecionada, 6).toString();
        
         int x = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir esse item?");

        if (x == JOptionPane.OK_OPTION) {
            try {
                 
                stmt.executeUpdate("DELETE FROM MATERIAIS WHERE CODIGO_MATERIAL = '" + CODIGO_MATERIAL + "' ");
                JOptionPane.showMessageDialog(null, " Deletado com Sucesso!");

            } catch (java.sql.SQLException e) {
                JOptionPane.showMessageDialog(null, " Erro ao Deletar Grupo!");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Grupo não Excluido! ");
           // FornecedorInsert.rs = null;
        }
        
    }//GEN-LAST:event_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Excluir_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excluir_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excluir_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excluir_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Excluir_Materiais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarregarTabela;
    private javax.swing.JTextField Entrada_Nome_Material;
    private javax.swing.JButton Excluir;
    private javax.swing.ButtonGroup Opções_busca;
    private javax.swing.JButton Pesquisa;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

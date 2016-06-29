package Fornecedor;

import Fornecedor.FornecedorInsert;
import Conexao_BD.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Incluir_Fornecedor extends javax.swing.JFrame {

    public Incluir_Fornecedor() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JPanel();
        EntradaFornecedor = new java.awt.TextField();
        EntradaRazao = new java.awt.TextField();
        EntradaNomeContato = new java.awt.TextField();
        EntradaCNPJ = new java.awt.TextField();
        EntradaFax = new java.awt.TextField();
        EntradaTelefone2 = new java.awt.TextField();
        EntradaTelefone1 = new java.awt.TextField();
        Fornecedor = new java.awt.Label();
        RazaoSocial = new java.awt.Label();
        NomeContato = new java.awt.Label();
        InscricaoEstadual = new java.awt.Label();
        Cnpj = new java.awt.Label();
        Telefone1 = new java.awt.Label();
        Telefone2 = new java.awt.Label();
        Fax = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        EntradaBairro = new java.awt.TextField();
        EntradaCEP = new java.awt.TextField();
        Endereco = new java.awt.Label();
        Bairro = new java.awt.Label();
        Cep = new java.awt.Label();
        EntradaCidade = new java.awt.TextField();
        EntradaUF = new java.awt.TextField();
        EntradaPontoRef = new java.awt.TextField();
        Cidade = new java.awt.Label();
        UF = new java.awt.Label();
        PontoRef = new java.awt.Label();
        EntradaEmail = new java.awt.TextField();
        EntradaObs = new java.awt.TextArea();
        Obs = new java.awt.Label();
        Email = new java.awt.Label();
        EntradaEndereco = new java.awt.TextField();
        EntradaInscricao = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Fornecedor");

        Sair.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EntradaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaFornecedorActionPerformed(evt);
            }
        });
        EntradaFornecedor.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                EntradaFornecedorInputMethodTextChanged(evt);
            }
        });

        EntradaRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaRazaoActionPerformed(evt);
            }
        });

        EntradaNomeContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomeContatoActionPerformed(evt);
            }
        });

        EntradaCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCNPJActionPerformed(evt);
            }
        });

        EntradaFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaFaxActionPerformed(evt);
            }
        });

        EntradaTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTelefone2ActionPerformed(evt);
            }
        });

        EntradaTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTelefone1ActionPerformed(evt);
            }
        });

        Fornecedor.setText("Fornecedor*");

        RazaoSocial.setText("Razão Social*");

        NomeContato.setText("Nome do Contato");

        InscricaoEstadual.setText("Inscrição Estadual*");

        Cnpj.setText("CNPJ*");

        Telefone1.setText("Telefone 1*");

        Telefone2.setText("Telefone 2");

        Fax.setText("FAX");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EntradaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaBairroActionPerformed(evt);
            }
        });

        EntradaCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCEPActionPerformed(evt);
            }
        });

        Endereco.setText("Endereço*");

        Bairro.setText("Bairro*");

        Cep.setText("CEP*");

        EntradaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCidadeActionPerformed(evt);
            }
        });

        EntradaUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaUFActionPerformed(evt);
            }
        });

        Cidade.setText("Cidade*");

        UF.setText("UF*");

        PontoRef.setText("Ponto de Referência");

        EntradaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEmailActionPerformed(evt);
            }
        });

        Obs.setText("Observações");

        Email.setText("E-mail*");

        EntradaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaEnderecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(EntradaEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EntradaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(EntradaPontoRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PontoRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaObs, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(EntradaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(EntradaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(EntradaUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(PontoRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(EntradaPontoRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(EntradaObs, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(EntradaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(EntradaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(EntradaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EntradaInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaInscricaoActionPerformed(evt);
            }
        });

        jButton1.setText("Incluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Desfazer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SairLayout = new javax.swing.GroupLayout(Sair);
        Sair.setLayout(SairLayout);
        SairLayout.setHorizontalGroup(
            SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(205, 205, 205))
            .addGroup(SairLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SairLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SairLayout.createSequentialGroup()
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                                    .addComponent(NomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addGroup(SairLayout.createSequentialGroup()
                                    .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(InscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(SairLayout.createSequentialGroup()
                                .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EntradaFax, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaTelefone1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaTelefone2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        SairLayout.setVerticalGroup(
            SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SairLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SairLayout.createSequentialGroup()
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SairLayout.createSequentialGroup()
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EntradaTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EntradaTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SairLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(EntradaFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        EntradaFornecedor.setText("");
        EntradaRazao.setText("");
        EntradaInscricao.setText("");
        EntradaCNPJ.setText("");
        EntradaTelefone1.setText("");
        EntradaTelefone2.setText("");
        EntradaEndereco.setText("");
        EntradaBairro.setText("");
        EntradaCEP.setText("");
        EntradaCidade.setText("");
        EntradaUF.setText("");
        EntradaEmail.setText("");
        EntradaObs.setText("");
        EntradaNomeContato.setText("");
        EntradaFax.setText("");
        EntradaPontoRef.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FornecedorInsert Insert = new FornecedorInsert();
        String nome = EntradaFornecedor.getText();
        String Razao_Social = EntradaRazao.getText();
        String Nome_Contato = EntradaNomeContato.getText();
        String Inscricao_Estadual = EntradaInscricao.getText();
        String CNPJ = EntradaCNPJ.getText();
        String Telefone1 = EntradaTelefone1.getText();
        String Telefone2 = EntradaTelefone2.getText();
        String Fax = EntradaFax.getText();
        String Endereco = EntradaEndereco.getText();
        String Bairro = EntradaBairro.getText();
        String Cep = EntradaCEP.getText();
        String Cidade = EntradaCidade.getText();
        String Uf = EntradaUF.getText();
        String Ponto_Referencia = EntradaPontoRef.getText();
        String Email = EntradaEmail.getText();
        String Observacao = EntradaObs.getText();

        if ((EntradaFornecedor.getText().isEmpty()) || (EntradaRazao.getText().isEmpty()) || (EntradaInscricao.getText().isEmpty())
            || (EntradaCNPJ.getText().isEmpty()) || (EntradaTelefone1.getText().isEmpty()) || (EntradaEndereco.getText().isEmpty())
            || (EntradaBairro.getText().isEmpty()) || (EntradaCEP.getText().isEmpty()) || (EntradaCidade.getText().isEmpty())
            || EntradaUF.getText().isEmpty() || EntradaEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {

            Insert.adiciona(nome, Razao_Social, Nome_Contato,
                Inscricao_Estadual, CNPJ, Telefone1, Telefone2, Fax,
                Endereco, Bairro, Cep, Cidade, Uf, Ponto_Referencia, Email,
                Observacao);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EntradaInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaInscricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaInscricaoActionPerformed

    private void EntradaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEnderecoActionPerformed

    private void EntradaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaEmailActionPerformed

    private void EntradaUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaUFActionPerformed

    private void EntradaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCidadeActionPerformed

    private void EntradaCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCEPActionPerformed

    private void EntradaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaBairroActionPerformed

    private void EntradaTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTelefone1ActionPerformed

    private void EntradaTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTelefone2ActionPerformed

    private void EntradaFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaFaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaFaxActionPerformed

    private void EntradaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCNPJActionPerformed

    private void EntradaNomeContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNomeContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNomeContatoActionPerformed

    private void EntradaRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaRazaoActionPerformed

    private void EntradaFornecedorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_EntradaFornecedorInputMethodTextChanged

    }//GEN-LAST:event_EntradaFornecedorInputMethodTextChanged

    private void EntradaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaFornecedorActionPerformed

    }//GEN-LAST:event_EntradaFornecedorActionPerformed

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
            java.util.logging.Logger.getLogger(Incluir_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Incluir_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Incluir_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Incluir_Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Incluir_Fornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Bairro;
    private java.awt.Label Cep;
    private java.awt.Label Cidade;
    private java.awt.Label Cnpj;
    private java.awt.Label Email;
    private java.awt.Label Endereco;
    private java.awt.TextField EntradaBairro;
    private java.awt.TextField EntradaCEP;
    private java.awt.TextField EntradaCNPJ;
    private java.awt.TextField EntradaCidade;
    private java.awt.TextField EntradaEmail;
    private java.awt.TextField EntradaEndereco;
    private java.awt.TextField EntradaFax;
    private java.awt.TextField EntradaFornecedor;
    private java.awt.TextField EntradaInscricao;
    private java.awt.TextField EntradaNomeContato;
    private java.awt.TextArea EntradaObs;
    private java.awt.TextField EntradaPontoRef;
    private java.awt.TextField EntradaRazao;
    private java.awt.TextField EntradaTelefone1;
    private java.awt.TextField EntradaTelefone2;
    private java.awt.TextField EntradaUF;
    private java.awt.Label Fax;
    private java.awt.Label Fornecedor;
    private java.awt.Label InscricaoEstadual;
    private java.awt.Label NomeContato;
    private java.awt.Label Obs;
    private java.awt.Label PontoRef;
    private java.awt.Label RazaoSocial;
    private javax.swing.JPanel Sair;
    private java.awt.Label Telefone1;
    private java.awt.Label Telefone2;
    private java.awt.Label UF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

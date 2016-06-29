package Fornecedor;

import Conexao_BD.Conexao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class FornecedorInsert {

    Vector registroLido = new Vector();
    public static ResultSet rs;
    public static Vector<Vector> dados = new Vector<>();
    public static Vector<Vector> dados2 = new Vector<>();
    Statement stmt = Conexao.stmt;

    public void adiciona(String Nome_Fornecedor, String Razao_Social, String Nome_Contato,
            String Inscricao_Estadual, String CNPJ, String Telefone1, String Telefone2, String Fax,
            String Endereco, String Bairro, String Cep, String Cidade, String Uf,
            String Ponto_Referencia, String Email, String Observacao) {
        try {

            stmt.executeUpdate("INSERT INTO FORNECEDOR(NOME_FORNECEDOR,RAZAO_SOCIAL,"
                    + "NOME_CONTATO,INSCRICAO_ESTADUAL,CNPJ,TELEFONE1,TELEFONE2,FAX,"
                    + "ENDERECO,BAIRRO,CEP,CIDADE,UF,PONTO_REFERENCIA,EMAIL,OBSERVACAO)"
                    + "VALUES('" + Nome_Fornecedor + "',"
                    + "'" + Razao_Social + "',"
                    + "'" + Nome_Contato + "',"
                    + "'" + Inscricao_Estadual + "',"
                    + "'" + CNPJ + "',"
                    + "'" + Telefone1 + "',"
                    + "'" + Telefone2 + "',"
                    + "'" + Fax + "',"
                    + "'" + Endereco + "',"
                    + "'" + Bairro + "',"
                    + "'" + Cep + "',"
                    + "'" + Cidade + "',"
                    + "'" + Uf + "',"
                    + "'" + Ponto_Referencia + "',"
                    + "'" + Email + "',"
                    + "'" + Observacao + "')");

            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso!");

        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar! " + a);
        }
    }

    public void busca(String nome) {
        try {
            rs = stmt.executeQuery("SELECT "
                    + "NOME_FORNECEDOR,"
                    + "RAZAO_SOCIAL,"
                    + "NOME_CONTATO,"
                    + "INSCRICAO_ESTADUAL,"
                    + "CNPJ,"
                    + "TELEFONE1,"
                    + "TELEFONE2,"
                    + "FAX,"
                    + "ENDERECO,"
                    + "BAIRRO,"
                    + "CEP,"
                    + "CIDADE,"
                    + "UF,"
                    + "PONTO_REFERENCIA,"
                    + "EMAIL,"
                    + "OBSERVACAO,"
                    + "CODIGO_FORNECEDOR "
                    + "FROM FORNECEDOR "
                    + "WHERE NOME_FORNECEDOR = '" + nome + "' ");
            while (rs.next()) {
                String NOME_FORNECEDOR;
                String RAZAO_SOCIAL;
                String NOME_CONTATO;
                String INSCRICAO_ESTADUAL;
                String CNPJ;
                String TELEFONE_1;
                String TELEFONE_2;
                String FAX;
                String ENDERECO;
                String BAIRRO;
                String CEP;
                String CIDADE;
                String UF;
                String PONTO_REFERENCIA;
                String EMAIL;
                String OBSERVACAO;
                int CODIGO_FORNECEDOR;

                String N_FORNECEDOR = rs.getString("NOME_FORNECEDOR");
                String R_SOCIAL = rs.getString("RAZAO_SOCIAL");
                String N_CONTATO = rs.getString("NOME_CONTATO");
                String I_ESTADUAL = rs.getString("INSCRICAO_ESTADUAL");
                String CNPJJ = rs.getString("CNPJ");
                String TEL1 = rs.getString("TELEFONE1");
                String TEL2 = rs.getString("TELEFONE2");
                String FAXX = rs.getString("FAX");
                String END = rs.getString("ENDERECO");
                String BAIRROO = rs.getString("BAIRRO");
                String CEPP = rs.getString("CEP");
                String CIDADEE = rs.getString("CIDADE");
                String UFF = rs.getString("UF");
                String P_REFERENCIA = rs.getString("PONTO_REFERENCIA");
                String EMAILL = rs.getString("EMAIL");
                String OBS = rs.getString("OBSERVACAO");
                int C_FORNECEDOR = rs.getInt("CODIGO_FORNECEDOR");

                Vector registroLido = new Vector();

                registroLido.add(N_FORNECEDOR);
                registroLido.add(R_SOCIAL);
                registroLido.add(N_CONTATO);
                registroLido.add(I_ESTADUAL);
                registroLido.add(CNPJJ);
                registroLido.add(TEL1);
                registroLido.add(TEL2);
                registroLido.add(FAXX);
                registroLido.add(END);
                registroLido.add(BAIRROO);
                registroLido.add(CEPP);
                registroLido.add(CIDADEE);
                registroLido.add(UFF);
                registroLido.add(P_REFERENCIA);
                registroLido.add(EMAILL);
                registroLido.add(OBS);
                registroLido.add(C_FORNECEDOR);

                dados.add(registroLido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " ERRO: " + ex);
        }
    }
}

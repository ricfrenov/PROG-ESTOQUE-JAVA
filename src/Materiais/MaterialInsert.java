package Materiais;

import Fornecedor.FornecedorInsert;
import Conexao_BD.Conexao;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

public class MaterialInsert {

      Vector registroLido = new Vector();
    public static ResultSet rs;
    public static Vector<Vector> dados = new Vector<>();
    public static Vector<Vector> dados2 = new Vector<>();
    Statement stmt = Conexao.stmt;
    
    public void adiciona(String NomeMaterial,String Unidade,     int CodigoGrupo,  
                         String Valor,   String CodigoBarras,   int CodigoFornecedor){
        try {
            stmt.executeUpdate("INSERT INTO MATERIAIS(NOME_MATERIAL,CODIGO_GRUPO,UNIDADE,CODIGO_DE_BARRAS,VALOR,CODIGO_FORNECEDOR)"
                    + "VALUES('" + NomeMaterial + "',"
                    + "'" + CodigoGrupo + "',"
                    + "'" + Unidade + "',"
                    + "'" + CodigoBarras + "',"
                    + "'" + Valor + "',"
                    + "'" + CodigoFornecedor + "')");

            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");

        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir! "+a);

        }
    }

    public void selected() {

    }
}

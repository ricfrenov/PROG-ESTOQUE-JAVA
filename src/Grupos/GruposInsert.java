package Grupos;

import Conexao_BD.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class GruposInsert {

    Vector registroLido = new Vector();
    public static ResultSet rs;
    public static Vector<Vector> dados2 = new Vector<>();
    Statement stmt = Conexao.stmt;

    public void adiciona(String Nome) {
        try {
            stmt.executeUpdate("INSERT INTO GRUPOS(NOME_GRUPO) VALUES('" + Nome + "')");
            JOptionPane.showMessageDialog(null, "Grupo Inserido com Sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " O  Grupo já existe! ");
        }
    }
   
    /*
  public void Deleta(String nome) {
        try {
            rs = stmt.executeQuery("SELECT * FROM GRUPOS WHERE NOME_GRUPO = '" + nome + "' ");
          
            while (rs.next()) {
          
            int CODIGO_GRUPO = rs.getInt("CODIGO_GRUPO");
            String NOME_GRUPO = rs.getString("NOME_GRUPO");
            registroLido.add(CODIGO_GRUPO);
            registroLido.add(NOME_GRUPO);
            dados2.add(registroLido);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " O Grupo não Existe! ");
        }
    }*/
}


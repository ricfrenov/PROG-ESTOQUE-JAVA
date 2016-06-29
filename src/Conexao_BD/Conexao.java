package Conexao_BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {

    public static Statement stmt;  
   
    //Construtor do Statement que inicializa a conexão como nula.
    public Statement teste ()
    {
        Connection conn = null;

        try
        {
            String userName = "root";
            String password = "123456";
            String url = "jdbc:mysql://localhost/estoque";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Conexão com o BD estabelecida!");
            
            stmt =  conn.createStatement();
        }
        catch (Exception e)
        {
            System.err.println ("Não foi possível estabelecer conexão com o BD");
        
        }
        if (conn == null) {  
            try {  
            conn.close();  
                System.out.println("Conexão encerrada.");  
            }catch (Exception ee) {}  
   }  
        return stmt;
        
        }
        
    }



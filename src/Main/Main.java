package Main;

import Conexao_BD.Conexao;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

    }
        public void conect(){
    Conexao objCon = new Conexao();
    Statement stmt = objCon.teste();
    }

}

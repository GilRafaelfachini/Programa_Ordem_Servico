package br.com.projeto.projeto_os.dao;

import java.sql.*;

public class ModuloConexao {

    // metodo para conexao com banco
    public static Connection conector() {

        java.sql.Connection conexao = null;
        // linha abaixo chama driver conexao
        String driver = "com.mysql.jdbc.Driver";
        // armazenando inf. referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // estabelecer conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            
        } catch (Exception e) {
             System.out.println(e);
            return null;
        }

    }

}

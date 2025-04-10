package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() throws SQLException {
        String url = "jdbc:sqlite:meu_banco.sql";
        String usuario = "root";
        String senha = "";
        return DriverManager.getConnection(url, usuario, senha);
    }
}

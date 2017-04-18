package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO{
    public void conecta(String nome, String email, String senha, int vitorias, int derrotas) throws SQLException{
        String driver = "org.mariadb.jdbc.Driver";

        Connection conexao;
        Statement statement;
        ResultSet resultset;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/jogoDama", "root", "97449077");
            statement = conexao.createStatement();
            resultset = statement.executeQuery("INSERT INTO dadosUser(nome, email, senha, vitorias, derrotas)"
                    + " VALUES('"+nome+"', '"+email+"', '"+senha+"', "+vitorias+", "+derrotas+");");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package models;

import java.sql.SQLException;

/**
 *
 * @author mateu
 */
public class UsuarioController {
    public void insere(String nome, String email, String senha) throws SQLException{
        Usuario novo = new Usuario();
        novo.setNome(nome);
        novo.setEmail(email);
        novo.setSenha(senha);
        
        UsuarioDAO ud = new UsuarioDAO();
        ud.conecta(novo);
    }
}

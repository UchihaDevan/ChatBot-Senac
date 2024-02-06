package br.com.controller;

import br.com.ConexaoBD.Conexao;
import br.com.dao.LoginDAO;
import br.com.telas.ChatBotCadastro;
import br.com.telas.ChatBotLogin;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Devan
 */
public class LoginController {
    //classe responsável por chamar a classe de cadastro de usuário.
   public void cadastroUsuario(ChatBotCadastro view) throws SQLException{
   
     Connection conexao = new Conexao().getConnection();
     LoginDAO cadastro = new LoginDAO();
     cadastro.cadastrarUsuario(view.getjTUsuario().getText(),view.getjTEmail().getText(),view.getJpSenha().getText());
     
   }
    //classe responsável por chamar a classe de login.
   public void loginUsuario(ChatBotLogin view) throws SQLException{
   
     Connection conexao = new Conexao().getConnection();
     LoginDAO login = new LoginDAO();
     login.login(view.getJtUsuario().getText(),view.getJpSenha().getText());
             
   }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

package br.com.dao;

import br.com.ConexaoBD.Conexao;
import br.com.chatinteligentesenac.ChatBotView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Devan
 */
public class LoginDAO {
    //classe responsável por verificar e enviar as informações de cadastro.
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql1 = "select email from login where email = '" + email + "'";
        System.out.println(sql1);
        PreparedStatement statment1 = conexao.prepareStatement(sql1);
        ResultSet rs1 = statment1.executeQuery();
        if (rs1.next()) {
            JOptionPane.showMessageDialog(null, "Usuario ou senha já exite!");
            this.dispose();
        } else {
            String sql = "INSERT INTO login (nome, email, senha) VALUES ('" + nome + "', '" + email + "', '" + senha + "')";
            System.out.println(sql);
            PreparedStatement statment = conexao.prepareStatement(sql);
            statment.execute();
            conexao.close();
        }
    }
    //classe responsável por verificar as informações de login.
    public void login(String email, String senha) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        String sql = "select email,senha from login where email = '" + email + "' and senha = '" + senha + "'";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();

        if (rs.next()) {
            ChatBotView tela = new ChatBotView();
            tela.setVisible(true);
            System.out.println("Possui");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos!");
            this.dispose();
        }
        conexao.close();

    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

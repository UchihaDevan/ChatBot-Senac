package br.com.ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//Esse arquivo não tem nenhuma função no projeto, foi apenas um teste diferente de conexão com o banco de dados.
/**
 *
 * @author Devan
 */
public class conexao {
    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://roundhouse.proxy.rlwy.net:51165/railway";
    private String usuario = "postgres";
    private String senha = "F53C5CABe*cC1c56E46d*eA-DFfBd2-1";
    public Connection conn;
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\n Erro:"+ ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro no executaSQL!\n Erro:"+ ex.getMessage());
        }
    }
    public void desconecta(){
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!\n Erro:"+ ex.getMessage());
        }
    }
}

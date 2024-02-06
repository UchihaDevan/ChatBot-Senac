package br.com.telas;

import br.com.controller.LoginController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Jeici
 */
public class ChatBotCadastro extends javax.swing.JFrame {

    
    /**
     * Creates new form TelaCadastro
     */
    public ChatBotCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jTUsuario = new javax.swing.JTextField();
        jpSenha = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(544, 554));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Vamos criar sua conta. Bip, bop!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Digite suas informações abaixo para criar a conta.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jTEmail.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 30));

        jTUsuario.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, 30));

        jpSenha.setBackground(new java.awt.Color(204, 204, 204));
        jpSenha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jpSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 240, 30));

        jbEntrar.setText("Cadastrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nome de Usuário");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Documents/Java/ChatBot Senac/ChatBotSenac/src/main/resources/images/Bem vindo de volta.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //classe responsável por adicionar função ao botão de cadastro.
    //Essa classe verifica se os campos estão preenchidos e envia as informações para o controlador.
    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        if (jTUsuario.getText().matches("") || jTEmail.getText().matches("") || jpSenha.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!");
        }else{
        
            LoginController cadastro = new LoginController();
            try {
            cadastro.cadastroUsuario(this);
            } catch (SQLException sql) {
            Logger.getLogger(ChatBotCadastro.class.getName()).log(Level.SEVERE, null, sql);
            }
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado.");
            this.setVisible(false);
            ChatBotLogin telaLogin = new ChatBotLogin();
            telaLogin.setVisible(true);
        }
    }//GEN-LAST:event_jbEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatBotCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatBotCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatBotCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBotCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBotCadastro().setVisible(true);
            }
        });
    }
    //inicio dos getter e setter dos jtextfield e jpassword.
    public JTextField getjTEmail() {
        return jTEmail;
    }

    public void setjTEmail(JTextField jTEmail) {
        this.jTEmail = jTEmail;
    }

    public JTextField getjTUsuario() {
        return jTUsuario;
    }

    public void setjTUsuario(JTextField jTUsuario) {
        this.jTUsuario = jTUsuario;
    }

    public JPasswordField getJpSenha() {
        return jpSenha;
    }

    public void setJpSenha(JPasswordField jpSenha) {
        this.jpSenha = jpSenha;
    }
    //final dos getter e setter dos jtextfield e jpassword.
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JPasswordField jpSenha;
    // End of variables declaration//GEN-END:variables
}

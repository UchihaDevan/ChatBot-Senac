package br.com.chatinteligentesenac;
import br.com.telas.ChatBotTela;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author kali
 */
public class ChatBotView extends javax.swing.JFrame {

    /**
     * Creates new form ChatBotView
     */
    public ChatBotView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEnviar = new javax.swing.JButton();
        jtPergunta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtResposta = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(547, 580));
        setMinimumSize(new java.awt.Dimension(547, 580));
        setPreferredSize(new java.awt.Dimension(547, 580));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbEnviar.setBackground(new java.awt.Color(204, 204, 204));
        jbEnviar.setIcon(new javax.swing.ImageIcon("/Documents/Java/ChatBot Senac/ChatBotSenac/src/main/resources/images/enviar-mensagem.png")); // NOI18N
        jbEnviar.setBorderPainted(false);
        jbEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 40, 40));

        jtPergunta.setBackground(new java.awt.Color(204, 204, 204));
        jtPergunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(jtPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 520, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("O que você gostaria de saber?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bem-vindo ao chat inteligente do Senac!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jtResposta.setBackground(new java.awt.Color(204, 204, 204));
        jtResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jtResposta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 520, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Documents/Java/ChatBot Senac/ChatBotSenac/src/main/resources/images/Bem vindo de volta.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(544, 574));
        jLabel1.setMinimumSize(new java.awt.Dimension(544, 574));
        jLabel1.setPreferredSize(new java.awt.Dimension(544, 574));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPerguntaActionPerformed

    }//GEN-LAST:event_jtPerguntaActionPerformed
    // Aqui fica o botão de enviar a pergunta. Ele é responsável por pegar o conteúdo da pergunta e enviar para a classe de conexão.
    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        String perg = jtPergunta.getText();
        System.out.println(chatGPT(perg));

    }//GEN-LAST:event_jbEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(ChatBotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatBotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatBotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBotView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBotView().setVisible(true);
            }
        });
    }
        //Aqui é a classe responsável pela conexão com a API e enviar a pergunta e "receber" a resposta. 
            public String chatGPT(String message) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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"; // Aqui fica a chave API
        String model = "gpt-3.5-turbo"; // Aqui fica o modelo de API

        try {
            // Aqui cria a solicitação http post
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + apiKey);
            con.setRequestProperty("Content-Type", "application/json");

            // Aqui cria o corpo da solicitação http
            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";
            con.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            // Aqui ele pega a resposta
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Aqui retorna o conteudo da resposta extraido
            return extractContentFromResponse(response.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Aqui recebe a resposta do chatGPT e retorna
    public String extractContentFromResponse(String response) {
        ChatBotTela view = new ChatBotTela();
        
        int startMarker = response.indexOf("content")+11; // Marcardor inicial do content.
        int endMarker = response.indexOf("\"", startMarker); // Marcador final do content.
        jtResposta.setText(response.substring(startMarker, endMarker)); // Retorno substring contendo só a resposta.
         return response;
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JTextField jtPergunta;
    private javax.swing.JTextPane jtResposta;
    // End of variables declaration//GEN-END:variables
}

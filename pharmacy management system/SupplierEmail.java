package pharmacy;

import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.net.InetAddress;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.net.UnknownHostException;
import javax.swing.*;
public class SupplierEmail extends javax.swing.JFrame {

   
    public SupplierEmail() {
        initComponents();
        initDetails();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
    }

    
    static String body,receipient,product;
    String subject="Place Order: ";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        receiversemailtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subjecttf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bodyemailtf = new javax.swing.JTextArea();
        sendemail = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Send to");

        jLabel2.setText("Subject");

        bodyemailtf.setColumns(20);
        bodyemailtf.setRows(5);
        jScrollPane1.setViewportView(bodyemailtf);

        sendemail.setText("Send e-mail");
        sendemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendemailActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subjecttf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(receiversemailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(sendemail)
                        .addGap(69, 69, 69)
                        .addComponent(cancelButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(receiversemailtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subjecttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendemail)
                    .addComponent(cancelButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendemailActionPerformed
        // TODO add your handling code here:
        String host = "smtp.gmail.com";
        //final String user="bitf11m036@pucit.edu.pk";//change accordingly  
        final String user = "aroymultipurp@gmail.com";
        //final String password="gazi786786";//change accordingly  
        final String password = "Rockwell@98";

        if (!user.equals("") && !password.equals("")) {
            String SMTP_PORT = "465";
            String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

            //String to="bitf11m036@pucit.edu.pk";//change accordingly  
            String to = receiversemailtf.getText();

            //Get the session object  
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "true");
            props.put("mail.smtp.port", SMTP_PORT);
            props.put("mail.smtp.socketFactory.port", SMTP_PORT);
            props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.put("mail.smtp.socketFactory.fallback", "true");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, password);
                }
            });

            //Compose the message  
            try {
                MimeMessage message = new MimeMessage(session);
                // creates message part
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(message, "text/html");

                message.setFrom(new InternetAddress(user));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                //message.setSubject("Subject");  
                message.setSubject(subjecttf.getText());
                message.setText(bodyemailtf.getText());
                //send the message  
                Transport.send(message);

                JOptionPane.showMessageDialog(null, "message sent successfully...");
                setVisible(false);
                dispose();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dear User! Please Enter Email or Password");
        }
    }//GEN-LAST:event_sendemailActionPerformed
       
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    
    public void initDetails(){
        subject+=product;
        receiversemailtf.setText(receipient);
        bodyemailtf.setText(body);
        subjecttf.setText(subject);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SupplierEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
            body = args[2];
            receipient = args[1];
            product = args[0];
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierEmail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bodyemailtf;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField receiversemailtf;
    private javax.swing.JButton sendemail;
    private javax.swing.JTextField subjecttf;
    // End of variables declaration//GEN-END:variables
}

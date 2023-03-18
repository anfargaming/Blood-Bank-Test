

import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gptc
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    public login() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usertext = new javax.swing.JTextField();
        userpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        signup_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(639, 425));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 160, 70));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setText("username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 130, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 120, -1));

        usertext.setBackground(new java.awt.Color(255, 204, 204));
        usertext.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jPanel1.add(usertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 150, 30));

        userpass.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.add(userpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, 30));

        signup_btn.setText("CREATE");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 100, 30));

        exit_btn.setBackground(new java.awt.Color(255, 255, 255));
        exit_btn.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(249, 223, 223));
        exit_btn.setText("X");
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });
        jPanel1.add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 20, -1));

        jButton2.setText("ADMIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 80, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login background final.PNG"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1080, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        setSize(new java.awt.Dimension(765, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        signup s=new signup();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signup_btnActionPerformed

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        // TODO add your handling code here
            System.exit(0);
        
                
    }//GEN-LAST:event_exit_btnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String user = usertext.getText();
        String password = String.valueOf( userpass.getPassword());
        if(user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username or Password should not be empty", "Error",JOptionPane.ERROR_MESSAGE);
        
            
        }
        else
        {
           userlogin(user,password);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        adminlogin s=new adminlogin();
        s.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signup_btn;
    private javax.swing.JPasswordField userpass;
    private javax.swing.JTextField usertext;
    // End of variables declaration//GEN-END:variables

   

    private void userlogin(String user,String password) {
        java.sql.Connection dbconn = DBconnector.connectDB();
        if(dbconn != null){
        try {
            java.sql.PreparedStatement st = (java.sql.PreparedStatement)
                    dbconn.prepareStatement("Select *from newuser WHERE username = ? AND password = ?");
            
           
            
            st.setString(1, user);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                dispose();
                adminmenu p =new adminmenu();
                p.setTitle("MAIN MENU");
                p.setVisible(true);
                this.dispose();
             
            } else{
                System.out.println("" + user);
                System.out.println("password" + password);
                javax.swing.JOptionPane.showMessageDialog(this, "Username or Password not Found.", "Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The connection Not Available.");
        }

    }
        
    }
   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeklibrary;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LUI
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        tf_user = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_user.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tf_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_user.setText("Username");
        tf_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_userFocusLost(evt);
            }
        });
        tf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_userActionPerformed(evt);
            }
        });
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_userKeyTyped(evt);
            }
        });

        tf_password.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        tf_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_password.setText("Password");
        tf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_passwordFocusLost(evt);
            }
        });
        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        tf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passwordKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bookcamps 50 px-02-02-02.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_password)
                            .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyTyped
        char a = evt.getKeyChar();
        if (a == '\n') {
            tf_password.requestFocus();
        }
    }//GEN-LAST:event_tf_userKeyTyped

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void tf_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passwordKeyTyped
        char a = evt.getKeyChar();
        if (a == '\n') {
            Login();
        }
    }//GEN-LAST:event_tf_passwordKeyTyped

    private void tf_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusGained
        if (tf_user.getText().equalsIgnoreCase("username")) {
            tf_user.setText("");
        }
    }//GEN-LAST:event_tf_userFocusGained

    private void tf_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userFocusLost
        if (tf_user.getText().equalsIgnoreCase("") || tf_user.getText().equalsIgnoreCase("username")) {
            tf_user.setText("Username");
        }
    }//GEN-LAST:event_tf_userFocusLost

    private void tf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passwordFocusGained
        if (tf_password.getText().equalsIgnoreCase("Password"))
            tf_password.setText("");
    }//GEN-LAST:event_tf_passwordFocusGained

    private void tf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passwordFocusLost
        if (tf_password.getText().equalsIgnoreCase("Password") || tf_password.getText().equalsIgnoreCase(""))
            tf_password.setText("Password");
    }//GEN-LAST:event_tf_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        String username = tf_user.getText();
        String pass = tf_password.getText();
        Petugas mod = null;
        List<Petugas> list = servisBuku.ambilData();
        for (Petugas p : list) {
            if (p.getUsername().equals(username) && p.getPassword().equals(Encrypt.getmd5java(pass))) {
                mod = p;
            }
        }
        if (mod != null) {
            MenuUtama menu = new MenuUtama(mod);
            menu.setVisible(true);
            menu.revalidate();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Username atau password salah");
            tf_user.setText("Username");
            tf_password.setText("Password");
        }
        jLabel1.requestFocus();
    }

}

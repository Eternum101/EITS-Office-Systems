
import com.sun.glass.events.KeyEvent;
import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.sql.*; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templatse in the editor.
 */

/**
 *
 * @author 2104990817
 */
public class startGUI extends javax.swing.JFrame {
    Connection con = null; 
    ResultSet rs = null; 
    PreparedStatement ps = null; 

    /**
     * Creates new form startGUI
     */
    public startGUI() {
        initComponents();
        con = DatabaseConnection.getConnection();
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
        txtEmail = new javax.swing.JTextField();
        signinButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        signupButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setForeground(new java.awt.Color(51, 51, 55));
        jPanel1.setPreferredSize(new java.awt.Dimension(458, 498));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        signinButton.setBackground(new java.awt.Color(0, 104, 185));
        signinButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        signinButton.setForeground(new java.awt.Color(255, 255, 255));
        signinButton.setText("Sign In");
        signinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinButtonMouseClicked(evt);
            }
        });
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        signinButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signinButtonKeyPressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        resetButton.setBackground(new java.awt.Color(102, 102, 102));
        resetButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jSeparator1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSeparator1PropertyChange(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        signupButton.setBackground(new java.awt.Color(0, 25, 138));
        signupButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign Up");
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupButtonMouseClicked(evt);
            }
        });
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jSeparator1)
                        .addComponent(txtPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signinButton)
                    .addComponent(signupButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(resetButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_signinButtonMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        txtEmail.setText(null);
        txtPassword.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
        try {
            
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, txtEmail.getText());
            ps.setString(2, txtPassword.getText()); 
            rs=ps.executeQuery();
            if(rs.next()) {
            dispose(); 
            clientIndustryList_GUI s = new clientIndustryList_GUI();
            s.setVisible(true);
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
            
            {
            }
            }
        
        try {
            String sql = "SELECT * FROM administrators WHERE email=? AND password=?"; 
            ps = con.prepareStatement(sql);
            ps.setString(1, txtEmail.getText());
            ps.setString(2, txtPassword.getText()); 
            rs=ps.executeQuery();
            if(rs.next()) {
                dispose(); 
                adminMain_GUI s = new adminMain_GUI();
                s.setVisible(true);
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
        try {
            String sql = "SELECT * FROM caseworkers WHERE email=? AND password=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, txtEmail.getText());
            ps.setString(2, txtPassword.getText());
            rs=ps.executeQuery();
            if(rs.next()) {
                dispose();
                caseworkerMain_GUI s = new caseworkerMain_GUI();
                s.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            
            
            /*String username=txtEmail.getText();
            char[] pwd=txtPassword.getPassword();
            String password=new String(pwd);
            
            //Admin Login
            if(username.equals("admin")&&password.equals("password")){
                dispose();
                 adminMain_GUI s = new adminMain_GUI();
                 s.setVisible(true); 
            }
            
            //User Login
            else if (username.equals("user")&&password.equals("password")){
                dispose();
                clientMain_GUI s = new clientMain_GUI();
                 s.setVisible(true);
                }
            
            //Case worker Login
            else if (username.equals("caseworker")&&password.equals("password")){
                dispose();
                caseworkerMain_GUI s = new caseworkerMain_GUI();
                 s.setVisible(true);
                }
            
            // If no input is entered signin will do nothing
            else if (username.equals("")&&password.equals("")){
                }
            
            //Sign in error message
            else { 
                dispose();
                signinError_GUI s = new signinError_GUI();
                 s.setVisible(true);
                
                }*/   
    }//GEN-LAST:event_signinButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void signupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupButtonMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_signupButtonMouseClicked

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        signup_GUI s = new signup_GUI();
        s.setVisible(true);
        
    }//GEN-LAST:event_signupButtonActionPerformed

    private void signinButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signinButtonKeyPressed
        // TODO add your handling code here

    }//GEN-LAST:event_signinButtonKeyPressed
    
    // Key Press Enter to sign in
    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            try {
            String username=txtEmail.getText();
            char[] pwd=txtPassword.getPassword();
            String password=new String(pwd);
            
            //Admin Login
            if(username.equals("admin")&&password.equals("password")){
                dispose();
                 adminMain_GUI s = new adminMain_GUI();
                 s.setVisible(true); 
            }
            
            //User Login
            else if (username.equals("user")&&password.equals("password")){
                dispose();
                clientIndustryList_GUI s = new clientIndustryList_GUI();
                 s.setVisible(true);
                }
            
            //Case worker Login
            else if (username.equals("caseworker")&&password.equals("password")){
                dispose();
                caseworkerMain_GUI s = new caseworkerMain_GUI();
                 s.setVisible(true);
                }
            
            // If no input is entered signin will do nothing
            else if (username.equals("")&&password.equals("")){
                }
            
            //Sign in error message
            else {
                dispose();
                signinError_GUI s = new signinError_GUI();
                 s.setVisible(true);
                
                }
            
            }
            
            
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jSeparator1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSeparator1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator1PropertyChange

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
            java.util.logging.Logger.getLogger(startGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}

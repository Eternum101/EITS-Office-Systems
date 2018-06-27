/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EITS;

/**
 *
 * @author Jakob
 */
public class loginHelp_GUI extends javax.swing.JFrame {

    /**
     * Creates new form loginHelp_GUI
     */
    public loginHelp_GUI() {
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

        loginhelpPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        backButton2 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailtxt = new javax.swing.JTextArea();
        passwordLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        passwordtxt = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        signintxt = new javax.swing.JTextArea();
        signinLabel = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        signuptxt = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        resettxt = new javax.swing.JTextArea();
        resetLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        exittxt = new javax.swing.JTextArea();
        exitLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        functionalityLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        functionalitytxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginhelpPanel.setBackground(new java.awt.Color(60, 60, 60));
        loginhelpPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        loginhelpPanel.setForeground(new java.awt.Color(51, 51, 55));
        loginhelpPanel.setPreferredSize(new java.awt.Dimension(458, 498));
        loginhelpPanel.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("LOGIN HELP");

        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return_28px.png"))); // NOI18N
        backButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton2MouseClicked(evt);
            }
        });

        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit_28px.png"))); // NOI18N
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton2)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email text field: ");

        emailtxt.setEditable(false);
        emailtxt.setBackground(new java.awt.Color(255, 255, 255));
        emailtxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(0, 0, 0));
        emailtxt.setTabSize(0);
        emailtxt.setText("In the email text field you will want to enter you \nemail which you have entered when signing up");
        emailtxt.setAutoscrolls(false);
        jScrollPane2.setViewportView(emailtxt);

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password text field: ");

        passwordtxt.setEditable(false);
        passwordtxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordtxt.setColumns(20);
        passwordtxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordtxt.setRows(2);
        passwordtxt.setText("In the password text field you will want to enter you \npassword which you have entered when signing up");
        jScrollPane3.setViewportView(passwordtxt);

        signintxt.setEditable(false);
        signintxt.setBackground(new java.awt.Color(255, 255, 255));
        signintxt.setColumns(20);
        signintxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signintxt.setForeground(new java.awt.Color(0, 0, 0));
        signintxt.setRows(3);
        signintxt.setText("The sign in button will sign you in to the application\nif the credentials you entered are the same as what \nyou signed up as");
        jScrollPane4.setViewportView(signintxt);

        signinLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signinLabel.setForeground(new java.awt.Color(255, 255, 255));
        signinLabel.setText("Sign in button:");

        signupLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(255, 255, 255));
        signupLabel.setText("Sign up button:");

        signuptxt.setEditable(false);
        signuptxt.setBackground(new java.awt.Color(255, 255, 255));
        signuptxt.setColumns(20);
        signuptxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signuptxt.setForeground(new java.awt.Color(0, 0, 0));
        signuptxt.setRows(2);
        signuptxt.setText("The sign up button will take you to the sign up page\nwhere you can sign up as a new user ");
        jScrollPane5.setViewportView(signuptxt);

        resettxt.setEditable(false);
        resettxt.setBackground(new java.awt.Color(255, 255, 255));
        resettxt.setColumns(20);
        resettxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        resettxt.setForeground(new java.awt.Color(0, 0, 0));
        resettxt.setRows(2);
        resettxt.setText("The reset button will clear all information you have \nentered in to the email and password text fields");
        jScrollPane6.setViewportView(resettxt);

        resetLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        resetLabel.setForeground(new java.awt.Color(255, 255, 255));
        resetLabel.setText("Reset button:");

        exittxt.setEditable(false);
        exittxt.setBackground(new java.awt.Color(255, 255, 255));
        exittxt.setColumns(20);
        exittxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exittxt.setForeground(new java.awt.Color(0, 0, 0));
        exittxt.setRows(2);
        exittxt.setText("The exit button will completely exit the user out of \n the whole application");
        jScrollPane7.setViewportView(exittxt);

        exitLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setText("Exit button:");

        functionalityLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        functionalityLabel.setForeground(new java.awt.Color(255, 255, 255));
        functionalityLabel.setText("Functionality: ");

        functionalitytxt.setEditable(false);
        functionalitytxt.setBackground(new java.awt.Color(255, 255, 255));
        functionalitytxt.setColumns(20);
        functionalitytxt.setForeground(new java.awt.Color(0, 0, 0));
        functionalitytxt.setRows(2);
        functionalitytxt.setText("The functionality for this page is to link and tie all pages together. The welcome page is used to enter an email and \npassword which has already been given to you inside the database. If you are a client you can then go to the courses \nlist which you can select a course and enrol. While admins and caseworkers will get special panel which they have \naccess to features to view clients data and modify it. ");
        jScrollPane1.setViewportView(functionalitytxt);

        javax.swing.GroupLayout loginhelpPanelLayout = new javax.swing.GroupLayout(loginhelpPanel);
        loginhelpPanel.setLayout(loginhelpPanelLayout);
        loginhelpPanelLayout.setHorizontalGroup(
            loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginhelpPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(functionalityLabel)
                    .addComponent(jSeparator1)
                    .addGroup(loginhelpPanelLayout.createSequentialGroup()
                        .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel)
                            .addComponent(signinLabel)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitLabel)
                            .addComponent(resetLabel)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signupLabel)))
                    .addComponent(jScrollPane1))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        loginhelpPanelLayout.setVerticalGroup(
            loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginhelpPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(signupLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginhelpPanelLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginhelpPanelLayout.createSequentialGroup()
                        .addComponent(resetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(loginhelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginhelpPanelLayout.createSequentialGroup()
                        .addComponent(signinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginhelpPanelLayout.createSequentialGroup()
                        .addComponent(exitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(functionalityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginhelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginhelpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseClicked
        dispose();
        startGUI s = new startGUI();
        s.setVisible(true);
    }//GEN-LAST:event_backButton2MouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(loginHelp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginHelp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginHelp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginHelp_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginHelp_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel backButton2;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailtxt;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JTextArea exittxt;
    private javax.swing.JLabel functionalityLabel;
    private javax.swing.JTextArea functionalitytxt;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginhelpPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextArea passwordtxt;
    private javax.swing.JLabel resetLabel;
    private javax.swing.JTextArea resettxt;
    private javax.swing.JLabel signinLabel;
    private javax.swing.JTextArea signintxt;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JTextArea signuptxt;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}

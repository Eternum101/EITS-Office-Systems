package EITS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2104990817
 */
public class adminMain_GUI extends javax.swing.JFrame {

    /**
     * Creates new form adminMain_GUI
     */
    public adminMain_GUI() {
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
        ClientButton = new javax.swing.JButton();
        SignoutButton = new javax.swing.JButton();
        courseListButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        unitListButton = new javax.swing.JButton();
        industryListButton = new javax.swing.JButton();
        caseworkerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setForeground(new java.awt.Color(60, 60, 60));
        jPanel1.setToolTipText("");

        ClientButton.setBackground(new java.awt.Color(51, 51, 51));
        ClientButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ClientButton.setForeground(new java.awt.Color(255, 255, 255));
        ClientButton.setText("Client Data");
        ClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientButtonActionPerformed(evt);
            }
        });

        SignoutButton.setBackground(new java.awt.Color(0, 153, 255));
        SignoutButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SignoutButton.setForeground(new java.awt.Color(255, 255, 255));
        SignoutButton.setText("Sign Out");
        SignoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutButtonActionPerformed(evt);
            }
        });

        courseListButton.setBackground(new java.awt.Color(51, 51, 51));
        courseListButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        courseListButton.setForeground(new java.awt.Color(255, 255, 255));
        courseListButton.setText("Course List");
        courseListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseListButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMIN PANEL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel4)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        unitListButton.setBackground(new java.awt.Color(51, 51, 51));
        unitListButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        unitListButton.setForeground(new java.awt.Color(255, 255, 255));
        unitListButton.setText("Unit List");
        unitListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitListButtonActionPerformed(evt);
            }
        });

        industryListButton.setBackground(new java.awt.Color(51, 51, 51));
        industryListButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        industryListButton.setForeground(new java.awt.Color(255, 255, 255));
        industryListButton.setText("Industry List");
        industryListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industryListButtonActionPerformed(evt);
            }
        });

        caseworkerButton.setBackground(new java.awt.Color(51, 51, 51));
        caseworkerButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        caseworkerButton.setForeground(new java.awt.Color(255, 255, 255));
        caseworkerButton.setText("Caseworker Data");
        caseworkerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseworkerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(SignoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(courseListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unitListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(industryListButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caseworkerButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseworkerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(industryListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unitListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(SignoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        clientData_GUI s = new clientData_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_ClientButtonActionPerformed

    private void SignoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        startGUI s = new startGUI();
        s.setVisible(true);
    }//GEN-LAST:event_SignoutButtonActionPerformed

    private void courseListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseListButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        clientCourseListAdmin_GUI s = new clientCourseListAdmin_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_courseListButtonActionPerformed

    private void unitListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitListButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        clientUnitListAdmin_GUI s = new clientUnitListAdmin_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_unitListButtonActionPerformed

    private void industryListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industryListButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        clientIndustryListAdmin_GUI s = new clientIndustryListAdmin_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_industryListButtonActionPerformed

    private void caseworkerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseworkerButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        clientCaseworkerAdmin_GUI s = new clientCaseworkerAdmin_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_caseworkerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminMain_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminMain_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminMain_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminMain_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and SignoutButtonthe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminMain_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClientButton;
    private javax.swing.JButton SignoutButton;
    private javax.swing.JButton caseworkerButton;
    private javax.swing.JButton courseListButton;
    private javax.swing.JButton industryListButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton unitListButton;
    // End of variables declaration//GEN-END:variables
}

package EITS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817
 *@purpose This page is the course list admin page and displays all the courses for each industry for the admin to insert, update, and delete original or new courses. 
 *@version control 1.0
 *@date 10/06/2018
 */
public class clientCourseListAdmin_GUI extends javax.swing.JFrame {
    Connection con = null; 
    ResultSet rs = null; 
    PreparedStatement ps = null; 
    Statement st = null;
    /**
     * Creates new form clientIndustryListAdmin_GUI
     */
    public clientCourseListAdmin_GUI() {
        initComponents();
        con = DatabaseConnection.getConnection();
        SelectComboBox();
        course_list();
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
        jPanel6 = new javax.swing.JPanel();
        backButton2 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        CourselistAdmin = new javax.swing.JLabel();
        jInsertButton = new javax.swing.JButton();
        jUpdateButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        industryLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        clearButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jCourseListTable = new javax.swing.JTable();
        jTextField_Code = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        jTextField_Title = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        jSelectIndustryComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setForeground(new java.awt.Color(60, 60, 60));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(889, 494));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

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

        CourselistAdmin.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        CourselistAdmin.setForeground(new java.awt.Color(255, 255, 255));
        CourselistAdmin.setText("COURSE LIST");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CourselistAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton2)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton)
                    .addComponent(backButton2))
                .addGap(12, 12, 12))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(CourselistAdmin)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jInsertButton.setBackground(new java.awt.Color(51, 51, 51));
        jInsertButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jInsertButton.setForeground(new java.awt.Color(255, 255, 255));
        jInsertButton.setText("INSERT");
        jInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertButtonActionPerformed(evt);
            }
        });

        jUpdateButton.setBackground(new java.awt.Color(51, 51, 51));
        jUpdateButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        jUpdateButton.setText("UPDATE");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jDeleteButton.setBackground(new java.awt.Color(51, 51, 51));
        jDeleteButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        jDeleteButton.setText("DELETE");
        jDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteButtonActionPerformed(evt);
            }
        });

        industryLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        industryLabel.setForeground(new java.awt.Color(255, 255, 255));
        industryLabel.setText("Industry ID:");

        idLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID:");

        clearButton1.setBackground(new java.awt.Color(0, 153, 255));
        clearButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setText("CLEAR");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        jCourseListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Industry ID", "Code", "Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jCourseListTable.getTableHeader().setReorderingAllowed(false);
        jCourseListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCourseListTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jCourseListTable);
        if (jCourseListTable.getColumnModel().getColumnCount() > 0) {
            jCourseListTable.getColumnModel().getColumn(0).setResizable(false);
            jCourseListTable.getColumnModel().getColumn(1).setResizable(false);
            jCourseListTable.getColumnModel().getColumn(2).setResizable(false);
            jCourseListTable.getColumnModel().getColumn(3).setResizable(false);
        }

        codeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codeLabel.setForeground(new java.awt.Color(255, 255, 255));
        codeLabel.setText("Code:");

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Title:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(industryLabel)
                            .addComponent(titleLabel)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel))
                        .addGap(28, 28, 28)
                        .addComponent(clearButton1))
                    .addComponent(codeLabel)
                    .addComponent(jTextField_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSelectIndustryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(industryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSelectIndustryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(codeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Selects the column id from the industries table in the database
    // then adds it to the combox box for a drop down selection
    public void SelectComboBox() {    
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id` FROM `industries`");
            while(rs.next()){
                jSelectIndustryComboBox.addItem(rs.getString("id"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientCourseListAdmin_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    // Acquires the Class CourseList and assigns it as an arraylist then selects all columns from the database
    public ArrayList<CourseList> getCourseList() {
        ArrayList<CourseList> coursesList = new ArrayList<>();
        String sql = "SELECT * FROM courses";
    
    try {
        st = con.createStatement();
        rs = st.executeQuery(sql);
        CourseList courseList; 
        while(rs.next()) {
            courseList = new CourseList(rs.getInt("id"), rs.getInt("industries_id"), 
            rs.getString("code"), rs.getString("title"));
            coursesList.add(courseList);
        }
        
    }   catch (SQLException ex) {            
    
    }            
    
    return coursesList; 
   
    }
    
    // Displays the arraylist into the jCourseListTable and acquires ints and strings
    // from the UnitList class to be assigned into rows in the jCourseListTable
    public void course_list() {    
        ArrayList<CourseList> list = getCourseList();
        DefaultTableModel model = (DefaultTableModel) jCourseListTable.getModel();
        Object[] row = new Object[4];
     
     for(int i = 0; i < list.size(); i++) {// note no list.length() but size()
         row[0] = list.get(i).getID();
         row[1] = list.get(i).getIndustryID();
         row[2] = list.get(i).getCode();
         row[3] = list.get(i).getTitle();
         model.addRow(row);
     } // end of for
    } // end of course_list
    
    public void executeSQlQuery(String query, String message) {
        try {
            st = con.createStatement();
            if((st.executeUpdate(query))==1) {
                DefaultTableModel model = (DefaultTableModel)jCourseListTable.getModel();
                model.setRowCount(0);
                getCourseList();
                JOptionPane.showMessageDialog(null, "Data " + message + " Sucessful");
             } else {    
                 JOptionPane.showMessageDialog(null, "Data Not " + message);
             } // end of if 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    // Allows the user to go back to the previous form 
    private void backButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseClicked
        dispose();
        adminMain_GUI s = new adminMain_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_backButton2MouseClicked
    
    // Exits out of the system
    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    // Acquires the inputed values from the text fields then executes the query
    // of inserting into the courses table in the database
    private void jInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertButtonActionPerformed
        try {
            String sql = "INSERT INTO courses (industries_id, code, title) "+
                    " VALUES (?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setObject(1,jSelectIndustryComboBox.getSelectedItem());
            ps.setString(2,jTextField_Code.getText());
            ps.setString(3,jTextField_Title.getText());
            ps.execute();
            DefaultTableModel model = (DefaultTableModel)jCourseListTable.getModel();
            model.setRowCount(0);
            course_list();
            JOptionPane.showMessageDialog(null, "Inserted " + "Sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jInsertButtonActionPerformed

    // Acquires the selected row and inputed values from the text fields then executes the query
    // of updating into the courses table in the database
    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        try {
            int row = jCourseListTable.getSelectedRow(); 
            String value = (jCourseListTable.getModel().getValueAt(row, 0).toString());
            String sql = "UPDATE courses SET id=?, industries_id=?, code=?, title=? WHERE id="+value;
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,jTextField_ID.getText());
            ps.setObject(2,jSelectIndustryComboBox.getSelectedItem());
            ps.setString(3,jTextField_Code.getText());
            ps.setString(4,jTextField_Title.getText());
            ps.execute();
            DefaultTableModel model = (DefaultTableModel)jCourseListTable.getModel();
            model.setRowCount(0);
            course_list();
            JOptionPane.showMessageDialog(null, "Updated " + "Sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    // Deletes the selected row in the jTable from the database
    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        String query = "DELETE FROM `courses` WHERE id = " + this.jTextField_ID.getText();
        executeSQlQuery(query, "Deleted");
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    // Clears the values inputed on the form
    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        dispose();
        clientCourseListAdmin_GUI s = new clientCourseListAdmin_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_clearButton1ActionPerformed

    // Allows the user to select a specifc row in the Jtable and then output
    // the columns in that row to their respected text fields
    private void jCourseListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCourseListTableMouseClicked
        int i = jCourseListTable.getSelectedRow();
        TableModel model= jCourseListTable.getModel();
        jTextField_ID.setText(model.getValueAt(i,0).toString());
        jSelectIndustryComboBox.setSelectedItem(model.getValueAt(i,1).toString());
        jTextField_Code.setText(model.getValueAt(i,2).toString());
        jTextField_Title.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jCourseListTableMouseClicked
 
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
            java.util.logging.Logger.getLogger(clientCourseListAdmin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientCourseListAdmin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientCourseListAdmin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientCourseListAdmin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientCourseListAdmin_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourselistAdmin;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel backButton2;
    private javax.swing.JButton clearButton1;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel industryLabel;
    private javax.swing.JTable jCourseListTable;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JButton jInsertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jSelectIndustryComboBox;
    private javax.swing.JTextField jTextField_Code;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Title;
    private javax.swing.JButton jUpdateButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

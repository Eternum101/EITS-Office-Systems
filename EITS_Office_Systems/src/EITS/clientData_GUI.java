package EITS;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *@author Jakob 2104990817, Brayden 2101560216,  Alex 7105395517
 *@purpose This page allows an admin to view, insert, update or delete client data inside the database. 
 *@version control 1.0
 *@date 10/06/2018
 */
public class clientData_GUI extends javax.swing.JFrame {
    Connection con = null; 
    ResultSet rs = null; 
    PreparedStatement ps = null; 
    Statement st = null; 
    /**
     * Creates new form clientData_GUI
     */
    public clientData_GUI() {
        
        
        initComponents();
        con = DatabaseConnection.getConnection();
        show_users();
        //Drag and drop
        this.clientdataTable.setDragEnabled(true);
        //this.jTextField_FirstName.setDragEnabled(true);
        //this.jTextField_LastName.setDragEnabled(true);
        this.jTextField_drophere.setDragEnabled(true);
        //jTextField1.setEditable(false);
        
        /*
        int i = jTable1.getSelectedRow(); 
        TableModel model= jTable1.getModel();
        jTextField_ID.setText(model.getValueAt(i,0).toString());
        jTextField_FirstName.setText(model.getValueAt(i,1).toString());
        jTextField_LastName.setText(model.getValueAt(i,2).toString());
        jTextField_Email.setText(model.getValueAt(i,3).toString());
        jTextField_Password.setText(model.getValueAt(i,4).toString());
        */
        
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
        jUpdateButton = new javax.swing.JButton();
        jInsertButton = new javax.swing.JButton();
        jDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientdataTable = new javax.swing.JTable();
        idLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jTextField_LastName = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        jTextField_Password = new javax.swing.JTextField();
        clearButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        backButton2 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        clientdataLabel = new javax.swing.JLabel();
        jTextField_drophere = new javax.swing.JTextField();
        drophereLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setForeground(new java.awt.Color(60, 60, 60));
        jPanel1.setToolTipText("");

        jUpdateButton.setBackground(new java.awt.Color(51, 51, 51));
        jUpdateButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jUpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        jUpdateButton.setText("UPDATE");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jInsertButton.setBackground(new java.awt.Color(51, 51, 51));
        jInsertButton.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jInsertButton.setForeground(new java.awt.Color(255, 255, 255));
        jInsertButton.setText("INSERT");
        jInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertButtonActionPerformed(evt);
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

        clientdataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientdataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientdataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientdataTable);
        if (clientdataTable.getColumnModel().getColumnCount() > 0) {
            clientdataTable.getColumnModel().getColumn(0).setResizable(false);
            clientdataTable.getColumnModel().getColumn(1).setResizable(false);
            clientdataTable.getColumnModel().getColumn(2).setResizable(false);
            clientdataTable.getColumnModel().getColumn(3).setResizable(false);
            clientdataTable.getColumnModel().getColumn(4).setResizable(false);
        }

        idLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID");

        firstnameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setText("First Name");

        lastnameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastnameLabel.setText("Last Name");

        emailLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email");

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FirstNameActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        clearButton1.setBackground(new java.awt.Color(0, 153, 255));
        clearButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(255, 255, 255));
        clearButton1.setText("CLEAR");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/return_28px.png"))); // NOI18N
        backButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backButton2MouseMoved(evt);
            }
        });
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

        clientdataLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        clientdataLabel.setForeground(new java.awt.Color(255, 255, 255));
        clientdataLabel.setText("CLIENT DATA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(clientdataLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton2)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientdataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton)
                    .addComponent(backButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField_drophere.setBackground(new java.awt.Color(51, 51, 51));
        jTextField_drophere.setForeground(new java.awt.Color(102, 102, 102));
        jTextField_drophere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField_drophereMouseEntered(evt);
            }
        });
        jTextField_drophere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_drophereActionPerformed(evt);
            }
        });
        jTextField_drophere.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTextField_drophereVetoableChange(evt);
            }
        });

        drophereLabel.setForeground(new java.awt.Color(255, 255, 255));
        drophereLabel.setText("Drop Here:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLabel)
                                    .addComponent(lastnameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstnameLabel)
                                    .addComponent(idLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_FirstName)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_drophere, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(drophereLabel)
                                        .addGap(9, 9, 9)))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(clearButton1)
                                .addGap(79, 79, 79)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(drophereLabel)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField_drophere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnameLabel))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<UserList> getUserList() {
        ArrayList<UserList> usersList = new ArrayList<>();
        String sql = "SELECT * FROM users";
    
    try {
        st = con.createStatement();
        rs = st.executeQuery(sql);
        UserList userList; 
        while(rs.next()) {
            userList = new UserList(rs.getInt("userID"), rs.getString("fName"), rs.getString("lName")
            , rs.getString("email"), rs.getString("password"));
            usersList.add(userList);
        }
        
    }   catch (SQLException ex) {            
    
    }            
    
    return usersList; 
   
    }
    
    
    public void show_users() {
     ArrayList<UserList> list = getUserList();
     DefaultTableModel model = (DefaultTableModel) clientdataTable.getModel();
     Object[] row = new Object[5];
     
     for(int i = 0; i < list.size(); i++) {// note no list.length() but size()
         row[0] = list.get(i).getuserID();
         row[1] = list.get(i).getFirstName();
         row[2] = list.get(i).getLastName();
         row[3] = list.get(i).getEmail();
         row[4] = list.get(i).getPassword();
         model.addRow(row);
     } // end of for
    } // end of show_users
    
    public void executeSQlQuery(String query, String message) {
        try {
            st = con.createStatement();
            if((st.executeUpdate(query))==1) {
                DefaultTableModel model = (DefaultTableModel)clientdataTable.getModel();
                model.setRowCount(0);
                show_users();
                JOptionPane.showMessageDialog(null, "Data " + message + " Sucessful");
             } else {    
                 JOptionPane.showMessageDialog(null, "Data Not " + message);
             } // end of if 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
         try {
            // TODO add your handling code here:
            int row = clientdataTable.getSelectedRow(); 
            String value = (clientdataTable.getModel().getValueAt(row, 0).toString());
            String sql = "UPDATE users SET fName=?, lName=?, email=?, password=? WHERE userID="+value;
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,jTextField_FirstName.getText());
            ps.setString(2,jTextField_LastName.getText());
            ps.setString(3,jTextField_Email.getText());
            ps.setString(4,jTextField_Password.getText());
            ps.execute();
            DefaultTableModel model = (DefaultTableModel)clientdataTable.getModel();
            model.setRowCount(0);
            show_users();
            JOptionPane.showMessageDialog(null, "Updated " + "Sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteButtonActionPerformed
        String query = "DELETE FROM `users` WHERE userID = " + this.jTextField_ID.getText();
        executeSQlQuery(query, "Deleted"); 
    }//GEN-LAST:event_jDeleteButtonActionPerformed

    private void jTextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FirstNameActionPerformed

    private void clientdataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientdataTableMouseClicked
        // TODO add your handling code here:
       /* int i = jTable1.getSelectedRow(); 
        TableModel model= jTable1.getModel();
        jTextField_ID.setText(model.getValueAt(i,0).toString());
        jTextField_FirstName.setText(model.getValueAt(i,1).toString());
        jTextField_LastName.setText(model.getValueAt(i,2).toString());
        jTextField_Email.setText(model.getValueAt(i,3).toString());
        jTextField_Password.setText(model.getValueAt(i,4).toString()); */
    }//GEN-LAST:event_clientdataTableMouseClicked

    private void jInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertButtonActionPerformed
        try {
            // TODO add your handling code here:
            String sql = "INSERT INTO users (fName, lName, email, password) "+
                    " VALUES (?,?,?,?)";
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setString(1,jTextField_FirstName.getText());
            ps.setString(2,jTextField_LastName.getText());
            ps.setString(3,jTextField_Email.getText());
            ps.setString(4,jTextField_Password.getText());
            ps.execute();
            DefaultTableModel model = (DefaultTableModel)clientdataTable.getModel();
            model.setRowCount(0);
            show_users();
            JOptionPane.showMessageDialog(null, "Inserted " + "Sucessfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jInsertButtonActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        clientData_GUI s = new clientData_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void backButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_backButton2MouseMoved

    private void backButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseClicked
        // TODO add your handling code here:
        dispose();
        adminMain_GUI s = new adminMain_GUI();
        s.setVisible(true);
    }//GEN-LAST:event_backButton2MouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_drophereVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTextField_drophereVetoableChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_drophereVetoableChange

    private void jTextField_drophereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_drophereActionPerformed
        // TODO add your handling code here:
        /*try {
            if () {
            int i = jTable1.getSelectedRow(); 
        TableModel model= jTable1.getModel();
        jTextField_ID.setText(model.getValueAt(i,0).toString());
        jTextField_FirstName.setText(model.getValueAt(i,1).toString());
        jTextField_LastName.setText(model.getValueAt(i,2).toString());
        jTextField_Email.setText(model.getValueAt(i,3).toString());
        jTextField_Password.setText(model.getValueAt(i,4).toString());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
    }//GEN-LAST:event_jTextField_drophereActionPerformed

    private void jTextField_drophereMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_drophereMouseEntered
        // TODO add your handling code here:
        int i = clientdataTable.getSelectedRow(); 
        TableModel model= clientdataTable.getModel();
        jTextField_ID.setText(model.getValueAt(i,0).toString());
        jTextField_FirstName.setText(model.getValueAt(i,1).toString());
        jTextField_LastName.setText(model.getValueAt(i,2).toString());
        jTextField_Email.setText(model.getValueAt(i,3).toString());
        jTextField_Password.setText(model.getValueAt(i,4).toString());
    }//GEN-LAST:event_jTextField_drophereMouseEntered

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
            java.util.logging.Logger.getLogger(clientData_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientData_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientData_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientData_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientData_GUI().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel backButton2;
    private javax.swing.JButton clearButton1;
    private javax.swing.JLabel clientdataLabel;
    private javax.swing.JTable clientdataTable;
    private javax.swing.JLabel drophereLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jDeleteButton;
    private javax.swing.JButton jInsertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_drophere;
    private javax.swing.JButton jUpdateButton;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables


    }


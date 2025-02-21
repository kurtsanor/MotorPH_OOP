/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motorphpayroll;

import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.PanelRound;
import motorphpayroll.customcomponents.MyButton;
import motorphpayroll.customcomponents.RoundJTextField;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author keith
 */
public class LeaveForm extends javax.swing.JFrame {

    private User user;
    private LeaveRequestGui leavePage;
    private LeaveManagementModule leaveModule;
    private JTable leaveTable;
    
    public LeaveForm(User user, LeaveRequestGui leavePage, JTable leaveTable) {
        initComponents();
        adjustTextField();
        this.user = user;
        this.leavePage = leavePage;
        this.leaveTable = leaveTable;
        leaveModule = new LeaveManagementModule(user);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new PanelRound();
        leaveType = new javax.swing.JComboBox<>();
        endDateField = new RoundJTextField(5);
        startDateField = new RoundJTextField(5);
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        submitButton = new MyButton();
        cancelButton = new MyButton();
        jPanel1 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        jLabel46 = new javax.swing.JLabel();
        reasonField = new RoundJTextField(5);
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 0));

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        leaveType.setBackground(new java.awt.Color(255, 255, 255));
        leaveType.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        leaveType.setForeground(new java.awt.Color(0, 0, 0));
        leaveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VL - Vacation", "SL - Sick", "PL - Personal" }));
        leaveType.setBorder(null);
        leaveType.setFocusable(false);
        leaveType.setLightWeightPopupEnabled(false);

        endDateField.setBackground(new java.awt.Color(255, 255, 255));
        endDateField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        endDateField.setForeground(new java.awt.Color(102, 102, 102));
        endDateField.setText("MM/DD/YYYY");
        endDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        endDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                endDateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                endDateFieldFocusLost(evt);
            }
        });
        endDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateFieldActionPerformed(evt);
            }
        });

        startDateField.setBackground(new java.awt.Color(255, 255, 255));
        startDateField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        startDateField.setForeground(new java.awt.Color(102, 102, 102));
        startDateField.setText("MM/DD/YYYY");
        startDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        startDateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startDateFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                startDateFieldFocusLost(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Leave Type*");

        jLabel43.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Start Date*");

        jLabel44.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("End Date*");

        jLabel45.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Reason*");

        submitButton.setBackground(new java.awt.Color(252, 141, 80));
        submitButton.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorderPainted(false);
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButtonMouseExited(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.setBorderPainted(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(47, 36, 56));
        jLabel46.setText("APPLY LEAVE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        reasonField.setBackground(new java.awt.Color(255, 255, 255));
        reasonField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        reasonField.setForeground(new java.awt.Color(102, 102, 102));
        reasonField.setText("Enter reason for your leave...");
        reasonField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reasonField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reasonFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reasonFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(leaveType, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(reasonField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel43)))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                            .addComponent(jLabel44)
                                            .addGap(238, 238, 238)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel45)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaveType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(startDateField))
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reasonField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (startDateField.getText().isBlank() || endDateField.getText().isBlank() || reasonField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please fillup all information");
        }
        else {         
            String leavetype = String.valueOf(leaveType.getSelectedItem());
            leaveModule.submitLeaveRequest(user.getId(), startDateField.getText(),endDateField.getText(), reasonField.getText(), user.getFirstName(), user.getLastName(), leavetype, "Pending");
            leaveModule.loadTable(leaveTable);
            this.dispose();
            leavePage.setVisible(true);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        leavePage.setVisible(true);
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void endDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateFieldActionPerformed

    private void startDateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startDateFieldFocusGained
        if (startDateField.getText().equals("MM/DD/YYYY")) {
            startDateField.setText("");
            startDateField.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_startDateFieldFocusGained

    private void startDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startDateFieldFocusLost
        if (startDateField.getText().equals("")) {
            startDateField.setText("MM/DD/YYYY");
            startDateField.setForeground(Color.GRAY);
        }
        
    }//GEN-LAST:event_startDateFieldFocusLost

    private void endDateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endDateFieldFocusGained
        if (endDateField.getText().equals("MM/DD/YYYY")) {
            endDateField.setText("");
            endDateField.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_endDateFieldFocusGained

    private void endDateFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_endDateFieldFocusLost
        if (endDateField.getText().equals("")) {
            endDateField.setText("MM/DD/YYYY");
            endDateField.setForeground(Color.GRAY);
        }
        
    }//GEN-LAST:event_endDateFieldFocusLost

    private void reasonFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reasonFieldFocusGained
        if (reasonField.getText().equals("Enter reason for your leave...")) {
            reasonField.setText("");
            reasonField.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_reasonFieldFocusGained

    private void reasonFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reasonFieldFocusLost
        if (reasonField.getText().equals("")) {
            reasonField.setText("Enter reason for your leave...");
            reasonField.setForeground(Color.GRAY);
        }
        
    }//GEN-LAST:event_reasonFieldFocusLost

    private void submitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseEntered
        submitButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_submitButtonMouseEntered

    private void submitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseExited
        submitButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_submitButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setBackground(new Color(214,214,214));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void adjustTextField() {
        startDateField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(startDateField.getForeground(), 0),
                    new EmptyBorder(5, 10, 5, 10)
            ));
        endDateField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(endDateField.getForeground(), 0),
                    new EmptyBorder(5, 10, 5, 10)
            ));
        reasonField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(reasonField.getForeground(), 0),
                    new EmptyBorder(5, 10, 5, 10)
            ));
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField endDateField;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> leaveType;
    private javax.swing.JTextField reasonField;
    private javax.swing.JTextField startDateField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}

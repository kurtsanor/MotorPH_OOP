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
import java.text.SimpleDateFormat;
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
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
    
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
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();
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
        setPreferredSize(new java.awt.Dimension(700, 510));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(238, 238, 238));
        jPanel2.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(null);

        leaveType.setBackground(new java.awt.Color(255, 255, 255));
        leaveType.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        leaveType.setForeground(new java.awt.Color(0, 0, 0));
        leaveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VL - Vacation", "SL - Sick", "PL - Personal" }));
        leaveType.setBorder(null);
        leaveType.setFocusable(false);
        leaveType.setLightWeightPopupEnabled(false);
        jPanel10.add(leaveType);
        leaveType.setBounds(22, 117, 269, 45);

        startDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startDateChooserPropertyChange(evt);
            }
        });
        jPanel10.add(startDateChooser);
        startDateChooser.setBounds(300, 212, 22, 30);

        endDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                endDateChooserPropertyChange(evt);
            }
        });
        jPanel10.add(endDateChooser);
        endDateChooser.setBounds(627, 210, 22, 30);

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
        jPanel10.add(endDateField);
        endDateField.setBounds(353, 204, 304, 45);

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
        jPanel10.add(startDateField);
        startDateField.setBounds(20, 205, 310, 45);

        jLabel42.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Leave Type*");
        jPanel10.add(jLabel42);
        jLabel42.setBounds(22, 89, 69, 16);

        jLabel43.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Start Date*");
        jPanel10.add(jLabel43);
        jLabel43.setBounds(30, 182, 63, 16);

        jLabel44.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("End Date*");
        jPanel10.add(jLabel44);
        jLabel44.setBounds(362, 183, 57, 15);

        jLabel45.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Reason*");
        jPanel10.add(jLabel45);
        jLabel45.setBounds(31, 267, 48, 15);

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
        jPanel10.add(submitButton);
        submitButton.setBounds(561, 409, 90, 38);

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
        jPanel10.add(cancelButton);
        cancelButton.setBounds(459, 410, 90, 36);

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

        jPanel10.add(jPanel1);
        jPanel1.setBounds(0, 0, 686, 71);

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
        jPanel10.add(reasonField);
        reasonField.setBounds(22, 288, 635, 103);
        jPanel10.add(jTextField1);
        jTextField1.setBounds(427, 6, 0, 22);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(0, 0, 686, 470);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 686, 470);

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

    private void endDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_endDateChooserPropertyChange
        if (endDateChooser.getDate() == null) return;
        endDateField.setText(dateFormat.format(endDateChooser.getDate()));
    }//GEN-LAST:event_endDateChooserPropertyChange

    private void startDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_startDateChooserPropertyChange
        if (startDateChooser.getDate() == null) return;
        startDateField.setText(dateFormat.format(startDateChooser.getDate()));
        System.out.println(dateFormat.format(startDateChooser.getDate()));
    }//GEN-LAST:event_startDateChooserPropertyChange

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
    private com.toedter.calendar.JDateChooser endDateChooser;
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
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JTextField startDateField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}

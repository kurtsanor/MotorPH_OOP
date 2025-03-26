/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiClasses;

import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.PanelRound;
import motorphpayroll.customcomponents.MyButton;
import motorphpayroll.customcomponents.RoundJTextField;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import oopClasses.EmployeeManagementModule;
import oopClasses.RegularEmployee;

/**
 *
 * @author keith
 */
public class LeaveForm extends javax.swing.JFrame {

    private int employeeID;
    private LeaveRequestGui leavePage;
    private SimpleDateFormat dateFormat; 
    private EmployeeManagementModule empModule;
    private RegularEmployee employee;
    
    public LeaveForm(int employeeID, LeaveRequestGui leavePage) {
        initComponents();
        adjustTextField();
        this.employeeID = employeeID;
        this.leavePage = leavePage;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        empModule = new EmployeeManagementModule();
        employee = empModule.getEmployeeDetails(employeeID);         
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
        setMaximumSize(new java.awt.Dimension(700, 510));
        setMinimumSize(new java.awt.Dimension(700, 510));
        setPreferredSize(new java.awt.Dimension(700, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        leaveType.setBounds(22, 117, 300, 45);

        startDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        startDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startDateChooserPropertyChange(evt);
            }
        });
        jPanel10.add(startDateChooser);
        startDateChooser.setBounds(300, 212, 23, 30);

        endDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        endDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                endDateChooserPropertyChange(evt);
            }
        });
        jPanel10.add(endDateChooser);
        endDateChooser.setBounds(627, 210, 23, 30);

        endDateField.setEditable(false);
        endDateField.setBackground(new java.awt.Color(255, 255, 255));
        endDateField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        endDateField.setForeground(new java.awt.Color(0, 0, 0));
        endDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(endDateField);
        endDateField.setBounds(353, 204, 304, 45);

        startDateField.setEditable(false);
        startDateField.setBackground(new java.awt.Color(255, 255, 255));
        startDateField.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        startDateField.setForeground(new java.awt.Color(0, 0, 0));
        startDateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jTextField1.setBounds(427, 6, 0, 26);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(0, 0, 700, 470);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-1, 0, 690, 470);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (startDateField.getText().isBlank() || endDateField.getText().isBlank() || reasonField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Please fillup all information");
            return;
        }
                   
        if (validDateFields() && validReason()) {
            
            LocalDate startDate = LocalDate.parse(startDateField.getText());
            LocalDate endDate = LocalDate.parse(endDateField.getText());
            String reason = reasonField.getText();
            String firstName = employee.getFirstName();
            String lastName = employee.getLastName();           
            String leavetype = String.valueOf(leaveType.getSelectedItem());
                       
            boolean submitted = employee.requestForLeave(employeeID, startDate, endDate, reason, firstName, lastName, leavetype);
            if (submitted) {
                JOptionPane.showMessageDialog(null, "Request Successfully submitted");
                leavePage.loadLeaveTable();
                this.dispose();
                leavePage.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Unable to send request");
            }
            
        }         
        
    }//GEN-LAST:event_submitButtonActionPerformed
    private boolean validReason () {
        String placeholder = "Enter reason for your leave...";
        if (reasonField.getText().equals(placeholder)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid reason");
            return false;
        }
        return true;
    }
    
    
    private boolean validDateFields () {        
        LocalDate startDate = LocalDate.parse(startDateField.getText());
        LocalDate endDate = LocalDate.parse(endDateField.getText());
        LocalDate currentDate = LocalDate.now();
        
        // checks if leave dates are in the past or end date is before the start date
        if (startDate.isBefore(currentDate) || endDate.isBefore(currentDate) || endDate.isEqual(startDate) || startDate.isAfter(endDate)) {
            JOptionPane.showMessageDialog(null, 
            "Invalid leave request:\n" +
            "- Leave dates cannot be in the past.\n" +
            "- The end date must be after the start date.", 
            "Leave Request Error", 
            JOptionPane.ERROR_MESSAGE);          
            return false;
        }
        
        // if no errors are found return true
        return true;
    }
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
        leavePage.setVisible(true);            
    }//GEN-LAST:event_cancelButtonActionPerformed

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

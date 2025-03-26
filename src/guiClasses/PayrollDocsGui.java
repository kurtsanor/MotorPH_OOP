/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiClasses;

import oopClasses.EmployeeManagementModule;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import motorphpayroll.customcomponents.CustomPanel;
import oopClasses.AttendanceModule;
import oopClasses.RegularEmployee;

/**
 *
 * @author keith
 */
public class PayrollDocsGui extends javax.swing.JFrame {

    private HomePageGui homePage;
    private JWindow overlay = new JWindow();
    private EmployeeManagementModule empModule;
    private AttendanceModule attendanceModule;
    private RegularEmployee employee;

    public PayrollDocsGui(int employeeID, HomePageGui homePage) {
        empModule = new EmployeeManagementModule();
        attendanceModule = new AttendanceModule(employeeID);
        employee = empModule.getEmployeeDetails(employeeID);
        this.homePage = homePage;
        initComponents();
        overlay.setBackground(new Color(0, 0, 0, 200));
        overlay.setVisible(false);       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton = new javax.swing.JButton();
        manageEmpLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        employeeProfileLabel = new javax.swing.JLabel();
        employeeProfileLabel1 = new javax.swing.JLabel();
        januaryPayslip = new javax.swing.JLabel();
        febPayslip = new javax.swing.JLabel();
        marchPayslip = new javax.swing.JLabel();
        aprilPayslip = new javax.swing.JLabel();
        mayPayslip = new javax.swing.JLabel();
        junePayslip = new javax.swing.JLabel();
        julyPayslip = new javax.swing.JLabel();
        augustPayslip = new javax.swing.JLabel();
        septemberPayslip = new javax.swing.JLabel();
        octoberPayslip = new javax.swing.JLabel();
        novemberPayslip = new javax.swing.JLabel();
        decemberPayslip = new javax.swing.JLabel();
        employeeProfileLabel14 = new javax.swing.JLabel();
        employeeProfileLabel15 = new javax.swing.JLabel();
        employeeProfileLabel16 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(204, 204, 204));
        headerPanel.setPreferredSize(new java.awt.Dimension(479, 60));

        backButton.setBackground(new java.awt.Color(158, 158, 158));
        backButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        manageEmpLabel.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        manageEmpLabel.setForeground(new java.awt.Color(47, 36, 56));
        manageEmpLabel.setText("PAYROLL DOCUMENTS");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageEmpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(manageEmpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        employeeProfileLabel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        employeeProfileLabel.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel.setText("Other Forms");

        employeeProfileLabel1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        employeeProfileLabel1.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel1.setText("Monthly Payslips");

        januaryPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        januaryPayslip.setForeground(new java.awt.Color(47, 36, 56));
        januaryPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-January</U></HTML>");
        januaryPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        januaryPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                januaryPayslipMouseClicked(evt);
            }
        });

        febPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        febPayslip.setForeground(new java.awt.Color(47, 36, 56));
        febPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-February</U></HTML>");
        febPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        febPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                febPayslipMouseClicked(evt);
            }
        });

        marchPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        marchPayslip.setForeground(new java.awt.Color(47, 36, 56));
        marchPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-March</U></HTML>");
        marchPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        marchPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marchPayslipMouseClicked(evt);
            }
        });

        aprilPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        aprilPayslip.setForeground(new java.awt.Color(47, 36, 56));
        aprilPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-April</U></HTML>");
        aprilPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aprilPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aprilPayslipMouseClicked(evt);
            }
        });

        mayPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        mayPayslip.setForeground(new java.awt.Color(47, 36, 56));
        mayPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-May</U></HTML>");
        mayPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mayPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mayPayslipMouseClicked(evt);
            }
        });

        junePayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        junePayslip.setForeground(new java.awt.Color(47, 36, 56));
        junePayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-June</U></HTML>");
        junePayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        junePayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                junePayslipMouseClicked(evt);
            }
        });

        julyPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        julyPayslip.setForeground(new java.awt.Color(47, 36, 56));
        julyPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-July</U></HTML>");
        julyPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        julyPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                julyPayslipMouseClicked(evt);
            }
        });

        augustPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        augustPayslip.setForeground(new java.awt.Color(47, 36, 56));
        augustPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-August</U></HTML>");
        augustPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        augustPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                augustPayslipMouseClicked(evt);
            }
        });

        septemberPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        septemberPayslip.setForeground(new java.awt.Color(47, 36, 56));
        septemberPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-September</U></HTML>");
        septemberPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        septemberPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                septemberPayslipMouseClicked(evt);
            }
        });

        octoberPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        octoberPayslip.setForeground(new java.awt.Color(47, 36, 56));
        octoberPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-October</U></HTML>");
        octoberPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        octoberPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                octoberPayslipMouseClicked(evt);
            }
        });

        novemberPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        novemberPayslip.setForeground(new java.awt.Color(47, 36, 56));
        novemberPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-November</U></HTML>");
        novemberPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novemberPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novemberPayslipMouseClicked(evt);
            }
        });

        decemberPayslip.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        decemberPayslip.setForeground(new java.awt.Color(47, 36, 56));
        decemberPayslip.setText("<HTML><U>"+employee.getLastName()+"-Payslip-December</U></HTML>");
        decemberPayslip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decemberPayslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decemberPayslipMouseClicked(evt);
            }
        });

        employeeProfileLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        employeeProfileLabel14.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel14.setText("<HTML><U>BIR Forms</U></HTML>");
        employeeProfileLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        employeeProfileLabel15.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        employeeProfileLabel15.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel15.setText("<HTML><U>Additional Form 1</U></HTML>");
        employeeProfileLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        employeeProfileLabel16.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        employeeProfileLabel16.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel16.setText("<HTML><U>Additional Form 2</U></HTML>");
        employeeProfileLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        yearComboBox.setBackground(new java.awt.Color(255, 255, 255));
        yearComboBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        yearComboBox.setForeground(new java.awt.Color(0, 0, 0));
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2022", "2023", "2024", "2025", "2026", "2027" }));
        yearComboBox.setBorder(null);
        yearComboBox.setFocusable(false);
        yearComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(octoberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(septemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(augustPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(julyPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(junePayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mayPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aprilPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeProfileLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(januaryPayslip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marchPayslip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(febPayslip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employeeProfileLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeProfileLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeProfileLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeProfileLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(januaryPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeProfileLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(febPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeProfileLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marchPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeProfileLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(aprilPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mayPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(junePayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(julyPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(augustPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(septemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(octoberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(novemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(decemberPayslip, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        homePage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void showOverlay() {
        overlay.setSize(this.getSize());
        overlay.setLocationRelativeTo(null);
        overlay.setVisible(true);
    }

    private void yearComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            if (yearComboBox.getSelectedItem().equals("Select Year")) {
                return;
            }
            // renames the JLabel to the employee's name and the selected year
            januaryPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-January-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            febPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-February-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            marchPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-March-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            aprilPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-April-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            mayPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-May-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            junePayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-June-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            julyPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-July-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            augustPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-August-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            septemberPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-September-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            octoberPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-October-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            novemberPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-November-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");
            decemberPayslip.setText("<HTML><U>" + employee.getLastName() + "-Payslip-December-" + yearComboBox.getSelectedItem().toString() + "</U></HTML>");

        }
    }//GEN-LAST:event_yearComboBoxItemStateChanged

    private void januaryPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_januaryPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "January";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_januaryPayslipMouseClicked

    private void febPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_febPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "February";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_febPayslipMouseClicked

    private void marchPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marchPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "March";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_marchPayslipMouseClicked

    private void aprilPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprilPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "April";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_aprilPayslipMouseClicked

    private void mayPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mayPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "May";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_mayPayslipMouseClicked

    private void junePayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_junePayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "June";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_junePayslipMouseClicked

    private void julyPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_julyPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "July";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_julyPayslipMouseClicked

    private void augustPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_augustPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "August";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_augustPayslipMouseClicked

    private void septemberPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_septemberPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "September";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_septemberPayslipMouseClicked

    private void octoberPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_octoberPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "October";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_octoberPayslipMouseClicked

    private void novemberPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novemberPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "November";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_novemberPayslipMouseClicked

    private void decemberPayslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decemberPayslipMouseClicked
        if (yearComboBox.getSelectedItem().toString().equalsIgnoreCase("Select Year")) {
            JOptionPane.showMessageDialog(null, "Please select a year to generate the payslip.");
            return;
        }
        
        String month = "December";
        String year = yearComboBox.getSelectedItem().toString();
        
        if (!attendanceModule.hasRecords(employee.getId(), month, year)) {
            JOptionPane.showMessageDialog(null, 
            "No attendance records found for " + month + " " + year + ".\nPayslip cannot be generated.", 
            "Attendance Not Found", 
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        showOverlay();
        new PayslipGui(employee.getId(), month, year, overlay).setVisible(true);
    }//GEN-LAST:event_decemberPayslipMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aprilPayslip;
    private javax.swing.JLabel augustPayslip;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel decemberPayslip;
    private javax.swing.JLabel employeeProfileLabel;
    private javax.swing.JLabel employeeProfileLabel1;
    private javax.swing.JLabel employeeProfileLabel14;
    private javax.swing.JLabel employeeProfileLabel15;
    private javax.swing.JLabel employeeProfileLabel16;
    private javax.swing.JLabel febPayslip;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel januaryPayslip;
    private javax.swing.JLabel julyPayslip;
    private javax.swing.JLabel junePayslip;
    private javax.swing.JLabel manageEmpLabel;
    private javax.swing.JLabel marchPayslip;
    private javax.swing.JLabel mayPayslip;
    private javax.swing.JLabel novemberPayslip;
    private javax.swing.JLabel octoberPayslip;
    private javax.swing.JLabel septemberPayslip;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}

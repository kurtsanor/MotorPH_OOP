/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiClasses;

import oopClasses.EmployeeManagementModule;
import oopClasses.AttendanceModule;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.RoundJTextField;
import oopClasses.RegularEmployee;

/**
 *
 * @author keith
 */
public class AttendanceDatabaseGUI extends javax.swing.JFrame {

    private AttendanceModule attendanceModule = new AttendanceModule(0);
    private EmployeeManagementModule empModule = new EmployeeManagementModule();
    private HomePageGui previousFrame;
    
    public AttendanceDatabaseGUI(HomePageGui previousFrame) {
        initComponents();
        addIndentionToTable();
        customizeTable();
        loadEmployeeList();
        adjustSearchField();
        this.previousFrame = previousFrame;   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeListTable = new javax.swing.JTable();
        headerPanel = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton = new javax.swing.JButton();
        manageEmpLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        employeeName = new javax.swing.JLabel();
        manageEmpLabel3 = new javax.swing.JLabel();
        timeSheetLabel2 = new javax.swing.JLabel();
        timeSheetLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        manageEmpLabel4 = new javax.swing.JLabel();
        manageEmpLabel5 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        manageEmpLabel6 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchField = new RoundJTextField(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        employeeListTable.setBackground(new java.awt.Color(255, 255, 255));
        employeeListTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        employeeListTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        employeeListTable.setForeground(new java.awt.Color(0, 0, 0));
        employeeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeListTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        employeeListTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeeListTable.setFocusable(false);
        employeeListTable.setGridColor(new java.awt.Color(102, 102, 102));
        employeeListTable.setRowHeight(70);
        employeeListTable.setSelectionBackground(new java.awt.Color(192, 227, 255));
        employeeListTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        employeeListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeeListTable.setShowGrid(false);
        employeeListTable.setShowHorizontalLines(true);
        employeeListTable.getTableHeader().setResizingAllowed(false);
        employeeListTable.getTableHeader().setReorderingAllowed(false);
        employeeListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                employeeListTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(employeeListTable);

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
        manageEmpLabel.setText("TIME AND ATTENDANCE DATABASE");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addComponent(manageEmpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setBorder(null);
        jScrollPane2.setFocusable(false);

        attendanceTable.setBackground(new java.awt.Color(255, 255, 255));
        attendanceTable.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        attendanceTable.setForeground(new java.awt.Color(68, 77, 38));
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " DATE", " TIME IN", " TIME OUT", " TOTAL HOURS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attendanceTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        attendanceTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        attendanceTable.setFocusable(false);
        attendanceTable.setGridColor(new java.awt.Color(204, 204, 204));
        attendanceTable.setRowHeight(30);
        attendanceTable.setSelectionBackground(new java.awt.Color(102, 102, 0));
        attendanceTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        attendanceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        attendanceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        attendanceTable.setShowGrid(false);
        attendanceTable.setShowHorizontalLines(true);
        attendanceTable.setShowVerticalLines(true);
        attendanceTable.getTableHeader().setResizingAllowed(false);
        attendanceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(attendanceTable);

        jPanel2.setBackground(new java.awt.Color(68, 77, 38));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        employeeName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        employeeName.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel3.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel3.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel3.setText("Employee:");

        timeSheetLabel2.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        timeSheetLabel2.setForeground(new java.awt.Color(136, 147, 100));
        timeSheetLabel2.setText("MONTHLY");

        timeSheetLabel.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        timeSheetLabel.setForeground(new java.awt.Color(68, 77, 38));
        timeSheetLabel.setText("TIMESHEET");

        jPanel3.setBackground(new java.awt.Color(68, 77, 38));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        dateText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateText.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel4.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        manageEmpLabel4.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel4.setText("Start Date of 1st Week:");

        manageEmpLabel5.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel5.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel5.setText("Select Month:");

        monthComboBox.setBackground(new java.awt.Color(255, 255, 255));
        monthComboBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        monthComboBox.setForeground(new java.awt.Color(0, 0, 0));
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthComboBox.setBorder(null);
        monthComboBox.setFocusable(false);
        monthComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthComboBoxItemStateChanged(evt);
            }
        });

        manageEmpLabel6.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel6.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel6.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel6.setText("Select Year:");

        yearComboBox.setBackground(new java.awt.Color(255, 255, 255));
        yearComboBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        yearComboBox.setForeground(new java.awt.Color(0, 0, 0));
        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027" }));
        yearComboBox.setBorder(null);
        yearComboBox.setFocusable(false);
        yearComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearComboBoxItemStateChanged(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(10, 0, 40, 40);

        searchField.setBackground(new java.awt.Color(255, 255, 255));
        searchField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(102, 102, 102));
        searchField.setText("Search");
        searchField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel5.add(searchField);
        searchField.setBounds(0, 0, 210, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(manageEmpLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(manageEmpLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeSheetLabel2)
                            .addComponent(timeSheetLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(manageEmpLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(manageEmpLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manageEmpLabel6)
                                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manageEmpLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeSheetLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeSheetLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEmpLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeName)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(manageEmpLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    
    private void loadEmployeeList () {       
        List <String []> employeeList = empModule.getAllRecords();
        
        DefaultTableModel empTbl = (DefaultTableModel) employeeListTable.getModel();
        
        for (String [] employeeInfo: employeeList) {
            String details = "<html> "
                          + employeeInfo[0]+ " <br> "
                          + "<b> "+ employeeInfo[2] + " " + employeeInfo[1] + "</b> </html>"; 
            
            empTbl.addRow(new Object [] {details});
        }
    }
    
    private void loadAttendanceTable () {
        List <String []> attendanceRecords = attendanceModule.getAllRecords();       
        
        DefaultTableModel attendanceTbl = (DefaultTableModel) attendanceTable.getModel();
        attendanceTbl.setRowCount(0);
                     
        if (!attendanceRecords.isEmpty()) {
            dateText.setText(attendanceRecords.get(0)[0]);
            for (String [] record: attendanceRecords) {
            attendanceTbl.addRow(new Object [] {
            record[0],
            record[1],
            record[2],
            record[3],});
            }   
        }
        
    }
    
    private void adjustSearchField() {
        searchField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(searchField.getForeground(), 1),
                    new EmptyBorder(5, 40, 5, 10)
            ));
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        previousFrame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void monthComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthComboBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            

        }
    }//GEN-LAST:event_monthComboBoxItemStateChanged

    private void yearComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            
        }
    }//GEN-LAST:event_yearComboBoxItemStateChanged

    private void employeeListTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeListTableMouseReleased
        String tableContent = employeeListTable.getValueAt(employeeListTable.getSelectedRow(), 0).toString();
        int chosenEmployeeID = Integer.parseInt(tableContent.split(" ")[1]); // index of the employee number
        
        RegularEmployee employee = empModule.getEmployeeDetails(chosenEmployeeID);
        employeeName.setText(employee.getFirstName() + " " + employee.getLastName());
        
        attendanceModule.setEmployeeId(chosenEmployeeID);
        attendanceModule.setSelectedMonth(monthComboBox.getSelectedItem().toString());
        attendanceModule.setSelectedYear(yearComboBox.getSelectedItem().toString());
        loadAttendanceTable();              
    }//GEN-LAST:event_employeeListTableMouseReleased

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // textfield placeholders
        if (searchField.getText().equals("Search")) {
            searchField.setText("");
            searchField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        // textfield placeholders
        if (searchField.getText().equals("")) {
            searchField.setText("Search");
            searchField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // search for employee
        List <String []> searchResults = attendanceModule.search(searchField.getText());
        
        DefaultTableModel empTbl = (DefaultTableModel) employeeListTable.getModel();
        empTbl.setRowCount(0);
        
        for (String [] employeeInfo: searchResults) {
            String details = "<html> "
                          + employeeInfo[0]+ " <br> "
                          + "<b> "+ employeeInfo[2] + " " + employeeInfo[1] + "</b> </html>"; 
            
            empTbl.addRow(new Object [] {details});
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    
    
    private void addIndentionToTable () {
        DefaultTableCellRenderer paddedRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(
                        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    if (c instanceof JLabel) {
                        JLabel label = (JLabel) c;
                        label.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Top, Left, Bottom, Right padding
                    }
                    return c;
                }
            };

            // Apply the renderer to all columns
            for (int i = 0; i < employeeListTable.getColumnCount(); i++) {
                employeeListTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
            }
            employeeListTable.setSelectionBackground(new Color(192,227,255));
    }
    
    private void customizeTable() {
        JTableHeader header = attendanceTable.getTableHeader();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT); // Align text to the left
        renderer.setBorder(BorderFactory.createEmptyBorder()); 
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 40));
        
        attendanceTable.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 14));
        attendanceTable.getTableHeader().setBackground(new Color(51,51,0));
        
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLUE));
        header.setDefaultRenderer(new CustomHeaderRendererIII());
        header.setOpaque(true);
        header.setForeground(Color.WHITE);
        attendanceTable.setSelectionBackground(new Color(68,77,38,200));                          
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateText;
    private javax.swing.JTable employeeListTable;
    private javax.swing.JLabel employeeName;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel manageEmpLabel;
    private javax.swing.JLabel manageEmpLabel3;
    private javax.swing.JLabel manageEmpLabel4;
    private javax.swing.JLabel manageEmpLabel5;
    private javax.swing.JLabel manageEmpLabel6;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel timeSheetLabel;
    private javax.swing.JLabel timeSheetLabel2;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}

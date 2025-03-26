/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiClasses;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.MyButton;
import motorphpayroll.customcomponents.RoundJTextField;
import oopClasses.HR;
import oopClasses.LeaveManagementModule;

/**
 *
 * @author keith
 */
public class LeaveManagementGui extends javax.swing.JFrame {

    private LeaveRequestGui leaveReqGui;
    private HR hr;
    private LeaveManagementModule leaveModule;
    
    public LeaveManagementGui(HR hr, LeaveRequestGui leaveReqGui) {
        initComponents();
        adjustTextFields();
        addIndentionToTable();
        customizeTable();
        this.hr = hr;
        this.leaveModule = new LeaveManagementModule(hr);
        this.leaveReqGui = leaveReqGui;
        adjustSearchField();
        loadLeaveTable();
        
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel2 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton2 = new javax.swing.JButton();
        manageEmpLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        manageEmpLabel3 = new javax.swing.JLabel();
        empNameField = new RoundJTextField(5);
        manageEmpLabel4 = new javax.swing.JLabel();
        startDateField = new RoundJTextField(5);
        manageEmpLabel5 = new javax.swing.JLabel();
        endDateField = new RoundJTextField(5);
        manageEmpLabel6 = new javax.swing.JLabel();
        reasonField = new RoundJTextField(5);
        manageEmpLabel7 = new javax.swing.JLabel();
        leaveTypeField = new RoundJTextField(5);
        manageEmpLabel8 = new javax.swing.JLabel();
        denyButton = new MyButton();
        approveButton = new MyButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new RoundJTextField(5);
        filterComboBox = new javax.swing.JComboBox<>();
        timeSheetLabel = new javax.swing.JLabel();
        timeSheetLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel2.setBackground(new java.awt.Color(204, 204, 204));
        headerPanel2.setPreferredSize(new java.awt.Dimension(479, 60));

        backButton2.setBackground(new java.awt.Color(158, 158, 158));
        backButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        backButton2.setForeground(new java.awt.Color(255, 255, 255));
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow.png"))); // NOI18N
        backButton2.setBorderPainted(false);
        backButton2.setContentAreaFilled(false);
        backButton2.setFocusable(false);
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        manageEmpLabel2.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        manageEmpLabel2.setForeground(new java.awt.Color(47, 36, 56));
        manageEmpLabel2.setText("LEAVE MANAGEMENT");

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmpLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanel2Layout.setVerticalGroup(
            headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(manageEmpLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        leaveTable.setBackground(new java.awt.Color(255, 255, 255));
        leaveTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        leaveTable.setForeground(new java.awt.Color(47, 36, 56));
        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   REQ ID", "   EMP ID", "    EMP NAME", "   LEAVE TYPE", "     STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leaveTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        leaveTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        leaveTable.setFocusable(false);
        leaveTable.setGridColor(new java.awt.Color(0, 0, 0));
        leaveTable.setRowHeight(30);
        leaveTable.setSelectionBackground(new java.awt.Color(102, 102, 0));
        leaveTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        leaveTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        leaveTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        leaveTable.setShowGrid(false);
        leaveTable.setShowVerticalLines(true);
        leaveTable.getTableHeader().setResizingAllowed(false);
        leaveTable.getTableHeader().setReorderingAllowed(false);
        leaveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leaveTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(leaveTable);
        if (leaveTable.getColumnModel().getColumnCount() > 0) {
            leaveTable.getColumnModel().getColumn(0).setResizable(false);
            leaveTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            leaveTable.getColumnModel().getColumn(1).setResizable(false);
            leaveTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            leaveTable.getColumnModel().getColumn(2).setResizable(false);
            leaveTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            leaveTable.getColumnModel().getColumn(3).setResizable(false);
            leaveTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        manageEmpLabel3.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        manageEmpLabel3.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel3.setText("Leave Request Details");

        empNameField.setEditable(false);
        empNameField.setBackground(new java.awt.Color(255, 255, 255));
        empNameField.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        empNameField.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel4.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        manageEmpLabel4.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel4.setText("Employee Name");

        startDateField.setEditable(false);
        startDateField.setBackground(new java.awt.Color(255, 255, 255));
        startDateField.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        startDateField.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel5.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        manageEmpLabel5.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel5.setText("Start Date of Leave");

        endDateField.setEditable(false);
        endDateField.setBackground(new java.awt.Color(255, 255, 255));
        endDateField.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        endDateField.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel6.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        manageEmpLabel6.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel6.setText("End Date of Leave");

        reasonField.setEditable(false);
        reasonField.setBackground(new java.awt.Color(255, 255, 255));
        reasonField.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        reasonField.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel7.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        manageEmpLabel7.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel7.setText("Reason");

        leaveTypeField.setEditable(false);
        leaveTypeField.setBackground(new java.awt.Color(255, 255, 255));
        leaveTypeField.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        leaveTypeField.setForeground(new java.awt.Color(0, 0, 0));

        manageEmpLabel8.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        manageEmpLabel8.setForeground(new java.awt.Color(102, 102, 102));
        manageEmpLabel8.setText("Leave Type");

        denyButton.setBackground(new java.awt.Color(215, 43, 43));
        denyButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        denyButton.setForeground(new java.awt.Color(255, 255, 255));
        denyButton.setText("Deny");
        denyButton.setBorderPainted(false);
        denyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                denyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                denyButtonMouseExited(evt);
            }
        });
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });

        approveButton.setBackground(new java.awt.Color(51, 153, 0));
        approveButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        approveButton.setForeground(new java.awt.Color(255, 255, 255));
        approveButton.setText("Approve");
        approveButton.setBorderPainted(false);
        approveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approveButtonMouseExited(evt);
            }
        });
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empNameField)
                    .addComponent(startDateField)
                    .addComponent(endDateField)
                    .addComponent(leaveTypeField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reasonField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEmpLabel4)
                            .addComponent(manageEmpLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEmpLabel5)
                            .addComponent(manageEmpLabel6)
                            .addComponent(manageEmpLabel8)
                            .addComponent(manageEmpLabel7))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(manageEmpLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmpLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmpLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmpLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmpLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leaveTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmpLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reasonField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(denyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 4, 40, 28);

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
        searchField.setBounds(0, 0, 270, 35);

        filterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        filterComboBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        filterComboBox.setForeground(new java.awt.Color(0, 0, 0));
        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Pending", "Approved", "Denied" }));
        filterComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        filterComboBox.setFocusable(false);
        filterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterComboBoxItemStateChanged(evt);
            }
        });

        timeSheetLabel.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        timeSheetLabel.setForeground(new java.awt.Color(190, 72, 69));
        timeSheetLabel.setText("LEAVE REQUEST");

        timeSheetLabel2.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        timeSheetLabel2.setForeground(new java.awt.Color(214, 139, 137));
        timeSheetLabel2.setText("TRACKER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(timeSheetLabel)
                            .addComponent(timeSheetLabel2))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(timeSheetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeSheetLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
    
    private void loadLeaveTable () {
        List <String []> leaveRecords = hr.loadAllEmployeeLeaveRecords();
        
        DefaultTableModel tblmodel = (DefaultTableModel) leaveTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] record: leaveRecords) {
            tblmodel.addRow(new Object [] {
            record[0],
            record[1],
            record[2],
            record[3],
            record[4]});
        }     
    }
    
    private void search () {
        List <String []> searchResults = leaveModule.search(searchField.getText());
        
        DefaultTableModel tblmodel = (DefaultTableModel) leaveTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] empDetails: searchResults) {
            tblmodel.addRow(new Object [] {
            empDetails[0],
            empDetails[1],
            empDetails[2],
            empDetails[3],
            empDetails[4]});
        }
    }
    
    private void filterTable () {
        List <String []> filteredResults = leaveModule.filterRecords(filterComboBox.getSelectedItem().toString(), searchField.getText());
        DefaultTableModel tblmodel = (DefaultTableModel) leaveTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] details: filteredResults) {
            tblmodel.addRow(new String [] {
            details[0],
            details[1],
            details[2],
            details[3],
            details[4],});
        }
    }
    
    private void searchFiltered () {
        List <String []> searchResults = leaveModule.search(searchField.getText(), filterComboBox.getSelectedItem().toString());
        
        DefaultTableModel tblmodel = (DefaultTableModel) leaveTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] empDetails: searchResults) {
            tblmodel.addRow(new Object [] {
            empDetails[0],
            empDetails[1],
            empDetails[2],
            empDetails[3],
            empDetails[4]});
        }
    }
    
    private void fillTextFields () {
        int requestID = Integer.parseInt(leaveTable.getValueAt(leaveTable.getSelectedRow(), 0).toString());
        
        String [] leaveDetails = leaveModule.getLeaveDetails(requestID);
        
        empNameField.setText(leaveDetails[0]);
        startDateField.setText(leaveDetails[1]);
        endDateField.setText(leaveDetails[2]);
        leaveTypeField.setText(leaveDetails[3]);
        reasonField.setText(leaveDetails[4]);
    }
    
    private void adjustSearchField() {
        searchField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(searchField.getForeground(), 1),
                    new EmptyBorder(5, 40, 5, 10)
            ));
    }
    
    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        this.dispose();
        leaveReqGui.setVisible(true);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void leaveTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseReleased
        fillTextFields();       
    }//GEN-LAST:event_leaveTableMouseReleased

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        if (leaveTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select an employee first");
        }
        else {
            int requestID = Integer.parseInt(leaveTable.getValueAt(leaveTable.getSelectedRow(), 0).toString());
            hr.approveEmployeeLeave(requestID);
            JOptionPane.showMessageDialog(null, "Leave approved");
            loadLeaveTable();
        }       
    }//GEN-LAST:event_approveButtonActionPerformed

    private void denyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyButtonActionPerformed
        if (leaveTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select an employee first");
        }
        else {
            int requestID = Integer.parseInt(leaveTable.getValueAt(leaveTable.getSelectedRow(), 0).toString());
            hr.denyEmployeeLeave(requestID);
            JOptionPane.showMessageDialog(null, "Leave Denied");
            loadLeaveTable();
        }     
    }//GEN-LAST:event_denyButtonActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if (searchField.getText().equals("Search")) {
            searchField.setText("");
            searchField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if (searchField.getText().equals("")) {
            searchField.setText("Search");
            searchField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        if (filterComboBox.getSelectedItem().toString().equals("All")) {
            search();
        }
        else {
            searchFiltered();
        }        
    }//GEN-LAST:event_searchFieldKeyReleased

    private void filterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterComboBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            filterTable();
        }
    }//GEN-LAST:event_filterComboBoxItemStateChanged

    private void denyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denyButtonMouseEntered
        denyButton.setBackground(new Color(221,74,74));
    }//GEN-LAST:event_denyButtonMouseEntered

    private void denyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denyButtonMouseExited
        denyButton.setBackground(new Color(215,43,43));
    }//GEN-LAST:event_denyButtonMouseExited

    private void approveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveButtonMouseEntered
        approveButton.setBackground(new Color(0,188,0));
    }//GEN-LAST:event_approveButtonMouseEntered

    private void approveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveButtonMouseExited
        approveButton.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_approveButtonMouseExited

    private void customizeTable() {
        JTableHeader header = leaveTable.getTableHeader();
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 30));
        
        leaveTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        leaveTable.getTableHeader().setBackground(new Color(230,184,183));
        
        header.setDefaultRenderer(new CustomHeaderRendererIV());
        leaveTable.setSelectionBackground(new Color(230,184,183,200));                          
    }
    
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
            for (int i = 0; i < leaveTable.getColumnCount(); i++) {
                leaveTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
            }
    }
    
    private void adjustTextFields() {
        empNameField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(empNameField.getForeground(), 1),
                    new EmptyBorder(5, 5, 5, 5)
            ));
        startDateField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(startDateField.getForeground(), 1),
                    new EmptyBorder(5, 5, 5, 5)
            ));
        endDateField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(endDateField.getForeground(), 1),
                    new EmptyBorder(5, 5, 5, 5)
            ));
        reasonField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(reasonField.getForeground(), 1),
                    new EmptyBorder(5, 5, 5, 5)
            ));
        leaveTypeField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(leaveTypeField.getForeground(), 1),
                    new EmptyBorder(5, 5, 5, 5)
            ));
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton backButton2;
    private javax.swing.JButton denyButton;
    private javax.swing.JTextField empNameField;
    private javax.swing.JTextField endDateField;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leaveTable;
    private javax.swing.JTextField leaveTypeField;
    private javax.swing.JLabel manageEmpLabel2;
    private javax.swing.JLabel manageEmpLabel3;
    private javax.swing.JLabel manageEmpLabel4;
    private javax.swing.JLabel manageEmpLabel5;
    private javax.swing.JLabel manageEmpLabel6;
    private javax.swing.JLabel manageEmpLabel7;
    private javax.swing.JLabel manageEmpLabel8;
    private javax.swing.JTextField reasonField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField startDateField;
    private javax.swing.JLabel timeSheetLabel;
    private javax.swing.JLabel timeSheetLabel2;
    // End of variables declaration//GEN-END:variables
}
class CustomHeaderRendererIV implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel header = new JLabel(value.toString());
            header.setOpaque(true);
            header.setBackground(new Color(230,184,183)); 

            // Custom grid color inside header cells
            header.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,0,0)));  // Grid lines inside header
            header.setForeground(Color.BLACK);
            header.setFont(new Font("Roboto", Font.BOLD, 12));
            return header;
        }
  }
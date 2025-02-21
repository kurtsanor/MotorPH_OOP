package motorphpayroll;

import motorphpayroll.customcomponents.CustomPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class AttendancePageGui extends javax.swing.JFrame {

    private User user;
    private HomePageGui homePage;
    private AttendanceModule attendanceModule;
    
    public AttendancePageGui(User user, HomePageGui homePage) {
        initComponents();
        customizeTable();
        addIndentionToTable();
        this.user = user;
        this.homePage = homePage;
        employeeName.setText(user.getFirstName()+ " " + user.getLastName());
        attendanceModule = new AttendanceModule(user.getId());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jPanel2 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        titleHeader = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        timeSheetLabel = new javax.swing.JLabel();
        timeSheetLabel2 = new javax.swing.JLabel();
        manageEmpLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        employeeName = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        manageEmpLabel4 = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        manageEmpLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(878, 565));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(479, 60));

        titleHeader.setBackground(new java.awt.Color(47, 36, 56));
        titleHeader.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        titleHeader.setForeground(new java.awt.Color(47, 36, 56));
        titleHeader.setText("TIME AND ATTENDANCE RECORDS");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(titleHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

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
        jScrollPane1.setViewportView(attendanceTable);

        timeSheetLabel.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        timeSheetLabel.setForeground(new java.awt.Color(68, 77, 38));
        timeSheetLabel.setText("TIMESHEET");

        timeSheetLabel2.setBackground(new java.awt.Color(47, 36, 56));
        timeSheetLabel2.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        timeSheetLabel2.setForeground(new java.awt.Color(136, 147, 100));
        timeSheetLabel2.setText("MONTHLY");

        manageEmpLabel3.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel3.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel3.setText("Employee:");

        jPanel1.setBackground(new java.awt.Color(68, 77, 38));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        employeeName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        employeeName.setForeground(new java.awt.Color(0, 0, 0));
        employeeName.setText("Freya Panganiban");

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

        manageEmpLabel4.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel4.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel4.setText("Select Year:");

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

        manageEmpLabel5.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        manageEmpLabel5.setForeground(new java.awt.Color(109, 121, 72));
        manageEmpLabel5.setText("Select Month:");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(manageEmpLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageEmpLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(manageEmpLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeSheetLabel2)
                    .addComponent(timeSheetLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeSheetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeSheetLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEmpLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                            .addComponent(employeeName)
                            .addGap(3, 3, 3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(manageEmpLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(manageEmpLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monthComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        homePage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void monthComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthComboBoxItemStateChanged
       if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           attendanceModule.setSelectedMonth(String.valueOf(monthComboBox.getSelectedItem()));
           attendanceModule.setSelectedYear(String.valueOf(yearComboBox.getSelectedItem()));
           attendanceModule.loadTable(attendanceTable);
           
      }
    }//GEN-LAST:event_monthComboBoxItemStateChanged

    private void yearComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearComboBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
           long start = System.currentTimeMillis();
           attendanceModule.setSelectedMonth(monthComboBox.getSelectedItem().toString());
           attendanceModule.setSelectedYear(yearComboBox.getSelectedItem().toString());
           attendanceModule.loadTable(attendanceTable);
           
        
        
            long end = System.currentTimeMillis();
        System.out.println("Query executed in: " + (end - start) + " ms");
      }
    }//GEN-LAST:event_yearComboBoxItemStateChanged
    private void customizeTable() {
        JTableHeader header = attendanceTable.getTableHeader();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT); // Align text to the left
        renderer.setBorder(BorderFactory.createEmptyBorder()); 
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 50));
        
        attendanceTable.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 16));
        attendanceTable.getTableHeader().setBackground(new Color(51,51,0));
        
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLUE));
        header.setDefaultRenderer(new CustomHeaderRendererIII());
        header.setOpaque(true);
        header.setForeground(Color.WHITE);
        attendanceTable.setSelectionBackground(new Color(68,77,38,200));                          
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
            for (int i = 0; i < attendanceTable.getColumnCount(); i++) {
                attendanceTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
            }
    }
   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel employeeName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEmpLabel3;
    private javax.swing.JLabel manageEmpLabel4;
    private javax.swing.JLabel manageEmpLabel5;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JLabel timeSheetLabel;
    private javax.swing.JLabel timeSheetLabel2;
    private javax.swing.JLabel titleHeader;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
class CustomHeaderRendererIII implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel header = new JLabel(value.toString());
            header.setOpaque(true);
            header.setBackground(new Color(68,77,38));  // Light blue background

            // Custom grid color inside header cells
            header.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(68,77,38)));  // Grid lines inside header
            header.setForeground(Color.WHITE);
            header.setFont(new Font("Yu Gothic UI", Font.BOLD, 18));
            return header;
        }
  }
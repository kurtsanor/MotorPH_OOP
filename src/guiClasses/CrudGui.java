
package guiClasses;

import oopClasses.EmployeeManagementModule;
import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.PanelRound;
import motorphpayroll.customcomponents.MyButton;
import motorphpayroll.customcomponents.RoundJTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import oopClasses.HR;

  
public class CrudGui extends javax.swing.JFrame {

    private HomePageGui homePage;
    private ViewProfileGui profile;
    private EmployeeManagementModule empManagement = new EmployeeManagementModule();
    private JWindow overlay = new JWindow();
    private HR hr;
    
    public CrudGui(HomePageGui homePage, HR hr) {
        initComponents();
        customizeTable();
        adjustSearchField();
        addIndentionToTable();
        this.homePage = homePage;
        this.hr = hr;
        loadEmployeeTable();          
        overlay.setBackground(new Color(0, 0, 0, 200));
        overlay.setVisible(false);
    }
    
    public void loadEmployeeTable () {        
        List <String []> employeeList = hr.viewAllEmployees();
        DefaultTableModel tblmodel = (DefaultTableModel) empTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] employeeDetails: employeeList) {
            tblmodel.addRow(new Object [] {employeeDetails[0], employeeDetails[1], employeeDetails[2]} );
        }
   }
    
    private void searchEmployees () {
        List <String []> searchResults = hr.searchEmployees(searchField.getText());
        DefaultTableModel tblmodel = (DefaultTableModel) empTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] result: searchResults) {
            tblmodel.addRow(new Object [] {result[0], result[1], result[2]});
        }
    }
    
    // for JTable formatting
    private void customizeTable() {
        JTableHeader header = empTable.getTableHeader();
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 50));              
        header.setDefaultRenderer(new CustomHeaderRenderer());
        empTable.setSelectionBackground(new Color(47,36,56,200));                          
    }
    
    
    
    
    // Puts indention on textfields
    private void adjustSearchField() {
        searchField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(searchField.getForeground(), 1),
                    new EmptyBorder(5, 40, 5, 10)
            ));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        headerPanel = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton = new javax.swing.JButton();
        manageEmpLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        deleteButton = new MyButton();
        viewButton = new MyButton();
        updateButton = new MyButton();
        addButton = new MyButton();
        jPanel2 = new PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchField = new RoundJTextField(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management");
        setMinimumSize(new java.awt.Dimension(878, 565));

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setForeground(new java.awt.Color(225, 225, 225));

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
        manageEmpLabel.setText("EMPLOYEE MANAGEMENT");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
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

        deleteButton.setBackground(new java.awt.Color(215, 43, 43));
        deleteButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trash-bin (1) (1).png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete");
        deleteButton.setBorderPainted(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(252, 141, 80));
        viewButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view (1).png"))); // NOI18N
        viewButton.setText("View");
        viewButton.setToolTipText("View");
        viewButton.setBorderPainted(false);
        viewButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewButtonMouseExited(evt);
            }
        });
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(252, 141, 80));
        updateButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/upd (1).png"))); // NOI18N
        updateButton.setText("Edit");
        updateButton.setToolTipText("Update");
        updateButton.setBorderPainted(false);
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(252, 141, 80));
        addButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addnew (1).png"))); // NOI18N
        addButton.setText("New");
        addButton.setToolTipText("Create");
        addButton.setBorderPainted(false);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        empTable.setBackground(new java.awt.Color(255, 255, 255));
        empTable.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        empTable.setForeground(new java.awt.Color(47, 36, 56));
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID number", " Last Name", " First Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        empTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        empTable.setFocusable(false);
        empTable.setGridColor(new java.awt.Color(204, 204, 204));
        empTable.setRowHeight(50);
        empTable.setSelectionBackground(new java.awt.Color(102, 102, 0));
        empTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        empTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        empTable.setShowGrid(false);
        empTable.setShowHorizontalLines(true);
        empTable.getTableHeader().setResizingAllowed(false);
        empTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(empTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
        searchField.setBounds(0, 0, 270, 40);

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // opens the GUI for adding employees
        boolean addingEmployee = true;
        new AddorEditEmployeeGui(addingEmployee, 0, empTable, hr).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        searchEmployees();
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        // textfield placeholders
        if (searchField.getText().equals("")) {
            searchField.setText("Search");
            searchField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // textfield placeholders
        if (searchField.getText().equals("Search")) {
            searchField.setText("");
            searchField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // disposes the current frame and restores the previous frame
        this.dispose();
        homePage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_addButtonMouseExited

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        updateButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        updateButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_updateButtonMouseExited

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        deleteButton.setBackground(new Color(221,74,74));
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        deleteButton.setBackground(new Color(215,43,43));
    }//GEN-LAST:event_deleteButtonMouseExited

    private void viewButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseEntered
        viewButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_viewButtonMouseEntered

    private void viewButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewButtonMouseExited
        viewButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_viewButtonMouseExited
    
     
    // to darken the background while viewing employee information
    private void showOverlay() {
        overlay.setSize(this.getSize());
        overlay.setLocationRelativeTo(null);
        overlay.setVisible(true);  
    }
        
    
    
    // Views details of the chosen employee
    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // throw error if no employee is selected from the table
        if (empTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select an employee first");
            return;
        }
        
        // Gets the employeeID of the employee from the table       
        int chosenEmployee = Integer.parseInt(empTable.getValueAt(empTable.getSelectedRow(),0).toString());
        if (profile != null) {
        profile.dispose();         
        }                   
        // opens a new frame and displays employee info
        showOverlay();
        profile = new ViewProfileGui(chosenEmployee, overlay, hr);
        profile.setVisible(true);  
                
    }//GEN-LAST:event_viewButtonActionPerformed
    
    // updates or edits the information of the chosen employee
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // throw error if no employee is selected from the table
        if (empTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select an employee first");
        }       
        // gets the employeeID of the chosen employee from the table then updates it
        else {
            int chosenEmployee = Integer.parseInt(empTable.getValueAt(empTable.getSelectedRow(),0).toString());
            boolean addingEmployees = true;
            new AddorEditEmployeeGui(!addingEmployees, chosenEmployee, empTable, hr).setVisible(true);
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    // deletes the record of the chosen employee
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // throw error if no employee is selected from the table
        if (empTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select an employee first");
        }
        // gets the employeeID of the chosen employee from the table then deletes it
        else {           
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete","", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                int chosenEmployee = Integer.parseInt(empTable.getValueAt(empTable.getSelectedRow(),0).toString());
                hr.deleteEmployeeRecord(chosenEmployee);
                JOptionPane.showMessageDialog(this, "Employee Deleted");
                loadEmployeeTable();
            }           
        }
    }//GEN-LAST:event_deleteButtonActionPerformed
    
   
    // for JTable formatting
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
            for (int i = 0; i < empTable.getColumnCount(); i++) {
                empTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable empTable;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel manageEmpLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

// for JTable designs
 class CustomHeaderRenderer implements TableCellRenderer {
     
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel header = new JLabel(value.toString());
            header.setOpaque(true);
            header.setBackground(new Color(47,36,56));  // Light blue background

            // Custom grid color inside header cells
            header.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(47,36,56)));  // Grid lines inside header
            header.setForeground(Color.WHITE);
            header.setFont(new Font("Roboto", Font.BOLD, 18));
            return header;
        }
  }
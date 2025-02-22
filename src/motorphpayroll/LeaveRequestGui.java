
package motorphpayroll;

import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.MyButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;


public class LeaveRequestGui extends javax.swing.JFrame {

    private User user;
    private HomePageGui homepage;
    private LeaveManagementModule leaveModule;
    
    public LeaveRequestGui(User user, HomePageGui homepage) {
        initComponents();
        customizeTable();
        addIndentionToTable();     
        leaveModule = new LeaveManagementModule(user);             
        this.user = user;
        this.homepage = homepage;
        loadLeaveTable();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        jPanel2 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton = new javax.swing.JButton();
        manageEmpLabel = new javax.swing.JLabel();
        manageEmpLabel1 = new javax.swing.JLabel();
        requestLeaveButton = new MyButton();
        manageLeaveButton = new MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Request");
        setPreferredSize(new java.awt.Dimension(878, 565));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        leaveTable.setBackground(new java.awt.Color(255, 255, 255));
        leaveTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        leaveTable.setForeground(new java.awt.Color(47, 36, 56));
        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "        Request ID", "        Start Date", "           End Date", "        Leave Type", "           Status"
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
        leaveTable.setGridColor(new java.awt.Color(51, 51, 51));
        leaveTable.setRowHeight(65);
        leaveTable.setSelectionBackground(new java.awt.Color(102, 102, 0));
        leaveTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        leaveTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        leaveTable.setShowGrid(false);
        leaveTable.setShowHorizontalLines(true);
        leaveTable.getTableHeader().setResizingAllowed(false);
        leaveTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(leaveTable);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

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
        manageEmpLabel.setText("LEAVE REQUEST FORMS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEmpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageEmpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        manageEmpLabel1.setBackground(new java.awt.Color(47, 36, 56));
        manageEmpLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        manageEmpLabel1.setForeground(new java.awt.Color(47, 36, 56));
        manageEmpLabel1.setText("Leave History");

        requestLeaveButton.setBackground(new java.awt.Color(252, 141, 80));
        requestLeaveButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        requestLeaveButton.setForeground(new java.awt.Color(255, 255, 255));
        requestLeaveButton.setText("Request for leave");
        requestLeaveButton.setBorderPainted(false);
        requestLeaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requestLeaveButton.setFocusable(false);
        requestLeaveButton.setPreferredSize(new java.awt.Dimension(144, 50));
        requestLeaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestLeaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestLeaveButtonMouseExited(evt);
            }
        });
        requestLeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestLeaveButtonActionPerformed(evt);
            }
        });

        manageLeaveButton.setBackground(new java.awt.Color(252, 141, 80));
        manageLeaveButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        manageLeaveButton.setForeground(new java.awt.Color(255, 255, 255));
        manageLeaveButton.setText("Manage Requests");
        manageLeaveButton.setBorderPainted(false);
        manageLeaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageLeaveButton.setFocusable(false);
        manageLeaveButton.setPreferredSize(new java.awt.Dimension(148, 35));
        manageLeaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageLeaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageLeaveButtonMouseExited(evt);
            }
        });
        manageLeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLeaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(manageLeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageEmpLabel1)
                        .addGap(209, 209, 209)
                        .addComponent(requestLeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageEmpLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(requestLeaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(manageLeaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void loadLeaveTable () {
        List <String []> leaveRecords = leaveModule.getAllRecords(user.getId());
        
        DefaultTableModel tblmodel = (DefaultTableModel) leaveTable.getModel();
        tblmodel.setRowCount(0);
        
        for (String [] record: leaveRecords) {
            tblmodel.addRow(new String [] {
            record[0],
            record[1],
            record[2],
            record[3],
            record[4]});
        }
        
    }
        
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        homepage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void requestLeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestLeaveButtonActionPerformed
        this.setVisible(false);
        new LeaveForm(user,this, leaveTable).setVisible(true);
    }//GEN-LAST:event_requestLeaveButtonActionPerformed

    private void requestLeaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestLeaveButtonMouseEntered
        requestLeaveButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_requestLeaveButtonMouseEntered

    private void requestLeaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestLeaveButtonMouseExited
        requestLeaveButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_requestLeaveButtonMouseExited

    private void manageLeaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageLeaveButtonMouseEntered
        manageLeaveButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_manageLeaveButtonMouseEntered

    private void manageLeaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageLeaveButtonMouseExited
        manageLeaveButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_manageLeaveButtonMouseExited

    private void manageLeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLeaveButtonActionPerformed
        if (user.hasHrAccess()) {
            this.setVisible(false);
            new LeaveManagementGui(user,this).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Only HR has access to this feature");
        }
        
    }//GEN-LAST:event_manageLeaveButtonActionPerformed

    private void customizeTable() {
        JTableHeader header = leaveTable.getTableHeader();
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT); // Align text to the left
        renderer.setBorder(BorderFactory.createEmptyBorder()); 
        header.setPreferredSize(new Dimension(header.getPreferredSize().width, 65));
        
        leaveTable.getTableHeader().setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
        leaveTable.getTableHeader().setBackground(new Color(51,51,0));
        
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLUE));
        header.setDefaultRenderer(new CustomHeaderRendererII());
        header.setOpaque(true);
        header.setForeground(Color.WHITE);
        leaveTable.setSelectionBackground(new Color(52,58,64,200));                          
    }
   
    private void addIndentionToTable () {
        DefaultTableCellRenderer paddedRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(
                        JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    
                    if (!isSelected) {
                        switch (leaveTable.getValueAt(row, 4).toString()) {
                        case "Approved" -> c.setBackground(new Color(180,216,180));
                        case "Denied" -> c.setBackground(new Color(255,173,173));
                        default -> c.setBackground(new Color(255,255,255));
                        }
                    }
                    
                    
                    
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leaveTable;
    private javax.swing.JLabel manageEmpLabel;
    private javax.swing.JLabel manageEmpLabel1;
    private javax.swing.JButton manageLeaveButton;
    private javax.swing.JButton requestLeaveButton;
    // End of variables declaration//GEN-END:variables
}
class CustomHeaderRendererII implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

            JLabel header = new JLabel(value.toString());
            header.setOpaque(true);
            header.setBackground(new Color(52,58,64));  
            

            // Custom grid color inside header cells
            header.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, new Color(52,58,64)));  // Grid lines inside header
            header.setForeground(Color.WHITE);
            header.setFont(new Font("Roboto", Font.BOLD, 18));
            return header;
        }
  }
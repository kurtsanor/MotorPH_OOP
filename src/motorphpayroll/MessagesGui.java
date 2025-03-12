package motorphpayroll;

import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.RoundJTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


public class MessagesGui extends javax.swing.JFrame {
    private HomePageGui homePage;
  
    public MessagesGui(HomePageGui homePage) {
        initComponents();
        adjustSearchField();
        addIndentionToTable();
        this.homePage = homePage;
        messagesTable.getTableHeader().setVisible(false);
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
            for (int i = 0; i < messagesTable.getColumnCount(); i++) {
                messagesTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
            }
            messagesTable.setSelectionBackground(new Color(192,227,255));
    }
    
    
        private void adjustSearchField() {
        searchField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(searchField.getForeground(), 1),
                    new EmptyBorder(5, 40, 5, 10)
            ));
    }
        
  
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messagesTable = new javax.swing.JTable();
        newMailButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new RoundJTextField(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Messages");
        setPreferredSize(new java.awt.Dimension(878, 565));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 60));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 36, 56));
        jLabel1.setText("MESSAGES (Not working yet)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        messagesTable.setBackground(new java.awt.Color(255, 255, 255));
        messagesTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        messagesTable.setForeground(new java.awt.Color(0, 0, 0));
        messagesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Manuel Garcia", "Lorem ipsum dolor sit amet", "Yesterday"},
                {"Antonio Lim", "Lorem ipsum dolor sit amet", "Jan 28"},
                {"Bianca Sofia Aquino", "Lorem ipsum dolor sit amet", "Jan 23"},
                {"Isabella Reyes", "Lorem ipsum dolor sit amet", "July 2"},
                {"Andrea Mae Villanueva", "Lorem ipsum dolor sit amet", "June 3"},
                {"San Jose Brad", "Lorem ipsum dolor sit amet", "May 23"},
                {"Alice Romualdez", "Lorem ipsum dolor sit amet", "June 22"},
                {"Rosie Atienza", "Lorem ipsum dolor sit amet", "October 2"},
                {"Roderick Alvero", "Lorem ipsum dolor sit amet", "Decmeber 5"},
                {"Edward Hernandez", "Lorem adsasdsad", "May 1"}
            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        messagesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        messagesTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        messagesTable.setFocusable(false);
        messagesTable.setGridColor(new java.awt.Color(238, 238, 238));
        messagesTable.setRowHeight(70);
        messagesTable.setSelectionBackground(new java.awt.Color(192, 227, 255));
        messagesTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        messagesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        messagesTable.setShowGrid(false);
        messagesTable.setShowHorizontalLines(true);
        messagesTable.getTableHeader().setResizingAllowed(false);
        messagesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(messagesTable);
        if (messagesTable.getColumnModel().getColumnCount() > 0) {
            messagesTable.getColumnModel().getColumn(0).setResizable(false);
            messagesTable.getColumnModel().getColumn(1).setResizable(false);
            messagesTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            messagesTable.getColumnModel().getColumn(2).setResizable(false);
            messagesTable.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        newMailButton.setBackground(new java.awt.Color(252, 141, 80));
        newMailButton.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        newMailButton.setForeground(new java.awt.Color(255, 255, 255));
        newMailButton.setText("New Mail");
        newMailButton.setBorderPainted(false);
        newMailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMailButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search (1).png"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 0, 40, 40);

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
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        jPanel5.add(searchField);
        searchField.setBounds(0, 0, 400, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(newMailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newMailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        homePage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void newMailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMailButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMailButtonActionPerformed

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

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        
    }//GEN-LAST:event_searchFieldKeyReleased
    
   
   
    
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
            header.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
            return header;
        }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable messagesTable;
    private javax.swing.JButton newMailButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}

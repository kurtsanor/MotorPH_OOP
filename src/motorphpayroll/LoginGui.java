package motorphpayroll;

import motorphpayroll.customcomponents.PanelRound;
import motorphpayroll.customcomponents.MyButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;


public class LoginGui extends javax.swing.JFrame {

    UserAuthentication system;
    
    public LoginGui() {
        initComponents();
        adustTextFields();
        LoginPanel.setBackground(new Color(0,0,0,70));
        system = new UserAuthentication();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginPanel = new PanelRound();
        UsernameTextfield = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new MyButton();
        jLabel3 = new javax.swing.JLabel();
        MotorphLabel = new javax.swing.JLabel();
        BackGroundLabel = new javax.swing.JLabel();
        pasi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(878, 565));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        LoginPanel.setBackground(new java.awt.Color(102, 102, 102));
        LoginPanel.setForeground(new java.awt.Color(0, 0, 0));

        UsernameTextfield.setBackground(new java.awt.Color(221, 221, 221));
        UsernameTextfield.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        UsernameTextfield.setForeground(new java.awt.Color(102, 102, 102));
        UsernameTextfield.setText("Enter Username");
        UsernameTextfield.setBorder(null);
        UsernameTextfield.setCaretPosition(0);
        UsernameTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        UsernameTextfield.setMargin(new java.awt.Insets(2, 50, 2, 10));
        UsernameTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameTextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameTextfieldFocusLost(evt);
            }
        });
        UsernameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextfieldActionPerformed(evt);
            }
        });

        PasswordField.setBackground(new java.awt.Color(221, 221, 221));
        PasswordField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(102, 102, 102));
        PasswordField.setText("Enter Password");
        PasswordField.setBorder(null);
        PasswordField.setEchoChar('\u0000');
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("We are happy to see you again!");

        loginButton.setBackground(new java.awt.Color(252, 141, 80));
        loginButton.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusable(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Forgot Password?");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jLabel1))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(94, 94, 94)
                            .addComponent(jLabel2))
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PasswordField)
                                .addComponent(UsernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(UsernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(LoginPanel);
        LoginPanel.setBounds(470, 170, 360, 240);

        MotorphLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tex (1).png"))); // NOI18N
        jPanel1.add(MotorphLabel);
        MotorphLabel.setBounds(40, 90, 340, 310);

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginBG.png"))); // NOI18N
        jPanel1.add(BackGroundLabel);
        BackGroundLabel.setBounds(0, 0, 863, 528);

        pasi.setEditable(false);
        pasi.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        pasi.setForeground(new java.awt.Color(255, 255, 255));
        pasi.setText("jTextField1");
        pasi.setCaretColor(new java.awt.Color(255, 255, 255));
        pasi.setCaretPosition(0);
        jPanel1.add(pasi);
        pasi.setBounds(0, 0, 0, 9);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void adustTextFields() {
        UsernameTextfield.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(UsernameTextfield.getForeground(), 0),
                    new EmptyBorder(5, 10, 5, 10)
            ));
        PasswordField.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(PasswordField.getForeground(), 0), 
                    new EmptyBorder(5, 10, 5, 10) // 
            ));
    }
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
//        new HomePageGui().setVisible(true);
        boolean validAccount = system.Login(UsernameTextfield.getText(), String.valueOf(PasswordField.getPassword()));
        if (validAccount) this.dispose();       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void UsernameTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTextfieldFocusGained
        if (UsernameTextfield.getText().equals("Enter Username")) {
            UsernameTextfield.setText("");
            UsernameTextfield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_UsernameTextfieldFocusGained

    private void UsernameTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTextfieldFocusLost
        if (UsernameTextfield.getText().equals("")){
            UsernameTextfield.setText("Enter Username");
            UsernameTextfield.setForeground(Color.GRAY);
        } 
    }//GEN-LAST:event_UsernameTextfieldFocusLost

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        if (PasswordField.getText().equals("Enter Password")){
            PasswordField.setText("");
            PasswordField.setEchoChar('*');
            PasswordField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        if (PasswordField.getText().equals("")) {
            PasswordField.setText("Enter Password");
            PasswordField.setForeground(Color.GRAY);
            PasswordField.setEchoChar('\u0000'); 
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void UsernameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextfieldActionPerformed

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        loginButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        loginButton.setBackground(new Color(252,141,80));

    }//GEN-LAST:event_loginButtonMouseExited

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel MotorphLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField pasi;
    // End of variables declaration//GEN-END:variables
}

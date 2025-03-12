    package motorphpayroll;

import motorphpayroll.customcomponents.CustomPanel;
import motorphpayroll.customcomponents.MyButton;
import motorphpayroll.customcomponents.RoundJTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class HomePageGui extends javax.swing.JFrame {
    
    private User user;
    private Timer timer;
    
  
    public HomePageGui(User user) {
        initComponents();
        adjustSearchField();
        setDateAndTime();   
        this.user = user;
        popup.setVisible(false);
        hamburgerPanel.setVisible(false);
        displayEmplyoeeDetails();
               
        
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jPanel1 = new CustomPanel(new Color(47,36,56), new Color(89,65,107));
        attendanceDatabaseButton = new javax.swing.JButton();
        homeButton1 = new javax.swing.JButton();
        messageButton1 = new javax.swing.JButton();
        manageEmployeesButton = new javax.swing.JButton();
        payrollButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        hamburgerMenuButton = new javax.swing.JButton();
        hamburgerPanel = new javax.swing.JPanel();
        myAttendanceMenu = new javax.swing.JButton();
        leaveRequestMenu = new javax.swing.JButton();
        myPayrollMenu = new javax.swing.JButton();
        needHelpMenu = new javax.swing.JButton();
        jPanel2 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        jLabel1 = new javax.swing.JLabel();
        notificationButton = new javax.swing.JButton();
        searchTextfield = new RoundJTextField(5);
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new CustomPanel(new Color(213,213,213), new Color(158,158,158));
        employeeProfileLabel = new javax.swing.JLabel();
        popup = new javax.swing.JPanel();
        logoutButton = new MyButton();
        timeinButton = new MyButton();
        timeoutButton = new MyButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        dateLabel = new javax.swing.JLabel();
        clockLabel = new javax.swing.JLabel();
        profileLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        documentsLabel = new javax.swing.JLabel();
        leaveRequestButton = new javax.swing.JButton();
        payrollDocsButton = new javax.swing.JButton();
        timeAndAttendanceButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setMinimumSize(new java.awt.Dimension(878, 565));
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(47, 36, 56));
        jPanel1.setLayout(null);

        attendanceDatabaseButton.setBackground(new java.awt.Color(47, 36, 56));
        attendanceDatabaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (3).png"))); // NOI18N
        attendanceDatabaseButton.setToolTipText("Employee Attendance");
        attendanceDatabaseButton.setBorderPainted(false);
        attendanceDatabaseButton.setContentAreaFilled(false);
        attendanceDatabaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendanceDatabaseButton.setFocusable(false);
        attendanceDatabaseButton.setPreferredSize(new java.awt.Dimension(50, 30));
        attendanceDatabaseButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (2) (1).png"))); // NOI18N
        attendanceDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceDatabaseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(attendanceDatabaseButton);
        attendanceDatabaseButton.setBounds(10, 320, 50, 50);

        homeButton1.setBackground(new java.awt.Color(47, 36, 56));
        homeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        homeButton1.setToolTipText("Home");
        homeButton1.setBorderPainted(false);
        homeButton1.setContentAreaFilled(false);
        homeButton1.setFocusable(false);
        homeButton1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(homeButton1);
        homeButton1.setBounds(10, 80, 50, 50);

        messageButton1.setBackground(new java.awt.Color(47, 36, 56));
        messageButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inbox.png"))); // NOI18N
        messageButton1.setToolTipText("Messages");
        messageButton1.setBorderPainted(false);
        messageButton1.setContentAreaFilled(false);
        messageButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messageButton1.setFocusable(false);
        messageButton1.setPreferredSize(new java.awt.Dimension(50, 30));
        messageButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inboxHover.png"))); // NOI18N
        messageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(messageButton1);
        messageButton1.setBounds(10, 140, 50, 50);

        manageEmployeesButton.setBackground(new java.awt.Color(47, 36, 56));
        manageEmployeesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empManagement.png"))); // NOI18N
        manageEmployeesButton.setToolTipText("Manage Employees");
        manageEmployeesButton.setBorderPainted(false);
        manageEmployeesButton.setContentAreaFilled(false);
        manageEmployeesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeesButton.setFocusable(false);
        manageEmployeesButton.setPreferredSize(new java.awt.Dimension(50, 30));
        manageEmployeesButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empManagementHover.png"))); // NOI18N
        manageEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageEmployeesButton);
        manageEmployeesButton.setBounds(10, 200, 50, 50);

        payrollButton.setBackground(new java.awt.Color(47, 36, 56));
        payrollButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/percentage.png"))); // NOI18N
        payrollButton.setToolTipText("Payroll Processing");
        payrollButton.setBorderPainted(false);
        payrollButton.setContentAreaFilled(false);
        payrollButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payrollButton.setFocusable(false);
        payrollButton.setPreferredSize(new java.awt.Dimension(50, 30));
        payrollButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/percentageHover.png"))); // NOI18N
        payrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollButtonActionPerformed(evt);
            }
        });
        jPanel1.add(payrollButton);
        payrollButton.setBounds(10, 260, 50, 50);

        profileButton.setBackground(new java.awt.Color(47, 36, 56));
        profileButton.setForeground(new java.awt.Color(47, 36, 56));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prof (1)_1.png"))); // NOI18N
        profileButton.setBorderPainted(false);
        profileButton.setContentAreaFilled(false);
        profileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileButton.setFocusable(false);
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(profileButton);
        profileButton.setBounds(10, 460, 50, 50);

        hamburgerMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        hamburgerMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hamburgerMenu.png"))); // NOI18N
        hamburgerMenuButton.setBorderPainted(false);
        hamburgerMenuButton.setContentAreaFilled(false);
        hamburgerMenuButton.setFocusPainted(false);
        hamburgerMenuButton.setFocusable(false);
        hamburgerMenuButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hamburgermenuHover_1.png"))); // NOI18N
        hamburgerMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamburgerMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hamburgerMenuButton);
        hamburgerMenuButton.setBounds(10, 23, 50, 50);

        backgroundPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 70, 565);

        hamburgerPanel.setBackground(new java.awt.Color(61, 48, 72));

        myAttendanceMenu.setBackground(new java.awt.Color(61, 48, 72));
        myAttendanceMenu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        myAttendanceMenu.setForeground(new java.awt.Color(255, 255, 255));
        myAttendanceMenu.setText("My Attendance");
        myAttendanceMenu.setBorder(null);
        myAttendanceMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myAttendanceMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myAttendanceMenuMouseExited(evt);
            }
        });
        myAttendanceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAttendanceMenuActionPerformed(evt);
            }
        });

        leaveRequestMenu.setBackground(new java.awt.Color(61, 48, 72));
        leaveRequestMenu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        leaveRequestMenu.setForeground(new java.awt.Color(255, 255, 255));
        leaveRequestMenu.setText("Leave Request Forms");
        leaveRequestMenu.setBorder(null);
        leaveRequestMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaveRequestMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaveRequestMenuMouseExited(evt);
            }
        });
        leaveRequestMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveRequestMenuActionPerformed(evt);
            }
        });

        myPayrollMenu.setBackground(new java.awt.Color(61, 48, 72));
        myPayrollMenu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        myPayrollMenu.setForeground(new java.awt.Color(255, 255, 255));
        myPayrollMenu.setText("My Payroll");
        myPayrollMenu.setBorder(null);
        myPayrollMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myPayrollMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myPayrollMenuMouseExited(evt);
            }
        });
        myPayrollMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myPayrollMenuActionPerformed(evt);
            }
        });

        needHelpMenu.setBackground(new java.awt.Color(61, 48, 72));
        needHelpMenu.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        needHelpMenu.setForeground(new java.awt.Color(255, 255, 255));
        needHelpMenu.setText("Need Help?");
        needHelpMenu.setBorder(null);
        needHelpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                needHelpMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                needHelpMenuMouseExited(evt);
            }
        });
        needHelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                needHelpMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hamburgerPanelLayout = new javax.swing.GroupLayout(hamburgerPanel);
        hamburgerPanel.setLayout(hamburgerPanelLayout);
        hamburgerPanelLayout.setHorizontalGroup(
            hamburgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myAttendanceMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leaveRequestMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(myPayrollMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(needHelpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hamburgerPanelLayout.setVerticalGroup(
            hamburgerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hamburgerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(myAttendanceMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(leaveRequestMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(myPayrollMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(needHelpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        backgroundPanel.add(hamburgerPanel);
        hamburgerPanel.setBounds(70, 0, 210, 530);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(47, 36, 56));
        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 36, 56));
        jLabel1.setText("MotorPH");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(14, 6, 220, 48);

        notificationButton.setBackground(new java.awt.Color(158, 158, 158));
        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notification.png"))); // NOI18N
        notificationButton.setToolTipText("Notifications");
        notificationButton.setBorderPainted(false);
        notificationButton.setContentAreaFilled(false);
        notificationButton.setFocusable(false);
        notificationButton.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(notificationButton);
        notificationButton.setBounds(730, 10, 50, 40);

        searchTextfield.setBackground(new java.awt.Color(255, 255, 255));
        searchTextfield.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        searchTextfield.setForeground(new java.awt.Color(102, 102, 102));
        searchTextfield.setText("Search");
        searchTextfield.setBorder(null);
        searchTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextfieldFocusLost(evt);
            }
        });
        jPanel2.add(searchTextfield);
        searchTextfield.setBounds(540, 10, 180, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(280, 0, 0, 16);

        backgroundPanel.add(jPanel2);
        jPanel2.setBounds(70, 0, 810, 60);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        employeeProfileLabel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        employeeProfileLabel.setForeground(new java.awt.Color(47, 36, 56));
        employeeProfileLabel.setText("EMPLOYEE PROFILE");
        jPanel3.add(employeeProfileLabel);
        employeeProfileLabel.setBounds(20, 20, 227, 33);

        popup.setBackground(new java.awt.Color(61, 48, 72));

        logoutButton.setBackground(new java.awt.Color(215, 43, 43));
        logoutButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("LOGOUT");
        logoutButton.setBorderPainted(false);
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutButtonMouseExited(evt);
            }
        });
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        timeinButton.setBackground(new java.awt.Color(0, 153, 0));
        timeinButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        timeinButton.setForeground(new java.awt.Color(0, 0, 0));
        timeinButton.setText("Time IN");
        timeinButton.setBorderPainted(false);
        timeinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeinButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeinButtonMouseExited(evt);
            }
        });
        timeinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeinButtonActionPerformed(evt);
            }
        });

        timeoutButton.setBackground(new java.awt.Color(252, 141, 80));
        timeoutButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        timeoutButton.setForeground(new java.awt.Color(0, 0, 0));
        timeoutButton.setText("Time OUT");
        timeoutButton.setBorderPainted(false);
        timeoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeoutButtonMouseExited(evt);
            }
        });
        timeoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeoutButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("00:00:00");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("00:00:00");

        jPanel5.setBackground(new java.awt.Color(86, 71, 97));

        dateLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("00:00:00");

        clockLabel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        clockLabel.setForeground(new java.awt.Color(255, 255, 255));
        clockLabel.setText("00:00:00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(clockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(clockLabel))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout popupLayout = new javax.swing.GroupLayout(popup);
        popup.setLayout(popupLayout);
        popupLayout.setHorizontalGroup(
            popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(popupLayout.createSequentialGroup()
                .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popupLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(popupLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        popupLayout.setVerticalGroup(
            popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popupLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeinButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.add(popup);
        popup.setBounds(0, 60, 230, 210);

        profileLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        profileLabel2.setForeground(new java.awt.Color(47, 36, 56));
        jPanel3.add(profileLabel2);
        profileLabel2.setBounds(20, 60, 465, 182);

        backgroundPanel.add(jPanel3);
        jPanel3.setBounds(70, 260, 510, 310);

        jPanel4.setBackground(new java.awt.Color(218, 218, 218));

        documentsLabel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        documentsLabel.setForeground(new java.awt.Color(47, 36, 56));
        documentsLabel.setText("RECORDS & DOCUMENTS");

        leaveRequestButton.setBackground(new java.awt.Color(252, 141, 80));
        leaveRequestButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        leaveRequestButton.setForeground(new java.awt.Color(255, 255, 255));
        leaveRequestButton.setText("Leave Request Forms");
        leaveRequestButton.setBorderPainted(false);
        leaveRequestButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leaveRequestButton.setFocusable(false);
        leaveRequestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaveRequestButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaveRequestButtonMouseExited(evt);
            }
        });
        leaveRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveRequestButtonActionPerformed(evt);
            }
        });

        payrollDocsButton.setBackground(new java.awt.Color(252, 141, 80));
        payrollDocsButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        payrollDocsButton.setForeground(new java.awt.Color(255, 255, 255));
        payrollDocsButton.setText("Payroll Documents");
        payrollDocsButton.setBorderPainted(false);
        payrollDocsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payrollDocsButton.setFocusable(false);
        payrollDocsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payrollDocsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payrollDocsButtonMouseExited(evt);
            }
        });
        payrollDocsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollDocsButtonActionPerformed(evt);
            }
        });

        timeAndAttendanceButton.setBackground(new java.awt.Color(252, 141, 80));
        timeAndAttendanceButton.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        timeAndAttendanceButton.setForeground(new java.awt.Color(255, 255, 255));
        timeAndAttendanceButton.setText("Time & Attendance");
        timeAndAttendanceButton.setBorderPainted(false);
        timeAndAttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeAndAttendanceButton.setFocusable(false);
        timeAndAttendanceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeAndAttendanceButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeAndAttendanceButtonMouseExited(evt);
            }
        });
        timeAndAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeAndAttendanceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeAndAttendanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaveRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payrollDocsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(documentsLabel)))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(documentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeAndAttendanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(leaveRequestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payrollDocsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        backgroundPanel.add(jPanel4);
        jPanel4.setBounds(580, 260, 300, 310);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/asdasd (1) (1).png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        backgroundPanel.add(jLabel2);
        jLabel2.setBounds(90, 80, 200, 170);

        profileLabel.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        profileLabel.setForeground(new java.awt.Color(47, 36, 56));
        backgroundPanel.add(profileLabel);
        profileLabel.setBounds(310, 80, 530, 160);

        getContentPane().add(backgroundPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void displayEmplyoeeDetails () {       
        String text = ("<html>" +
            "<table cellspacing='2' cellpadding='2' style='line-height:1.2;'>" +
            "  <tr><td><b>Name</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + user.getFirstName()+ " " + user.getLastName() + " </td></tr>" +
            "  <tr><td><b>Employee ID</b></td><td>&nbsp:</td><td>" + user.getId()+ " </td></tr>" +
            "  <tr><td><b>Job Position</b></td><td>&nbsp:</td><td>" + user.getPosition()+ " </td></tr>" +
            "  <tr><td><b>Address</b></td><td>&nbsp:</td><td>" + user.getAddress()+ " </td></tr>" +
            "</table>" +
            "</html>");
        profileLabel.setText(text);
        
        String textII = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td><b>Birthday</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + user.getBirthday() + " </td></tr>" +
            "  <tr><td><b>Status</b></td><td>&nbsp:</td><td>" + user.getStatus() + " </td></tr>" +
            "  <tr><td><b>Phone</b></td><td>&nbsp:</td><td>" + user.getPhoneNumber() + " </td></tr>" +
            "  <tr><td><b>SSS</b></td><td>&nbsp:</td><td>" + user.getSSSNumber() + " </td></tr>" +
            "  <tr><td><b>Philhealth</b></td><td>&nbsp:</td><td>" + user.getPhilhealthNumber()+ " </td></tr>" +
            "  <tr><td><b>PAG-IBIG</b></td><td>&nbsp:</td><td>" + user.getPagibigNumber() + " </td></tr>" +
            "  <tr><td><b>TIN</b></td><td>&nbsp:</td><td>" + user.getTinNumber() + " </td></tr>" +
            "  <tr><td><b>Hourly Rate</b></td><td>&nbsp:</td><td>" + user.getHourlyRate() + " </td></tr>" +
            "</table>" +
            "</html>");
        profileLabel2.setText(textII);
    }
    
    
    private void timeIn() {
        String [] details = new String [3];
        Date date = new Date();
        DateFormat currentDate = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat currentTime = new SimpleDateFormat("HH:mm");
        details[0] = String.valueOf(user.getId());
        details[1] = currentDate.format(date);
        details[2] = currentTime.format(date);
        
        AttendanceModule attendance = new AttendanceModule(user.getId());
        
        boolean timeIn = attendance.timeIn(details);
        
        if (timeIn) {
            JOptionPane.showMessageDialog(null, "Timed in successfully");
        }
        else {
            JOptionPane.showMessageDialog(null, "You have already timed in", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void timeOut() {
        String [] details = new String [3];
        Date date = new Date();
        DateFormat currentDate = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat currentTime = new SimpleDateFormat("HH:mm");
        details[0] = currentTime.format(date);
        details[1] = currentDate.format(date);
        details[2] = String.valueOf(user.getId());
        
        AttendanceModule attendance = new AttendanceModule(user.getId());
        
        boolean timeOut = attendance.timeOut(details);
        
        if (timeOut) {
            JOptionPane.showMessageDialog(null, "Timed out successfully");
        }
        else {
            JOptionPane.showMessageDialog(null, "You have not yet timed in", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void setDateAndTime () {
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat currentDate = new SimpleDateFormat("MM/dd/yyyy");               
                dateLabel.setText(currentDate.format(date));
                
                Date date2 = new Date();
                DateFormat currentDate2 = new SimpleDateFormat("hh:mm:ss");
                clockLabel.setText(currentDate2.format(date2));
            }
        };
        timer = new Timer(1000,ac);
        timer.setInitialDelay(0);
        timer.start();
    }
        
    private void adjustSearchField() {
        searchTextfield.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(searchTextfield.getForeground(), 0),
                    new EmptyBorder(5, 10, 5, 10)
            ));
    }
    
    private void searchTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextfieldFocusGained
        // Placeholders
        if (searchTextfield.getText().equals("Search")) {
            searchTextfield.setText("");
            searchTextfield.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_searchTextfieldFocusGained

    private void searchTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextfieldFocusLost
        // Placeholders
        if (searchTextfield.getText().equals("")) {
            searchTextfield.setText("Search");
            searchTextfield.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchTextfieldFocusLost

    private void timeinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeinButtonActionPerformed
        timeIn();
    }//GEN-LAST:event_timeinButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Confirm",JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            new UserAuthentication().logOut(this);
        }
        
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void leaveRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveRequestButtonActionPerformed
        this.setVisible(false);
        new LeaveRequestGui(user,this).setVisible(true);
    }//GEN-LAST:event_leaveRequestButtonActionPerformed

    private void timeAndAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeAndAttendanceButtonActionPerformed
        new AttendancePageGui(user,this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_timeAndAttendanceButtonActionPerformed

    private void timeAndAttendanceButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeAndAttendanceButtonMouseEntered
        timeAndAttendanceButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_timeAndAttendanceButtonMouseEntered

    private void timeAndAttendanceButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeAndAttendanceButtonMouseExited
        timeAndAttendanceButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_timeAndAttendanceButtonMouseExited

    private void leaveRequestButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveRequestButtonMouseEntered
        leaveRequestButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_leaveRequestButtonMouseEntered

    private void leaveRequestButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveRequestButtonMouseExited
        leaveRequestButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_leaveRequestButtonMouseExited

    private void payrollDocsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollDocsButtonMouseEntered
        payrollDocsButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_payrollDocsButtonMouseEntered

    private void payrollDocsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payrollDocsButtonMouseExited
        payrollDocsButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_payrollDocsButtonMouseExited

    private void logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseEntered
        logoutButton.setBackground(new Color(221,74,74));
    }//GEN-LAST:event_logoutButtonMouseEntered

    private void logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseExited
        logoutButton.setBackground(new Color(215,43,43));
    }//GEN-LAST:event_logoutButtonMouseExited

    private void timeinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeinButtonMouseEntered
        timeinButton.setBackground(new Color(0,188,0));
    }//GEN-LAST:event_timeinButtonMouseEntered

    private void timeinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeinButtonMouseExited
        timeinButton.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_timeinButtonMouseExited

    private void timeoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutButtonMouseEntered
        timeoutButton.setBackground(new Color(255,165,115));
    }//GEN-LAST:event_timeoutButtonMouseEntered

    private void timeoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeoutButtonMouseExited
       timeoutButton.setBackground(new Color(252,141,80));
    }//GEN-LAST:event_timeoutButtonMouseExited

    private void payrollDocsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollDocsButtonActionPerformed
        this.setVisible(false);
        new PayrollDocsGui(user,this).setVisible(true);
    }//GEN-LAST:event_payrollDocsButtonActionPerformed

    private void myAttendanceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAttendanceMenuActionPerformed
        hamburgerPanel.setVisible(false);
        new AttendancePageGui(user,this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_myAttendanceMenuActionPerformed

    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileButtonActionPerformed
        if (!popup.isVisible()) {
            popup.setVisible(true);
        } else {
            popup.setVisible(false);
        }

    }//GEN-LAST:event_profileButtonActionPerformed

    private void attendanceDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceDatabaseButtonActionPerformed
        if (user.hasHrAccess()) {
            this.setVisible(false);
            new AttendanceDatabaseGUI(this).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Only HR can access this feature");
        }
        
    }//GEN-LAST:event_attendanceDatabaseButtonActionPerformed

    private void manageEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeesButtonActionPerformed
        if (user.hasHrAccess()) {
            this.setVisible(false);
            new CrudGui(this).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Only HR can access this feature");
        }

    }//GEN-LAST:event_manageEmployeesButtonActionPerformed

    private void messageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButton1ActionPerformed
        this.setVisible(false);
        new MessagesGui(this).setVisible(true);
    }//GEN-LAST:event_messageButton1ActionPerformed

    private void hamburgerMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamburgerMenuButtonActionPerformed
        if (!hamburgerPanel.isVisible()) {
            hamburgerPanel.setVisible(true);
        }
        else {
            hamburgerPanel.setVisible(false);
        }
    }//GEN-LAST:event_hamburgerMenuButtonActionPerformed

    private void leaveRequestMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveRequestMenuActionPerformed
        hamburgerPanel.setVisible(false);
        this.setVisible(false);
        new LeaveRequestGui(user,this).setVisible(true);
    }//GEN-LAST:event_leaveRequestMenuActionPerformed

    private void timeoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeoutButtonActionPerformed
        timeOut();
    }//GEN-LAST:event_timeoutButtonActionPerformed

    private void payrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollButtonActionPerformed
        if (user.hasFinanceAccess()) {
            this.setVisible(false);
            new PayrollProcessingGui(this).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Only Finance can access this feature");
        }
    }//GEN-LAST:event_payrollButtonActionPerformed

    private void myAttendanceMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAttendanceMenuMouseEntered
        myAttendanceMenu.setBackground(new Color(85, 66, 100));
    }//GEN-LAST:event_myAttendanceMenuMouseEntered

    private void myAttendanceMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAttendanceMenuMouseExited
        myAttendanceMenu.setBackground(new Color(61,48,72));
        
    }//GEN-LAST:event_myAttendanceMenuMouseExited

    private void leaveRequestMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveRequestMenuMouseEntered
        leaveRequestMenu.setBackground(new Color(85, 66, 100));
    }//GEN-LAST:event_leaveRequestMenuMouseEntered

    private void leaveRequestMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveRequestMenuMouseExited
        leaveRequestMenu.setBackground(new Color(61,48,72));
    }//GEN-LAST:event_leaveRequestMenuMouseExited

    private void myPayrollMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myPayrollMenuMouseEntered
        myPayrollMenu.setBackground(new Color(85, 66, 100));
    }//GEN-LAST:event_myPayrollMenuMouseEntered

    private void myPayrollMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myPayrollMenuMouseExited
        myPayrollMenu.setBackground(new Color(61,48,72));
    }//GEN-LAST:event_myPayrollMenuMouseExited

    private void needHelpMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_needHelpMenuMouseEntered
        needHelpMenu.setBackground(new Color(85, 66, 100));
    }//GEN-LAST:event_needHelpMenuMouseEntered

    private void needHelpMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_needHelpMenuMouseExited
        needHelpMenu.setBackground(new Color(61,48,72));
    }//GEN-LAST:event_needHelpMenuMouseExited

    private void myPayrollMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myPayrollMenuActionPerformed
        hamburgerPanel.setVisible(false);
        this.setVisible(false);
        new PayrollDocsGui(user,this).setVisible(true);
    }//GEN-LAST:event_myPayrollMenuActionPerformed

    private void needHelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_needHelpMenuActionPerformed
        hamburgerPanel.setVisible(false);
        this.setVisible(false);
        new HelpSectionGui(this, user, popup).setVisible(true);
    }//GEN-LAST:event_needHelpMenuActionPerformed
    
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendanceDatabaseButton;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel clockLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel documentsLabel;
    private javax.swing.JLabel employeeProfileLabel;
    private javax.swing.JButton hamburgerMenuButton;
    private javax.swing.JPanel hamburgerPanel;
    private javax.swing.JButton homeButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton leaveRequestButton;
    private javax.swing.JButton leaveRequestMenu;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageEmployeesButton;
    private javax.swing.JButton messageButton1;
    private javax.swing.JButton myAttendanceMenu;
    private javax.swing.JButton myPayrollMenu;
    private javax.swing.JButton needHelpMenu;
    private javax.swing.JButton notificationButton;
    private javax.swing.JButton payrollButton;
    private javax.swing.JButton payrollDocsButton;
    private javax.swing.JPanel popup;
    private javax.swing.JButton profileButton;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JLabel profileLabel2;
    private javax.swing.JTextField searchTextfield;
    private javax.swing.JButton timeAndAttendanceButton;
    private javax.swing.JButton timeinButton;
    private javax.swing.JButton timeoutButton;
    // End of variables declaration//GEN-END:variables
}

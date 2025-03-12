/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package motorphpayroll;

import javax.swing.JWindow;

/**
 *
 * @author keith
 */
public class PayslipGui extends javax.swing.JFrame {

    
    private PayrollModule payrollModule;
    private String month;
    private TaxAndDeductionsModule taxModule = new TaxAndDeductionsModule();
    private JWindow overlay;
    private String [] empDetails;
     
    public PayslipGui(PayrollModule payrollModule, String month, String [] empDetails, JWindow overlay) {        
        initComponents();
        this.payrollModule = payrollModule;
        this.month = month;
        this.overlay = overlay;
        this.empDetails = empDetails;
        payrollModule.calculateMonthlyGrossSalary();
        showPayslip();      
    }
    
    public void showPayslip () {
        String text = ("<html>" +
            "<table cellspacing='2' cellpadding='2' style='line-height:1.2;'>" +
            "  <tr><td><b>Payslip No</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + "31-2023-12-30" + " </td></tr>" +
            "  <tr><td><b>Pay Period</b></td><td>&nbsp:</td><td>" + month +", " + payrollModule.getSelectedYear()+  " </td></tr>" +
            "  <tr><td><b>Worked Hours</b></td><td>&nbsp:</td><td>" + payrollModule.getMonthlyHoursWorked()+ " Hours"+ " </td></tr>" +          
            "</table>" +
            "</html>");
        label1.setText(text);
        
        String textII = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td><b>Name</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + empDetails[1] + " " + empDetails[2] +  " </td></tr>" +
            "  <tr><td><b>ID #</b></td><td>&nbsp:</td><td>" + empDetails[0] + " </td></tr>" +
            "  <tr><td><b>Position</b></td><td>&nbsp:</td><td>" + empDetails[7] + " </td></tr>" +           
            "</table>" +
            "</html>");
        label2.setText(textII);
        
        String textIII = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td>Gross Pay</b></td><td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td><td>" + payrollModule.getGrossPay() + " </td></tr>" +
            "  <tr><td>Total Earnings</b></td><td>&nbsp</td><td>" + payrollModule.getGrossPay() + " </td></tr>" +
            "</table>" +
            "</html>");
        label4.setText(textIII);
        
        String textIV = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td>SSS</b></td><td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp </td><td>" + taxModule.getSSSDeduction(payrollModule.getGrossPay()) + "0 </td></tr>" +
            "  <tr><td>Philhealth</b></td><td>&nbsp</td><td>" + taxModule.getPhilHealthDeduction(payrollModule.getGrossPay()) + " </td></tr>" +
            "  <tr><td>Pagibig</b></td><td>&nbsp</td><td>" + taxModule.getPagIbigDeduction(payrollModule.getGrossPay()) + " </td></tr>" +  
            "  <tr><td>Withholding Tax</b></td><td>&nbsp</td><td>" + taxModule.getWithholdingTax(payrollModule.getTaxableIncome()) + " </td></tr>" +
            "  <tr><td>Total Deductions</b></td><td>&nbsp</td><td>" + payrollModule.getTotalDeductions() + " </td></tr>" +
            "  <tr><td><b>Net Pay</b></td><td>&nbsp</td><td><b>" + payrollModule.getNetSalary() + " </td></tr>" +
            "</table>" +
            "</html>");
        label5.setText(textIV);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        employeeProfileLabel1 = new javax.swing.JLabel();
        employeeProfileLabel2 = new javax.swing.JLabel();
        employeeProfileLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 565));
        jPanel1.setLayout(null);

        employeeProfileLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        employeeProfileLabel1.setForeground(new java.awt.Color(0, 0, 0));
        employeeProfileLabel1.setText("MotorPH");
        jPanel1.add(employeeProfileLabel1);
        employeeProfileLabel1.setBounds(207, 30, 80, 15);

        employeeProfileLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        employeeProfileLabel2.setForeground(new java.awt.Color(0, 0, 0));
        employeeProfileLabel2.setText("Payslip");
        jPanel1.add(employeeProfileLabel2);
        employeeProfileLabel2.setBounds(217, 7, 70, 17);

        employeeProfileLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        employeeProfileLabel3.setForeground(new java.awt.Color(0, 0, 0));
        employeeProfileLabel3.setText("Philippines");
        jPanel1.add(employeeProfileLabel3);
        employeeProfileLabel3.setBounds(213, 51, 60, 15);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(2, 20, 403, 2);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(110, 0, 2, 21);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("      Amount");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 2, 90, 18);

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(200, 20, 2, 130);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);
        jPanel9.setBounds(200, 0, 2, 21);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("         Earnings");
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(2, 2, 108, 18);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10);
        jPanel10.setBounds(200, 0, 2, 21);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11);
        jPanel11.setBounds(110, 0, 2, 21);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("      Amount");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 2, 90, 18);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("         Earnings");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(2, 2, 108, 18);

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12);
        jPanel12.setBounds(200, 0, 2, 21);

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);
        jPanel13.setBounds(110, 0, 2, 21);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("      Amount");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 2, 90, 18);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("         Earnings");
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(2, 2, 108, 18);

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14);
        jPanel14.setBounds(310, 0, 2, 21);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("        Deductions");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(202, 2, 108, 18);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("      Amount");
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(312, 2, 93, 18);

        label5.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label5.setForeground(new java.awt.Color(47, 36, 56));
        label5.setText("Date of Joining");
        jPanel2.add(label5);
        label5.setBounds(205, 30, 196, 100);

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(2, 21));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15);
        jPanel15.setBounds(200, 0, 2, 21);

        label4.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label4.setForeground(new java.awt.Color(47, 36, 56));
        label4.setText("Date of Joining");
        jPanel2.add(label4);
        label4.setBounds(5, 30, 192, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 170, 407, 150);

        label12.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label12.setForeground(new java.awt.Color(47, 36, 56));
        label12.setText("This is a system generated payslip");
        jPanel1.add(label12);
        label12.setBounds(160, 450, 190, 30);

        label2.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label2.setForeground(new java.awt.Color(47, 36, 56));
        label2.setText("Date of Joining");
        jPanel1.add(label2);
        label2.setBounds(248, 89, 192, 60);

        label1.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(47, 36, 56));
        label1.setText("Date of Joining");
        jPanel1.add(label1);
        label1.setBounds(38, 89, 192, 60);

        label6.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label6.setForeground(new java.awt.Color(47, 36, 56));
        label6.setText("Employer Signature");
        jPanel1.add(label6);
        label6.setBounds(70, 370, 100, 30);

        label7.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        label7.setForeground(new java.awt.Color(47, 36, 56));
        label7.setText("Employee Signature");
        jPanel1.add(label7);
        label7.setBounds(320, 370, 100, 30);

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));
        jPanel16.setPreferredSize(new java.awt.Dimension(200, 2));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16);
        jPanel16.setBounds(290, 420, 160, 2);

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));
        jPanel17.setPreferredSize(new java.awt.Dimension(200, 2));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel17);
        jPanel17.setBounds(40, 420, 160, 2);

        closeButton.setBackground(new java.awt.Color(153, 153, 153));
        closeButton.setForeground(new java.awt.Color(204, 204, 204));
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close (1).png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setFocusPainted(false);
        closeButton.setFocusable(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton);
        closeButton.setBounds(460, 10, 30, 30);

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

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
        overlay.setVisible(false);
        
    }//GEN-LAST:event_closeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel employeeProfileLabel1;
    private javax.swing.JLabel employeeProfileLabel2;
    private javax.swing.JLabel employeeProfileLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Abubakar Manzoor
 */
public class Accounts_Dekstop1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Accounts_Dekstop1
     */

    String Classname;
    String Rollno;


  
    public Accounts_Dekstop1() {
        initComponents();
       
    }
    
    int finemaking(String lastdate){
        
        String day = null;
        String month = null;
        String year = null;
        
        //breaking the last date into days, month and year
        int loop = 0;
           
        for (String retval: lastdate.split("-")){
    
            switch (loop) {
                case 0:
                    day = retval;
                    break;
                case 1:
                    month = retval;
                    break;
                case 2:
                    year = retval;
                    break;
                default:
                    break;
            }
            loop++;
        }
        
        
        //last date of fees submission
        int day1 = Integer.parseInt(day);
        int month1 = Integer.parseInt(month);
        int year1 = Integer.parseInt(year);
        
        //today date
        Calendar cal = new GregorianCalendar();
        int day2 = cal.get(Calendar.DAY_OF_MONTH);
        int month2 = cal.get(Calendar.MONTH);
        int year2 = cal.get(Calendar.YEAR);
        
        int fine;
        
        int finemonth;
        int fineday;
        int fineyear;
        
        finemonth = month2 - month1;
        fineday = day2 - day1;
        fineyear = year2 - year1;
        
        
        if(finemonth < 0){
            finemonth=0;
        }if(fineday < 0){
            fineday = 0;
        }if(fineyear < 0){
            fineday = 0;
        }
        
        if(month2>month1){
            fineday = fineday * 20;
        }else{
            fineday = 0;
        }
        finemonth = finemonth * 20;
        fineyear = fineyear * 20;
        
        fine = fineday + finemonth + fineyear;
    
        return fine;
   
    }
    
    //function that recieve the class name and roll no of the student
    void reciever(String class1, String rollno, String Month, int Day, int Year, String feestype){
        
        
        String name = null;
        String fathername = null;
        String totalfees = null;
        String feessubmittedornot = null;
        String discount = null;
        String fine = null;
        String lastdate = null;
        int grandtotal;

        String feesgenerator = "select * from Student_admission where class = '" + class1 + "' AND roll_no = '" + rollno + "';";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            PreparedStatement stmt = con.prepareStatement(feesgenerator);
            ResultSet r1 = stmt.executeQuery();

            while(r1.next())
            {
                name = r1.getString("first_name");
                fathername = r1.getString("fathers_name");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        String feesgenerator1 = "select * from fees_" + class1 + " where Rollno = " + rollno + ";";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            PreparedStatement stmt = con.prepareStatement(feesgenerator1);
            ResultSet r1 = stmt.executeQuery();
            
          
            while(r1.next())
            {
                totalfees = r1.getString("TF_" + feestype);
                discount = r1.getString("D_" + feestype);
                fine = r1.getString("F_" + feestype);
                lastdate = r1.getString("LDate_" + feestype);
                feessubmittedornot = r1.getString("SF_" + feestype);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        int totalfees1 = Integer.parseInt(totalfees);
        int discount1 = Integer.parseInt(discount);
       
        //this function making the fine according to the late feee submission
        int totalfine = finemaking(lastdate);
        String totalfine1 = ""+ totalfine;
        
        
        grandtotal = (totalfees1 - discount1) + totalfine;
        String grandtotal1 = ""+grandtotal;
        
        if("0".equals(feessubmittedornot)){
            jLabel5.setText("Not Submitted");
        }else{
            jLabel5.setText("Submitted");
        }
        
        jLabel17.setText(feestype);
        L_name.setText(name);
        L_fathername.setText(fathername);
        L_rollno.setText(rollno);
        L_class.setText(class1);
        L_fees.setText(totalfees);
        TF_discount.setText(discount);
        L_fine.setText(totalfine1);
        String date = Day + ":" + Month + ":" + Year;
        L_date.setText(lastdate);
        today_date.setText(date);
        L_total.setText(grandtotal1);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L_name = new javax.swing.JLabel();
        L_fathername = new javax.swing.JLabel();
        L_rollno = new javax.swing.JLabel();
        L_class = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        L_fees = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        L_fine = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        L_total = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        L_date = new javax.swing.JLabel();
        TF_discount = new javax.swing.JTextField();
        today_date = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        jLabel1.setText("Student Name");

        jLabel2.setText("Roll No");

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Class");

        jLabel4.setText("Father's Name");

        L_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L_fathername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_fathername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L_rollno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_rollno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        L_class.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_class.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Discount (if any)");

        L_fees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_fees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Fees");

        L_fine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_fine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Fine");

        L_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("Grand Total");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setText("SAVE & PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        L_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TF_discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_discount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_discountFocusLost(evt);
            }
        });
        TF_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_discountActionPerformed(evt);
            }
        });

        today_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        today_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setText("Today Date");

        jLabel15.setText("Last Date of Fees Submission");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Submitted or not");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(27, 27, 27)
                        .addComponent(L_date, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(today_date, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel4))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(L_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(128, 128, 128)
                                    .addComponent(jLabel12)
                                    .addGap(48, 48, 48)
                                    .addComponent(L_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(L_fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel9))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel2)
                            .addGap(42, 42, 42)
                            .addComponent(L_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addComponent(jLabel14)
                            .addGap(48, 48, 48)
                            .addComponent(L_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel3)
                            .addGap(42, 42, 42)
                            .addComponent(L_class, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(97, 97, 97)
                            .addComponent(jLabel16)
                            .addGap(49, 49, 49)
                            .addComponent(L_total, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(today_date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_name, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(L_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_fathername, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(L_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(L_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(L_class, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(L_total, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String classname = L_class.getText();
        String rollno = L_rollno.getText();
        String feestype = jLabel17.getText();
        String totalfees = L_total.getText();
        String L_fees1 = L_fees.getText(); 
        String fine = L_fine.getText();
        
        String discount = TF_discount.getText();
        
        String query1 = "UPDATE fees_" + classname + " SET SF_" + feestype + " = " + totalfees + " where Rollno = '" + rollno + "';";
        String query2 = "UPDATE fees_" + classname + " SET D_" + feestype + " = " + discount + " where Rollno = '" + rollno + "';";
        String query3 = "UPDATE fees_" + classname + " SET F_" + feestype + " = " + fine + " where Rollno = '" + rollno + "';";
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt=con.createStatement();
            
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            con.close();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        String name11 = null;
        String fathername11 = null;
        
        String datagetter = "select * from Student_admission where class = '" + classname + "' AND roll_no = '" + rollno + "';";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            PreparedStatement stmt = con.prepareStatement(datagetter);
            ResultSet r1 = stmt.executeQuery();

            while(r1.next())
            {
                name11 = r1.getString("first_name");
                fathername11 = r1.getString("fathers_name");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        fees_slip_printing object1 = new fees_slip_printing();
        object1.printing(name11, fathername11, rollno, classname, totalfees, fine, L_fees1, feestype);
        
        
        JOptionPane.showMessageDialog(null,"Fees Successfully Added");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TF_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_discountActionPerformed

    private void TF_discountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_discountFocusLost
        
        
        String discount = TF_discount.getText();
        String fine = L_fine.getText();
        String fees = L_fees.getText();
        
        
        
        
        int discount1 = Integer.parseInt(discount);
        int fine1 = Integer.parseInt(fine);
        int fees1 = Integer.parseInt(fees);
        
        int totalfees = (fees1 + fine1) - discount1;
        
        String totalfees1 = "" + totalfees;
        
        L_total.setText(totalfees1);
        
    }//GEN-LAST:event_TF_discountFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        String classname = L_class.getText();
        String rollno = L_rollno.getText();
        String feestype = jLabel17.getText();
        String totalfees = L_total.getText();
        String L_fees1 = L_fees.getText(); 
        String fine = L_fine.getText();
        
        String discount = TF_discount.getText();
        
        String query1 = "UPDATE fees_" + classname + " SET SF_" + feestype + " = " + totalfees + " where Rollno = '" + rollno + "';";
        String query2 = "UPDATE fees_" + classname + " SET D_" + feestype + " = " + discount + " where Rollno = '" + rollno + "';";
        String query3 = "UPDATE fees_" + classname + " SET F_" + feestype + " = " + fine + " where Rollno = '" + rollno + "';";
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt=con.createStatement();
            
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            con.close();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        String name11 = null;
        String fathername11 = null;
        
        String datagetter = "select * from Student_admission where class = '" + classname + "' AND roll_no = '" + rollno + "';";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/misc","root","");
            PreparedStatement stmt = con.prepareStatement(datagetter);
            ResultSet r1 = stmt.executeQuery();

            while(r1.next())
            {
                name11 = r1.getString("first_name");
                fathername11 = r1.getString("fathers_name");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        JOptionPane.showMessageDialog(null,"Fees Successfully Added");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_class;
    private javax.swing.JLabel L_date;
    private javax.swing.JLabel L_fathername;
    private javax.swing.JLabel L_fees;
    private javax.swing.JLabel L_fine;
    private javax.swing.JLabel L_name;
    private javax.swing.JLabel L_rollno;
    private javax.swing.JLabel L_total;
    private javax.swing.JTextField TF_discount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel today_date;
    // End of variables declaration//GEN-END:variables
}

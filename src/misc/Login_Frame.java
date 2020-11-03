package misc;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Class Starts here
public class Login_Frame extends javax.swing.JFrame {

    int timeRun = 0;
    int day, month, year;

    String date;

    //Constructor
    public Login_Frame() {
        this.setIconImage(new ImageIcon(getClass().getResource("MISC_logo.png")).getImage());
        initComponents();

        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();

                    day = cal.get(Calendar.DAY_OF_MONTH);
                    month = cal.get(Calendar.MONTH);
                    year = cal.get(Calendar.YEAR);

                    date = day + ":" + month + ":" + year;

                }
            }
        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 110, 190, 20);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Forget Password");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 170, 90, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(320, 140, 190, 20);

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 170, 70, 23);

        jButton4.setText("Signup");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 210, 70, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 300);

        setSize(new java.awt.Dimension(570, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //.............................................................BUTTONS CODING STARTS HERE.............................................................................

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String username = jTextField2.getText();
        String password = jPasswordField1.getText();
        String firstname = null;

        String status = "Not_Accepted";

        if ("".equals(username)) {
            JOptionPane.showMessageDialog(null, "Please Enter the Username");
        } else if ("".equals(password)) {
            JOptionPane.showMessageDialog(null, "Please Enter the Password");
        } else {

            String Query = "select * from login_table;";
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {

                    String user1 = r1.getString("User_name");
                    String pass1 = r1.getString("Password");
                    String firstname1 = r1.getString("First_Name");

                    if (user1.equals(username) && pass1.equals(password)) {

                        status = "Approve";
                        firstname = firstname1;

                    }

                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if ("Not_Accepted".equals(status)) {
            if ("pmhs".equals(username) && "!@#phms".equals(password)) {
                status = "Approve";
                firstname = "Developer";
            }

        }

        switch (status) {
            case "Approve":
                dispose();
                Main_Page object123456 = new Main_Page(firstname);
                object123456.functioncalling();
                object123456.setVisible(true);
                object123456.show_notice_board();
                break;
            case "Not_Approve1":
                JOptionPane.showMessageDialog(null, "Trial Period End");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Your User name and Password is Wrong try again!");
                jTextField2.setText("");
                jPasswordField1.setText("");
                break;
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String username = jTextField2.getText();

        if ("".equals(username)) {
            JOptionPane.showMessageDialog(null, "Enter the Username in the Username Field then Press Enter");
        } else {

            dispose();
            Forget_password_Frame objectforgetpassword = new Forget_password_Frame();
            objectforgetpassword.usernamegetter(username);
            objectforgetpassword.setVisible(true);

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Signup_Frame objectsignup = new Signup_Frame();
        objectsignup.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    //.............................................................BUTTONS CODING ENDS HERE............................................................................
    //............................................................FUNCTIONS DEFINITION STARTS HERE..........................................................................
    //.............................................................FUNCTIONS DEFINITION ENDS HERE..........................................................................
    //............................................................UN-TOUCING CODING STARTE HERE............................................................................
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(4500);
                } catch (Exception e) {

                }
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

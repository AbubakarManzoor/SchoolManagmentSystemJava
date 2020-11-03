
package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Signup_Frame extends javax.swing.JFrame {

  
    public Signup_Frame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                signupclosing(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(340, 150, 160, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 50, 160, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(340, 90, 160, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(340, 120, 160, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(340, 180, 160, 20);

        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 250, 90, 23);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(340, 210, 160, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("First Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 85, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 170, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Master Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 200, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("User Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 145, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Last Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 115, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 570, 300);

        setSize(new java.awt.Dimension(571, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String firstname = jTextField2.getText();
        String lastname = jTextField3.getText();
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();

        String masterpassword = "master!@#pmhs";

        if ("".equals(firstname)) {
            JOptionPane.showMessageDialog(null, "Please Enter First Name in the First Field");
        } else if ("".equals(lastname)) {
            JOptionPane.showMessageDialog(null, "Please Enter Last Name in the Second Field");
        } else if ("".equals(username)) {
            JOptionPane.showMessageDialog(null, "Please Enter UserName in the Third Field");
        } else if ("".equals(password)) {
            JOptionPane.showMessageDialog(null, "Please Enter Password in the Forth Field");
        }else{
            if (jPasswordField2.getText() == null ? masterpassword == null : jPasswordField2.getText().equals(masterpassword)) {

                String query = "insert into login_table(First_Name, Last_Name, User_name , Password) values('" + firstname + "' , ' " + lastname + "' , '" + username + "' , '" + password + "');";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "User Add Succssfully");
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }else{
                JOptionPane.showMessageDialog(null, "Master is Password is Wrong");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signupclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_signupclosing
        dispose();
        Login_Frame objectlogin = new Login_Frame();
        objectlogin.setVisible(true);
    }//GEN-LAST:event_signupclosing

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
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

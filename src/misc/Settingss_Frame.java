/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author Abubakar Manzoor
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static misc.Main_Page.functiongettingtotals;

public class Settingss_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Settingss_Frame
     */
    public Settingss_Frame() {
        initComponents();

        combobox();

    }

    void combobox() {

        String Query3 = "select * from classes_record;";
        String Query4 = "select * from login_table;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            PreparedStatement stmtt = con.prepareStatement(Query4);
            ResultSet r2 = stmtt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Class_name");
                CB_classes.addItem(name);
            }

            while (r2.next()) {
                String name = r2.getString("User_name");
                CB_users.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    String Subject1 = "None";
    String Subject2 = "None";
    String Subject3 = "None";
    String Subject4 = "None";
    String Subject5 = "None";
    String Subject6 = "None";
    String Subject7 = "None";
    String Subject8 = "None";
    String Subject9 = "None";
    String Suject10 = "None";

    String totalsubjects;
    String classname;
    String totalfees;
    String classinchargename;
    String schoolorcollege;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void tf_to_variables() {
        //getting data from text field  and save it in variables
        totalsubjects = TF_totalnumberofsubjects.getText();
        classname = TF_classname.getText();
        totalfees = TF_classtotalfees.getText();
        classinchargename = TF_classinchargename.getText();
        schoolorcollege = CB_schoolorcollege.getSelectedItem().toString();

        //get data from text field and save it into the variables
        Subject1 = TF_subject1.getText();
        Subject2 = TF_subject2.getText();
        Subject3 = TF_subject3.getText();
        Subject4 = TF_subject4.getText();
        Subject5 = TF_subject5.getText();
        Subject6 = TF_subject6.getText();
        Subject7 = TF_subject7.getText();
        Subject8 = TF_subject8.getText();

    }

    void autohiding1() {
    
       
        gif1.setVisible(false);
        gif3.setVisible(false);
        
        TF_subject8.hide();
        lable8.hide();
        TF_subject7.hide();
        lable7.hide();
        TF_subject6.hide();
        lable6.hide();
        TF_subject5.hide();
        lable5.hide();
        TF_subject4.hide();
        lable4.hide();
        TF_subject3.hide();
        lable3.hide();
        TF_subject2.hide();
        lable2.hide();
        TF_subject1.hide();
        lable1.hide();
        jButton2.hide();
    }

    void empty_the_fields() {
        TF_classname.setText("");
        TF_totalnumberofsubjects.setText("");
        TF_classinchargename.setText("");
        TF_classtotalfees.setText("");

        TF_subject8.hide();
        lable8.hide();
        TF_subject7.hide();
        lable7.hide();
        TF_subject6.hide();
        lable6.hide();
        TF_subject5.hide();
        lable5.hide();
        TF_subject4.hide();
        lable4.hide();
        TF_subject3.hide();
        lable3.hide();
        TF_subject2.hide();
        lable2.hide();
        TF_subject1.hide();
        lable1.hide();
        jButton2.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        gif1 = new javax.swing.JLabel();
        gif3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TF_subject1 = new javax.swing.JTextField();
        TF_subject2 = new javax.swing.JTextField();
        TF_subject3 = new javax.swing.JTextField();
        TF_subject4 = new javax.swing.JTextField();
        TF_subject5 = new javax.swing.JTextField();
        TF_subject6 = new javax.swing.JTextField();
        TF_subject7 = new javax.swing.JTextField();
        TF_subject8 = new javax.swing.JTextField();
        lable1 = new javax.swing.JLabel();
        lable2 = new javax.swing.JLabel();
        lable3 = new javax.swing.JLabel();
        lable4 = new javax.swing.JLabel();
        lable5 = new javax.swing.JLabel();
        lable6 = new javax.swing.JLabel();
        lable7 = new javax.swing.JLabel();
        lable8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_classinchargename = new javax.swing.JTextField();
        TF_classtotalfees = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TF_classname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CB_schoolorcollege = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        TF_totalnumberofsubjects = new javax.swing.JTextField();
        panel2 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel4 = new java.awt.Panel();
        CB_classes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        CB_users = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                settingclosing(evt);
            }
        });

        panel1.setLayout(null);

        gif1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/loader.gif"))); // NOI18N
        panel1.add(gif1);
        gif1.setBounds(370, 130, 140, 80);

        gif3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/gif 950,550.png"))); // NOI18N
        panel1.add(gif3);
        gif3.setBounds(0, -10, 960, 390);

        jLabel1.setText("Total No of Subjects :");
        panel1.add(jLabel1);
        jLabel1.setBounds(25, 64, 104, 14);
        panel1.add(TF_subject1);
        TF_subject1.setBounds(119, 228, 126, 20);
        panel1.add(TF_subject2);
        TF_subject2.setBounds(119, 254, 126, 20);
        panel1.add(TF_subject3);
        TF_subject3.setBounds(119, 280, 126, 20);
        panel1.add(TF_subject4);
        TF_subject4.setBounds(119, 306, 126, 20);
        panel1.add(TF_subject5);
        TF_subject5.setBounds(119, 332, 126, 20);
        panel1.add(TF_subject6);
        TF_subject6.setBounds(119, 358, 126, 20);
        panel1.add(TF_subject7);
        TF_subject7.setBounds(119, 384, 126, 20);
        panel1.add(TF_subject8);
        TF_subject8.setBounds(119, 410, 126, 20);

        lable1.setText("Subject 1 :");
        panel1.add(lable1);
        lable1.setBounds(57, 231, 52, 14);

        lable2.setText("Subject 2 :");
        panel1.add(lable2);
        lable2.setBounds(57, 257, 52, 14);

        lable3.setText("Subject 3 :");
        panel1.add(lable3);
        lable3.setBounds(57, 283, 52, 14);

        lable4.setText("Subject 4 :");
        panel1.add(lable4);
        lable4.setBounds(57, 309, 52, 14);

        lable5.setText("Subject 5 :");
        panel1.add(lable5);
        lable5.setBounds(57, 335, 52, 14);

        lable6.setText("Subject 6 :");
        panel1.add(lable6);
        lable6.setBounds(57, 361, 52, 14);

        lable7.setText("Subject 7 :");
        panel1.add(lable7);
        lable7.setBounds(57, 387, 52, 14);

        lable8.setText("Subject 8 :");
        panel1.add(lable8);
        lable8.setBounds(57, 413, 52, 14);

        jLabel12.setText("Class Total Fees :");
        panel1.add(jLabel12);
        jLabel12.setBounds(39, 140, 85, 14);

        jLabel11.setText("Class Incharge Name :");
        panel1.add(jLabel11);
        jLabel11.setBounds(87, 102, 108, 14);
        panel1.add(TF_classinchargename);
        TF_classinchargename.setBounds(199, 99, 130, 20);

        TF_classtotalfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_classtotalfeesActionPerformed(evt);
            }
        });
        panel1.add(TF_classtotalfees);
        TF_classtotalfees.setBounds(134, 137, 130, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Incharge", "Total Subjects", "Total Fees", "School/College"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(460, 110, 452, 322);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Classes Available");
        panel1.add(jLabel13);
        jLabel13.setBounds(590, 80, 179, 29);

        jButton2.setText("Add Class");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2);
        jButton2.setBounds(310, 440, 125, 20);
        panel1.add(TF_classname);
        TF_classname.setBounds(202, 23, 127, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Class Name :");
        panel1.add(jLabel4);
        jLabel4.setBounds(135, 26, 63, 14);

        CB_schoolorcollege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "College" }));
        panel1.add(CB_schoolorcollege);
        CB_schoolorcollege.setBounds(347, 23, 60, 20);

        jButton3.setText("Add Subjects Fields");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3);
        jButton3.setBounds(309, 165, 125, 23);

        TF_totalnumberofsubjects.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_totalnumberofsubjectsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_totalnumberofsubjectsFocusLost(evt);
            }
        });
        TF_totalnumberofsubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_totalnumberofsubjectsActionPerformed(evt);
            }
        });
        panel1.add(TF_totalnumberofsubjects);
        TF_totalnumberofsubjects.setBounds(133, 61, 130, 20);

        jTabbedPane1.addTab("Add Class", panel1);

        panel2.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Incharge", "Total Subjects", "Total Fees", "School/College"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        panel2.add(jScrollPane2);
        jScrollPane2.setBounds(438, 60, 490, 180);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Users Available");
        panel2.add(jLabel14);
        jLabel14.setBounds(620, 250, 170, 29);

        jButton1.setText("Delete Class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Select Deleting Class ");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(CB_classes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CB_classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Delete Class", panel4);

        jButton5.setText("Delete User");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Select Deleting User ");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(CB_users, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Delete User", panel5);

        panel2.add(jTabbedPane2);
        jTabbedPane2.setBounds(20, 90, 400, 270);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
        }

        panel2.add(jScrollPane4);
        jScrollPane4.setBounds(520, 290, 370, 180);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Classes Available");
        panel2.add(jLabel15);
        jLabel15.setBounds(590, 20, 179, 29);

        jTabbedPane1.addTab("Delete", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(966, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TF_totalnumberofsubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_totalnumberofsubjectsActionPerformed


    }//GEN-LAST:event_TF_totalnumberofsubjectsActionPerformed

    private void TF_classtotalfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_classtotalfeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_classtotalfeesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
        
        tf_to_variables();

        String createqueryfees = null;//Query Variable for create new Fees table
        String createqueryclassinsert = null;//Query Variable for insert the Class inside the table
        String createqueryresult = null;//Query for create new result table

        //Initialize the quries
        createqueryresult = "create table Result_" + classname + "(Rollno int(11) primary key not null, Name varchar(225) not null);";
        createqueryfees = "create table Fees_" + classname + "(Rollno int(11) primary key not null, Name varchar(225) not null, admission int(11) not null, monthly int(11) not null, card int(11) not null , badge int(11) not null, book int(11) not null , uniform int(11) not null, other int(11) not null , total int(11) not null);";
        createqueryclassinsert = "insert into classes_record(Class_name, Incharge_name, Total_Subjects, Total_fees, School_College, Subject_1, Subject_2, Subject_3, Subject_4, Subject_5, Subject_6, Subject_7, Subject_8 ) Values('" + classname + "', '" + classinchargename + "', '" + totalsubjects + "', '" + totalfees + "', '" + schoolorcollege + "', '" + Subject1 + "', '" + Subject2 + "', '" + Subject3 + "', '" + Subject4 + "', '" + Subject5 + "', '" + Subject6 + "', '" + Subject7 + "', '" + Subject8 + "');";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(createqueryfees);

            stmt.executeUpdate(createqueryclassinsert);

            stmt.executeUpdate(createqueryresult);

            empty_the_fields();

            JOptionPane.showMessageDialog(null, "Class is Added Successfully");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        show_into_classestable();
        combobox();

      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //this function show the fetched data in the jtable 
    void show_into_classestable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();

        //this is the loop that empty all the rows from the table
        while (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }
        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }
        while (model2.getRowCount() > 0) {
            for (int i = 0; i < model2.getRowCount(); i++) {
                model2.removeRow(i);
            }
        }
        
        String query_fetch_notices = "select * from classes_record";
        String Query_users = "select * from login_table;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            PreparedStatement stmt = conn.prepareStatement(query_fetch_notices);
            ResultSet r1 = stmt.executeQuery();

            PreparedStatement stmtt = conn.prepareStatement(Query_users);
            ResultSet r2 = stmtt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Class_Name");
                String incharge = r1.getString("Incharge_name");
                String total_subjects = r1.getString("Total_Subjects");
                String total_fees = r1.getString("Total_fees");
                String school_or_college = r1.getString("School_College");

                model.addRow(new Object[]{name, incharge, total_subjects, total_fees, school_or_college});
                model1.addRow(new Object[]{name, incharge, total_subjects, total_fees, school_or_college});

            }

            while (r2.next()) {
                String username = r2.getString("User_name");
                model2.addRow(new Object[]{username});

            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Record found");
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String total_subjects = TF_totalnumberofsubjects.getText();

        if ("2".equals(total_subjects) || "1".equals(total_subjects)) {
            JOptionPane.showMessageDialog(null, "You must Add Greate then 2 Subects");
        } else if ("3".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);

            TF_subject4.hide();
            lable4.hide();
            TF_subject5.hide();
            lable5.hide();
            TF_subject6.hide();
            lable6.hide();
            TF_subject7.hide();
            lable7.hide();
            TF_subject8.hide();
            lable8.hide();

        } else if ("4".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);
            TF_subject4.setVisible(true);
            lable4.setVisible(true);

            TF_subject5.hide();
            lable5.hide();
            TF_subject6.hide();
            lable6.hide();
            TF_subject7.hide();
            lable7.hide();
            TF_subject8.hide();
            lable8.hide();

        } else if ("5".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);
            TF_subject4.setVisible(true);
            lable4.setVisible(true);
            TF_subject5.setVisible(true);
            lable5.setVisible(true);

            TF_subject6.hide();
            lable6.hide();
            TF_subject7.hide();
            lable7.hide();
            TF_subject8.hide();
            lable8.hide();

        } else if ("6".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);
            TF_subject4.setVisible(true);
            lable4.setVisible(true);
            TF_subject5.setVisible(true);
            lable5.setVisible(true);
            TF_subject6.setVisible(true);
            lable6.setVisible(true);

            TF_subject7.hide();
            lable7.hide();
            TF_subject8.hide();
            lable8.hide();

        } else if ("7".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);
            TF_subject4.setVisible(true);
            lable4.setVisible(true);
            TF_subject5.setVisible(true);
            lable5.setVisible(true);
            TF_subject6.setVisible(true);
            lable6.setVisible(true);
            TF_subject7.setVisible(true);
            lable7.setVisible(true);

            TF_subject8.hide();
            lable8.hide();

        } else if ("8".equals(total_subjects)) {
            TF_subject1.setVisible(true);
            lable1.setVisible(true);
            TF_subject2.setVisible(true);
            lable2.setVisible(true);
            TF_subject3.setVisible(true);
            lable3.setVisible(true);
            TF_subject4.setVisible(true);
            lable4.setVisible(true);
            TF_subject5.setVisible(true);
            lable5.setVisible(true);
            TF_subject6.setVisible(true);
            lable6.setVisible(true);
            TF_subject7.setVisible(true);
            lable7.setVisible(true);
            TF_subject8.setVisible(true);
            lable8.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "You can only have Eight Subject in the Class");
        }

        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TF_totalnumberofsubjectsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_totalnumberofsubjectsFocusGained

        // TODO add your handling code here:
    }//GEN-LAST:event_TF_totalnumberofsubjectsFocusGained

    private void TF_totalnumberofsubjectsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_totalnumberofsubjectsFocusLost

    }//GEN-LAST:event_TF_totalnumberofsubjectsFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

      
        
        String classnamedel = CB_classes.getSelectedItem().toString();

        int select = JOptionPane.showConfirmDialog(null, "Are you sure to Delete the Class");

        switch (select) {
            //deleting class
            case 0:

                //deleteing fees tab;e
                String Queryfees = "DROP TABLE fees_" + classnamedel + ";";
                //deleting result table
                String Queryresult = "DROP TABLE result_" + classnamedel + ";";
                //deleting class from admission
                String Queryadmission = "DELETE FROM student_admission WHERE class = '" + classnamedel + "';";
                //deleting class from classes record
                String Queryclassrecord = "DELETE FROM classes_record WHERE Class_name = '" + classnamedel + "';";

                //select data from tables info
                String Querygettablename = "select * from tables_info;";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    java.sql.Statement stmt = con.createStatement();

                    PreparedStatement stmtt = con.prepareStatement(Querygettablename);
                    ResultSet r1 = stmtt.executeQuery();

                    while (r1.next()) {
                        String attendancetablename = r1.getString("Attendance_Available_for_Month");

                        //deleting class from attendance
                        String Queryattendance = "DELETE FROM " + attendancetablename + " WHERE Class = '" + classnamedel + "';";

                        int loop = 0;
                        String tnamefirstword = null;
                        for (String retval : attendancetablename.split("_")) {

                            switch (loop) {
                                case 0:
                                    tnamefirstword = retval;

                                    break;
                                default:
                                    break;
                            }
                            loop++;
                        }

                        if ("attendance".equals(tnamefirstword)) {
                            stmt.executeUpdate(Queryattendance);

                        }

                    }

                    stmt.executeUpdate(Queryfees);
                    stmt.executeUpdate(Queryresult);
                    stmt.executeUpdate(Queryadmission);
                    stmt.executeUpdate(Queryclassrecord);

                    JOptionPane.showMessageDialog(null, "Class is Deleted Successfully");

                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            //selecting no option in joptionpane conform dialogue box
            case 1:

                JOptionPane.showMessageDialog(null, "The Class is not Deleted");
                break;
            //selecting cancel option in joptionpane conform dialogue box
            case 2:
                break;
            default:
                break;
        }

        show_into_classestable();
        combobox();
        
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void settingclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_settingclosing
        
        dispose();
        Main_Page.functiongettingtotals();
        
    }//GEN-LAST:event_settingclosing

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        
        
        String username = CB_users.getSelectedItem().toString();

        int select = JOptionPane.showConfirmDialog(null, "Are you sure to Delete the User");

        if (select == 0) {

            String masterpassword;
            masterpassword = JOptionPane.showInputDialog("Enter the Master Password");
            if ("master!@#pmhs".equals(masterpassword)) {

                String Queryuserdel = "DELETE FROM login_table where User_name = '" + username + "';";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    java.sql.Statement stmt = con.createStatement();

                    stmt.executeUpdate(Queryuserdel);

                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                JOptionPane.showMessageDialog(null, "User deleted succssfully");
            }
        }

        show_into_classestable();
        combobox();
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Settingss_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settingss_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settingss_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settingss_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settingss_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_classes;
    private javax.swing.JComboBox<String> CB_schoolorcollege;
    private javax.swing.JComboBox<String> CB_users;
    private javax.swing.JTextField TF_classinchargename;
    private javax.swing.JTextField TF_classname;
    private javax.swing.JTextField TF_classtotalfees;
    private javax.swing.JTextField TF_subject1;
    private javax.swing.JTextField TF_subject2;
    private javax.swing.JTextField TF_subject3;
    private javax.swing.JTextField TF_subject4;
    private javax.swing.JTextField TF_subject5;
    private javax.swing.JTextField TF_subject6;
    private javax.swing.JTextField TF_subject7;
    private javax.swing.JTextField TF_subject8;
    private javax.swing.JTextField TF_totalnumberofsubjects;
    private javax.swing.JLabel gif1;
    private javax.swing.JLabel gif3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lable3;
    private javax.swing.JLabel lable4;
    private javax.swing.JLabel lable5;
    private javax.swing.JLabel lable6;
    private javax.swing.JLabel lable7;
    private javax.swing.JLabel lable8;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables
}

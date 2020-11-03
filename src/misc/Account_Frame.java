/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abubakar Manzoor
 */
public class Account_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Account_Frame
     */
    String Month;
    int Day;
    int Year;

    public Account_Frame() {
        initComponents();
        combobox();
        show_salary_type();
        //combobox

    }

    int finemaking(String lastdate) {

        String day = null;
        String month = null;
        String year = null;

        //breaking the last date into days, month and year
        int loop = 0;

        for (String retval : lastdate.split("-")) {

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

        int fine = 0;

        int finemonth;
        int fineday;
        int fineyear;

        finemonth = month2 - month1;
        fineday = day2 - day1;
        fineyear = year2 - year1;

        fineday = fineday * 20;
        finemonth = finemonth * 20;
        fineyear = fineyear * 20;

        fine = fineday + finemonth + fineyear;

        return fine;

    }

    void hidding() {
        gif.setVisible(false);
        gif2.setVisible(false);
        jButton1.setEnabled(true);

        jComboBox9.hide();
        jComboBox7.hide();
        jButton14.hide();
        jComboBox8.hide();
        jButton15.hide();
        jComboBox1.hide();
        jButton17.hide();
        statistics();
    }

    void show_fees_type(String class11) {

        String Query3 = "show fields in fees_" + class11 + ";";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Field");

                for (String retval : name.split("_")) {

                    if ("SF".equals(retval)) {

                        int loop = 0;
                        for (String retval1 : name.split("_")) {

                            if (loop != 0) {
                                jComboBox7.addItem(retval1);
                                jComboBox9.addItem(retval1);
                            } else {
                            }
                            loop++;

                        }

                    }

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void show_salary_type() {

        String Query3 = "show fields in salary;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Field");

                for (String retval : name.split("_")) {

                    if ("salaryyy".equals(retval)) {

                        int loop = 0;
                        for (String retval1 : name.split("_")) {

                            if (loop == 1) {
                                CB_salarymonthinfo.addItem(retval1);
                                CB_salarymonthinfo1.addItem(retval1);

                            } else {
                            }
                            loop++;

                        }

                    }

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void show_fees_type1(String class11) {

        String Query3 = "show fields in fees_" + class11 + ";";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Field");

                for (String retval : name.split("_")) {

                    if ("SF".equals(retval)) {

                        int loop = 0;
                        for (String retval1 : name.split("_")) {

                            if (loop != 0) {
                                jComboBox8.addItem(retval1);
                            } else {
                            }
                            loop++;

                        }

                    }

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void Clearrows_attendance_info() {

        //create connection with table in the Add attendance Tabbed Pane
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

        //this is the loop that empty all the rows from the table
        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }
    }

    int student_found_or_not(String Classnamestd, String Rollnostd) {
        int found = 0;

        String Query = "select * from fees_" + Classnamestd + ";";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(Query);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String rollnogetter = r1.getString("Rollno");

                if (rollnogetter == null ? Rollnostd == null : rollnogetter.equals(Rollnostd)) {
                    found = 1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return found;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel4 = new java.awt.Panel();
        panel12 = new java.awt.Panel();
        panel6 = new java.awt.Panel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        panel15 = new java.awt.Panel();
        TF_rollno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CB_classcollectdues = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        dp9 = new javax.swing.JDesktopPane();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        panel16 = new java.awt.Panel();
        CB_classduesinfo = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        panel1 = new java.awt.Panel();
        gif = new javax.swing.JLabel();
        gif2 = new javax.swing.JLabel();
        CB_classaddnewclass = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        TF_feesname = new javax.swing.JTextField();
        TF_totalfees = new javax.swing.JTextField();
        TF_lastdate = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel8 = new java.awt.Panel();
        CB_classcollectdues1 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        panel5 = new java.awt.Panel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel2 = new java.awt.Panel();
        CB_stafftypesalarygiven = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tf_staffidsalarygiven = new javax.swing.JTextField();
        CB_salarymonthinfo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lablegrandtotal = new javax.swing.JLabel();
        lablefine = new javax.swing.JLabel();
        lablesalary = new javax.swing.JLabel();
        lablerollno = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        lablesalarygivendate = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lablesubmittedornot1 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        CB_stafftypesalarygiven1 = new javax.swing.JComboBox<>();
        CB_salarymonthinfo1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        panel7 = new java.awt.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingaccounts(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Accounts");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(417, 11, 132, 30);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Roll no :");

        CB_classcollectdues.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
        CB_classcollectdues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classcollectduesActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Admission" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        dp9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dp9Layout = new javax.swing.GroupLayout(dp9);
        dp9.setLayout(dp9Layout);
        dp9Layout.setHorizontalGroup(
            dp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        dp9Layout.setVerticalGroup(
            dp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jButton12.setText("Submit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setText("Submit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addComponent(CB_classcollectdues, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classcollectdues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_rollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton12)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp9)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Collect Dues", panel15);

        CB_classduesinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));

        jButton13.setText("Search");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Admission" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rollno ", "Name", "Fees Type", "Total Fees", "Submitted or Not", "Fine", "Discount", "Last Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Print list");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by", "All Students", "Submitted", "Not Submitted" }));

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addComponent(CB_classduesinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classduesinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Dues Info", panel16);

        panel1.setLayout(null);

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/loader.gif"))); // NOI18N
        panel1.add(gif);
        gif.setBounds(370, 130, 140, 80);

        gif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/gif 950,550.png"))); // NOI18N
        panel1.add(gif2);
        gif2.setBounds(-4, 250, 960, 290);

        CB_classaddnewclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
        panel1.add(CB_classaddnewclass);
        CB_classaddnewclass.setBounds(200, 169, 124, 20);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(773, 168, 73, 23);

        TF_feesname.setForeground(new java.awt.Color(204, 204, 204));
        TF_feesname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_feesname.setText("Fees Type");
        TF_feesname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_feesnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_feesnameFocusLost(evt);
            }
        });
        TF_feesname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_feesnameActionPerformed(evt);
            }
        });
        panel1.add(TF_feesname);
        TF_feesname.setBounds(342, 169, 138, 20);

        TF_totalfees.setForeground(new java.awt.Color(204, 204, 204));
        TF_totalfees.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_totalfees.setText("Total Fees");
        TF_totalfees.setToolTipText("");
        TF_totalfees.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_totalfeesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_totalfeesFocusLost(evt);
            }
        });
        panel1.add(TF_totalfees);
        TF_totalfees.setBounds(487, 169, 138, 20);

        try {
            TF_lastdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TF_lastdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel1.add(TF_lastdate);
        TF_lastdate.setBounds(631, 169, 124, 20);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DD - MM - YYYY");
        panel1.add(jLabel9);
        jLabel9.setBounds(631, 148, 124, 14);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Last Date");
        panel1.add(jLabel11);
        jLabel11.setBounds(631, 128, 124, 14);

        jTabbedPane6.addTab("Add New Fees", panel1);

        CB_classcollectdues1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class" }));
        CB_classcollectdues1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classcollectdues1ActionPerformed(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jButton16.setText("Submit");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Delete");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(CB_classcollectdues1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classcollectdues1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Delete Fees", panel8);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addComponent(jTabbedPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 965, Short.MAX_VALUE)
            .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
            .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Fees", panel4);

        CB_stafftypesalarygiven.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff Type", "teacher", "non_teaching" }));

        jLabel5.setText("Staff ID :");

        tf_staffidsalarygiven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_staffidsalarygivenActionPerformed(evt);
            }
        });

        CB_salarymonthinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salary Month" }));
        CB_salarymonthinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_salarymonthinfoActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Salary");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Fine");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Grand Total");

        lablegrandtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lablefine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lablesalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lablerollno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lablesalarygivendate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lablesubmittedornot1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(73, 73, 73)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lablerollno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lablesalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lablefine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lablegrandtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lablesalarygivendate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(CB_stafftypesalarygiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_staffidsalarygiven, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(CB_salarymonthinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton3)))
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(lablesubmittedornot1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(688, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_staffidsalarygiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(CB_salarymonthinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_stafftypesalarygiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(lablesalarygivendate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lablerollno, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lablesalary, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lablefine, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lablegrandtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(108, 108, 108)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(lablesubmittedornot1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Add Sallary", panel2);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setName("Search Salary"); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Total Salary", "Total Working Days", "Total Absents", "Fine", "Bonas", "Grand Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
            jTable2.getColumnModel().getColumn(7).setResizable(false);
        }

        CB_stafftypesalarygiven1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff Type", "teacher", "non_teaching" }));

        CB_salarymonthinfo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salary Salary" }));
        CB_salarymonthinfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_salarymonthinfo1ActionPerformed(evt);
            }
        });

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(CB_stafftypesalarygiven1, 0, 83, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(CB_salarymonthinfo1, 0, 97, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(629, 629, 629)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_salarymonthinfo1)
                            .addComponent(CB_stafftypesalarygiven1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search Salary", panel3);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane2.addTab("Payroll", panel5);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Fees Name", "Estimated Fees", "Accounted Fees"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Statistics", panel7);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 50, 940, 500);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/950, 550 Background.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 950, 550);

        setSize(new java.awt.Dimension(953, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void combobox() {

        String Query3 = "select * from classes_record;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("Class_name");
                CB_classcollectdues.addItem(name);
                CB_classaddnewclass.addItem(name);
                CB_classduesinfo.addItem(name);
                CB_classcollectdues1.addItem(name);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void functionreciever(String Month1, int day1, int year1) {
        Month = Month1;
        Day = day1;
        Year = year1;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setEnabled(false);
        gif.setVisible(true);
        gif2.setVisible(true);

        String Fees_Name = TF_feesname.getText();
        String class_name = CB_classaddnewclass.getSelectedItem().toString();
        String totalfees = TF_totalfees.getText();
        String lastdate = TF_lastdate.getText();

        String Query_fees = "insert into fees_record(fees_name) values('" + Fees_Name + "');";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmttt = connn.createStatement();

            stmttt.executeUpdate(Query_fees);

            connn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //this is the integer variable that converts the fees from string to int 
        int totalfees1 = Integer.parseInt(totalfees);

        String Query = "alter table fees_" + class_name + " add TF_" + Fees_Name + " Int default " + totalfees1 + ";";
        String Query1 = "alter table fees_" + class_name + " add SF_" + Fees_Name + " Int default 0;";
        String Query2 = "alter table fees_" + class_name + " add D_" + Fees_Name + " Int default 0;";
        String Query3 = "alter table fees_" + class_name + " add F_" + Fees_Name + " Int default 0;";
        String Query4 = "alter table fees_" + class_name + " add LDate_" + Fees_Name + " Varchar(225) default 'none';";
        String Query5 = "alter table fees_" + class_name + " add SDate_" + Fees_Name + " Varchar(225) default 'none';";
        String Query6 = "UPDATE fees_" + class_name + " SET LDate_" + Fees_Name + " = '" + lastdate + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(Query);
            stmt.executeUpdate(Query1);
            stmt.executeUpdate(Query2);
            stmt.executeUpdate(Query3);
            stmt.executeUpdate(Query4);
            stmt.executeUpdate(Query5);
            stmt.executeUpdate(Query6);

            JOptionPane.showMessageDialog(null, "Fees Add Successfully");

            TF_feesname.setText("");
            TF_totalfees.setText("");
            TF_lastdate.setText("");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        jButton1.setEnabled(true);
        gif.setVisible(false);
        gif2.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String class1 = CB_classcollectdues.getSelectedItem().toString();
        String Roll_no = TF_rollno.getText();

        if ("Select Class".equals(class1) || "".equals(Roll_no)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class and Enter the Roll no");
        } else {
            show_fees_type(class1);
            jComboBox7.setVisible(true);
            jButton12.hide();
            jButton14.setVisible(true);
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void CB_classcollectduesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classcollectduesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classcollectduesActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        String classduesinfo = CB_classduesinfo.getSelectedItem().toString();

        if ("Select Class".equals(classduesinfo)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class");
        } else {
            show_fees_type1(classduesinfo);
            jButton13.hide();
            jButton15.setVisible(true);
            jComboBox8.setVisible(true);
            jComboBox1.setVisible(true);
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void TF_feesnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_feesnameFocusGained
        TF_feesname.setForeground(Color.BLACK);
        TF_feesname.setText("");
    }//GEN-LAST:event_TF_feesnameFocusGained

    private void TF_feesnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_feesnameFocusLost


    }//GEN-LAST:event_TF_feesnameFocusLost

    private void TF_totalfeesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_totalfeesFocusGained
        TF_totalfees.setForeground(Color.BLACK);
        TF_totalfees.setText("");
    }//GEN-LAST:event_TF_totalfeesFocusGained

    private void TF_totalfeesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_totalfeesFocusLost


    }//GEN-LAST:event_TF_totalfeesFocusLost

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        String class1 = CB_classcollectdues.getSelectedItem().toString();
        String Roll_no = TF_rollno.getText();

        int foundornot = student_found_or_not(class1, Roll_no);

        if (foundornot == 1) {

            String feestype = jComboBox7.getSelectedItem().toString();

            if ("Admission".equals(feestype)) {
                
                Admission_Fees_Printing obj_adm_printing = new Admission_Fees_Printing();
                obj_adm_printing.Printing(class1, Roll_no);
            
            } else {
            
                Accounts_Dekstop1 objeee = new Accounts_Dekstop1();
                objeee.reciever(class1, Roll_no, Month, Day, Year, feestype);
                dp9.add(objeee);
                objeee.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Student Not Found");
        }


    }//GEN-LAST:event_jButton14ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String classname = CB_classduesinfo.getSelectedItem().toString();
        String feestype = jComboBox8.getSelectedItem().toString();
        String searchtype = jComboBox1.getSelectedItem().toString();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        if ("Select Type".equals(feestype)) {
            JOptionPane.showMessageDialog(null, "Please Select the Fees Type");
        } else if ("Search by".equals(searchtype)) {
            JOptionPane.showMessageDialog(null, "Please Select the Search Option");
        } else {

            String query = "select * from fees_" + classname + ";";

            Clearrows_attendance_info();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(query);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    String name = r1.getString("Name");
                    String rollno = r1.getString("Rollno");
                    String totalfees = r1.getString("TF_" + feestype);
                    String submittedfees = r1.getString("SF_" + feestype);
                    String discount = r1.getString("D_" + feestype);
                    String lastdate = r1.getString("LDate_" + feestype);

                    int totalfine = finemaking(lastdate);
                    String fine = "" + totalfine;

                    String status = null;
                    if ("0".equals(submittedfees)) {
                        status = "Not Submitted";
                    } else {
                        status = "Submitted";
                    }

                    if (null != searchtype) {
                        switch (searchtype) {
                            case "All Students":
                                model.addRow(new Object[]{rollno, name, feestype, totalfees, status, fine, discount, lastdate});
                                break;
                            case "Submitted":
                                if ("Submitted".equals(status)) {
                                    model.addRow(new Object[]{rollno, name, feestype, totalfees, status, fine, discount, lastdate});
                                }
                                break;
                            case "Not Submitted":
                                if ("Not Submitted".equals(status)) {
                                    model.addRow(new Object[]{rollno, name, feestype, totalfees, status, fine, discount, lastdate});
                                }
                                break;
                            default:
                                break;
                        }
                    }

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String stafftype = CB_stafftypesalarygiven.getSelectedItem().toString();//Check the Staff Type (Teaching Staff , Non Teaching Staff)
        String Staff_id = tf_staffidsalarygiven.getText();//this is the Staff id Which we want to search
        String get_months = CB_salarymonthinfo.getSelectedItem().toString();//Check the Month that Which Month we wnat to check the attendance

        String query1 = "select * from salary where stafftype = '" + stafftype + "' AND staffid = " + Staff_id + ";";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            PreparedStatement stmt = con.prepareStatement(query1);
            ResultSet r1 = stmt.executeQuery();

            r1.next();

            String name = r1.getString("staffname");
            String salary = r1.getString("totalsalary");
            String bonas = r1.getString("salary_" + get_months + "_bonas");
            String fine = r1.getString("salaryyy_" + get_months + "_fine");
            String givendate = r1.getString("salary_" + get_months + "_givendate");
            String recornot = r1.getString("salary_" + get_months + "_recyesornot");

            int Mainfine = attendancegetter(stafftype, Staff_id, get_months);

            String Mainfine1 = "" + Mainfine;
            JOptionPane.showMessageDialog(null, Mainfine1);

            if ("0".equals(recornot)) {
                lablesubmittedornot1.setText("Not Recieved");
            } else {
                lablesubmittedornot1.setText("Recieved");
            }

            int salary1 = Integer.parseInt(salary);
            int bonas1 = Integer.parseInt(bonas);
            int grandtotal1 = (salary1 + bonas1) - Mainfine;
            String grandtotal = "" + grandtotal1;

            lablesalarygivendate.setText(givendate);

            labelname.setText(name);
            lablesalary.setText(salary);
            lablefine.setText(Mainfine1);
            lablegrandtotal.setText(grandtotal);
            lablerollno.setText(Staff_id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    //showing the table 
    int attendancegetter1(String type, String stafftype1, String staffid1, String Month1) {

        String Query_fetching_attendance = "select * from teacher_attendance_" + Month1 + "_" + Year + " where Staff_type = '" + stafftype1 + "' AND Staff_id = '" + staffid1 + "';";

        int total = 0;
        int absents = 0;
        int presents = 0;
        int leaves = 0;
        int i = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            Statement st = con.createStatement();
            DatabaseMetaData md2 = con.getMetaData();
            for (int k = 0; k < 31; k++) {

                ResultSet rss = md2.getColumns(null, null, "teacher_attendance_" + Month1 + "_" + Year, "Date_" + k);

                if (rss.next()) {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                        PreparedStatement stmt = conn.prepareStatement(Query_fetching_attendance);
                        ResultSet r1 = stmt.executeQuery();
                        while (r1.next()) {
                            String Statuspora = r1.getString("Date_" + k);
                            switch (Statuspora) {
                                case "0":
                                    total++;
                                    absents++;
                                    break;
                                case "1":
                                    presents++;
                                    total++;
                                    break;
                                case "2":
                                    total++;
                                    leaves++;
                                    break;
                                default:
                                    break;
                            }

                        }

                        JOptionPane.showMessageDialog(null, total);
                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(null, e);
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if ("totaldays".equals(type)) {
            return total;
        }
        if ("totalabsents".equals(type)) {
            return absents;
        }

        absents = absents * 500;

        if ("fine".equals(type)) {
            return absents;
        }

        return 0;
    }

    //teacher attendance according to the rule and fine them 
    int attendancegetter(String stafftype1, String staffid1, String Month1) {

        String Query_fetching_attendance = "select * from teacher_attendance_" + Month1 + "_" + Year + " where Staff_type = '" + stafftype1 + "' AND Staff_id = '" + staffid1 + "';";

        int total = 0;
        int absents = 0;
        int presents = 0;
        int leaves = 0;

        int i = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            Statement st = con.createStatement();
            DatabaseMetaData md2 = con.getMetaData();

            for (int k = 0; k < 31; k++) {

                ResultSet rss = md2.getColumns(null, null, "teacher_attendance_" + Month1 + "_" + Year, "Date_" + k);

                if (rss.next()) {

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                        PreparedStatement stmt = conn.prepareStatement(Query_fetching_attendance);
                        ResultSet r1 = stmt.executeQuery();
                        while (r1.next()) {
                            String Statuspora = r1.getString("Date_" + k);
                            switch (Statuspora) {
                                case "0":
                                    total++;
                                    absents++;
                                    break;
                                case "1":
                                    presents++;
                                    total++;
                                    break;
                                case "2":
                                    total++;
                                    leaves++;
                                    break;
                                default:
                                    break;
                            }

                        }
                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(null, e);
                    }

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        absents = absents * 500;

        return absents;

    }


    private void CB_salarymonthinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_salarymonthinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_salarymonthinfoActionPerformed

    private void tf_staffidsalarygivenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_staffidsalarygivenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_staffidsalarygivenActionPerformed

    private void CB_salarymonthinfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_salarymonthinfo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_salarymonthinfo1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String stafftype = CB_stafftypesalarygiven1.getSelectedItem().toString();//Check the Staff Type (Teaching Staff , Non Teaching Staff)
        String get_months = CB_salarymonthinfo1.getSelectedItem().toString();//Check the Month that Which Month we wnat to check the attendance

        String Query3 = "select * from salary where stafftype = '" + stafftype + "';";

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmt = con.prepareStatement(Query3);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String name = r1.getString("staffname");
                String id = r1.getString("staffid");
                String totalsalary = r1.getString("totalsalary");
                String bonas = r1.getString("salary_" + get_months + "_bonas");

                int Mainfine = attendancegetter1("fine", stafftype, id, get_months);
                int totaldays = attendancegetter1("totaldays", stafftype, id, get_months);
                int totalabsents = attendancegetter1("totalabsents", stafftype, id, get_months);

                int salary = Integer.parseInt(totalsalary);
                int bonas1 = Integer.parseInt(bonas);
                int grandtotal = (salary - Mainfine) + bonas1;

                model.addRow(new Object[]{id, name, totalsalary, totaldays, totalabsents, Mainfine, bonas, grandtotal});

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void closingaccounts(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingaccounts
        dispose();
        Main_Page.jButton8.setEnabled(true);
    }//GEN-LAST:event_closingaccounts

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TF_feesnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_feesnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_feesnameActionPerformed

    void statistics() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();

        while (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }

        String Query_classname = "select * from classes_record;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            PreparedStatement stmt = conn.prepareStatement(Query_classname);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String classname = r1.getString("Class_name");

                String Query_Fields = "select * from fees_record;";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    PreparedStatement stmtt = con.prepareStatement(Query_Fields);
                    ResultSet r2 = stmtt.executeQuery();

                    while (r2.next()) {
                        String feesname = r2.getString("fees_name");

                        String Query_fields = "show fields in fees_" + classname + ";";

                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                            PreparedStatement stmttt = conn.prepareStatement(Query_fields);
                            ResultSet r3 = stmttt.executeQuery();

                            while (r3.next()) {
                                String columnname = r3.getString("Field");

                                for (String retval : columnname.split("_")) {

                                    if ("TF".equals(retval)) {

                                        for (String retval1 : columnname.split("_")) {
                                            if (retval1 == null ? feesname == null : retval1.equals(feesname)) {
                                                int totalestimatedfees = 0;
                                                int totalaccountedfees = 0;

                                                String Queryfeesgiven = "select * from fees_" + classname + ";";
                                                try {

                                                    Class.forName("com.mysql.jdbc.Driver");
                                                    Connection confeesgiven = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                                    PreparedStatement stmtfeesgiven = confeesgiven.prepareStatement(Queryfeesgiven);
                                                    ResultSet rfeesgiven = stmtfeesgiven.executeQuery();

                                                    while (rfeesgiven.next()) {
                                                        String totalfees = rfeesgiven.getString("TF_" + feesname);
                                                        String subfees = rfeesgiven.getString("SF_" + feesname);

                                                        int totalfees1 = Integer.parseInt(totalfees);
                                                        int subfees1 = Integer.parseInt(subfees);

                                                        totalestimatedfees = totalestimatedfees + totalfees1;
                                                        totalaccountedfees = totalaccountedfees + subfees1;
                                                    }
                                                } catch (Exception e) {
                                                    JOptionPane.showMessageDialog(null, e);
                                                }

                                                model.addRow(new Object[]{classname, feesname, totalestimatedfees, totalaccountedfees});
                                            }
                                        }
                                    }

                                }
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        statistics();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String classname = CB_classduesinfo.getSelectedItem().toString();
        String resulttype = jComboBox8.getSelectedItem().toString();

        MessageFormat header = new MessageFormat("Class " + classname + " " + resulttype + " Report");
        MessageFormat footer = new MessageFormat("page {0,number,integer}");

        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s %n", e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CB_classcollectdues1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classcollectdues1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classcollectdues1ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        jButton16.hide();

        String classname = CB_classcollectdues1.getSelectedItem().toString();

        if ("Select Class".equals(classname)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class First");
        } else {
            show_fees_type(classname);
            jComboBox9.setVisible(true);
            jButton17.setVisible(true);
        }


    }//GEN-LAST:event_jButton16ActionPerformed

    void delete_fees_type(String classname1, String feestype1) {

        String Query_delete_fees1 = "ALTER TABLE fees_" + classname1 + " DROP TF_" + feestype1 + ";";
        String Query_delete_fees2 = "ALTER TABLE fees_" + classname1 + " DROP SF_" + feestype1 + ";";
        String Query_delete_fees3 = "ALTER TABLE fees_" + classname1 + " DROP D_" + feestype1 + ";";
        String Query_delete_fees4 = "ALTER TABLE fees_" + classname1 + " DROP F_" + feestype1 + ";";
        String Query_delete_fees5 = "ALTER TABLE fees_" + classname1 + " DROP LDate_" + feestype1 + ";";
        String Query_delete_fees6 = "ALTER TABLE fees_" + classname1 + " DROP SDate_" + feestype1 + ";";
        String Query_delete_fees7 = "DELETE FROM fees_record where fees_name = '" + feestype1 + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(Query_delete_fees1);
            stmt.executeUpdate(Query_delete_fees2);
            stmt.executeUpdate(Query_delete_fees3);
            stmt.executeUpdate(Query_delete_fees4);
            stmt.executeUpdate(Query_delete_fees5);
            stmt.executeUpdate(Query_delete_fees6);
            stmt.executeUpdate(Query_delete_fees7);

            JOptionPane.showMessageDialog(null, "Delete Fees Table Successfully");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        String classname = CB_classcollectdues1.getSelectedItem().toString();
        String feestype = jComboBox9.getSelectedItem().toString();

        if ("Select Type".equals(feestype)) {
            JOptionPane.showMessageDialog(null, "Please Select the Fees First");
        } else {
            delete_fees_type(classname, feestype);
        }

    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_classaddnewclass;
    private javax.swing.JComboBox<String> CB_classcollectdues;
    private javax.swing.JComboBox<String> CB_classcollectdues1;
    private javax.swing.JComboBox<String> CB_classduesinfo;
    private javax.swing.JComboBox<String> CB_salarymonthinfo;
    private javax.swing.JComboBox<String> CB_salarymonthinfo1;
    private javax.swing.JComboBox<String> CB_stafftypesalarygiven;
    private javax.swing.JComboBox<String> CB_stafftypesalarygiven1;
    private javax.swing.JTextField TF_feesname;
    private javax.swing.JFormattedTextField TF_lastdate;
    private javax.swing.JTextField TF_rollno;
    private javax.swing.JTextField TF_totalfees;
    private javax.swing.JDesktopPane dp9;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel gif2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel lablefine;
    private javax.swing.JLabel lablegrandtotal;
    private javax.swing.JLabel lablerollno;
    private javax.swing.JLabel lablesalary;
    private javax.swing.JLabel lablesalarygivendate;
    private javax.swing.JLabel lablesubmittedornot1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel12;
    private java.awt.Panel panel15;
    private java.awt.Panel panel16;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private javax.swing.JTextField tf_staffidsalarygiven;
    // End of variables declaration//GEN-END:variables
}

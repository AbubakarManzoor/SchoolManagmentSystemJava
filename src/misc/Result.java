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
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abubakar Manzoor
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        combobox();
    }

    String subject1_add;
    String subject2_add;
    String subject3_add;
    String subject4_add;
    String subject5_add;
    String subject6_add;
    String subject7_add;
    String subject8_add;

    int Date;
    String Month;
    int Year;

    void hidding() {

        CB_weektype3.hide();
        CB_months2.hide();
        Add_Button1.hide();

        CB_months.hide();
        Add_Button.hide();
        CB_weektype1.hide();
        CB_months1.hide();
        CB_weektype2.hide();
        jButton2.hide();
        //B_printresultcards.hide();
        B_printresultlist.hide();
        
        deleting_result_gif.setVisible(false);
    }

    void timerecieves(String Month1, int day1, int year1) {
        Date = day1;
        Month = Month1;
        Year = year1;
    }

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
                CB_classmonthly.addItem(name);
                CB_classterm1.addItem(name);
                CB_classterm2.addItem(name);
                CB_classfinalterm.addItem(name);
                CB_searchclass1.addItem(name);
                CB_searchclass2.addItem(name);
                CB_class123.addItem(name);
                CB_class124.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panel5 = new java.awt.Panel();
        CB_classmonthly = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtablemonthly = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        CB_monthsresultadd = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        CB_weektype = new javax.swing.JComboBox<>();
        panel1 = new java.awt.Panel();
        CB_classterm1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        CB_classterm2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        panel3 = new java.awt.Panel();
        CB_classfinalterm = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        JT_finalterm = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Printing = new javax.swing.JTabbedPane();
        panel6 = new java.awt.Panel();
        CB_searchclass2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        B_printresultlist = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        JT_searchresultclass = new javax.swing.JTable();
        CB_resulttype124 = new javax.swing.JComboBox<>();
        jButton16 = new javax.swing.JButton();
        CB_weektype2 = new javax.swing.JComboBox<>();
        CB_months1 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        panel7 = new java.awt.Panel();
        CB_searchclass1 = new javax.swing.JComboBox<>();
        jTextField26 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        JT_searchresultstudent = new javax.swing.JTable();
        panel4 = new java.awt.Panel();
        CB_class123 = new javax.swing.JComboBox<>();
        CB_resulttype123 = new javax.swing.JComboBox<>();
        CB_months = new javax.swing.JComboBox<>();
        Add_Button = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        CB_weektype1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CB_class124 = new javax.swing.JComboBox<>();
        CB_resulttype125 = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        CB_weektype3 = new javax.swing.JComboBox<>();
        CB_months2 = new javax.swing.JComboBox<>();
        Add_Button1 = new javax.swing.JButton();
        deleting_result_gif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Result");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingresultframe(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Result");

        CB_classmonthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classmonthlyActionPerformed(evt);
            }
        });

        Jtablemonthly.setAutoCreateRowSorter(true);
        Jtablemonthly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Jtablemonthly);

        jButton8.setText("SAVE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        CB_monthsresultadd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "Jan", "Feb", "Mar", "apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        CB_monthsresultadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_monthsresultaddActionPerformed(evt);
            }
        });

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        CB_weektype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Week", "Week_1", "Week_2", "Week_3", "Week_4" }));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(CB_classmonthly, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_monthsresultadd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_weektype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classmonthly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_monthsresultadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(CB_weektype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Monthly", panel5);

        CB_classterm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classterm1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton10.setText("SAVE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(CB_classterm1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classterm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10))
        );

        jTabbedPane2.addTab("Term 1", panel1);

        CB_classterm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classterm2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(CB_classterm2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classterm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Term 2", panel2);

        CB_classfinalterm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classfinaltermActionPerformed(evt);
            }
        });

        JT_finalterm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JT_finalterm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JT_finalterm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(JT_finalterm);

        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Add");
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
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(CB_classfinalterm, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_classfinalterm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Final Term", panel3);

        jTabbedPane1.addTab("Marks Entry", jTabbedPane2);

        CB_searchclass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_searchclass2ActionPerformed(evt);
            }
        });

        jButton2.setText("Search ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        B_printresultlist.setText("Print Result List");
        B_printresultlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_printresultlistActionPerformed(evt);
            }
        });

        JT_searchresultclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JT_searchresultclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JT_searchresultclass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane5.setViewportView(JT_searchresultclass);

        CB_resulttype124.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Result Type", "Monthly", "Term_1", "Term_2", "Final_Term" }));
        CB_resulttype124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_resulttype124ActionPerformed(evt);
            }
        });

        jButton16.setText("Submite");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        CB_weektype2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Week", "Week_1", "Week_2", "Week_3", "Week_4" }));

        CB_months1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        CB_months1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_months1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Printing Result Cards", "Selective Student", "Total Class" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(CB_searchclass2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_resulttype124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(CB_months1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CB_weektype2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 660, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B_printresultlist)))
                .addContainerGap())
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_searchclass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(CB_resulttype124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16)
                    .addComponent(CB_months1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_weektype2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_printresultlist)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel6Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        Printing.addTab("Class", panel6);

        CB_searchclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_searchclass1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Roll No :");

        jButton1.setText("Search ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JT_searchresultstudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JT_searchresultstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Result Type", "Name", "Total Marks", "Obtained Marks", "Percentage", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_searchresultstudent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane6.setViewportView(JT_searchresultstudent);
        if (JT_searchresultstudent.getColumnModel().getColumnCount() > 0) {
            JT_searchresultstudent.getColumnModel().getColumn(3).setResizable(false);
            JT_searchresultstudent.getColumnModel().getColumn(4).setResizable(false);
            JT_searchresultstudent.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CB_searchclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(890, Short.MAX_VALUE))
            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1241, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_searchclass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jButton1))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        Printing.addTab("Student", panel7);

        jTabbedPane1.addTab("Search / Print Result", Printing);

        panel4.setLayout(null);

        CB_class123.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select_Class" }));
        CB_class123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_class123ActionPerformed(evt);
            }
        });
        panel4.add(CB_class123);
        CB_class123.setBounds(360, 120, 132, 20);

        CB_resulttype123.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Result Type", "Monthly", "Term_1", "Term_2", "Final_Term" }));
        CB_resulttype123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_resulttype123ActionPerformed(evt);
            }
        });
        panel4.add(CB_resulttype123);
        CB_resulttype123.setBounds(500, 120, 82, 20);

        CB_months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        CB_months.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_monthsActionPerformed(evt);
            }
        });
        panel4.add(CB_months);
        CB_months.setBounds(680, 120, 87, 20);

        Add_Button.setText("Add");
        Add_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_ButtonMouseClicked(evt);
            }
        });
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });
        panel4.add(Add_Button);
        Add_Button.setBounds(870, 120, 73, 23);

        jButton13.setText("Submite");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panel4.add(jButton13);
        jButton13.setBounds(590, 120, 73, 23);

        CB_weektype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Week", "Week_1", "Week_2", "Week_3", "Week_4" }));
        panel4.add(CB_weektype1);
        CB_weektype1.setBounds(780, 120, 84, 20);
        panel4.add(jSeparator1);
        jSeparator1.setBounds(20, 190, 1210, 10);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Delete Existing Result");
        panel4.add(jLabel5);
        jLabel5.setBounds(110, 220, 1025, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add New Result");
        panel4.add(jLabel6);
        jLabel6.setBounds(120, 10, 1025, 30);

        CB_class124.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select_Class" }));
        CB_class124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_class124ActionPerformed(evt);
            }
        });
        panel4.add(CB_class124);
        CB_class124.setBounds(370, 340, 132, 20);

        CB_resulttype125.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Result Type", "Monthly", "Term_1", "Term_2", "Final_Term" }));
        CB_resulttype125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_resulttype125ActionPerformed(evt);
            }
        });
        panel4.add(CB_resulttype125);
        CB_resulttype125.setBounds(510, 340, 82, 20);

        jButton14.setText("Submite");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panel4.add(jButton14);
        jButton14.setBounds(600, 340, 73, 23);

        CB_weektype3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Week", "Week_1", "Week_2", "Week_3", "Week_4" }));
        panel4.add(CB_weektype3);
        CB_weektype3.setBounds(790, 340, 84, 20);

        CB_months2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        CB_months2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_months2ActionPerformed(evt);
            }
        });
        panel4.add(CB_months2);
        CB_months2.setBounds(690, 340, 87, 20);

        Add_Button1.setText("Delete");
        Add_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Button1ActionPerformed(evt);
            }
        });
        panel4.add(Add_Button1);
        Add_Button1.setBounds(880, 340, 73, 23);

        deleting_result_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/resultloading deleting.gif"))); // NOI18N
        panel4.add(deleting_result_gif);
        deleting_result_gif.setBounds(-150, -10, 420, 130);

        jTabbedPane1.addTab("Add/Delete  New Result", panel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        setSize(new java.awt.Dimension(1287, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CB_searchclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_searchclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_searchclass1ActionPerformed

    private void CB_searchclass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_searchclass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_searchclass2ActionPerformed

    private void CB_classterm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classterm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classterm2ActionPerformed

    private void CB_classterm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classterm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classterm1ActionPerformed

    private void CB_classmonthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classmonthlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classmonthlyActionPerformed

    private void CB_classfinaltermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classfinaltermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classfinaltermActionPerformed

    private void CB_class123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_class123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_class123ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        String class1 = CB_class123.getSelectedItem().toString();

        String Result_type = CB_resulttype123.getSelectedItem().toString();

        if ("Select_Class".equals(class1)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class first");
        } else if ("Result Type".equals(Result_type)) {
            JOptionPane.showMessageDialog(null, "Please Select the Result Type");
        } else if ("Monthly".equals(Result_type)) {
            CB_months.setVisible(true);
            Add_Button.setVisible(true);
            CB_weektype1.setVisible(true);

        } else {
            CB_weektype1.hide();
            CB_months.hide();
            Add_Button.setVisible(true);
        }


    }//GEN-LAST:event_jButton13ActionPerformed

    private void CB_resulttype123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_resulttype123ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_resulttype123ActionPerformed

    private void CB_monthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthsActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed

        
        deleting_result_gif.setVisible(true);
        non_editable();
        
        
        
            String Result_type = CB_resulttype123.getSelectedItem().toString();
        String Months = CB_months.getSelectedItem().toString();
        String Week = CB_weektype1.getSelectedItem().toString();
        String classname = CB_class123.getSelectedItem().toString();

        if ("Monthly".equals(Result_type)) {

            if ("Select Week".equals(Week)) {
                JOptionPane.showMessageDialog(null, "Please Select the Week");
            } else if ("Select Month".equals(Months)) {
                JOptionPane.showMessageDialog(null, "Please Select the Month First");
            } else {
                //Main Code for monthly result column adding
                String attendanceinfo = null, subject1 = null, subject2 = null, subject3 = null, subject4 = null, subject5 = null, subject6 = null, subject7 = null, subject8 = null;

                String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                    ResultSet r1 = stmt.executeQuery();

                    while (r1.next()) {
                        attendanceinfo = r1.getString("Total_Subjects");
                        subject1 = r1.getString("Subject_1");
                        subject2 = r1.getString("Subject_2");
                        subject3 = r1.getString("Subject_3");
                        subject4 = r1.getString("Subject_4");
                        subject5 = r1.getString("Subject_5");
                        subject6 = r1.getString("Subject_6");
                        subject7 = r1.getString("Subject_7");
                        subject8 = r1.getString("Subject_8");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                int totalsubjects = Integer.parseInt(attendanceinfo);

                String query_subject_adder1a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject1 + "_TM Int default 0 ;";
                String query_subject_adder1b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject1 + "_OM Int default 0 ;";
                String query_subject_adder2a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject2 + "_TM Int default 0 ;";
                String query_subject_adder2b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject2 + "_OM Int default 0 ;";
                String query_subject_adder3a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject3 + "_TM Int default 0 ;";
                String query_subject_adder3b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject3 + "_OM Int default 0 ;";
                String query_subject_adder4a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject4 + "_TM Int default 0 ;";
                String query_subject_adder4b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject4 + "_OM Int default 0 ;";
                String query_subject_adder5a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject5 + "_TM Int default 0 ;";
                String query_subject_adder5b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject5 + "_OM Int default 0 ;";
                String query_subject_adder6a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject6 + "_TM Int default 0 ;";
                String query_subject_adder6b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject6 + "_OM Int default 0 ;";
                String query_subject_adder7a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject7 + "_TM Int default 0 ;";
                String query_subject_adder7b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject7 + "_OM Int default 0 ;";
                String query_subject_adder8a = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject8 + "_TM Int default 0 ;";
                String query_subject_adder8b = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_" + subject8 + "_OM Int default 0 ;";
                String query_total_marks = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_totalmarks Int default 0;";
                String query_obtained_marks = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_obtainedmarks Int default 0;";
                String query_persentage = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_persentage float default 0.0;";
                String query_position = "ALTER TABLE Result_" + classname + " ADD " + Months + "_" + Week + "_position int default 0;";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    //here sonoo is database name, root is username and password
                    java.sql.Statement stmt = con.createStatement();

                    switch (totalsubjects) {
                        case 3:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 4:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 5:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 6:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 7:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_subject_adder7a);
                            stmt.executeUpdate(query_subject_adder7b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 8:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_subject_adder7a);
                            stmt.executeUpdate(query_subject_adder7b);

                            stmt.executeUpdate(query_subject_adder8a);
                            stmt.executeUpdate(query_subject_adder8b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        default:
                            break;
                    }

                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        } else {
            //main code for semesters adding column

            String attendanceinfo = null, subject1 = null, subject2 = null, subject3 = null, subject4 = null, subject5 = null, subject6 = null, subject7 = null, subject8 = null;

            String termwise = CB_resulttype123.getSelectedItem().toString();

            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    attendanceinfo = r1.getString("Total_Subjects");
                    subject1 = r1.getString("Subject_1");
                    subject2 = r1.getString("Subject_2");
                    subject3 = r1.getString("Subject_3");
                    subject4 = r1.getString("Subject_4");
                    subject5 = r1.getString("Subject_5");
                    subject6 = r1.getString("Subject_6");
                    subject7 = r1.getString("Subject_7");
                    subject8 = r1.getString("Subject_8");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            int totalsubjects = Integer.parseInt(attendanceinfo);

            String query_subject_adder1a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject1 + "_TM Int default 0 ;";
            String query_subject_adder2a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject2 + "_TM Int default 0 ;";
            String query_subject_adder3a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject3 + "_TM Int default 0 ;";
            String query_subject_adder4a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject4 + "_TM Int default 0 ;";
            String query_subject_adder5a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject5 + "_TM Int default 0 ;";
            String query_subject_adder6a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject6 + "_TM Int default 0 ;";
            String query_subject_adder7a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject7 + "_TM Int default 0 ;";
            String query_subject_adder8a = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject8 + "_TM Int default 0 ;";
            String query_subject_adder1b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject1 + "_OM Int default 0 ;";
            String query_subject_adder2b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject2 + "_OM Int default 0 ;";
            String query_subject_adder3b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject3 + "_OM Int default 0 ;";
            String query_subject_adder4b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject4 + "_OM Int default 0 ;";
            String query_subject_adder5b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject5 + "_OM Int default 0 ;";
            String query_subject_adder6b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject6 + "_OM Int default 0 ;";
            String query_subject_adder7b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject7 + "_OM Int default 0 ;";
            String query_subject_adder8b = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_" + subject8 + "_OM Int default 0 ;";
            String query_total_marks = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_totalmarks Int default 0;";
            String query_obtained_marks = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_obtainedmarks Int default 0;";
            String query_persentage = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_persentage float default 0.0;";
            String query_position = "ALTER TABLE Result_" + classname + " ADD " + termwise + "_position int default 0 ;";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                //here sonoo is database name, root is username and password
                java.sql.Statement stmt = con.createStatement();

                switch (totalsubjects) {
                    case 3:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 4:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 5:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 6:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 7:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_subject_adder7a);
                        stmt.executeUpdate(query_subject_adder7b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 8:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_subject_adder7a);
                        stmt.executeUpdate(query_subject_adder7b);

                        stmt.executeUpdate(query_subject_adder8a);
                        stmt.executeUpdate(query_subject_adder8b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    default:
                        break;
                }

                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        JOptionPane.showMessageDialog(null, "Successfully Added Now please Enter the Marks in Add Result Tabbed Pane");

        
        
        
        deleting_result_gif.setVisible(false);
        editable();
        
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    //Monthly SAVE Button
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        jButton6.hide();

        String classname = CB_classmonthly.getSelectedItem().toString();
        String Month = CB_monthsresultadd.getSelectedItem().toString();
        String weektype = CB_weektype.getSelectedItem().toString();

        if ("Select Month".equals(Month)) {
            JOptionPane.showMessageDialog(null, "Please Select the Month");
        } else if ("Select Week".equals(weektype)) {
            JOptionPane.showMessageDialog(null, "Pleae Select the Week");
        } else {

            String attendanceinfo11 = null;

            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    attendanceinfo11 = r1.getString("Total_Subjects");
                    subject1_add = r1.getString("Subject_1");
                    subject2_add = r1.getString("Subject_2");
                    subject3_add = r1.getString("Subject_3");
                    subject4_add = r1.getString("Subject_4");
                    subject5_add = r1.getString("Subject_5");
                    subject6_add = r1.getString("Subject_6");
                    subject7_add = r1.getString("Subject_7");
                    subject8_add = r1.getString("Subject_8");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            int totalsubjects = Integer.parseInt(attendanceinfo11);

            String query_upload_data = "select * from result_" + classname + " ;";

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_upload_data);
                ResultSet r1 = stmt.executeQuery();

                DefaultTableModel model2 = (DefaultTableModel) Jtablemonthly.getModel();

                //calling the function that add the columns in the Jtable
                add_column_JTablem(totalsubjects);

                while (r1.next()) {
                    String roll_no = r1.getString("Rollno");
                    String name = r1.getString("Name");

                    switch (totalsubjects) {
                        case 3: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b});
                            break;
                        }
                        case 4: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            String sub4a = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_TM");
                            String sub4b = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b});
                            break;
                        }
                        case 5: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            String sub4a = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_TM");
                            String sub4b = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_OM");
                            String sub5a = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_TM");
                            String sub5b = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b});
                            break;
                        }
                        case 6: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            String sub4a = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_TM");
                            String sub4b = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_OM");
                            String sub5a = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_TM");
                            String sub5b = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_OM");
                            String sub6a = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_TM");
                            String sub6b = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b});
                            break;
                        }
                        case 7: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            String sub4a = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_TM");
                            String sub4b = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_OM");
                            String sub5a = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_TM");
                            String sub5b = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_OM");
                            String sub6a = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_TM");
                            String sub6b = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_OM");
                            String sub7a = r1.getString(Month + "_" + weektype + "_" + subject7_add + "_TM");
                            String sub7b = r1.getString(Month + "_" + weektype + "_" + subject7_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b});
                            break;
                        }
                        case 8: {
                            String sub1a = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_TM");
                            String sub1b = r1.getString(Month + "_" + weektype + "_" + subject1_add + "_OM");
                            String sub2a = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_TM");
                            String sub2b = r1.getString(Month + "_" + weektype + "_" + subject2_add + "_OM");
                            String sub3a = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_TM");
                            String sub3b = r1.getString(Month + "_" + weektype + "_" + subject3_add + "_OM");
                            String sub4a = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_TM");
                            String sub4b = r1.getString(Month + "_" + weektype + "_" + subject4_add + "_OM");
                            String sub5a = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_TM");
                            String sub5b = r1.getString(Month + "_" + weektype + "_" + subject5_add + "_OM");
                            String sub6a = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_TM");
                            String sub6b = r1.getString(Month + "_" + weektype + "_" + subject6_add + "_OM");
                            String sub7a = r1.getString(Month + "_" + weektype + "_" + subject7_add + "_TM");
                            String sub7b = r1.getString(Month + "_" + weektype + "_" + subject7_add + "_OM");
                            String sub8a = r1.getString(Month + "_" + weektype + "_" + subject8_add + "_TM");
                            String sub8b = r1.getString(Month + "_" + weektype + "_" + subject8_add + "_OM");
                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b});
                            break;
                        }
                        default:
                            break;
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CB_monthsresultaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthsresultaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthsresultaddActionPerformed

    void position_found(String classname, String Columnnameom, String Columnnamep) {

        String value1;
        String value2;

        int totalmarksm;
        int totalmarksn;
        int position = 1;
        int smaller = 0;
        int total = 0;

        String totalstudents = "select * from " + classname + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(totalstudents);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                total++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String query_checking_noofsubjects = "select * from " + classname + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {

                value1 = r1.getString(Columnnameom);//totalmarks
                String rollno1 = r1.getString("Rollno");

                totalmarksm = Integer.parseInt(value1);

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmtt = conn.prepareStatement(query_checking_noofsubjects);
                    ResultSet r2 = stmtt.executeQuery();

                    while (r2.next()) {

                        value2 = r2.getString(Columnnameom);
                        String rollno2 = r2.getString("Rollno");
                        totalmarksn = Integer.parseInt(value2);

                        if (totalmarksm < totalmarksn) {
                            position++;

                        }

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                String Queryupdate = "UPDATE " + classname + " SET " + Columnnamep + " = " + position + " where Rollno = " + rollno1 + ";";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    java.sql.Statement stmttt = connn.createStatement();
                    stmttt.executeUpdate(Queryupdate);

                    connn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                position = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //this is the table for final term
    void add_column_JTable(int totalSubjects1) {

        DefaultTableModel model = (DefaultTableModel) JT_finalterm.getModel();

        switch (totalSubjects1) {
            case 3:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                break;
            case 4:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                break;
            case 5:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                break;
            case 6:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                break;
            case 7:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                break;
            case 8:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn(subject8_add + " T.M");
                model.addColumn(subject8_add + " O.M");
                break;
            default:
                break;
        }
        jButton5.hide();//hide the add button so that no extra column are creating inside the column
    }

    ///this is the table for 2nd term
    void add_column_JTable2(int totalSubjects1) {

        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

        switch (totalSubjects1) {
            case 3:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                break;
            case 4:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                break;
            case 5:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                break;
            case 6:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                break;
            case 7:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                break;
            case 8:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn(subject8_add + " T.M");
                model.addColumn(subject8_add + " O.M");
                break;
            default:
                break;
        }
        jButton9.hide();//hide the add button so that no extra column are creating inside the column
    }

    //this is the table for 1st Semester
    void add_column_JTable1(int totalSubjects1) {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        switch (totalSubjects1) {
            case 3:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                break;
            case 4:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                break;
            case 5:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                break;
            case 6:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                break;
            case 7:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                break;
            case 8:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn(subject8_add + " T.M");
                model.addColumn(subject8_add + " O.M");
                break;
            default:
                break;
        }
        jButton7.hide();//hide the add button so that no extra column are creating inside the column
    }

    //this is the table for Monthly
    void add_column_JTablem(int totalSubjects1) {

        DefaultTableModel model = (DefaultTableModel) Jtablemonthly.getModel();

        switch (totalSubjects1) {
            case 3:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                break;
            case 4:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                break;
            case 5:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                break;
            case 6:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                break;
            case 7:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                break;
            case 8:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn(subject8_add + " T.M");
                model.addColumn(subject8_add + " O.M");
                break;
            default:
                break;
        }
        jButton7.hide();//hide the add button so that no extra column are creating inside the column
    }

    //this is the table for search class
    void add_column_JTablesearchclass(int totalSubjects1) {
        DefaultTableModel model = (DefaultTableModel) JT_searchresultclass.getModel();

        switch (totalSubjects1) {
            case 3:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            case 4:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            case 5:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            case 6:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            case 7:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            case 8:
                model.addColumn("Roll No");
                model.addColumn("Name");
                model.addColumn(subject1_add + " T.M");
                model.addColumn(subject1_add + " O.M");
                model.addColumn(subject2_add + " T.M");
                model.addColumn(subject2_add + " O.M");
                model.addColumn(subject3_add + " T.M");
                model.addColumn(subject3_add + " O.M");
                model.addColumn(subject4_add + " T.M");
                model.addColumn(subject4_add + " O.M");
                model.addColumn(subject5_add + " T.M");
                model.addColumn(subject5_add + " O.M");
                model.addColumn(subject6_add + " T.M");
                model.addColumn(subject6_add + " O.M");
                model.addColumn(subject7_add + " T.M");
                model.addColumn(subject7_add + " O.M");
                model.addColumn(subject8_add + " T.M");
                model.addColumn(subject8_add + " O.M");
                model.addColumn("Tot.M");
                model.addColumn("Obt.M");
                model.addColumn("%age");
                model.addColumn("Position");
                break;
            default:
                break;
        }
        jButton2.hide();
    }

    //Final Term ADD Button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jButton5.hide();
        //getting the value from the class combobox
        String classname = CB_classfinalterm.getSelectedItem().toString();

        String attendanceinfo11 = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                attendanceinfo11 = r1.getString("Total_Subjects");
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int totalsubjects = Integer.parseInt(attendanceinfo11);

        String query_upload_data = "select * from result_" + classname + ";";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_upload_data);
            ResultSet r1 = stmt.executeQuery();

            DefaultTableModel model2 = (DefaultTableModel) JT_finalterm.getModel();

            //calling the function that add the columns in the Jtable
            add_column_JTable(totalsubjects);

            while (r1.next()) {
                String roll_no = r1.getString("Rollno");
                String name = r1.getString("Name");

                switch (totalsubjects) {
                    case 3: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b});
                        break;
                    }
                    case 4: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Final_Term_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Final_Term_" + subject4_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b});
                        break;
                    }
                    case 5: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Final_Term_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Final_Term_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Final_Term_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Final_Term_" + subject5_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b});
                        break;
                    }
                    case 6: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Final_Term_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Final_Term_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Final_Term_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Final_Term_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Final_Term_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Final_Term_" + subject6_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b});
                        break;
                    }
                    case 7: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Final_Term_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Final_Term_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Final_Term_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Final_Term_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Final_Term_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Final_Term_" + subject6_add + "_OM");
                        String sub7a = r1.getString("Final_Term_" + subject7_add + "_TM");
                        String sub7b = r1.getString("Final_Term_" + subject7_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b});
                        break;
                    }
                    case 8: {
                        String sub1a = r1.getString("Final_Term_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Final_Term_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Final_Term_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Final_Term_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Final_Term_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Final_Term_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Final_Term_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Final_Term_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Final_Term_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Final_Term_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Final_Term_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Final_Term_" + subject6_add + "_OM");
                        String sub7a = r1.getString("Final_Term_" + subject7_add + "_TM");
                        String sub7b = r1.getString("Final_Term_" + subject7_add + "_OM");
                        String sub8a = r1.getString("Final_Term_" + subject8_add + "_TM");
                        String sub8b = r1.getString("Final_Term_" + subject8_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b});
                        break;
                    }
                    default:
                        break;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    //Term 2 ADD Button
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        jButton9.hide();

        //getting the value from the class combobox
        String classname = CB_classterm2.getSelectedItem().toString();

        String attendanceinfo11 = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                attendanceinfo11 = r1.getString("Total_Subjects");
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int totalsubjects = Integer.parseInt(attendanceinfo11);

        String query_upload_data = "select * from result_" + classname + ";";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_upload_data);
            ResultSet r1 = stmt.executeQuery();

            DefaultTableModel model2 = (DefaultTableModel) jTable3.getModel();

            //calling the function that add the columns in the Jtable
            add_column_JTable2(totalsubjects);

            while (r1.next()) {
                String roll_no = r1.getString("Rollno");
                String name = r1.getString("Name");

                switch (totalsubjects) {
                    case 3: {
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b});
                        break;
                    }
                    case 4: {
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Term_2_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Term_2_" + subject4_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b});
                        break;
                    }
                    case 5: {
                        JOptionPane.showMessageDialog(null, "getting the data from table");
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Term_2_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Term_2_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Term_2_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Term_2_" + subject5_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b});
                        break;
                    }
                    case 6: {
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Term_2_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Term_2_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Term_2_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Term_2_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Term_2_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Term_2_" + subject6_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b});
                        break;
                    }
                    case 7: {
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Term_2_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Term_2_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Term_2_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Term_2_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Term_2_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Term_2_" + subject6_add + "_OM");
                        String sub7a = r1.getString("Term_2_" + subject7_add + "_TM");
                        String sub7b = r1.getString("Term_2_" + subject7_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b});
                        break;
                    }
                    case 8: {
                        String sub1a = r1.getString("Term_2_" + subject1_add + "_TM");
                        String sub1b = r1.getString("Term_2_" + subject1_add + "_OM");
                        String sub2a = r1.getString("Term_2_" + subject2_add + "_TM");
                        String sub2b = r1.getString("Term_2_" + subject2_add + "_OM");
                        String sub3a = r1.getString("Term_2_" + subject3_add + "_TM");
                        String sub3b = r1.getString("Term_2_" + subject3_add + "_OM");
                        String sub4a = r1.getString("Term_2_" + subject4_add + "_TM");
                        String sub4b = r1.getString("Term_2_" + subject4_add + "_OM");
                        String sub5a = r1.getString("Term_2_" + subject5_add + "_TM");
                        String sub5b = r1.getString("Term_2_" + subject5_add + "_OM");
                        String sub6a = r1.getString("Term_2_" + subject6_add + "_TM");
                        String sub6b = r1.getString("Term_2_" + subject6_add + "_OM");
                        String sub7a = r1.getString("Term_2_" + subject7_add + "_TM");
                        String sub7b = r1.getString("Term_2_" + subject7_add + "_OM");
                        String sub8a = r1.getString("Term_2_" + subject8_add + "_TM");
                        String sub8b = r1.getString("Term_2_" + subject8_add + "_OM");

                        model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b});
                        break;
                    }
                    default:
                        break;
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton9ActionPerformed

    //if subjects are three
    int marks_checker(int sub1t, int sub2t, int sub3t, int sub1o, int sub2o, int sub3o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //if subjects are Four
    int marks_checker4(int sub1t, int sub2t, int sub3t, int sub4t, int sub1o, int sub2o, int sub3o, int sub4o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub3o > sub3t || sub3o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub4o > sub4t || sub4o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //if subjects are Five
    int marks_checker5(int sub1t, int sub2t, int sub3t, int sub4t, int sub5t, int sub1o, int sub2o, int sub3o, int sub4o, int sub5o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub3o > sub3t || sub3o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub4o > sub4t || sub4o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub5o > sub5t || sub5o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //if subjects are Six
    int marks_checker6(int sub1t, int sub2t, int sub3t, int sub4t, int sub5t, int sub6t, int sub1o, int sub2o, int sub3o, int sub4o, int sub5o, int sub6o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub3o > sub3t || sub3o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub4o > sub4t || sub4o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub5o > sub5t || sub5o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub6o > sub6t || sub6o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //if subjects are Seven
    int marks_checker7(int sub1t, int sub2t, int sub3t, int sub4t, int sub5t, int sub6t, int sub7t, int sub1o, int sub2o, int sub3o, int sub4o, int sub5o, int sub6o, int sub7o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub3o > sub3t || sub3o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub4o > sub4t || sub4o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub5o > sub5t || sub5o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub6o > sub6t || sub6o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub7o > sub7t || sub7o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //if subjects are Eight
    int marks_checker8(int sub1t, int sub2t, int sub3t, int sub4t, int sub5t, int sub6t, int sub7t, int sub8t, int sub1o, int sub2o, int sub3o, int sub4o, int sub5o, int sub6o, int sub7o, int sub8o) {

        if (sub1o > sub1t || sub1o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub2o > sub2t || sub2o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub3o > sub3t || sub3o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub4o > sub4t || sub4o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub5o > sub5t || sub5o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub6o > sub6t || sub6o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub7o > sub7t || sub7o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }
        if (sub8o > sub8t || sub8o < 0) {
            JOptionPane.showMessageDialog(null, "Obtained Marks cannot be grater then total marks and not be less then 0");
            JOptionPane.showMessageDialog(null, "Result has not been updated");
            return 0;
        }

        return 1;

    }

    //final term Save table function
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String classname = CB_classfinalterm.getSelectedItem().toString();

        String totalsubjects = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                totalsubjects = r1.getString("Total_Subjects");
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (null != totalsubjects) {
            switch (totalsubjects) {
                case "3":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);

                        int checker = marks_checker(sub1t, sub2t, sub3t, sub1o, sub2o, sub3o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t;
                            int obtainedmarks = sub1o + sub2o + sub3o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }

                        }
                    }
                    break;
                case "4":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String name = JT_finalterm.getValueAt(i, 1).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();//rollno;
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();//rollno;
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();//rollno;
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();//rollno;
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();//rollno;
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();//rollno;
                        String subject4t = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject4o = JT_finalterm.getValueAt(i, 9).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);

                        int checker = marks_checker4(sub1t, sub2t, sub3t, sub4t, sub1o, sub2o, sub3o, sub4o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "5":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();//rollno;
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();//rollno;
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();//rollno;
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();//rollno;
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();//rollno;
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();//rollno;
                        String subject4t = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject4o = JT_finalterm.getValueAt(i, 9).toString();//rollno;
                        String subject5t = JT_finalterm.getValueAt(i, 10).toString();//rollno;
                        String subject5o = JT_finalterm.getValueAt(i, 11).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);

                        int checker = marks_checker5(sub1t, sub2t, sub3t, sub4t, sub5t, sub1o, sub2o, sub3o, sub4o, sub5o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "6":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();//rollno;
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();//rollno;
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();//rollno;
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();//rollno;
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();//rollno;
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();//rollno;
                        String subject4t = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject4o = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject5t = JT_finalterm.getValueAt(i, 10).toString();//rollno;
                        String subject5o = JT_finalterm.getValueAt(i, 11).toString();//rollno;
                        String subject6t = JT_finalterm.getValueAt(i, 12).toString();//rollno;
                        String subject6o = JT_finalterm.getValueAt(i, 13).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);

                        int checker = marks_checker6(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "7":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();//rollno;
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();//rollno;
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();//rollno;
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();//rollno;
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();//rollno;
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();//rollno;
                        String subject4t = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject4o = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject5t = JT_finalterm.getValueAt(i, 10).toString();//rollno;
                        String subject5o = JT_finalterm.getValueAt(i, 11).toString();//rollno;
                        String subject6t = JT_finalterm.getValueAt(i, 12).toString();//rollno;
                        String subject6o = JT_finalterm.getValueAt(i, 13).toString();//rollno;
                        String subject7t = JT_finalterm.getValueAt(i, 14).toString();//rollno;
                        String subject7o = JT_finalterm.getValueAt(i, 15).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);

                        int checker = marks_checker7(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o);

                        if (checker == 1) {

                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Final_Term_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "8":
                    for (int i = 0; i < JT_finalterm.getRowCount(); i++) {

                        String rollno = JT_finalterm.getValueAt(i, 0).toString();//rollno;
                        String name = JT_finalterm.getValueAt(i, 1).toString();//rollno;
                        String subject1t = JT_finalterm.getValueAt(i, 2).toString();//rollno;
                        String subject1o = JT_finalterm.getValueAt(i, 3).toString();//rollno;
                        String subject2t = JT_finalterm.getValueAt(i, 4).toString();//rollno;
                        String subject2o = JT_finalterm.getValueAt(i, 5).toString();//rollno;
                        String subject3t = JT_finalterm.getValueAt(i, 6).toString();//rollno;
                        String subject3o = JT_finalterm.getValueAt(i, 7).toString();//rollno;
                        String subject4t = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject4o = JT_finalterm.getValueAt(i, 8).toString();//rollno;
                        String subject5t = JT_finalterm.getValueAt(i, 10).toString();//rollno;
                        String subject5o = JT_finalterm.getValueAt(i, 11).toString();//rollno;
                        String subject6t = JT_finalterm.getValueAt(i, 12).toString();//rollno;
                        String subject6o = JT_finalterm.getValueAt(i, 13).toString();//rollno;
                        String subject7t = JT_finalterm.getValueAt(i, 14).toString();//rollno;
                        String subject7o = JT_finalterm.getValueAt(i, 15).toString();//rollno;
                        String subject8t = JT_finalterm.getValueAt(i, 16).toString();//rollno;
                        String subject8o = JT_finalterm.getValueAt(i, 17).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);
                        int sub8t = Integer.parseInt(subject8t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);
                        int sub8o = Integer.parseInt(subject8o);

                        int checker = marks_checker8(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub8t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o, sub8o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t + sub8t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o + sub8o;
                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Final_Term_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Final_Term_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Final_Term_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Final_Term_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Final_Term_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Final_Term_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Final_Term_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_sub8_tm = "UPDATE result_" + classname + " SET Final_Term_" + subject8_add + "_TM = '" + sub8t + "' where Rollno = '" + rollno + "';";
                            String Query_sub8_om = "UPDATE result_" + classname + " SET Final_Term_" + subject8_add + "_OM = '" + sub8o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Final_Term_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Final_Term_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Final_Term_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_sub8_tm);
                                stmt.executeUpdate(Query_sub8_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }

                        }

                    }
                    break;
                default:
                    break;
            }
        }

        //monthly
        Jtablemonthly.hide();

        //calling the postion function
        position_found("result_" + classname, "Final_Term_obtainedmarks", "Final_Term_position");
        JOptionPane.showMessageDialog(null, "Data is Inserted");


    }//GEN-LAST:event_jButton4ActionPerformed

    //Term 1 ADD Button
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jButton7.hide();

        String classname = CB_classterm2.getSelectedItem().toString();

        String attendanceinfo11 = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                attendanceinfo11 = r1.getString("Total_Subjects");
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        int totalsubjects = Integer.parseInt(attendanceinfo11);

        String query_upload_data = "select * from result_" + classname + ";";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_upload_data);
            ResultSet r1 = stmt.executeQuery();

            DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

            //calling the function that add the columns in the Jtable
            add_column_JTable1(totalsubjects);

            while (r1.next()) {
                String roll_no = r1.getString("Rollno");
                String name = r1.getString("Name");

                if (totalsubjects == 3) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b});

                } else if (totalsubjects == 4) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    String sub4a = r1.getString("Term_1_" + subject4_add + "_TM");
                    String sub4b = r1.getString("Term_1_" + subject4_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b});

                } else if (totalsubjects == 5) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    String sub4a = r1.getString("Term_1_" + subject4_add + "_TM");
                    String sub4b = r1.getString("Term_1_" + subject4_add + "_OM");

                    String sub5a = r1.getString("Term_1_" + subject5_add + "_TM");
                    String sub5b = r1.getString("Term_1_" + subject5_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b});

                } else if (totalsubjects == 6) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    String sub4a = r1.getString("Term_1_" + subject4_add + "_TM");
                    String sub4b = r1.getString("Term_1_" + subject4_add + "_OM");

                    String sub5a = r1.getString("Term_1_" + subject5_add + "_TM");
                    String sub5b = r1.getString("Term_1_" + subject5_add + "_OM");

                    String sub6a = r1.getString("Term_1_" + subject6_add + "_TM");
                    String sub6b = r1.getString("Term_1_" + subject6_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b});

                } else if (totalsubjects == 7) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    String sub4a = r1.getString("Term_1_" + subject4_add + "_TM");
                    String sub4b = r1.getString("Term_1_" + subject4_add + "_OM");

                    String sub5a = r1.getString("Term_1_" + subject5_add + "_TM");
                    String sub5b = r1.getString("Term_1_" + subject5_add + "_OM");

                    String sub6a = r1.getString("Term_1_" + subject6_add + "_TM");
                    String sub6b = r1.getString("Term_1_" + subject6_add + "_OM");

                    String sub7a = r1.getString("Term_1_" + subject7_add + "_TM");
                    String sub7b = r1.getString("Term_1_" + subject7_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b});

                } else if (totalsubjects == 8) {
                    String sub1a = r1.getString("Term_1_" + subject1_add + "_TM");
                    String sub1b = r1.getString("Term_1_" + subject1_add + "_OM");

                    String sub2a = r1.getString("Term_1_" + subject2_add + "_TM");
                    String sub2b = r1.getString("Term_1_" + subject2_add + "_OM");

                    String sub3a = r1.getString("Term_1_" + subject3_add + "_TM");
                    String sub3b = r1.getString("Term_1_" + subject3_add + "_OM");

                    String sub4a = r1.getString("Term_1_" + subject4_add + "_TM");
                    String sub4b = r1.getString("Term_1_" + subject4_add + "_OM");

                    String sub5a = r1.getString("Term_1_" + subject5_add + "_TM");
                    String sub5b = r1.getString("Term_1_" + subject5_add + "_OM");

                    String sub6a = r1.getString("Term_1_" + subject6_add + "_TM");
                    String sub6b = r1.getString("Term_1_" + subject6_add + "_OM");

                    String sub7a = r1.getString("Term_1_" + subject7_add + "_TM");
                    String sub7b = r1.getString("Term_1_" + subject7_add + "_OM");

                    String sub8a = r1.getString("Term_1_" + subject8_add + "_TM");
                    String sub8b = r1.getString("Term_1_" + subject8_add + "_OM");

                    model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b});

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    //Term 1 SAVE Button
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String classname = CB_classterm1.getSelectedItem().toString();

        String totalsubjects = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                totalsubjects = r1.getString("Total_Subjects");
                JOptionPane.showMessageDialog(null, totalsubjects);
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (null != totalsubjects) {
            switch (totalsubjects) {
                case "3":
                    JOptionPane.showMessageDialog(null, "3");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);

                        int checker = marks_checker(sub1t, sub2t, sub3t, sub1o, sub2o, sub3o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t;
                            int obtainedmarks = sub1o + sub2o + sub3o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "4");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;
                        String subject4t = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject4o = jTable2.getValueAt(i, 9).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);

                        int checker = marks_checker4(sub1t, sub2t, sub3t, sub4t, sub1o, sub2o, sub3o, sub4o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "5");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {
                        JOptionPane.showMessageDialog(null, "in result updation ");

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;
                        String subject4t = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject4o = jTable2.getValueAt(i, 9).toString();//rollno;
                        String subject5t = jTable2.getValueAt(i, 10).toString();//rollno;
                        String subject5o = jTable2.getValueAt(i, 11).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);

                        int checker = marks_checker5(sub1t, sub2t, sub3t, sub4t, sub5t, sub1o, sub2o, sub3o, sub4o, sub5o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "6");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;
                        String subject4t = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject4o = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject5t = jTable2.getValueAt(i, 10).toString();//rollno;
                        String subject5o = jTable2.getValueAt(i, 11).toString();//rollno;
                        String subject6t = jTable2.getValueAt(i, 12).toString();//rollno;
                        String subject6o = jTable2.getValueAt(i, 13).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);

                        int checker = marks_checker6(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "7");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;
                        String subject4t = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject4o = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject5t = jTable2.getValueAt(i, 10).toString();//rollno;
                        String subject5o = jTable2.getValueAt(i, 11).toString();//rollno;
                        String subject6t = jTable2.getValueAt(i, 12).toString();//rollno;
                        String subject6o = jTable2.getValueAt(i, 13).toString();//rollno;
                        String subject7t = jTable2.getValueAt(i, 14).toString();//rollno;
                        String subject7o = jTable2.getValueAt(i, 15).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);

                        int checker = marks_checker7(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Term_1_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Term_1_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "8");
                    for (int i = 0; i < jTable2.getRowCount(); i++) {

                        String rollno = jTable2.getValueAt(i, 0).toString();//rollno;
                        String name = jTable2.getValueAt(i, 1).toString();//rollno;
                        String subject1t = jTable2.getValueAt(i, 2).toString();//rollno;
                        String subject1o = jTable2.getValueAt(i, 3).toString();//rollno;
                        String subject2t = jTable2.getValueAt(i, 4).toString();//rollno;
                        String subject2o = jTable2.getValueAt(i, 5).toString();//rollno;
                        String subject3t = jTable2.getValueAt(i, 6).toString();//rollno;
                        String subject3o = jTable2.getValueAt(i, 7).toString();//rollno;
                        String subject4t = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject4o = jTable2.getValueAt(i, 8).toString();//rollno;
                        String subject5t = jTable2.getValueAt(i, 10).toString();//rollno;
                        String subject5o = jTable2.getValueAt(i, 11).toString();//rollno;
                        String subject6t = jTable2.getValueAt(i, 12).toString();//rollno;
                        String subject6o = jTable2.getValueAt(i, 13).toString();//rollno;
                        String subject7t = jTable2.getValueAt(i, 14).toString();//rollno;
                        String subject7o = jTable2.getValueAt(i, 15).toString();//rollno;
                        String subject8t = jTable2.getValueAt(i, 16).toString();//rollno;
                        String subject8o = jTable2.getValueAt(i, 17).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);
                        int sub8t = Integer.parseInt(subject8t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);
                        int sub8o = Integer.parseInt(subject8o);

                        int checker = marks_checker8(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub8t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o, sub8o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o + sub8o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t + sub8t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_1_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_1_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_1_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_1_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_1_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_1_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Term_1_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Term_1_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_sub8_tm = "UPDATE result_" + classname + " SET Term_1_" + subject8_add + "_TM = '" + sub8t + "' where Rollno = '" + rollno + "';";
                            String Query_sub8_om = "UPDATE result_" + classname + " SET Term_1_" + subject8_add + "_OM = '" + sub8o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_1_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_1_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_1_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_sub8_tm);
                                stmt.executeUpdate(Query_sub8_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                default:
                    break;
            }
        }

        jTable2.hide();

        //calling the postion function
        position_found("result_" + classname, "Term_1_obtainedmarks", "Term_1_position");
        JOptionPane.showMessageDialog(null, "Data is Inserted");


    }//GEN-LAST:event_jButton10ActionPerformed

    //Term 2 Save Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String classname = CB_classterm2.getSelectedItem().toString();

        String totalsubjects = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                totalsubjects = r1.getString("Total_Subjects");
                JOptionPane.showMessageDialog(null, totalsubjects);
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (null != totalsubjects) {
            switch (totalsubjects) {
                case "3":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);

                        int checker = marks_checker(sub1t, sub2t, sub3t, sub1o, sub2o, sub3o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o;
                            int totalmarks = sub1t + sub2t + sub3t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "4");
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 9).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);

                        int checker = marks_checker4(sub1t, sub2t, sub3t, sub4t, sub1o, sub2o, sub3o, sub4o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "5");
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {
                        JOptionPane.showMessageDialog(null, "in result updation ");

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 9).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);

                        int checker = marks_checker5(sub1t, sub2t, sub3t, sub4t, sub5t, sub1o, sub2o, sub3o, sub4o, sub5o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "6");
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String name = Jtablemonthly.getValueAt(i, 1).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);

                        int checker = marks_checker6(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "7");
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = jTable3.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;
                        String subject7t = Jtablemonthly.getValueAt(i, 14).toString();//rollno;
                        String subject7o = Jtablemonthly.getValueAt(i, 15).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);

                        int checker = marks_checker7(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Term_2_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Term_2_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "8");
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String name = Jtablemonthly.getValueAt(i, 1).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;
                        String subject7t = Jtablemonthly.getValueAt(i, 14).toString();//rollno;
                        String subject7o = Jtablemonthly.getValueAt(i, 15).toString();//rollno;
                        String subject8t = Jtablemonthly.getValueAt(i, 16).toString();//rollno;
                        String subject8o = Jtablemonthly.getValueAt(i, 17).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);
                        int sub8t = Integer.parseInt(subject8t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);
                        int sub8o = Integer.parseInt(subject8o);

                        int checker = marks_checker8(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub8t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o, sub8o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t + sub8t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o + sub8o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET Term_2_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET Term_2_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET Term_2_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET Term_2_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET Term_2_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET Term_2_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET Term_2_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET Term_2_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_sub8_tm = "UPDATE result_" + classname + " SET Term_2_" + subject8_add + "_TM = '" + sub8t + "' where Rollno = '" + rollno + "';";
                            String Query_sub8_om = "UPDATE result_" + classname + " SET Term_2_" + subject8_add + "_OM = '" + sub8o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET Term_2_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET Term_2_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET Term_2_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_sub8_tm);
                                stmt.executeUpdate(Query_sub8_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                default:
                    break;
            }
        }

        jTable3.hide();

        //calling the postion function
        position_found("result_" + classname, "Term_2_obtainedmarks", "Term_2_position");
        JOptionPane.showMessageDialog(null, "Data is Inserted");


    }//GEN-LAST:event_jButton3ActionPerformed

    //Monthly SAVE Button
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String classname = CB_classmonthly.getSelectedItem().toString();
        String month = CB_monthsresultadd.getSelectedItem().toString();
        String week = CB_weektype.getSelectedItem().toString();

        String totalsubjects = null;

        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                totalsubjects = r1.getString("Total_Subjects");
                subject1_add = r1.getString("Subject_1");
                subject2_add = r1.getString("Subject_2");
                subject3_add = r1.getString("Subject_3");
                subject4_add = r1.getString("Subject_4");
                subject5_add = r1.getString("Subject_5");
                subject6_add = r1.getString("Subject_6");
                subject7_add = r1.getString("Subject_7");
                subject8_add = r1.getString("Subject_8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        if (null != totalsubjects) {
            switch (totalsubjects) {
                case "3":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);

                        int checker = marks_checker(sub1t, sub2t, sub3t, sub1o, sub2o, sub3o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t;
                            int obtainedmarks = sub1o + sub2o + sub3o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;
                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);
                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }

                        }
                    }
                    break;
                case "4":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String name = Jtablemonthly.getValueAt(i, 1).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 9).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);

                        int checker = marks_checker4(sub1t, sub2t, sub3t, sub4t, sub1o, sub2o, sub3o, sub4o);

                        if (checker == 1) {
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }
                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "5":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 9).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);

                        int checker = marks_checker5(sub1t, sub2t, sub3t, sub4t, sub5t, sub1o, sub2o, sub3o, sub4o, sub5o);

                        if (checker == 1) {
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "6":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);

                        int checker = marks_checker6(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }
                    }
                    break;
                case "7":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;
                        String subject7t = Jtablemonthly.getValueAt(i, 14).toString();//rollno;
                        String subject7o = Jtablemonthly.getValueAt(i, 15).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);

                        int checker = marks_checker7(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o);

                        if (checker == 1) {

                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o;
                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }

                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    }
                    break;
                case "8":
                    for (int i = 0; i < Jtablemonthly.getRowCount(); i++) {

                        String rollno = Jtablemonthly.getValueAt(i, 0).toString();//rollno;
                        String name = Jtablemonthly.getValueAt(i, 1).toString();//rollno;
                        String subject1t = Jtablemonthly.getValueAt(i, 2).toString();//rollno;
                        String subject1o = Jtablemonthly.getValueAt(i, 3).toString();//rollno;
                        String subject2t = Jtablemonthly.getValueAt(i, 4).toString();//rollno;
                        String subject2o = Jtablemonthly.getValueAt(i, 5).toString();//rollno;
                        String subject3t = Jtablemonthly.getValueAt(i, 6).toString();//rollno;
                        String subject3o = Jtablemonthly.getValueAt(i, 7).toString();//rollno;
                        String subject4t = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject4o = Jtablemonthly.getValueAt(i, 8).toString();//rollno;
                        String subject5t = Jtablemonthly.getValueAt(i, 10).toString();//rollno;
                        String subject5o = Jtablemonthly.getValueAt(i, 11).toString();//rollno;
                        String subject6t = Jtablemonthly.getValueAt(i, 12).toString();//rollno;
                        String subject6o = Jtablemonthly.getValueAt(i, 13).toString();//rollno;
                        String subject7t = Jtablemonthly.getValueAt(i, 14).toString();//rollno;
                        String subject7o = Jtablemonthly.getValueAt(i, 15).toString();//rollno;
                        String subject8t = Jtablemonthly.getValueAt(i, 16).toString();//rollno;
                        String subject8o = Jtablemonthly.getValueAt(i, 17).toString();//rollno;

                        int sub1t = Integer.parseInt(subject1t);
                        int sub2t = Integer.parseInt(subject2t);
                        int sub3t = Integer.parseInt(subject3t);
                        int sub4t = Integer.parseInt(subject4t);
                        int sub5t = Integer.parseInt(subject5t);
                        int sub6t = Integer.parseInt(subject6t);
                        int sub7t = Integer.parseInt(subject7t);
                        int sub8t = Integer.parseInt(subject8t);

                        int sub1o = Integer.parseInt(subject1o);
                        int sub2o = Integer.parseInt(subject2o);
                        int sub3o = Integer.parseInt(subject3o);
                        int sub4o = Integer.parseInt(subject4o);
                        int sub5o = Integer.parseInt(subject5o);
                        int sub6o = Integer.parseInt(subject6o);
                        int sub7o = Integer.parseInt(subject7o);
                        int sub8o = Integer.parseInt(subject8o);

                        int checker = marks_checker8(sub1t, sub2t, sub3t, sub4t, sub5t, sub6t, sub7t, sub8t, sub1o, sub2o, sub3o, sub4o, sub5o, sub6o, sub7o, sub8o);

                        if (checker == 1) {

                            int totalmarks = sub1t + sub2t + sub3t + sub4t + sub5t + sub6t + sub7t + sub8t;
                            int obtainedmarks = sub1o + sub2o + sub3o + sub4o + sub5o + sub6o + sub7o + sub8o;

                            if (totalmarks == 0) {
                                totalmarks = 1;
                            }
                            float persentage = obtainedmarks * 100 / totalmarks;

                            String Query_sub1_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_TM = '" + sub1t + "' where Rollno = '" + rollno + "';";
                            String Query_sub1_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject1_add + "_OM = '" + sub1o + "' where Rollno = '" + rollno + "';";

                            String Query_sub2_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_TM = '" + sub2t + "' where Rollno = '" + rollno + "';";
                            String Query_sub2_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject2_add + "_OM = '" + sub2o + "' where Rollno = '" + rollno + "';";

                            String Query_sub3_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_TM = '" + sub3t + "' where Rollno = '" + rollno + "';";
                            String Query_sub3_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject3_add + "_OM = '" + sub3o + "' where Rollno = '" + rollno + "';";

                            String Query_sub4_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_TM = '" + sub4t + "' where Rollno = '" + rollno + "';";
                            String Query_sub4_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject4_add + "_OM = '" + sub4o + "' where Rollno = '" + rollno + "';";

                            String Query_sub5_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_TM = '" + sub5t + "' where Rollno = '" + rollno + "';";
                            String Query_sub5_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject5_add + "_OM = '" + sub5o + "' where Rollno = '" + rollno + "';";

                            String Query_sub6_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_TM = '" + sub6t + "' where Rollno = '" + rollno + "';";
                            String Query_sub6_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject6_add + "_OM = '" + sub6o + "' where Rollno = '" + rollno + "';";

                            String Query_sub7_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject7_add + "_TM = '" + sub7t + "' where Rollno = '" + rollno + "';";
                            String Query_sub7_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject7_add + "_OM = '" + sub7o + "' where Rollno = '" + rollno + "';";

                            String Query_sub8_tm = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject8_add + "_TM = '" + sub8t + "' where Rollno = '" + rollno + "';";
                            String Query_sub8_om = "UPDATE result_" + classname + " SET " + month + "_" + week + "_" + subject8_add + "_OM = '" + sub8o + "' where Rollno = '" + rollno + "';";

                            String Query_total = "UPDATE result_" + classname + " SET " + month + "_" + week + "_totalmarks = '" + totalmarks + "' where Rollno = '" + rollno + "';";
                            String Query_obtained = "UPDATE result_" + classname + " SET " + month + "_" + week + "_obtainedmarks = '" + obtainedmarks + "' where Rollno = '" + rollno + "';";
                            String Query_persentage = "UPDATE result_" + classname + " SET " + month + "_" + week + "_persentage = '" + persentage + "' where Rollno = '" + rollno + "';";

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                java.sql.Statement stmt = con.createStatement();
                                stmt.executeUpdate(Query_sub1_tm);
                                stmt.executeUpdate(Query_sub1_om);

                                stmt.executeUpdate(Query_sub2_tm);
                                stmt.executeUpdate(Query_sub2_om);

                                stmt.executeUpdate(Query_sub3_tm);
                                stmt.executeUpdate(Query_sub3_om);

                                stmt.executeUpdate(Query_sub4_tm);
                                stmt.executeUpdate(Query_sub4_om);

                                stmt.executeUpdate(Query_sub5_tm);
                                stmt.executeUpdate(Query_sub5_om);

                                stmt.executeUpdate(Query_sub6_tm);
                                stmt.executeUpdate(Query_sub6_om);

                                stmt.executeUpdate(Query_sub7_tm);
                                stmt.executeUpdate(Query_sub7_om);

                                stmt.executeUpdate(Query_sub8_tm);
                                stmt.executeUpdate(Query_sub8_om);

                                stmt.executeUpdate(Query_total);
                                stmt.executeUpdate(Query_obtained);
                                stmt.executeUpdate(Query_persentage);

                                con.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }

                        }

                    }
                    break;
                default:
                    break;
            }
        }
        //monthly
        Jtablemonthly.hide();

        //calling the postion function
        position_found("result_" + classname, month + "_" + week + "_obtainedmarks", month + "_" + week + "_position");
        JOptionPane.showMessageDialog(null, "Data is Inserted");


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String classname = CB_searchclass2.getSelectedItem().toString();
        String resulttype = CB_resulttype124.getSelectedItem().toString();
        String Week = CB_weektype2.getSelectedItem().toString();
        String Month1 = CB_months1.getSelectedItem().toString();

        String columnnamemonthly = null;

        if ("Monthly".equals(resulttype)) {

            columnnamemonthly = Month1 + "_" + Week + "_";

            if ("Select Week".equals(Week)) {
                JOptionPane.showMessageDialog(null, "Please Select the Week");
            } else if ("Select Month".equals(Month1)) {
                JOptionPane.showMessageDialog(null, "Please Select the Month");
            } else {

                String attendanceinfo11 = null;
                String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                    ResultSet r1 = stmt.executeQuery();

                    while (r1.next()) {
                        attendanceinfo11 = r1.getString("Total_Subjects");
                        subject1_add = r1.getString("Subject_1");
                        subject2_add = r1.getString("Subject_2");
                        subject3_add = r1.getString("Subject_3");
                        subject4_add = r1.getString("Subject_4");
                        subject5_add = r1.getString("Subject_5");
                        subject6_add = r1.getString("Subject_6");
                        subject7_add = r1.getString("Subject_7");
                        subject8_add = r1.getString("Subject_8");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                int totalsubjects = Integer.parseInt(attendanceinfo11);
                String query_upload_data = "select * from result_" + classname + " order by " + columnnamemonthly + "position ;";

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmt = con.prepareStatement(query_upload_data);
                    ResultSet r1 = stmt.executeQuery();

                    DefaultTableModel model2 = (DefaultTableModel) JT_searchresultclass.getModel();

                    //calling the function that add the columns in the Jtable
                    add_column_JTablesearchclass(totalsubjects);

                    while (r1.next()) {
                        String roll_no = r1.getString("Rollno");
                        String name = r1.getString("Name");

                        switch (totalsubjects) {
                            case 3: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage + " % ", position});

                                break;
                            }
                            case 4: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage + " % ", position});
                                break;
                            }
                            case 5: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage + " % ", position});
                                break;
                            }
                            case 6: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage + " % ", position});
                                break;
                            }
                            case 7: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage + " % ", position});
                                break;
                            }
                            case 8: {
                                String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                                String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                                String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                String percentage = r1.getString(columnnamemonthly + "persentage");
                                String position = r1.getString(columnnamemonthly + "position");

                                model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage + " % ", position});
                                break;
                            }
                            default:
                                break;
                        }

                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        } else {

            columnnamemonthly = resulttype + "_";
            String attendanceinfo11 = null;
            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    attendanceinfo11 = r1.getString("Total_Subjects");
                    subject1_add = r1.getString("Subject_1");
                    subject2_add = r1.getString("Subject_2");
                    subject3_add = r1.getString("Subject_3");
                    subject4_add = r1.getString("Subject_4");
                    subject5_add = r1.getString("Subject_5");
                    subject6_add = r1.getString("Subject_6");
                    subject7_add = r1.getString("Subject_7");
                    subject8_add = r1.getString("Subject_8");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            int totalsubjects = Integer.parseInt(attendanceinfo11);
            String query_upload_data = "select * from result_" + classname + " order by " + columnnamemonthly + "position;";

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_upload_data);
                ResultSet r1 = stmt.executeQuery();

                DefaultTableModel model2 = (DefaultTableModel) JT_searchresultclass.getModel();

                add_column_JTablesearchclass(totalsubjects);

                while (r1.next()) {
                    String roll_no = r1.getString("Rollno");
                    String name = r1.getString("Name");

                    switch (totalsubjects) {
                        case 3: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        case 4: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        case 5: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        case 6: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        case 7: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        case 8: {
                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                            String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                            String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                            String percentage = r1.getString(columnnamemonthly + "persentage");
                            String position1 = r1.getString(columnnamemonthly + "position");

                            model2.addRow(new Object[]{roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage, position1});
                            break;
                        }
                        default:
                            break;
                    }

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        JT_searchresultclass.setEnabled(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CB_resulttype124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_resulttype124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_resulttype124ActionPerformed

    private void CB_months1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_months1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_months1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        jButton16.hide();

        String class1 = CB_searchclass2.getSelectedItem().toString();

        String Result_type = CB_resulttype124.getSelectedItem().toString();

        if ("Select_Class".equals(class1)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class first");
        } else if (null != Result_type) {
            switch (Result_type) {
                case "Result Type":
                    JOptionPane.showMessageDialog(null, "Please Select the Result Type");
                    break;
                case "Monthly":
                    CB_months1.setVisible(true);
                    CB_weektype2.setVisible(true);
                    jButton2.setVisible(true);
                    //B_printresultcards.setVisible(true);
                    B_printresultlist.setVisible(true);
                    break;
                default:
                    CB_weektype2.hide();
                    CB_months1.hide();
                    jButton2.setVisible(true);
                    //B_printresultcards.setVisible(true);
                    B_printresultlist.setVisible(true);
                    break;
            }
        }

    }//GEN-LAST:event_jButton16ActionPerformed

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


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JT_searchresultstudent.setEnabled(false);

        String cl_name = CB_searchclass1.getSelectedItem().toString();
        String r_no = jTextField26.getText();

        int foundornot = student_found_or_not(cl_name, r_no);

        if (foundornot == 1) {

            DefaultTableModel model3 = (DefaultTableModel) JT_searchresultstudent.getModel();

            while (model3.getRowCount() > 0) {
                for (int i = 0; i < model3.getRowCount(); i++) {
                    model3.removeRow(i);
                }
            }

            String Query3 = "show fields in result_" + cl_name + ";";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(Query3);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    String completename = "";
                    String name = r1.getString("Field");
                    for (String retval : name.split("_")) {
                        if ("totalmarks".equals(retval)) {

                            for (String retval1 : name.split("_")) {

                                if (!"totalmarks".equals(retval1)) {

                                    completename = completename + retval1 + "_";//this is result type without totalmarks

                                    String query2 = "select * from result_" + cl_name + " where Rollno = '" + r_no + "';";

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                        PreparedStatement stmttt = conn.prepareStatement(query2);
                                        ResultSet r2 = stmttt.executeQuery();

                                        while (r2.next()) {
                                            //JOptionPane.showMessageDialog(null, "inside result set");
                                            String name1 = r2.getString("Name");
                                            String totalmarks1 = r2.getString(completename + "totalmarks");
                                            String obtainedmarks1 = r2.getString(completename + "obtainedmarks");
                                            String percentage1 = r2.getString(completename + "persentage");
                                            String position1 = r2.getString(completename + "position");

                                            model3.addRow(new Object[]{completename, name1, totalmarks1, obtainedmarks1, percentage1, position1});

                                        }
                                    } catch (Exception e) {
                                        //JOptionPane.showMessageDialog(null, e);
                                    }

                                }
                            }

                        }

                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Student not Found");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void closingresultframe(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingresultframe
        dispose();
        Main_Page.resultbutton.setEnabled(true);
    }//GEN-LAST:event_closingresultframe

    private void B_printresultlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_printresultlistActionPerformed

        String classname = CB_searchclass2.getSelectedItem().toString();
        String resulttype = CB_resulttype124.getSelectedItem().toString();
        String columnnamemonthly;

        if ("Monthly".equals(resulttype)) {
            String Week1 = CB_weektype2.getSelectedItem().toString();
            String Month2 = CB_months1.getSelectedItem().toString();
            columnnamemonthly = classname + " " + resulttype + " " + Month2 + " " + Week1;
        } else {
            columnnamemonthly = classname + " " + resulttype;
        }

        MessageFormat header = new MessageFormat("Class " + columnnamemonthly + " Report");
        MessageFormat footer = new MessageFormat("page {0,number,integer}");

        try {
            JT_searchresultclass.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s %n", e.getMessage());
        }

    }//GEN-LAST:event_B_printresultlistActionPerformed

    private void CB_class124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_class124ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_class124ActionPerformed

    private void CB_resulttype125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_resulttype125ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_resulttype125ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        String class1 = CB_class124.getSelectedItem().toString();

        String Result_type = CB_resulttype125.getSelectedItem().toString();

        if ("Select_Class".equals(class1)) {
            JOptionPane.showMessageDialog(null, "Please Select the Class first");
        } else if ("Result Type".equals(Result_type)) {
            JOptionPane.showMessageDialog(null, "Please Select the Result Type");
        } else if ("Monthly".equals(Result_type)) {
            CB_months2.setVisible(true);
            Add_Button1.setVisible(true);
            CB_weektype3.setVisible(true);

        } else {
            CB_weektype3.hide();
            CB_months2.hide();
            Add_Button1.setVisible(true);
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void CB_months2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_months2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_months2ActionPerformed

    private void Add_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Button1ActionPerformed

        deleting_result_gif.setVisible(true);
        non_editable();
        
        
        
        String Result_type = CB_resulttype125.getSelectedItem().toString();
        String Months = CB_months2.getSelectedItem().toString();
        String Week = CB_weektype3.getSelectedItem().toString();
        String classname = CB_class124.getSelectedItem().toString();

        
        if ("Monthly".equals(Result_type)) {

            if ("Select Week".equals(Week)) {
                JOptionPane.showMessageDialog(null, "Please Select the Week");
            } else if ("Select Month".equals(Months)) {
                JOptionPane.showMessageDialog(null, "Please Select the Month First");
            } else {
                //Main Code for monthly result column adding
                String attendanceinfo = null, subject1 = null, subject2 = null, subject3 = null, subject4 = null, subject5 = null, subject6 = null, subject7 = null, subject8 = null;

                String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                    ResultSet r1 = stmt.executeQuery();

                    while (r1.next()) {
                        attendanceinfo = r1.getString("Total_Subjects");
                        subject1 = r1.getString("Subject_1");
                        subject2 = r1.getString("Subject_2");
                        subject3 = r1.getString("Subject_3");
                        subject4 = r1.getString("Subject_4");
                        subject5 = r1.getString("Subject_5");
                        subject6 = r1.getString("Subject_6");
                        subject7 = r1.getString("Subject_7");
                        subject8 = r1.getString("Subject_8");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                int totalsubjects = Integer.parseInt(attendanceinfo);

                String query_subject_adder1a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject1 + "_TM;";
                String query_subject_adder1b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject1 + "_OM;";
                String query_subject_adder2a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject2 + "_TM;";
                String query_subject_adder2b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject2 + "_OM;";
                String query_subject_adder3a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject3 + "_TM;";
                String query_subject_adder3b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject3 + "_OM;";
                String query_subject_adder4a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject4 + "_TM;";
                String query_subject_adder4b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject4 + "_OM;";
                String query_subject_adder5a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject5 + "_TM;";
                String query_subject_adder5b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject5 + "_OM;";
                String query_subject_adder6a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject6 + "_TM;";
                String query_subject_adder6b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject6 + "_OM;";
                String query_subject_adder7a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject7 + "_TM;";
                String query_subject_adder7b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject7 + "_OM;";
                String query_subject_adder8a = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject8 + "_TM;";
                String query_subject_adder8b = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_" + subject8 + "_OM;";
                String query_total_marks = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_totalmarks0;";
                String query_obtained_marks = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_obtainedmarks;";
                String query_persentage = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_persentage;";
                String query_position = "ALTER TABLE Result_" + classname + " DROP " + Months + "_" + Week + "_position;";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    //here sonoo is database name, root is username and password
                    java.sql.Statement stmt = con.createStatement();

                    switch (totalsubjects) {
                        case 3:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 4:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 5:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 6:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 7:

                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_subject_adder7a);
                            stmt.executeUpdate(query_subject_adder7b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        case 8:
                            stmt.executeUpdate(query_subject_adder1a);
                            stmt.executeUpdate(query_subject_adder1b);

                            stmt.executeUpdate(query_subject_adder2a);
                            stmt.executeUpdate(query_subject_adder2b);

                            stmt.executeUpdate(query_subject_adder3a);
                            stmt.executeUpdate(query_subject_adder3b);

                            stmt.executeUpdate(query_subject_adder4a);
                            stmt.executeUpdate(query_subject_adder4b);

                            stmt.executeUpdate(query_subject_adder5a);
                            stmt.executeUpdate(query_subject_adder5b);

                            stmt.executeUpdate(query_subject_adder6a);
                            stmt.executeUpdate(query_subject_adder6b);

                            stmt.executeUpdate(query_subject_adder7a);
                            stmt.executeUpdate(query_subject_adder7b);

                            stmt.executeUpdate(query_subject_adder8a);
                            stmt.executeUpdate(query_subject_adder8b);

                            stmt.executeUpdate(query_total_marks);
                            stmt.executeUpdate(query_obtained_marks);
                            stmt.executeUpdate(query_persentage);
                            stmt.executeUpdate(query_position);
                            break;
                        default:
                            break;
                    }

                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }
        } else {
            //main code for semesters adding column

            String attendanceinfo = null, subject1 = null, subject2 = null, subject3 = null, subject4 = null, subject5 = null, subject6 = null, subject7 = null, subject8 = null;

            String termwise = CB_resulttype125.getSelectedItem().toString();

            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                ResultSet r1 = stmt.executeQuery();

                while (r1.next()) {
                    attendanceinfo = r1.getString("Total_Subjects");
                    subject1 = r1.getString("Subject_1");
                    subject2 = r1.getString("Subject_2");
                    subject3 = r1.getString("Subject_3");
                    subject4 = r1.getString("Subject_4");
                    subject5 = r1.getString("Subject_5");
                    subject6 = r1.getString("Subject_6");
                    subject7 = r1.getString("Subject_7");
                    subject8 = r1.getString("Subject_8");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            int totalsubjects = Integer.parseInt(attendanceinfo);

            String query_subject_adder1a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject1 + "_TM;";
            String query_subject_adder2a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject2 + "_TM;";
            String query_subject_adder3a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject3 + "_TM;";
            String query_subject_adder4a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject4 + "_TM;";
            String query_subject_adder5a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject5 + "_TM;";
            String query_subject_adder6a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject6 + "_TM;";
            String query_subject_adder7a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject7 + "_TM;";
            String query_subject_adder8a = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject8 + "_TM;";
            String query_subject_adder1b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject1 + "_OM;";
            String query_subject_adder2b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject2 + "_OM;";
            String query_subject_adder3b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject3 + "_OM;";
            String query_subject_adder4b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject4 + "_OM;";
            String query_subject_adder5b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject5 + "_OM;";
            String query_subject_adder6b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject6 + "_OM;";
            String query_subject_adder7b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject7 + "_OM;";
            String query_subject_adder8b = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_" + subject8 + "_OM;";
            String query_total_marks = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_totalmarks;";
            String query_obtained_marks = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_obtainedmarks;";
            String query_persentage = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_persentage;";
            String query_position = "ALTER TABLE Result_" + classname + " DROP " + termwise + "_position;";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                //here sonoo is database name, root is username and password
                java.sql.Statement stmt = con.createStatement();

                switch (totalsubjects) {
                    case 3:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 4:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 5:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 6:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 7:

                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_subject_adder7a);
                        stmt.executeUpdate(query_subject_adder7b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    case 8:
                        stmt.executeUpdate(query_subject_adder1a);
                        stmt.executeUpdate(query_subject_adder1b);

                        stmt.executeUpdate(query_subject_adder2a);
                        stmt.executeUpdate(query_subject_adder2b);

                        stmt.executeUpdate(query_subject_adder3a);
                        stmt.executeUpdate(query_subject_adder3b);

                        stmt.executeUpdate(query_subject_adder4a);
                        stmt.executeUpdate(query_subject_adder4b);

                        stmt.executeUpdate(query_subject_adder5a);
                        stmt.executeUpdate(query_subject_adder5b);

                        stmt.executeUpdate(query_subject_adder6a);
                        stmt.executeUpdate(query_subject_adder6b);

                        stmt.executeUpdate(query_subject_adder7a);
                        stmt.executeUpdate(query_subject_adder7b);

                        stmt.executeUpdate(query_subject_adder8a);
                        stmt.executeUpdate(query_subject_adder8b);

                        stmt.executeUpdate(query_total_marks);
                        stmt.executeUpdate(query_obtained_marks);
                        stmt.executeUpdate(query_persentage);
                        stmt.executeUpdate(query_position);
                        break;
                    default:
                        break;
                }

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        
        deleting_result_gif.setVisible(false);
        editable();
        JOptionPane.showMessageDialog(null, "Successfully Deleted the Result From Class");

    }//GEN-LAST:event_Add_Button1ActionPerformed

    void non_editable()
    {
        
        //...........................................ADD OR DELETE TAB
        
        //add new result buttn
        CB_class123.setEnabled(false);
        CB_resulttype123.setEnabled(false);
        jButton13.setEnabled(false);
        CB_months.setEnabled(false);
        CB_weektype1.setEnabled(false);
        Add_Button.setEnabled(false);
        
        //delete result button
        CB_class124.setEnabled(false);
        CB_resulttype125.setEnabled(false);
        jButton14.setEnabled(false);
        CB_months2.setEnabled(false);
        CB_weektype3.setEnabled(false);
        Add_Button1.setEnabled(false);
        
        
        //...........................................SEARCH / PRINT RESULT TAB
        
        //class subtab
        CB_searchclass2.setEnabled(false);
        CB_resulttype124.setEnabled(false);
        jButton16.setEnabled(false);
        CB_months1.setEnabled(false);
        CB_weektype2.setEnabled(false);
        jButton2.setEnabled(false);
        jComboBox1.setEnabled(false);
        B_printresultlist.setEnabled(false);
 
        //Student subtab
        CB_searchclass1.setEnabled(false);
        jTextField26.setEnabled(false);
        jButton1.setEnabled(false);
        
        //...........................................MARKS ENTRY TAB
        
        //Monthly subtab
        CB_classmonthly.setEnabled(false);
        CB_monthsresultadd.setEnabled(false);
        CB_weektype.setEnabled(false);
        jButton6.setEnabled(false);
        jButton8.setEnabled(false);
        
        //Term1 subtab
        CB_classterm1.setEnabled(false);
        jButton7.setEnabled(false);
        jButton10.setEnabled(false);
        
        //Term2 subtab
        CB_classterm2.setEnabled(false);
        jButton9.setEnabled(false);
        jButton3.setEnabled(false);
        
        //Final Term subtab
        CB_classfinalterm.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        
    }
    
    void editable()
    {
        //...........................................ADD OR DELETE TAB
        
        //add new result buttn
        CB_class123.setEnabled(true);
        CB_resulttype123.setEnabled(true);
        jButton13.setEnabled(true);
        CB_months.setEnabled(true);
        CB_weektype1.setEnabled(true);
        Add_Button.setEnabled(true);
        
        //delete result button
        CB_class124.setEnabled(true);
        CB_resulttype125.setEnabled(true);
        jButton14.setEnabled(true);
        CB_months2.setEnabled(true);
        CB_weektype3.setEnabled(true);
        Add_Button1.setEnabled(true);
        
        
        //...........................................SEARCH / PRINT RESULT TAB
        
        //class subtab
        CB_searchclass2.setEnabled(true);
        CB_resulttype124.setEnabled(true);
        jButton16.setEnabled(true);
        CB_months1.setEnabled(true);
        CB_weektype2.setEnabled(true);
        jButton2.setEnabled(true);
        jComboBox1.setEnabled(true);
        B_printresultlist.setEnabled(true);
 
        //Student subtab
        CB_searchclass1.setEnabled(true);
        jTextField26.setEnabled(true);
        jButton1.setEnabled(true);
        
        //...........................................MARKS ENTRY TAB
        
        //Monthly subtab
        CB_classmonthly.setEnabled(true);
        CB_monthsresultadd.setEnabled(true);
        CB_weektype.setEnabled(true);
        jButton6.setEnabled(true);
        jButton8.setEnabled(true);
        
        //Term1 subtab
        CB_classterm1.setEnabled(true);
        jButton7.setEnabled(true);
        jButton10.setEnabled(true);
        
        //Term2 subtab
        CB_classterm2.setEnabled(true);
        jButton9.setEnabled(true);
        jButton3.setEnabled(true);
        
        //Final Term subtab
        CB_classfinalterm.setEnabled(true);
        jButton5.setEnabled(true);
        jButton4.setEnabled(true);
    }
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String Choose = jComboBox1.getSelectedItem().toString();

        result_printing_class objectresultprinting = new result_printing_class();

        String classname = CB_searchclass2.getSelectedItem().toString();
        String resulttype = CB_resulttype124.getSelectedItem().toString();
        String Week = CB_weektype2.getSelectedItem().toString();
        String Month1 = CB_months1.getSelectedItem().toString();

        String columnnamemonthly = null;

        if (null != Choose) {
            switch (Choose) {
                case "Total Class":

         
                    if ("Monthly".equals(resulttype)) {

                        columnnamemonthly = Month1 + "_" + Week + "_";

                        if ("Select Week".equals(Week)) {
                            JOptionPane.showMessageDialog(null, "Please Select the Week");
                        } else if ("Select Month".equals(Month1)) {
                            JOptionPane.showMessageDialog(null, "Please Select the Month");
                        } else {

                            String attendanceinfo11 = null;
                            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
                            try {

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                                ResultSet r1 = stmt.executeQuery();

                                while (r1.next()) {
                                    attendanceinfo11 = r1.getString("Total_Subjects");
                                    subject1_add = r1.getString("Subject_1");
                                    subject2_add = r1.getString("Subject_2");
                                    subject3_add = r1.getString("Subject_3");
                                    subject4_add = r1.getString("Subject_4");
                                    subject5_add = r1.getString("Subject_5");
                                    subject6_add = r1.getString("Subject_6");
                                    subject7_add = r1.getString("Subject_7");
                                    subject8_add = r1.getString("Subject_8");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                            int totalsubjects = Integer.parseInt(attendanceinfo11);
                            String query_upload_data = "select * from result_" + classname + " order by " + columnnamemonthly + "position ;";

                            try {

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                PreparedStatement stmt = con.prepareStatement(query_upload_data);
                                ResultSet r1 = stmt.executeQuery();

                                DefaultTableModel model2 = (DefaultTableModel) JT_searchresultclass.getModel();

                                //calling the function that add the columns in the Jtable
                                while (r1.next()) {
                                    String roll_no = r1.getString("Rollno");
                                    String name = r1.getString("Name");

                                    switch (totalsubjects) {
                                        case 3: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing3(resulttype12, classname, subject1_add, subject2_add, subject3_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 4: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing4(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 5: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing5(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 6: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing6(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, roll_no, name, sub2a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 7: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing7(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 8: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                            String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                                            String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing8(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, subject8_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        default:
                                            break;
                                    }

                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    } else {

                        columnnamemonthly = resulttype + "_";
                        String attendanceinfo11 = null;
                        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                            ResultSet r1 = stmt.executeQuery();

                            while (r1.next()) {
                                attendanceinfo11 = r1.getString("Total_Subjects");
                                subject1_add = r1.getString("Subject_1");
                                subject2_add = r1.getString("Subject_2");
                                subject3_add = r1.getString("Subject_3");
                                subject4_add = r1.getString("Subject_4");
                                subject5_add = r1.getString("Subject_5");
                                subject6_add = r1.getString("Subject_6");
                                subject7_add = r1.getString("Subject_7");
                                subject8_add = r1.getString("Subject_8");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        int totalsubjects = Integer.parseInt(attendanceinfo11);
                        String query_upload_data = "select * from result_" + classname + " order by " + columnnamemonthly + "position;";

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                            PreparedStatement stmt = con.prepareStatement(query_upload_data);
                            ResultSet r1 = stmt.executeQuery();

                            while (r1.next()) {
                                String roll_no = r1.getString("Rollno");
                                String name = r1.getString("Name");

                                switch (totalsubjects) {
                                    case 3: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing3(resulttype12, classname, subject1_add, subject2_add, subject3_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 4: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");
                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing4(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 5: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing5(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 6: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing6(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 7: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                        String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing7(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage, position1);

                                        break;
                                    }
                                    case 8: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                        String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                        String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                                        String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing8(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, subject8_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    default:
                                        break;
                                }

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }

                    JT_searchresultclass.setEnabled(false);

                    break;
                case "Selective Student":

                    String std_rollno = JOptionPane.showInputDialog("Enter the Roll no of the Student");

                    if ("Monthly".equals(resulttype)) {

                        columnnamemonthly = Month1 + "_" + Week + "_";

                        if ("Select Week".equals(Week)) {
                            JOptionPane.showMessageDialog(null, "Please Select the Week");
                        } else if ("Select Month".equals(Month1)) {
                            JOptionPane.showMessageDialog(null, "Please Select the Month");
                        } else {

                            String attendanceinfo11 = null;
                            String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
                            try {

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                                ResultSet r1 = stmt.executeQuery();

                                while (r1.next()) {
                                    attendanceinfo11 = r1.getString("Total_Subjects");
                                    subject1_add = r1.getString("Subject_1");
                                    subject2_add = r1.getString("Subject_2");
                                    subject3_add = r1.getString("Subject_3");
                                    subject4_add = r1.getString("Subject_4");
                                    subject5_add = r1.getString("Subject_5");
                                    subject6_add = r1.getString("Subject_6");
                                    subject7_add = r1.getString("Subject_7");
                                    subject8_add = r1.getString("Subject_8");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                            int totalsubjects = Integer.parseInt(attendanceinfo11);
                            String query_upload_data = "select * from result_" + classname + " where Rollno = '" + std_rollno + "';";

                            try {

                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                                PreparedStatement stmt = con.prepareStatement(query_upload_data);
                                ResultSet r1 = stmt.executeQuery();

                                DefaultTableModel model2 = (DefaultTableModel) JT_searchresultclass.getModel();

                                //calling the function that add the columns in the Jtable
                                while (r1.next()) {
                                    String roll_no = r1.getString("Rollno");
                                    String name = r1.getString("Name");

                                    switch (totalsubjects) {
                                        case 3: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing3(resulttype12, classname, subject1_add, subject2_add, subject3_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 4: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing4(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 5: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing5(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 6: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing6(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, roll_no, name, sub2a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 7: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing7(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        case 8: {
                                            String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                            String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                            String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                            String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                            String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                            String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                            String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                            String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                            String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                            String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                            String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                            String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                            String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                            String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                            String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                                            String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                                            String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                            String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                            String percentage = r1.getString(columnnamemonthly + "persentage");
                                            String position = r1.getString(columnnamemonthly + "position");

                                            String resulttype12 = Month1 + " " + Week;

                                            objectresultprinting.printing8(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, subject8_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage, position);
                                            break;
                                        }
                                        default:
                                            break;
                                    }

                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e);
                            }
                        }

                    } else {

                        columnnamemonthly = resulttype + "_";
                        String attendanceinfo11 = null;
                        String query_checking_noofsubjects = "select * from classes_record where Class_name = '" + classname + "';";
                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                            PreparedStatement stmt = con.prepareStatement(query_checking_noofsubjects);
                            ResultSet r1 = stmt.executeQuery();

                            while (r1.next()) {
                                attendanceinfo11 = r1.getString("Total_Subjects");
                                subject1_add = r1.getString("Subject_1");
                                subject2_add = r1.getString("Subject_2");
                                subject3_add = r1.getString("Subject_3");
                                subject4_add = r1.getString("Subject_4");
                                subject5_add = r1.getString("Subject_5");
                                subject6_add = r1.getString("Subject_6");
                                subject7_add = r1.getString("Subject_7");
                                subject8_add = r1.getString("Subject_8");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        int totalsubjects = Integer.parseInt(attendanceinfo11);
                        String query_upload_data = "select * from result_" + classname + " where Rollno = '" + std_rollno + "';";

                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                            PreparedStatement stmt = con.prepareStatement(query_upload_data);
                            ResultSet r1 = stmt.executeQuery();

                            while (r1.next()) {
                                String roll_no = r1.getString("Rollno");
                                String name = r1.getString("Name");

                                switch (totalsubjects) {
                                    case 3: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing3(resulttype12, classname, subject1_add, subject2_add, subject3_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 4: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");
                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing4(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 5: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;

                                        objectresultprinting.printing5(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 6: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing6(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    case 7: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                        String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing7(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, totalmarks, obtainedmarks, percentage, position1);

                                        break;
                                    }
                                    case 8: {
                                        String sub1a = r1.getString(columnnamemonthly + subject1_add + "_TM");
                                        String sub1b = r1.getString(columnnamemonthly + subject1_add + "_OM");
                                        String sub2a = r1.getString(columnnamemonthly + subject2_add + "_TM");
                                        String sub2b = r1.getString(columnnamemonthly + subject2_add + "_OM");
                                        String sub3a = r1.getString(columnnamemonthly + subject3_add + "_TM");
                                        String sub3b = r1.getString(columnnamemonthly + subject3_add + "_OM");
                                        String sub4a = r1.getString(columnnamemonthly + subject4_add + "_TM");
                                        String sub4b = r1.getString(columnnamemonthly + subject4_add + "_OM");
                                        String sub5a = r1.getString(columnnamemonthly + subject5_add + "_TM");
                                        String sub5b = r1.getString(columnnamemonthly + subject5_add + "_OM");
                                        String sub6a = r1.getString(columnnamemonthly + subject6_add + "_TM");
                                        String sub6b = r1.getString(columnnamemonthly + subject6_add + "_OM");
                                        String sub7a = r1.getString(columnnamemonthly + subject7_add + "_TM");
                                        String sub7b = r1.getString(columnnamemonthly + subject7_add + "_OM");
                                        String sub8a = r1.getString(columnnamemonthly + subject8_add + "_TM");
                                        String sub8b = r1.getString(columnnamemonthly + subject8_add + "_OM");
                                        String totalmarks = r1.getString(columnnamemonthly + "totalmarks");
                                        String obtainedmarks = r1.getString(columnnamemonthly + "obtainedmarks");
                                        String percentage = r1.getString(columnnamemonthly + "persentage");
                                        String position1 = r1.getString(columnnamemonthly + "position");

                                        String resulttype12 = resulttype;
                                        objectresultprinting.printing8(resulttype12, classname, subject1_add, subject2_add, subject3_add, subject4_add, subject5_add, subject6_add, subject7_add, subject8_add, roll_no, name, sub1a, sub1b, sub2a, sub2b, sub3a, sub3b, sub4a, sub4b, sub5a, sub5b, sub6a, sub6b, sub7a, sub7b, sub8a, sub8b, totalmarks, obtainedmarks, percentage, position1);
                                        break;
                                    }
                                    default:
                                        break;
                                }

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }

                    JT_searchresultclass.setEnabled(false);

                    break;
                case "Printing Result Cards":
                    JOptionPane.showMessageDialog(null, "pleaes select one option");
                    break;
                default:
                    break;
            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Add_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_ButtonMouseClicked
        
        deleting_result_gif.setVisible(true);
        
    }//GEN-LAST:event_Add_ButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Add_Button1;
    private javax.swing.JButton B_printresultlist;
    private javax.swing.JComboBox<String> CB_class123;
    private javax.swing.JComboBox<String> CB_class124;
    private javax.swing.JComboBox<String> CB_classfinalterm;
    private javax.swing.JComboBox<String> CB_classmonthly;
    private javax.swing.JComboBox<String> CB_classterm1;
    private javax.swing.JComboBox<String> CB_classterm2;
    private javax.swing.JComboBox<String> CB_months;
    private javax.swing.JComboBox<String> CB_months1;
    private javax.swing.JComboBox<String> CB_months2;
    private javax.swing.JComboBox<String> CB_monthsresultadd;
    private javax.swing.JComboBox<String> CB_resulttype123;
    private javax.swing.JComboBox<String> CB_resulttype124;
    private javax.swing.JComboBox<String> CB_resulttype125;
    private javax.swing.JComboBox<String> CB_searchclass1;
    private javax.swing.JComboBox<String> CB_searchclass2;
    private javax.swing.JComboBox<String> CB_weektype;
    private javax.swing.JComboBox<String> CB_weektype1;
    private javax.swing.JComboBox<String> CB_weektype2;
    private javax.swing.JComboBox<String> CB_weektype3;
    public javax.swing.JTable JT_finalterm;
    public javax.swing.JTable JT_searchresultclass;
    public javax.swing.JTable JT_searchresultstudent;
    private javax.swing.JTable Jtablemonthly;
    private javax.swing.JTabbedPane Printing;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel deleting_result_gif;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField26;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    // End of variables declaration//GEN-END:variables
}

package misc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Staff_Attendance extends javax.swing.JFrame {

    //Constructor
    public Staff_Attendance() {
        initComponents();

        combobox();
    }

    //.......................................................DECLARING VARIABLES START HERE........................................................................
    String Month1;//this variable recieves the currunt month
    int day1;//this variable recieves the current day
    int year1;//this variable recieves the current year
    int values1_a;
    String Approve = null;//this is the variable that checks that the table is in the database or no if yes then 
    //this variable value will be 'Approved' otherwise is 'Not_Approve'

    //.......................................................DECLARING VARIABLES ENDS HERE.................................................................................
    //........................................................BUTTONS CODING STARTS HERE...................................................................................
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_staffid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Lable_name = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TF_totalattendance = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TF_totalpresents = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TF_totalabsents = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_persentage = new javax.swing.JLabel();
        CB_monthsinfo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_attendanceinfo = new javax.swing.JTable();
        CB_stafftype = new javax.swing.JComboBox<>();
        date_lable = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        add_attendance = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_attendance = new javax.swing.JTable();
        date_lable1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Staff Attendance");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingstaffattendance(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Staff ID :");

        tf_staffid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_staffidActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Lable_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lable_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel14.setText("Total Attendance :");

        jLabel12.setText("Total Presents :");

        jLabel13.setText("Total Absents :");

        jLabel9.setText("Percentage:");

        CB_monthsinfo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month" }));
        CB_monthsinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_monthsinfoActionPerformed(evt);
            }
        });

        JTable_attendanceinfo.setAutoCreateRowSorter(true);
        JTable_attendanceinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_attendanceinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        JTable_attendanceinfo.setEditingColumn(5);
        jScrollPane1.setViewportView(JTable_attendanceinfo);

        CB_stafftype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff Type", "teacher", "non_teaching" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CB_stafftype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(TF_totalattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel12)
                                .addGap(32, 32, 32)
                                .addComponent(TF_totalpresents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(TF_totalabsents, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)
                                .addGap(32, 32, 32)
                                .addComponent(TF_persentage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CB_monthsinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                                .addComponent(Lable_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(CB_monthsinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_stafftype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lable_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_totalattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TF_totalpresents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_totalabsents, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TF_persentage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addGap(51, 51, 51)))
        );

        jTabbedPane1.addTab("Attendance Info", jPanel1);

        add_attendance.setText("Add");
        add_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_attendanceActionPerformed(evt);
            }
        });

        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Table_attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "ID", "Name", "Present", "Absent", "Leave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_attendanceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_attendance);
        if (Table_attendance.getColumnModel().getColumnCount() > 0) {
            Table_attendance.getColumnModel().getColumn(0).setResizable(false);
            Table_attendance.getColumnModel().getColumn(1).setResizable(false);
            Table_attendance.getColumnModel().getColumn(2).setResizable(false);
            Table_attendance.getColumnModel().getColumn(3).setResizable(false);
            Table_attendance.getColumnModel().getColumn(4).setResizable(false);
            Table_attendance.getColumnModel().getColumn(5).setResizable(false);
        }

        date_lable1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        date_lable1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout date_lableLayout = new javax.swing.GroupLayout(date_lable);
        date_lable.setLayout(date_lableLayout);
        date_lableLayout.setHorizontalGroup(
            date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_lableLayout.createSequentialGroup()
                .addGroup(date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(date_lableLayout.createSequentialGroup()
                        .addGroup(date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(date_lableLayout.createSequentialGroup()
                                .addGap(561, 561, 561)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(date_lableLayout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(add_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addGroup(date_lableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(date_lableLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(date_lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        date_lableLayout.setVerticalGroup(
            date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_lableLayout.createSequentialGroup()
                .addGroup(date_lableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(add_attendance)
                    .addComponent(date_lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Attendance", date_lable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Staff Attendance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        setSize(new java.awt.Dimension(966, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_staffidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_staffidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_staffidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int total_Leaves = 0;
        int total_Presents = 0;
        int total_Absents = 0;
        int total_Attendances = 0;
        float total_Persentage = 0;
        String Approve1 = "Not_Available";

        String stafftype = CB_stafftype.getSelectedItem().toString();//Check the Staff Type (Teaching Staff , Non Teaching Staff)
        String Staff_id = tf_staffid.getText();//this is the Staff id Which we want to search
        String get_months = CB_monthsinfo.getSelectedItem().toString();//Check the Month that Which Month we wnat to check the attendance
        String month_checker = "teacher_attendance_" + get_months + "_" + year1;//Sets the Tables Name according to the Calendar

        int i = 1;

        //Code to check that weather this table exist in the database or not
        String Query_table_cheker1 = "select * from tables_info;";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            PreparedStatement stmt = con.prepareStatement(Query_table_cheker1);
            ResultSet r1 = stmt.executeQuery();
            while (r1.next()) {
                String attendanceinfo = r1.getString("Attendance_Available_for_Month");

                if (attendanceinfo == null ? month_checker == null : attendanceinfo.equals(month_checker)) {
                    Approve1 = "Available";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //if the table is existed in the database 
        if ("Available".equals(Approve1)) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                Statement st = con.createStatement();
                DatabaseMetaData md2 = con.getMetaData();

                Clearrows_attendance_info();//this function clear the rows from the (table in attendance info tabbed Pane)

                for (int k = 0; k < 30; k++) {

                    ResultSet rs = md2.getColumns(null, null, month_checker, "Date_" + i);
                    if (rs.next()) {
                        DefaultTableModel model11 = (DefaultTableModel) JTable_attendanceinfo.getModel();
                        String Query_fetching_attendance = "select * from " + month_checker + " where Staff_id = '" + Staff_id + "' AND Staff_type = '" + stafftype + "';";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            PreparedStatement stmt = con.prepareStatement(Query_fetching_attendance);
                            ResultSet r1 = stmt.executeQuery();
                            int date_value = i;
                            while (r1.next()) {

                                String name = r1.getString("Name");
                                String Statuspora = r1.getString("Date_" + date_value);
                                total_Attendances++;

                                switch (Statuspora) {
                                    case "0":
                                        total_Absents++;
                                        break;
                                    case "1":
                                        total_Presents++;
                                        break;
                                    case "2":
                                        total_Leaves++;
                                        break;
                                    default:
                                        break;
                                }

                                String attendance = null;
                                if (null != Statuspora) {
                                    switch (Statuspora) {
                                        case "1":
                                            attendance = "Present                                                                ";
                                            break;
                                        case "0":
                                            attendance = "Absent                                                                 ";
                                            break;
                                        case "2":
                                            attendance = "Leave                                                                   ";
                                            break;
                                        default:
                                            break;
                                    }
                                }

                                model11.addRow(new Object[]{i + " " + get_months, attendance});

                                Lable_name.setText(name);
                                date_value++;

                            }//while ends

                            i++;

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    } else {
                        i++;
                    }
                }//for loop ends    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "This Month Attendance is Not Available");
        }

        total_Persentage = total_Presents * 100 / total_Attendances;

        TF_totalpresents.setText(Integer.toString(total_Presents));
        TF_totalabsents.setText(Integer.toString(total_Absents));
        TF_totalattendance.setText(Integer.toString(total_Attendances));
        TF_persentage.setText(Float.toString(total_Persentage));

        //function ends here
        int values1_a;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void add_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_attendanceActionPerformed

        String table_name = "teacher_attendance_" + Month1 + "_" + year1;

        Approve = "Not_Available";

        String Query_table_checker = "select * from tables_info;";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(Query_table_checker);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String attendanceinfo = r1.getString("Attendance_Available_for_Month");

                if (attendanceinfo == null ? table_name == null : attendanceinfo.equals(table_name)) {
                    Approve = "Available";
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Query4;
        String Query5 = null;
        String Query6 = null;

        if ("Available".equals(Approve)) {
            Query4 = "ALTER TABLE teacher_attendance_" + Month1 + "_" + year1 + " ADD Date_" + day1 + " Int default 1 ;";

        } else {
            Query4 = "create table teacher_attendance_" + Month1 + "_" + year1 + "(Staff_type varchar(225) not null, Staff_id int(11) not null , Name varchar(225) not null);";

            Query5 = "ALTER TABLE teacher_attendance_" + Month1 + "_" + year1 + " ADD Date_" + day1 + " Int default 1;";
            Query6 = "insert into tables_info(Attendance_Available_for_Month) Values('" + table_name + "');";
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(Query4);

            if ("Not_Available".equals(Approve)) {

                stmt.executeUpdate(Query5);
                stmt.executeUpdate(Query6);

                String Query_add_student = "select * from teacher_admission;";
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmtt = conn.prepareStatement(Query_add_student);
                    ResultSet r1 = stmtt.executeQuery();

                    while (r1.next()) {
                        String Studentinfo1 = r1.getString("teacher_id");
                        String Studentinfo3 = r1.getString("first_name");
                        String Studentinfo4 = r1.getString("Staff_type");
                        String Queryinsert1 = "insert into teacher_attendance_" + Month1 + "_" + year1 + "(Staff_type, Staff_id, Name) Values('" + Studentinfo4 + "', '" + Studentinfo1 + "', '" + Studentinfo3 + "');";

                        stmt.executeUpdate(Queryinsert1);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String Query_put_data_intable = "select * from teacher_attendance_" + Month1 + "_" + year1 + ";";

        DefaultTableModel model = (DefaultTableModel) Table_attendance.getModel();

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt = con.prepareStatement(Query_put_data_intable);
            ResultSet r1 = stmt.executeQuery();

            Clearrows_Table_attendance();

            while (r1.next()) {
                String attendancetype = r1.getString("Staff_type");
                String attendancerollno = r1.getString("Staff_id");
                String attendancename = r1.getString("Name");
                String attendancedate = r1.getString("Date_" + day1);

                String Presentornot = "P";
                if ("0".equals(attendancedate)) {
                    Presentornot = "A";
                } else if ("2".equals(attendancedate)) {
                    Presentornot = "L";
                }

                model.addRow(new Object[]{attendancetype, attendancerollno, attendancename, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        jButton3.setVisible(true);

        //function ends here
    }//GEN-LAST:event_add_attendanceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //Save button int the add attendance Tabbed Pane
        for (int i = 0; i < Table_attendance.getRowCount(); i++) {

            Object valuesp = Table_attendance.getValueAt(i, 3).toString();//present 
            Object valuesa = Table_attendance.getValueAt(i, 4).toString();//absent
            Object valuesl = Table_attendance.getValueAt(i, 5).toString();//leave

            String values2 = Table_attendance.getValueAt(i, 1).toString();//rollno
            String values3 = Table_attendance.getValueAt(i, 0).toString();//type

            //these if statements checks that weather the student present/absent or on leave
            if (valuesp == "true") {
                values1_a = 1;
            }
            if (valuesa == "true") {
                values1_a = 0;
            }
            if (valuesl == "true") {
                values1_a = 2;
            }
            //this is the query that changes the student present/absent/leave
            String Query_attendance_change = "UPDATE teacher_attendance_" + Month1 + "_" + year1 + " SET Date_" + day1 + " = '" + values1_a + "' where Staff_id = '" + values2 + "' AND Staff_type = '" + values3 + "';";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                java.sql.Statement stmt = con.createStatement();
                stmt.executeUpdate(Query_attendance_change);

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        JOptionPane.showMessageDialog(null, "Attendance Update Successfully");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CB_monthsinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_monthsinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_monthsinfoActionPerformed

    private void closingstaffattendance(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingstaffattendance
        dispose();
        Main_Page.jButton10.setEnabled(true);
    }//GEN-LAST:event_closingstaffattendance

    private void Table_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_attendanceMouseClicked

        int row = Table_attendance.getSelectedRow();
        int column = Table_attendance.getSelectedColumn();

        switch (column) {
            case 3:
                Table_attendance.setValueAt(Boolean.FALSE, row, 5);
                Table_attendance.setValueAt(Boolean.FALSE, row, 4);
                break;
            case 4:
                Table_attendance.setValueAt(Boolean.FALSE, row, 3);
                Table_attendance.setValueAt(Boolean.FALSE, row, 5);
                break;
            case 5:
                Table_attendance.setValueAt(Boolean.FALSE, row, 3);
                Table_attendance.setValueAt(Boolean.FALSE, row, 4);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_Table_attendanceMouseClicked

    //........................................................BUTTONS CODING ENDS HERE....................................................................................
    //.........................................................FUNCTION CODING STARTS HERE.............................................................................
    void combobox() {

        String Query4 = "select * from tables_info;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password

            PreparedStatement stmtt = con.prepareStatement(Query4);
            ResultSet r2 = stmtt.executeQuery();

            while (r2.next()) {
                String monthname = r2.getString("Attendance_Available_for_Month");

                int loop = 0;
                String studentorteacher = null;
                String month = null;

                for (String retval : monthname.split("_")) {

                    switch (loop) {
                        case 0:
                            studentorteacher = retval;
                            break;
                        case 2:
                            if ("teacher".equals(studentorteacher)) {
                                month = retval;
                                CB_monthsinfo.addItem(month);
                            }
                            break;
                        default:
                            break;
                    }
                    loop++;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//this function recieves the date from the Main page 
    void timerecieves1(String Month, int day, int year) {
        Month1 = Month;
        day1 = day;
        year1 = year;

        date_lable1.setText(day1 + " : " + Month1 + " : " + year1);
        jButton3.hide();
    }

    //this function clear the rows in attendance insertion jtable
    void Clearrows_Table_attendance() {

        //create connection with table in the Add attendance Tabbed Pane
        DefaultTableModel model1 = (DefaultTableModel) Table_attendance.getModel();

        //this is the loop that empty all the rows from the table
        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }
    }

    //this function clear the rows in the attendance shows jtable
    void Clearrows_attendance_info() {

        //create connection with table in the Add attendance Tabbed Pane
        DefaultTableModel model1 = (DefaultTableModel) JTable_attendanceinfo.getModel();

        //this is the loop that empty all the rows from the table
        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }
    }

    //...........................................................FUNCTIONS CODING ENDS HERE..................................................................................
    //..........................................................UN-TOUCHING CODING STARTS HERE...............................................................................
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
            java.util.logging.Logger.getLogger(Staff_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_monthsinfo;
    private javax.swing.JComboBox<String> CB_stafftype;
    private javax.swing.JTable JTable_attendanceinfo;
    private javax.swing.JLabel Lable_name;
    private javax.swing.JLabel TF_persentage;
    private javax.swing.JLabel TF_totalabsents;
    private javax.swing.JLabel TF_totalattendance;
    private javax.swing.JLabel TF_totalpresents;
    private javax.swing.JTable Table_attendance;
    private javax.swing.JButton add_attendance;
    private javax.swing.JPanel date_lable;
    private javax.swing.JLabel date_lable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tf_staffid;
    // End of variables declaration//GEN-END:variables
}

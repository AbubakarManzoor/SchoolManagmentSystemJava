package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Class Starts here
public class Add_notice1 extends javax.swing.JFrame {

    //Constructor
    public Add_notice1() {

        this.setIconImage(new ImageIcon(getClass().getResource("MISC_logo.png")).getImage());
        initComponents();

    }

    //..........................................................DECLARING VARIABLES START HERE...........................................................................................
    String event_id;
    String event_title;
    String event_start_date;
    String event_close_date;
    String event_start_time;
    String event_close_time;
    String event_incharge;
    String event_details;

    //.............................................................DECLARING VARIABLES ENDS HERE.......................................................................................
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TF_event_id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TF_close_date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_Event_details = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_Event_incharge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_Event_title = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TF_start_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TF_start_time = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TF_close_time = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notice_table = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingnoticeboard(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Add Notice");

        jLabel9.setText("Event ID :");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Event Title :");

        jLabel3.setText("Event Starting Date :");

        jLabel4.setText("Event Closing Date :");

        jLabel5.setText("Sarting time :");

        jLabel6.setText("Closing time :");

        jLabel7.setText("Event Incharge :");

        TF_start_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_start_timeActionPerformed(evt);
            }
        });

        jLabel8.setText("Event Details :");

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TF_event_id, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TF_Event_details, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TF_Event_incharge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TF_close_time, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TF_start_time, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TF_close_date, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TF_start_date)
                                .addComponent(TF_Event_title, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(360, 360, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_event_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_Event_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_start_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_close_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TF_start_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TF_close_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TF_Event_incharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TF_Event_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn)
                    .addComponent(update_btn)
                    .addComponent(add_btn))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Notice", jPanel1);

        notice_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "Tittle", "Starting Date", "Closing Date", "Starting Time", "Closing Time", "Incharge", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(notice_table);
        if (notice_table.getColumnModel().getColumnCount() > 0) {
            notice_table.getColumnModel().getColumn(0).setResizable(false);
            notice_table.getColumnModel().getColumn(1).setResizable(false);
            notice_table.getColumnModel().getColumn(2).setResizable(false);
            notice_table.getColumnModel().getColumn(3).setResizable(false);
            notice_table.getColumnModel().getColumn(4).setResizable(false);
            notice_table.getColumnModel().getColumn(5).setResizable(false);
            notice_table.getColumnModel().getColumn(6).setResizable(false);
            notice_table.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton26.setText("Refresh");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Notices", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1008, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed

        event_title = TF_Event_title.getText();
        event_id = TF_event_id.getText();
        event_start_date = TF_start_date.getText();
        event_close_date = TF_close_date.getText();
        event_start_time = TF_start_time.getText();
        event_close_time = TF_close_time.getText();
        event_incharge = TF_Event_incharge.getText();
        event_details = TF_Event_details.getText();

        int value1 = check_empty_values();
        
        if (value1 == 1) {
            data_insert_into_database();
            Set_field_to_empty();
            JOptionPane.showMessageDialog(null, "Data is INSERTED Successfully");
        }


    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        event_title = TF_Event_title.getText();
        event_id = TF_event_id.getText();
        event_start_date = TF_start_date.getText();
        event_close_date = TF_close_date.getText();
        event_start_time = TF_start_time.getText();
        event_close_time = TF_close_time.getText();
        event_incharge = TF_Event_incharge.getText();
        event_details = TF_Event_details.getText();
        check_empty_values();
        data_update_into_database();
        JOptionPane.showMessageDialog(null, "Data is UPDATED Successfully");
        Set_field_to_empty();

    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        event_id = TF_event_id.getText();
        String query1 = "DELETE from event_information where Event_id = '" + event_id + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(query1);

            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        JOptionPane.showMessageDialog(null, "Data is DELETED Successfully");
    }//GEN-LAST:event_delete_btnActionPerformed

    private void TF_start_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_start_timeActionPerformed

    }//GEN-LAST:event_TF_start_timeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        delete_btn.show();
        update_btn.show();
        add_btn.hide();
        String query_add_notice;

        event_id = TF_event_id.getText();
        query_add_notice = "Select * from event_information where Event_id= '" + event_id + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            PreparedStatement stmt = con.prepareStatement(query_add_notice);
            ResultSet r1 = stmt.executeQuery();

            r1.next();
            event_title = r1.getString("Event_title");
            event_start_date = r1.getString("Event_start_date");
            event_close_date = r1.getString("Event_close_date");
            event_start_time = r1.getString("Event_start_time");
            event_close_time = r1.getString("Event_close_time");
            event_incharge = r1.getString("Event_incharge");
            event_details = r1.getString("Event_details");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Record found");
        }
        set_values();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        show_into_noticeboard();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void closingnoticeboard(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingnoticeboard
        dispose();
        Main_Page.jButton26.setEnabled(true);
        Main_Page.show_notice_board();
    }//GEN-LAST:event_closingnoticeboard

    //.........................................................FUNCTIONS VARIABLES START HERE....................................................................................
    //this function show the fetched data in the jtable 
    void show_into_noticeboard() {
        DefaultTableModel model = (DefaultTableModel) notice_table.getModel();

        Clearrows_notices_info();
        String query_fetch_notices = "select * from event_information";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            PreparedStatement stmt = con.prepareStatement(query_fetch_notices);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String id = r1.getString("Event_id");
                String tittle = r1.getString("Event_title");
                String startdate = r1.getString("Event_start_date");
                String closedate = r1.getString("Event_close_date");
                String starttime = r1.getString("Event_start_time");
                String closetime = r1.getString("Event_close_time");
                String incharge = r1.getString("Event_incharge");
                String details = r1.getString("Event_details");

                model.addRow(new Object[]{id, tittle, startdate, closedate, starttime, closetime, incharge, details});

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Record found");
        }
    }

    //this function clear the rows in the jtable for new insertion
    void Clearrows_notices_info() {

        //create connection with table in the Add attendance Tabbed Pane
        DefaultTableModel model1 = (DefaultTableModel) notice_table.getModel();

        //this is the loop that empty all the rows from the table
        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }
    }

    //this function inserts the data into the database
    void data_insert_into_database() {

        String query_add_notice;

        query_add_notice = "insert into event_information(Event_id, Event_title, Event_start_date, Event_close_date, Event_start_time, Event_close_time, Event_incharge, Event_details) values('" + event_id + "','" + event_title + "','" + event_start_date + "','" + event_close_date + "','" + event_start_time + "','" + event_close_time + "','" + event_incharge + "','" + event_details + "');";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(query_add_notice);

            JOptionPane.showMessageDialog(null, "Data is Inserted");

            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //this function set all the fields to empty
    void Set_field_to_empty() {
        //Setting all the text field to empty
        TF_event_id.setText("");
        TF_close_date.setText("");
        TF_Event_details.setText("");

        TF_Event_incharge.setText("");
        TF_Event_title.setText("");
        TF_start_date.setText("");
        TF_start_time.setText("");
        TF_close_time.setText("");

    }

    //this function checks the empty values in the text fields
    int check_empty_values() {

        int value = 0;
        if ("".equals(event_id)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Event ID field");
        } else if ("".equals(event_title)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Event Title");
        } else if ("".equals(event_start_date)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Event Starting Date");
        } else if ("".equals(event_start_time)) {
            JOptionPane.showMessageDialog(null, "Please enter Event Starting Time");
        } else if ("".equals(event_close_date)) {
            JOptionPane.showMessageDialog(null, "Please enter Event Closing Date");
        } else if ("".equals(event_close_time)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Event Cloasing Time");
        } else if ("".equals(event_incharge)) {
            JOptionPane.showMessageDialog(null, "Pleaes Enter Event Incharge Name");
        } else {
            value = 1;
        }
        return value;
    }

    //this function update the data in the database
    void data_update_into_database() {

        String query_add_notice;
        String query1 = "UPDATE event_information SET Event_title = '" + event_title + "' where Event_id = '" + event_id + "';";
        String query2 = "UPDATE event_information SET Event_start_date = '" + event_start_date + "' where Event_id = '" + event_id + "';";
        String query3 = "UPDATE event_information SET Event_close_date = '" + event_close_date + "' where Event_id = '" + event_id + "';";
        String query4 = "UPDATE event_information SET Event_start_time = '" + event_start_time + "' where Event_id = '" + event_id + "';";
        String query5 = "UPDATE event_information SET Event_close_time = '" + event_close_time + "' where Event_id = '" + event_id + "';";
        String query6 = "UPDATE event_information SET Event_incharge = '" + event_incharge + "' where Event_id = '" + event_id + "';";
        String query7 = "UPDATE event_information SET Event_details = '" + event_details + "' where Event_id = '" + event_id + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query4);
            stmt.executeUpdate(query5);
            stmt.executeUpdate(query6);
            stmt.executeUpdate(query7);

            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //this functions set the set variables values to filds
    void set_values() {
        TF_Event_title.setText(event_title);
        TF_start_date.setText(event_start_date);
        TF_close_date.setText(event_close_date);
        TF_start_time.setText(event_start_time);
        TF_close_time.setText(event_close_time);
        TF_Event_incharge.setText(event_incharge);
        TF_Event_details.setText(event_details);

    }

    //this function hide some buttons
    void hiding() {
        delete_btn.hide();
        update_btn.hide();
    }

    //...........................................................FUNCTIONS VARIABLES ENDS HERE..............................................................................
    //...........................................................UN-TOUCHING CODING START HERE............................................................................................
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
            java.util.logging.Logger.getLogger(Add_notice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_notice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_notice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_notice1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Add_notice1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_Event_details;
    private javax.swing.JTextField TF_Event_incharge;
    private javax.swing.JTextField TF_Event_title;
    private javax.swing.JTextField TF_close_date;
    private javax.swing.JTextField TF_close_time;
    private javax.swing.JTextField TF_event_id;
    private javax.swing.JTextField TF_start_date;
    private javax.swing.JTextField TF_start_time;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable notice_table;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}

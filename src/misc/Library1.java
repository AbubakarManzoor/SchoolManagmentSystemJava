package misc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Library1 extends javax.swing.JFrame {

    //Constructor
    public Library1() {
        initComponents();
        
        
    }
    
    
    //..................................................DECLARING VARIABLES STARTS HERE................................................................................................
    
    
    String book_id;//variable for book id
    String book_title;//variable for book tittle
    String book_author;//varirable for book author
    String book_copy_avail;//variable for total number of copies available in the liberary
    String book_isbn;//variable for book ISBN number 

    
    //.....................................................DECLARING VARIABLES ENDS HERE...............................................................................................................
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TF_book_isbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        TF_author = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_title_of_book = new javax.swing.JTextField();
        TF_book_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_copy_avail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        book_table = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closinglibrary(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Library");

        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        jLabel3.setText("ISBN No :");

        jLabel2.setText("Title of book :");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        jLabel5.setText("Book ID :");

        jLabel4.setText("Book Copies Available :");

        jLabel6.setText("Author :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Add or Remove Book");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TF_author)
                            .addComponent(TF_title_of_book)
                            .addComponent(TF_book_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_book_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jButton2))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(delete_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_btn)
                                .addGap(64, 64, 64)
                                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TF_copy_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(246, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(365, 365, 365))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TF_book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2))
                    .addComponent(TF_title_of_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TF_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_book_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_copy_avail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_btn)
                    .addComponent(add_btn)
                    .addComponent(delete_btn))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Add Book", jPanel1);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Book Info");

        book_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tittle", "Author", "ISBN", "Copies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(book_table);
        if (book_table.getColumnModel().getColumnCount() > 0) {
            book_table.getColumnModel().getColumn(0).setResizable(false);
            book_table.getColumnModel().getColumn(1).setResizable(false);
            book_table.getColumnModel().getColumn(2).setResizable(false);
            book_table.getColumnModel().getColumn(3).setResizable(false);
            book_table.getColumnModel().getColumn(4).setResizable(false);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Book Info", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
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
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(966, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        delete_btn.show();
        update_btn.show();
        add_btn.hide();
        String query_add_notice;

        book_id = TF_book_id.getText();
        query_add_notice = "Select * from Library where Book_id= '" + book_id + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            PreparedStatement stmt = con.prepareStatement(query_add_notice);
            ResultSet r1 = stmt.executeQuery();

            r1.next();
            book_title = r1.getString("Book_title");
            book_author = r1.getString("Book_author");
            book_copy_avail = r1.getString("Book_copy_avail");
            book_isbn = r1.getString("Book_isbn");

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Record found");
        }
        set_values();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        book_id = TF_book_id.getText();
        book_title = TF_title_of_book.getText();
        book_author = TF_author.getText();
        book_isbn = TF_book_isbn.getText();
        book_copy_avail = TF_copy_avail.getText();
        data_insert_into_database();
        Set_field_to_empty();
        JOptionPane.showMessageDialog(null, "Data is INSERTED Successfully");
        show_into_noticeboard();
    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        book_id = TF_book_id.getText();
        book_title = TF_title_of_book.getText();
        book_author = TF_author.getText();
        book_isbn = TF_book_isbn.getText();
        book_copy_avail = TF_copy_avail.getText();
        check_empty_values();
        data_update_into_database();
        Set_field_to_empty();
        show_into_noticeboard();
        JOptionPane.showMessageDialog(null, "Data is UPDATED Successfully");
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        book_id = TF_book_id.getText();
        String query1 = "DELETE from Library where Book_id = '" + book_id + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmt = con.createStatement();
            stmt.executeUpdate(query1);


            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, "Data is DELETED Successfully");
    }//GEN-LAST:event_delete_btnActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        //calling this function in constructor so that the data that is addes will be show immediately
        show_into_noticeboard();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void closinglibrary(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closinglibrary
        dispose();
        Main_Page.jButton11.setEnabled(true);
    }//GEN-LAST:event_closinglibrary

    
    
    //.............................................................FUNCTION DEFINATION STARTS HERE......................................................................................
    
    
    //this function clear the rows in liberary info 
    void Clearrows_liberary_info() {

        DefaultTableModel model1 = (DefaultTableModel) book_table.getModel();

        while (model1.getRowCount() > 0) {
            for (int i = 0; i < model1.getRowCount(); i++) {
                model1.removeRow(i);
            }
        }

    }

    //this function show data in the table 
    void show_into_noticeboard() {

        DefaultTableModel model1 = (DefaultTableModel) book_table.getModel();

        Clearrows_liberary_info();
        String query_fetch_notices = "select * from library";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            PreparedStatement stmt = con.prepareStatement(query_fetch_notices);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String id = r1.getString("Book_id");
                String tittle = r1.getString("Book_title");
                String author = r1.getString("Book_author");
                String isbn = r1.getString("Book_isbn");
                String copies = r1.getString("Book_copy_avail");

                model1.addRow(new Object[]{id, tittle, author, isbn, copies});

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //this function hide the buttons and fields 
    void hiding() {
        delete_btn.hide();
        update_btn.hide();
    }

    //this function insert the data in the database
    void data_insert_into_database() {

        String query_add_notice;

        query_add_notice = "insert into Library(Book_id, Book_title, Book_author, Book_isbn, Book_copy_avail) values('" + book_id + "','" + book_title + "','" + book_author + "','" + book_isbn + "','" + book_copy_avail + "');";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmt = con.createStatement();
            stmt.executeUpdate(query_add_notice);

            

            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //this function update the data in the database
    void data_update_into_database() {

        String query1 = "UPDATE Library SET Book_title = '" + book_title + "' where Book_id = '" + book_id + "';";
        String query2 = "UPDATE Library SET Book_author = '" + book_author + "' where Book_id = '" + book_id + "';";
        String query3 = "UPDATE Library SET Book_isbn = '" + book_isbn + "' where Book_id = '" + book_id + "';";
        String query4 = "UPDATE Library SET Book_copy_avail = '" + book_copy_avail + "' where Book_id = '" + book_id + "';";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query4);
            JOptionPane.showMessageDialog(null, "Data is Inserted");

            Set_field_to_empty();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //this function set values to test field 
    void set_values() {
        TF_title_of_book.setText(book_title);
        TF_author.setText(book_author);
        TF_copy_avail.setText(book_copy_avail);
        TF_book_isbn.setText(book_isbn);
    }

    void Set_field_to_empty() {
        TF_book_id.setText("");
        TF_title_of_book.setText("");
        TF_author.setText("");
        TF_book_isbn.setText("");
        TF_copy_avail.setText("");
    }

    void check_empty_values() {
        if ("".equals(book_id)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Book ID field");
        } else if ("".equals(book_title)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Book Title");
        } else if ("".equals(book_author)) {
            JOptionPane.showMessageDialog(null, "Pleaes enter Book Author Name");
        } else if ("".equals(book_isbn)) {
            JOptionPane.showMessageDialog(null, "Please enter Book ISBN number");
        } else if ("".equals(book_copy_avail)) {
            JOptionPane.showMessageDialog(null, "Please enter Book Copies Available");
        } else {
        }
    }

    
    //..........................................................FUNCTION DEFINATION ENDS HERE...........................................................................................
    
    
    
    
    
    //...........................................................UN-TOUCHING CODING STARTS HERE.........................................................................................
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
            java.util.logging.Logger.getLogger(Library1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_author;
    private javax.swing.JTextField TF_book_id;
    private javax.swing.JTextField TF_book_isbn;
    private javax.swing.JTextField TF_copy_avail;
    private javax.swing.JTextField TF_title_of_book;
    private javax.swing.JButton add_btn;
    private javax.swing.JTable book_table;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}

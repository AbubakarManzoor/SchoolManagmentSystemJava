package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.security.spec.*;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main_Page extends javax.swing.JFrame {

    //.........................................................DELARING VARIABLES STARTS HERE................................................................................................................
    int mainvalue = 0;
    int timeRun = 0;
    int hour;
    int min;
    int sec;
    int AM_PM;
    int day;
    int month;
    int year;
    int weekday;
    String Month = null;

    //.........................................................DELARING VARIABLES ENDS HERE................................................................................................................
    //Constructor
    public Main_Page(String username) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("MISC_logo.png")).getImage());

        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();

                    hour = cal.get(Calendar.HOUR);
                    min = cal.get(Calendar.MINUTE);
                    sec = cal.get(Calendar.SECOND);
                    AM_PM = cal.get(Calendar.AM_PM);
                    day = cal.get(Calendar.DAY_OF_MONTH);
                    month = cal.get(Calendar.MONTH);
                    year = cal.get(Calendar.YEAR);
                    weekday = cal.get(Calendar.DAY_OF_WEEK);

                    String day_night = null;
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    switch (month) {
                        case 0:
                            Month = "Jan";
                            break;
                        case 1:
                            Month = "Feb";
                            break;
                        case 2:
                            Month = "Mar";
                            break;
                        case 3:
                            Month = "apr";
                            break;
                        case 4:
                            Month = "May";
                            break;
                        case 5:
                            Month = "June";
                            break;
                        case 6:
                            Month = "July";
                            break;
                        case 7:
                            Month = "Aug";
                            break;
                        case 8:
                            Month = "Sep";
                            break;
                        case 9:
                            Month = "Oct";
                            break;
                        case 10:
                            Month = "Nov";
                            break;
                        case 11:
                            Month = "Dec";
                            break;
                        default:
                            System.out.println("other month not accpeted");
                    }

                    String time = hour + ":" + min + ":" + sec + " " + day_night;
                    String date = day + ":" + Month + ":" + year;
                    Clock.setText(time);
                    Date.setText(date);

                }
            }
        }.start();

        jLabel6.setText("Hi, " + username);

        //getting total number of students and staff admin user and total number of classes
        functiongettingtotals();
        show_notice_board();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        resultbutton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        Clock = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lable_admin = new javax.swing.JLabel();
        lable_students = new javax.swing.JLabel();
        Lable_classes = new javax.swing.JLabel();
        lable_employees = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        B_developers = new javax.swing.JButton();
        B_setting = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pakistan Model High School");
        setMinimumSize(new java.awt.Dimension(1024, 786));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingmainpage(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/pin.jpg"))); // NOI18N
        jLabel3.setText("Admin Dashboard");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 178, 34));

        jButton2.setBackground(new java.awt.Color(51, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Student.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 120, 172, 90));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Teaching_staff.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 172, 90));

        resultbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Result.png"))); // NOI18N
        resultbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resultbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultbuttonMouseExited(evt);
            }
        });
        resultbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resultbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 120, 172, 90));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Accounts.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 120, 172, 90));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/NonTeaching_staff.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 120, 172, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/St_attendance.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 224, 172, 90));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Stf_attendance.png"))); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 224, 172, 90));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Library.png"))); // NOI18N
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 224, 172, 90));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/About.png"))); // NOI18N
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1121, 224, 172, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 550, 280));

        jPanel3.setBackground(new java.awt.Color(0, 0, 59));

        jLabel4.setBackground(new java.awt.Color(0, 0, 59));
        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Notice Board");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 357, -1, -1));

        panel1.setBackground(new java.awt.Color(0, 0, 59));
        panel1.setPreferredSize(new java.awt.Dimension(100, 50));

        Clock.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 255, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Date.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton25.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Log Out");
        jButton25.setBorder(null);
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("|");
        jButton27.setBorder(null);
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton28.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("|");
        jButton28.setBorder(null);
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/arrow_down.png"))); // NOI18N
        jButton29.setBorder(null);
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton29FocusGained(evt);
            }
        });
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton29MouseExited(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clock, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(632, 632, 632)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/new design logoUntitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Button 4.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Button 1.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Button 2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Button 3.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, -1, -1));

        lable_admin.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        lable_admin.setForeground(new java.awt.Color(51, 51, 51));
        lable_admin.setText("5");
        getContentPane().add(lable_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 605, 60, -1));

        lable_students.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        lable_students.setForeground(new java.awt.Color(51, 51, 51));
        lable_students.setText("5");
        getContentPane().add(lable_students, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 525, 60, -1));

        Lable_classes.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        Lable_classes.setForeground(new java.awt.Color(51, 51, 51));
        Lable_classes.setText("5");
        getContentPane().add(Lable_classes, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 375, 60, -1));

        lable_employees.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        lable_employees.setForeground(new java.awt.Color(51, 51, 51));
        lable_employees.setText("5");
        getContentPane().add(lable_employees, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 445, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Total Numer Of Classes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 400, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Total Numer Of Students");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Total Numer Of Admin User");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 630, 180, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Total Numer Of Employees");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 470, 180, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 340, 54));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 340, 54));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 340, 54));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 340, 54));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Student");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Teaching Staff");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Non-Teaching Staff");
        jButton14.setBorder(null);
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Result");
        jButton15.setBorder(null);
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Accounts");
        jButton16.setBorder(null);
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Students Attendence");
        jButton17.setBorder(null);
        jButton17.setContentAreaFilled(false);
        jButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Staff Attendance");
        jButton18.setBorder(null);
        jButton18.setContentAreaFilled(false);
        jButton18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Library");
        jButton19.setBorder(null);
        jButton19.setContentAreaFilled(false);
        jButton19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Notice Board");
        jButton20.setBorder(null);
        jButton20.setContentAreaFilled(false);
        jButton20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 81, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Settings");
        jButton22.setBorder(null);
        jButton22.setContentAreaFilled(false);
        jButton22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("About");
        jButton24.setBorder(null);
        jButton24.setContentAreaFilled(false);
        jButton24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        B_developers.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        B_developers.setForeground(new java.awt.Color(0, 0, 153));
        B_developers.setText("Developers");
        B_developers.setBorder(null);
        B_developers.setContentAreaFilled(false);
        B_developers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_developers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_developersActionPerformed(evt);
            }
        });
        getContentPane().add(B_developers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, 70, -1));

        B_setting.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        B_setting.setForeground(new java.awt.Color(0, 0, 153));
        B_setting.setText("Settings");
        B_setting.setBorder(null);
        B_setting.setContentAreaFilled(false);
        B_setting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_settingActionPerformed(evt);
            }
        });
        getContentPane().add(B_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 50, -1));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/Notice.png"))); // NOI18N
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton26MouseExited(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 224, 172, 90));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/white.jpg"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 100, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/logo_mainScreen.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 47, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 59));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/dash_board_theme.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/maxresdefault.jpg"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 1170, 690));

        setSize(new java.awt.Dimension(1382, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //.............................................................BUTTONS CODING STARTS HERE................................................................................................................
    //teaching staff
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setEnabled(false);
        Teacher_form obj = new Teacher_form();
        obj.timereciever(Month, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setEnabled(false);

        Student_form obj11 = new Student_form();
        obj11.datereciever(Month, year);
        obj11.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void resultbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultbuttonActionPerformed

        resultbutton.setEnabled(false);
        Result obj = new Result();
        obj.timerecieves(Month, day, year);
        obj.hidding();
        obj.setVisible(true);

    }//GEN-LAST:event_resultbuttonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setEnabled(false);
        Account_Frame obj = new Account_Frame();
        obj.functionreciever(Month, day, year);
        obj.hidding();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setEnabled(false);
        Non_teaching_form obj = new Non_teaching_form();
        obj.timereciever3(Month, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setEnabled(false);
        Student_Attendance obj = new Student_Attendance();
        obj.timerecieves(Month, day, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setEnabled(false);
        Staff_Attendance obj = new Staff_Attendance();
        obj.timerecieves1(Month, day, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Student_hover.png"));
        jButton2.setIcon(ico);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Student.png"));
        jButton2.setIcon(ico);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Teaching_staff_hover.png"));
        jButton6.setIcon(ico);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Teaching_staff.png"));
        jButton6.setIcon(ico);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("NonTeaching_staff_hover.png"));
        jButton9.setIcon(ico);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("NonTeaching_staff.png"));
        jButton9.setIcon(ico);
    }//GEN-LAST:event_jButton9MouseExited

    private void resultbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultbuttonMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Result_hover.png"));
        resultbutton.setIcon(ico);
    }//GEN-LAST:event_resultbuttonMouseEntered

    private void resultbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultbuttonMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Result.png"));
        resultbutton.setIcon(ico);
    }//GEN-LAST:event_resultbuttonMouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Accounts_hover.png"));
        jButton8.setIcon(ico);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Accounts.png"));
        jButton8.setIcon(ico);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("St_attendance_hover.png"));
        jButton3.setIcon(ico);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("St_attendance.png"));
        jButton3.setIcon(ico);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Stf_attendance_hover.png"));
        jButton10.setIcon(ico);
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Stf_attendance.png"));
        jButton10.setIcon(ico);
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Library_hover.png"));
        jButton11.setIcon(ico);
    }//GEN-LAST:event_jButton11MouseEntered

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Library.png"));
        jButton11.setIcon(ico);
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("About_hover.png"));
        jButton12.setIcon(ico);
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("About.png"));
        jButton12.setIcon(ico);
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Settingss_Frame obj = new Settingss_Frame();
        obj.autohiding1();
        obj.show_into_classestable();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton29FocusGained

    }//GEN-LAST:event_jButton29FocusGained

    private void B_developersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_developersActionPerformed
        About_Frame objectdevelopers = new About_Frame();
        objectdevelopers.setVisible(true);
    }//GEN-LAST:event_B_developersActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseEntered

    }//GEN-LAST:event_jButton29MouseEntered

    private void jButton29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseExited

    }//GEN-LAST:event_jButton29MouseExited

    private void jButton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseClicked
        B_developers.setVisible(true);
        B_setting.setVisible(true);
        jLabel23.setVisible(true);
    }//GEN-LAST:event_jButton29MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setEnabled(false);
        Library1 objectlib = new Library1();
        objectlib.hiding();
        objectlib.show_into_noticeboard();
        objectlib.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        jButton12.setEnabled(false);
        About objectabout = new About();
        objectabout.setVisible(true);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("Notice_hover.png"));
        jButton26.setIcon(ico);
    }//GEN-LAST:event_jButton26MouseEntered

    private void jButton26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("Notice.png"));
        jButton26.setIcon(ico);
    }//GEN-LAST:event_jButton26MouseExited

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton26.setEnabled(false);
        Add_notice1 objectnot = new Add_notice1();
        objectnot.hiding();
        objectnot.setVisible(true);
        objectnot.show_into_noticeboard();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void closingmainpage(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingmainpage


    }//GEN-LAST:event_closingmainpage

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        dispose();
        Login_Frame objectlogin = new Login_Frame();
        objectlogin.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void B_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_settingActionPerformed
        Settingss_Frame objectsettings = new Settingss_Frame();
        objectsettings.setVisible(true);
    }//GEN-LAST:event_B_settingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Student_form obj11 = new Student_form();
        obj11.datereciever(Month, year);
        obj11.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Teacher_form obj = new Teacher_form();
        obj.timereciever(Month, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Non_teaching_form obj = new Non_teaching_form();
        obj.timereciever3(Month, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Result obj = new Result();
        obj.timerecieves(Month, day, year);
        obj.hidding();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Account_Frame obj = new Account_Frame();
        obj.functionreciever(Month, day, year);
        obj.hidding();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Student_Attendance obj = new Student_Attendance();
        obj.timerecieves(Month, day, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Staff_Attendance obj = new Staff_Attendance();
        obj.timerecieves1(Month, day, year);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Library1 objectlib = new Library1();
        objectlib.hiding();
        objectlib.show_into_noticeboard();
        objectlib.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        About objectabout = new About();
        objectabout.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton26.setEnabled(false);
        Add_notice1 objectnot = new Add_notice1();
        objectnot.hiding();
        objectnot.setVisible(true);
        objectnot.show_into_noticeboard();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        B_developers.hide();
        B_setting.hide();
        jLabel23.hide();

    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered


    }//GEN-LAST:event_jLabel18MouseEntered

    //.............................................................BUTTONS CODING ENDS HERE................................................................................................................
    //.........................................................FUNCTIONS DEFINITION STARTS HERE................................................................................................................
    public static void functioncalling1() {
        functiongettingtotals();
        show_notice_board();
    }

    public static void functiongettingtotals() {

        int totalemployees = 0;
        int total_students = 0;
        int total_classes = 0;
        int total_admin = 0;

        String Query1 = "select * from teacher_admission;";//total employess
        String Query2 = "select * from student_admission;";//total students
        String Query3 = "select * from classes_record;";//total classes
        String Query4 = "select * from login_table;";//total admin user

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

            PreparedStatement stmt1 = con.prepareStatement(Query1);
            ResultSet r1 = stmt1.executeQuery();

            PreparedStatement stmt2 = con.prepareStatement(Query2);
            ResultSet r2 = stmt2.executeQuery();

            PreparedStatement stmt3 = con.prepareStatement(Query3);
            ResultSet r3 = stmt3.executeQuery();

            PreparedStatement stmt4 = con.prepareStatement(Query4);
            ResultSet r4 = stmt4.executeQuery();

            while (r1.next()) {
                totalemployees++;
            }
            while (r2.next()) {
                total_students++;
            }
            while (r3.next()) {
                total_classes++;
            }
            while (r4.next()) {
                total_admin++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        String totalemployees1 = "" + totalemployees;
        String total_students1 = "" + total_students;
        String total_classes1 = "" + total_classes;
        String total_admin1 = "" + total_admin;

        lable_employees.setText(totalemployees1);
        lable_students.setText(total_students1);
        Lable_classes.setText(total_classes1);
        lable_admin.setText(total_admin1);

    }

    public static void show_notice_board() {
        DefaultTableModel model123 = (DefaultTableModel) jTable1.getModel();

        while (model123.getRowCount() > 0) {
            for (int i = 0; i < model123.getRowCount(); i++) {
                model123.removeRow(i);
            }
        }

        String query_fetch_notices = "select * from event_information";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            PreparedStatement stmt = con.prepareStatement(query_fetch_notices);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {

                String tittle = r1.getString("Event_title");
                String startdate = r1.getString("Event_start_date");

                model123.addRow(new Object[]{tittle, startdate});

            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void functioncalling() {

        B_setting.hide();
        B_developers.hide();
        jLabel23.hide();

        if (day == 1 && day == 2 && day == 3) {
            monthlyfeesgenerator(Month);
            teachersalaryadder(Month);
        }
        if (day > 10) {
        }

    }

    void teachersalaryadder(String Month) {

        String Query = "alter table salary add salary_" + Month + "_bonas Int default 0;";
        String Query1 = "alter table salary add salaryyy_" + Month + "_fine Int default 0;";
        String Query2 = "alter table salary add salary_" + Month + "_grandtotal Int default 0;";
        String Query3 = "alter table salary add salary_" + Month + "_givendate Int default 0;";
        String Query4 = "alter table salary add salary_" + Month + "_recyesornot Int default 0;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmtt = conn.createStatement();

            stmtt.executeUpdate(Query);
            stmtt.executeUpdate(Query1);
            stmtt.executeUpdate(Query2);
            stmtt.executeUpdate(Query3);
            stmtt.executeUpdate(Query4);

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        JOptionPane.showConfirmDialog(null, "added");
    }

    void monthlyfeesgenerator(String Month) {

        String feesgenerator = "select * from classes_record;";

        
        
        String Query_fees = "insert into fees_record(fees_name) values('" + Month + "');";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            java.sql.Statement stmttt = connn.createStatement();

            stmttt.executeUpdate(Query_fees);

            connn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            PreparedStatement stmt = con.prepareStatement(feesgenerator);
            ResultSet r1 = stmt.executeQuery();

            while (r1.next()) {
                String classname = r1.getString("Class_name");
                String totalfees = r1.getString("Total_fees");

                String Query = "alter table fees_" + classname + " add TF_" + Month + " Int default " + totalfees + ";";
                String Query1 = "alter table fees_" + classname + " add SF_" + Month + " Int default 0;";
                String Query2 = "alter table fees_" + classname + " add D_" + Month + " Int default 0;";
                String Query3 = "alter table fees_" + classname + " add F_" + Month + " Int default 0;";
                String Query4 = "alter table fees_" + classname + " add LDate_" + Month + " varchar(225) default 'none';";
                String Query5 = "alter table fees_" + classname + " add SDate_" + Month + " varchar(225) default 'none';";
                String Query6 = "UPDATE fees_" + classname + " SET LDate_" + Month + " = '10-" + Month + "-" + year + "';";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    java.sql.Statement stmtt = conn.createStatement();

                    stmtt.executeUpdate(Query);
                    stmtt.executeUpdate(Query1);
                    stmtt.executeUpdate(Query2);
                    stmtt.executeUpdate(Query3);
                    stmtt.executeUpdate(Query4);
                    stmtt.executeUpdate(Query5);
                    stmtt.executeUpdate(Query6);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        JOptionPane.showMessageDialog(null, "Fees Addes Successfully");
    }

    //.........................................................FUNCTIONS DEFINITION ENDS HERE................................................................................................................
    //.........................................................UN-TOUCHING CODING STARTS HERE................................................................................................................
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
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Page("Abubak").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_developers;
    private javax.swing.JButton B_setting;
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    public static javax.swing.JLabel Lable_classes;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    public static javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    public static javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JLabel lable_admin;
    public static javax.swing.JLabel lable_employees;
    public static javax.swing.JLabel lable_students;
    private java.awt.Panel panel1;
    public static javax.swing.JButton resultbutton;
    // End of variables declaration//GEN-END:variables
}

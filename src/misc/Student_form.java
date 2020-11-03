package misc;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

//Class
public class Student_form extends javax.swing.JFrame {

    //Constructor
    public Student_form() {
        this.setIconImage(new ImageIcon(getClass().getResource("MISC_logo.png")).getImage());
        initComponents();
        combobox();
    }

//.............................................................VARIABLE DECLARING STARTS HERE........................................................................
    int year2;
    String month2;

    String Class1;
    String Roll_no1;
    String form_no;
    String Session;
    String Roll_no;
    String Date;
    String First_Name;
    String Last_Name;
    String C_B_Fromno;
    String DOB;
    String Father_Name;
    String Father_Occupation;
    String Father_CNIC;
    String Religion;
    String Contact_home;
    String Mobile;
    String Postel_Adress;
    String Permanent_Adress;
    String Tehsil;
    String District;
    String Elective_subject;
    String Picture_address;

    String admissionfee;
    String monthlyfee;
    String cardfee;
    String badgefee;
    String booksfee;
    String uniformfee;
    String otherfee;
    String totalfee;

//.............................................................VARIABLES DECLARATIONS ENDS HERE.......................................................................
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TF_otherfee = new javax.swing.JTextField();
        TF_bookfee = new javax.swing.JTextField();
        TF_cardfee = new javax.swing.JTextField();
        TF_admissionfee = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        TF_totalfee = new javax.swing.JTextField();
        TF_uniformfee = new javax.swing.JTextField();
        TF_badgefee = new javax.swing.JTextField();
        TF_monthlyfee = new javax.swing.JTextField();
        gif = new javax.swing.JLabel();
        gif2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_rollno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CB_class = new javax.swing.JComboBox<>();
        TF_firstname = new javax.swing.JTextField();
        TF_lastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF_candidate_bform = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TF_dob = new javax.swing.JFormattedTextField();
        TF_fathersname = new javax.swing.JTextField();
        TF_fathers_cnic = new javax.swing.JTextField();
        TF_fathers_occupation = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TF_religion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TF_contact_home = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TF_mobile = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TF_postal_address = new javax.swing.JTextField();
        TF_permanent_address = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TF_tehsil = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TF_district = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        TF_formno = new javax.swing.JTextField();
        TF_session = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TF_admissiondate = new javax.swing.JFormattedTextField();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lbl_Image1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TF_otherfee1 = new javax.swing.JTextField();
        TF_bookfee1 = new javax.swing.JTextField();
        TF_cardfee1 = new javax.swing.JTextField();
        TF_admissionfee1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        TF_totalfee1 = new javax.swing.JTextField();
        TF_uniformfee1 = new javax.swing.JTextField();
        TF_badgefee1 = new javax.swing.JTextField();
        TF_monthlyfee1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TF_elective_subject = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Admission Fees :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Fee Card :");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Fee Books :");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("Other/Reg.Fee :");

        TF_otherfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_otherfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_otherfee.setText("0");
        TF_otherfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_otherfeeFocusLost(evt);
            }
        });

        TF_bookfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_bookfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_bookfee.setText("0");
        TF_bookfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_bookfeeFocusLost(evt);
            }
        });

        TF_cardfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_cardfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_cardfee.setText("0");
        TF_cardfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_cardfeeFocusLost(evt);
            }
        });
        TF_cardfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_cardfeeActionPerformed(evt);
            }
        });

        TF_admissionfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_admissionfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_admissionfee.setText("0");
        TF_admissionfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_admissionfeeFocusLost(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Monthly Fees :");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Fee Badge :");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("Fee Uniform :");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Total :");

        TF_totalfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_totalfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TF_uniformfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_uniformfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_uniformfee.setText("0");
        TF_uniformfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_uniformfeeFocusLost(evt);
            }
        });

        TF_badgefee.setForeground(new java.awt.Color(153, 153, 153));
        TF_badgefee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_badgefee.setText("0");
        TF_badgefee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_badgefeeFocusLost(evt);
            }
        });

        TF_monthlyfee.setForeground(new java.awt.Color(153, 153, 153));
        TF_monthlyfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_monthlyfee.setText("0");
        TF_monthlyfee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_monthlyfeeFocusLost(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Information");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowclosing(evt);
            }
        });
        getContentPane().setLayout(null);

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/loader.gif"))); // NOI18N
        getContentPane().add(gif);
        gif.setBounds(370, 130, 140, 80);

        gif2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/gif 950,550.png"))); // NOI18N
        getContentPane().add(gif2);
        gif2.setBounds(0, 160, 970, 310);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Class :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 40, 20);

        TF_rollno.setForeground(new java.awt.Color(102, 102, 102));
        TF_rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_rollnoActionPerformed(evt);
            }
        });
        getContentPane().add(TF_rollno);
        TF_rollno.setBounds(215, 80, 70, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Roll No :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 80, 50, 20);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 80, 70, 22);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("First Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 160, 70, 17);

        CB_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_classActionPerformed(evt);
            }
        });
        getContentPane().add(CB_class);
        CB_class.setBounds(60, 80, 90, 20);

        TF_firstname.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_firstname);
        TF_firstname.setBounds(150, 160, 171, 20);

        TF_lastname.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_lastname);
        TF_lastname.setBounds(460, 160, 171, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Last Name :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 160, 68, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Father's  Name :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 220, 93, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Father's  CNIC :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 220, 93, 17);

        TF_candidate_bform.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_candidate_bform);
        TF_candidate_bform.setBounds(150, 190, 171, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Candidate B Form :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 190, 109, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("DOB :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 190, 35, 17);

        TF_dob.setForeground(new java.awt.Color(102, 102, 102));
        TF_dob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TF_dob);
        TF_dob.setBounds(460, 190, 171, 20);

        TF_fathersname.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_fathersname);
        TF_fathersname.setBounds(150, 220, 171, 20);

        TF_fathers_cnic.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_fathers_cnic);
        TF_fathers_cnic.setBounds(460, 220, 171, 20);

        TF_fathers_occupation.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_fathers_occupation);
        TF_fathers_occupation.setBounds(150, 250, 171, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Father's Occupation : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 250, 125, 17);

        TF_religion.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_religion);
        TF_religion.setBounds(460, 250, 171, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Religion");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(360, 250, 45, 17);

        TF_contact_home.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_contact_home);
        TF_contact_home.setBounds(150, 280, 171, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Contact (Home) : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 280, 102, 17);

        TF_mobile.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_mobile);
        TF_mobile.setBounds(460, 280, 171, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Mobile : ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 280, 49, 17);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Postal Address :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 310, 91, 17);

        TF_postal_address.setForeground(new java.awt.Color(102, 102, 102));
        TF_postal_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_postal_addressActionPerformed(evt);
            }
        });
        getContentPane().add(TF_postal_address);
        TF_postal_address.setBounds(150, 310, 480, 20);

        TF_permanent_address.setForeground(new java.awt.Color(102, 102, 102));
        TF_permanent_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_permanent_addressActionPerformed(evt);
            }
        });
        getContentPane().add(TF_permanent_address);
        TF_permanent_address.setBounds(150, 340, 480, 20);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Permanent Address :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 340, 117, 17);

        TF_tehsil.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_tehsil);
        TF_tehsil.setBounds(150, 370, 171, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Tehsil :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 370, 41, 17);

        TF_district.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_district);
        TF_district.setBounds(460, 370, 171, 20);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(770, 500, 75, 25);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("District :");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(360, 370, 49, 17);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Form No :");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(20, 130, 60, 17);

        TF_formno.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_formno);
        TF_formno.setBounds(83, 130, 60, 20);

        TF_session.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_session);
        TF_session.setBounds(202, 130, 60, 20);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Session :");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(148, 130, 50, 17);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel31.setText("Admission Date:");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(268, 130, 100, 17);

        TF_admissiondate.setForeground(new java.awt.Color(102, 102, 102));
        TF_admissiondate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TF_admissiondate);
        TF_admissiondate.setBounds(370, 130, 90, 20);

        panel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(panel1);
        panel1.setBounds(20, 110, 905, 10);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 900, 70);

        jButton5.setText("New Admission");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(790, 80, 103, 25);

        lbl_Image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lbl_Image1);
        lbl_Image1.setBounds(770, 150, 140, 160);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 500, 70, 23);

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(780, 330, 120, 23);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Admission Fees :");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 400, 110, 20);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Fee Card :");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 430, 110, 20);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel36.setText("Fee Books :");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(20, 460, 110, 20);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel37.setText("Other/Reg.Fee :");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(20, 490, 110, 20);

        TF_otherfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_otherfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_otherfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_otherfee1FocusLost(evt);
            }
        });
        TF_otherfee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_otherfee1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF_otherfee1);
        TF_otherfee1.setBounds(150, 490, 171, 20);

        TF_bookfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_bookfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_bookfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_bookfee1FocusLost(evt);
            }
        });
        getContentPane().add(TF_bookfee1);
        TF_bookfee1.setBounds(150, 460, 171, 20);

        TF_cardfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_cardfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_cardfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_cardfee1FocusLost(evt);
            }
        });
        TF_cardfee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_cardfee1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF_cardfee1);
        TF_cardfee1.setBounds(150, 430, 171, 20);

        TF_admissionfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_admissionfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_admissionfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_admissionfee1FocusLost(evt);
            }
        });
        getContentPane().add(TF_admissionfee1);
        TF_admissionfee1.setBounds(150, 400, 171, 20);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel38.setText("Monthly Fees :");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(360, 400, 90, 20);

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel39.setText("Fee Badge :");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(360, 430, 90, 20);

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel40.setText("Fee Uniform :");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(360, 460, 90, 20);

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel41.setText("Total :");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(360, 490, 80, 20);

        TF_totalfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_totalfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TF_totalfee1);
        TF_totalfee1.setBounds(460, 490, 171, 20);

        TF_uniformfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_uniformfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_uniformfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_uniformfee1FocusLost(evt);
            }
        });
        getContentPane().add(TF_uniformfee1);
        TF_uniformfee1.setBounds(460, 460, 171, 20);

        TF_badgefee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_badgefee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_badgefee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_badgefee1FocusLost(evt);
            }
        });
        getContentPane().add(TF_badgefee1);
        TF_badgefee1.setBounds(460, 430, 171, 20);

        TF_monthlyfee1.setForeground(new java.awt.Color(153, 153, 153));
        TF_monthlyfee1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TF_monthlyfee1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_monthlyfee1FocusLost(evt);
            }
        });
        getContentPane().add(TF_monthlyfee1);
        TF_monthlyfee1.setBounds(460, 400, 171, 20);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misc/950, 550 Background.jpg"))); // NOI18N
        jLabel33.setText("jLabel16");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(0, 0, 950, 550);

        TF_elective_subject.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(TF_elective_subject);
        TF_elective_subject.setBounds(150, 560, 171, 20);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Elective Subject :");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(30, 510, 100, 17);

        setSize(new java.awt.Dimension(956, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//........................................................BUTTONS CODING STARTS HERE................................................................................

    private void CB_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_classActionPerformed

    private void TF_rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_rollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_rollnoActionPerformed

    private void TF_postal_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_postal_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_postal_addressActionPerformed

    private void TF_permanent_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_permanent_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_permanent_addressActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        dispose();
        Main_Page.jButton2.setEnabled(false);
        new_admission_form obj = new new_admission_form();
        obj.hiding();
        obj.datereciever(month2, year2);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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

        CB_class.setEnabled(false);
        TF_rollno.setEnabled(false);
        jButton1.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);

        gif.setVisible(true);
        gif2.setVisible(true);

        Class1 = CB_class.getSelectedItem().toString();
        Roll_no1 = TF_rollno.getText();

        if ("None".equals(Class1)) {
            JOptionPane.showMessageDialog(null, "Select the Class");
        }
        if ("".equals(Roll_no1)) {
            JOptionPane.showMessageDialog(null, "Enter the Roll No");
        }
        if (!"None".equals(Class1) && !"".equals(Roll_no1)) {

            int foundornot = student_found_or_not(Class1, Roll_no1);

            if (foundornot == 1) {

                String query1;
                String query2;

                query1 = "select * from student_admission where class = '" + Class1 + "' and roll_no = '" + Roll_no1 + "';";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                    //here sonoo is database name, root is username and password

                    PreparedStatement stmt = con.prepareStatement(query1);
                    ResultSet r1 = stmt.executeQuery();

                    r1.next();

                    form_no = r1.getString("form_no");
                    Session = r1.getString("session");
                    Date = r1.getString("date");
                    First_Name = r1.getString("first_name");
                    Last_Name = r1.getString("last_name");
                    C_B_Fromno = r1.getString("c_b_form_no");
                    DOB = r1.getString("dob");
                    Father_Name = r1.getString("fathers_name");
                    Father_CNIC = r1.getString("fathers_cnic");
                    Father_Occupation = r1.getString("fathers_occupation");
                    Religion = r1.getString("religion");
                    Contact_home = r1.getString("contact_home");
                    Mobile = r1.getString("mobile");
                    Postel_Adress = r1.getString("postal_address");
                    Permanent_Adress = r1.getString("permanent_address");
                    Tehsil = r1.getString("tehsil");
                    District = r1.getString("district");
                    Elective_subject = r1.getString("elective_subject");
                    Picture_address = r1.getString("pic_address");
                    con.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                query2 = "select * from fees_" + Class1 + " where Rollno = '" + Roll_no1 + "';";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");

                    PreparedStatement stmtt = conn.prepareStatement(query2);
                    ResultSet r2 = stmtt.executeQuery();
                    r2.next();

                    admissionfee = r2.getString("admission");
                    monthlyfee = r2.getString("monthly");
                    cardfee = r2.getString("card");
                    badgefee = r2.getString("badge");
                    booksfee = r2.getString("book");
                    uniformfee = r2.getString("uniform");
                    otherfee = r2.getString("other");
                    totalfee = r2.getString("total");

                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }

                put_values_to_textfields();

            } else {
                JOptionPane.showMessageDialog(null, "Student not Found");
            }
        }

        CB_class.setEnabled(true);
        TF_rollno.setEnabled(true);
        jButton1.setEnabled(true);
        jButton5.setEnabled(true);
        jButton4.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

        gif.setVisible(false);
        gif2.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    void update_into_database() {

        Picture_address = Picture_address.replace("\\", "\\\\");

        String query1 = "UPDATE student_admission SET session = '" + Session + "' where form_no = '" + form_no + "';";
        String query2 = "UPDATE student_admission SET first_name = '" + First_Name + "' where form_no = '" + form_no + "';";
        String query3 = "UPDATE student_admission SET last_name = '" + Last_Name + "' where form_no = '" + form_no + "';";
        String query4 = "UPDATE student_admission SET c_b_form_no = '" + C_B_Fromno + "' where form_no = '" + form_no + "';";
        String query5 = "UPDATE student_admission SET dob = '" + DOB + "' where form_no = '" + form_no + "';";
        String query6 = "UPDATE student_admission SET fathers_name = '" + Father_Name + "' where form_no = '" + form_no + "';";
        String query7 = "UPDATE student_admission SET fathers_cnic = '" + Father_CNIC + "' where form_no = '" + form_no + "';";
        String query8 = "UPDATE student_admission SET fathers_occupation = '" + Father_Occupation + "' where form_no = '" + form_no + "';";
        String query9 = "UPDATE student_admission SET contact_home = '" + Contact_home + "' where form_no = '" + form_no + "';";
        String query10 = "UPDATE student_admission SET mobile = '" + Mobile + "' where form_no = '" + form_no + "';";
        String query11 = "UPDATE student_admission SET postal_address = '" + Postel_Adress + "' where form_no = '" + form_no + "';";
        String query12 = "UPDATE student_admission SET permanent_address = '" + Permanent_Adress + "' where form_no = '" + form_no + "';";
        String query14 = "UPDATE student_admission SET tehsil = '" + Tehsil + "' where form_no = '" + form_no + "';";
        String query15 = "UPDATE student_admission SET district = '" + District + "' where form_no = '" + form_no + "';";
        String query16 = "UPDATE student_admission SET elective_subject = '" + Elective_subject + "' where form_no = '" + form_no + "';";
        String query17 = "UPDATE student_admission SET pic_address = '" + Picture_address + "' where form_no = '" + form_no + "';";

        String query_fees_table = " UPDATE Fees_" + Class1 + " SET Name = '" + First_Name + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table1 = " UPDATE Fees_" + Class1 + " SET admission = '" + admissionfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table2 = " UPDATE Fees_" + Class1 + " SET monthly = '" + monthlyfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table3 = " UPDATE Fees_" + Class1 + " SET card = '" + cardfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table4 = " UPDATE Fees_" + Class1 + " SET badge = '" + badgefee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table5 = " UPDATE Fees_" + Class1 + " SET book = '" + booksfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table6 = " UPDATE Fees_" + Class1 + " SET uniform = '" + uniformfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table7 = " UPDATE Fees_" + Class1 + " SET other = '" + otherfee + "' where Rollno = '" + Roll_no1 + "';";
        String query_fees_table8 = " UPDATE Fees_" + Class1 + " SET total = '" + totalfee + "' where Rollno = '" + Roll_no1 + "';";

        String query_result_table = "UPDATE Result_" + Class1 + " SET Name = '" + First_Name + "'  where Rollno = '" + Roll_no1 + "';";
        String query_attendance_table = "UPDATE attendance_" + month2 + "_" + year2 + " SET Name = '" + First_Name + "' where Class = '" + Class1 + "' AND Roll_no = '" + Roll_no1 + "';";

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
            stmt.executeUpdate(query8);
            stmt.executeUpdate(query9);
            stmt.executeUpdate(query10);
            stmt.executeUpdate(query11);
            stmt.executeUpdate(query12);
            stmt.executeUpdate(query14);
            stmt.executeUpdate(query15);
            stmt.executeUpdate(query16);
            stmt.executeUpdate(query17);

            stmt.executeUpdate(query_fees_table);
            stmt.executeUpdate(query_fees_table1);
            stmt.executeUpdate(query_fees_table2);
            stmt.executeUpdate(query_fees_table3);
            stmt.executeUpdate(query_fees_table4);
            stmt.executeUpdate(query_fees_table5);
            stmt.executeUpdate(query_fees_table6);
            stmt.executeUpdate(query_fees_table7);
            stmt.executeUpdate(query_fees_table8);

            stmt.executeUpdate(query_result_table);
            stmt.executeUpdate(query_attendance_table);

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void get_values_from_database() {

        form_no = TF_formno.getText();
        Session = TF_session.getText();
        Date = TF_admissiondate.getText();
        First_Name = TF_firstname.getText();
        Last_Name = TF_lastname.getText();
        C_B_Fromno = TF_candidate_bform.getText();
        DOB = TF_dob.getText();
        Father_Name = TF_fathersname.getText();
        Father_CNIC = TF_fathers_cnic.getText();
        Father_Occupation = TF_fathers_occupation.getText();
        Religion = TF_religion.getText();
        Contact_home = TF_contact_home.getText();
        Mobile = TF_mobile.getText();
        Postel_Adress = TF_postal_address.getText();
        Permanent_Adress = TF_permanent_address.getText();
        Tehsil = TF_tehsil.getText();
        District = TF_district.getText();
        Elective_subject = TF_elective_subject.getText();

        admissionfee = TF_admissionfee1.getText();
        monthlyfee = TF_monthlyfee1.getText();
        cardfee = TF_cardfee1.getText();
        badgefee = TF_badgefee1.getText();
        booksfee = TF_bookfee1.getText();
        uniformfee = TF_uniformfee1.getText();
        otherfee = TF_otherfee1.getText();
        totalfee = TF_totalfee1.getText();

    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        CB_class.setEnabled(false);
        TF_rollno.setEnabled(false);
        jButton1.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);

        gif.setVisible(true);
        gif2.setVisible(true);

        int choose = JOptionPane.showConfirmDialog(null, "Are you sure you want to Update this Student's Data");

        switch (choose) {
            case 0:
                get_values_from_database();
                update_into_database();
                Set_field_to_empty();
                JOptionPane.showMessageDialog(null, "The Data of Student " + First_Name + " is Updated");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "The Data is not Updated");
                break;

            case 2:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error 404");
        }

        CB_class.setEnabled(true);
        TF_rollno.setEnabled(true);
        jButton1.setEnabled(true);
        jButton5.setEnabled(true);
        jButton4.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

        gif.setVisible(false);
        gif2.setVisible(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    public void Set_field_to_empty() {
        //Setting all the text field to empty
        TF_session.setText("");
        TF_rollno.setText("");
        TF_admissiondate.setText("");
        TF_firstname.setText("");
        TF_lastname.setText("");
        TF_fathers_cnic.setText("");
        TF_fathersname.setText("");
        TF_formno.setText("");
        TF_candidate_bform.setText("");
        TF_religion.setText("");
        TF_dob.setText("");
        TF_fathers_occupation.setText("");
        TF_contact_home.setText("");
        TF_mobile.setText("");
        TF_tehsil.setText("");
        TF_district.setText("");
        TF_postal_address.setText("");
        TF_permanent_address.setText("");
        TF_elective_subject.setText("");
        lbl_Image1.setIcon(null);

        TF_admissionfee1.setText("");
        TF_monthlyfee1.setText("");
        TF_cardfee1.setText("");
        TF_badgefee1.setText("");
        TF_bookfee1.setText("");
        TF_uniformfee1.setText("");
        TF_otherfee1.setText("");
        TF_totalfee1.setText("");

    }


    private void windowclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowclosing

        dispose();
        Main_Page.jButton2.setEnabled(true);
        Main_Page.functioncalling1();

    }//GEN-LAST:event_windowclosing

    void student_deletion() {
        String Classdel = CB_class.getSelectedItem().toString();
        String Roll_nodel = TF_rollno.getText();

        String query1 = "DELETE from student_admission where class = '" + Classdel + "' AND roll_no = '" + Roll_nodel + "';";
        String query2 = "DELETE from attendance_" + month2 + "_" + year2 + " where Class = '" + Classdel + "' AND Roll_no = '" + Roll_nodel + "';";
        String query3 = "DELETE from Fees_" + Classdel + " where Rollno = '" + Roll_nodel + "';";
        String query4 = "DELETE from Result_" + Classdel + " where Rollno = '" + Roll_nodel + "';";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
            //here sonoo is database name, root is username and password
            java.sql.Statement stmt = con.createStatement();

            stmt.executeUpdate(query1);
            stmt.executeUpdate(query4);
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query2);

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        CB_class.setEnabled(false);
        TF_rollno.setEnabled(false);
        jButton1.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);

        gif.setVisible(true);
        gif2.setVisible(true);

        int choose = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete this Student's Data");

        switch (choose) {
            case 0:
                student_deletion();
                Set_field_to_empty();
                JOptionPane.showMessageDialog(null, "The Data of Student is Deleted");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "The Data is not Deleted");
                break;

            case 2:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error 404");
        }

        CB_class.setEnabled(true);
        TF_rollno.setEnabled(true);
        jButton1.setEnabled(true);
        jButton5.setEnabled(true);
        jButton4.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);

        gif.setVisible(false);
        gif2.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    String imgPath1 = null;
    String path1 = null;

    //this is the fucntion that resize the image 
    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lbl_Image1.getWidth(), lbl_Image1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);

        return image;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Imges", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);

        int result = file.showSaveDialog(null);
        //if the user click on save in JFileChoose
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();

            path1 = selectedFile.getAbsolutePath();
            lbl_Image1.setIcon(ResizeImage(path1, null));
            Picture_address = path1;

            path1 = path1.replace("\\", "\\\\");

        } //if the user click on save in Jfilechooser
        else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "No File Selected");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void TF_otherfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_otherfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_otherfeeFocusLost

    private void TF_bookfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_bookfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_bookfeeFocusLost

    private void TF_cardfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_cardfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_cardfeeFocusLost

    private void TF_cardfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_cardfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_cardfeeActionPerformed

    private void TF_admissionfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_admissionfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + " Rs";
        TF_totalfee.setText(totalfee2);
    }//GEN-LAST:event_TF_admissionfeeFocusLost

    private void TF_uniformfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_uniformfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_uniformfeeFocusLost

    private void TF_badgefeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_badgefeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_badgefeeFocusLost

    private void TF_monthlyfeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_monthlyfeeFocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);
    }//GEN-LAST:event_TF_monthlyfeeFocusLost

    private void TF_otherfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_otherfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_otherfee1FocusLost

    private void TF_bookfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_bookfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_bookfee1FocusLost

    private void TF_cardfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_cardfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_cardfee1FocusLost

    private void TF_cardfee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_cardfee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_cardfee1ActionPerformed

    private void TF_admissionfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_admissionfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + " Rs";
        TF_totalfee.setText(totalfee2);
    }//GEN-LAST:event_TF_admissionfee1FocusLost

    private void TF_uniformfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_uniformfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_uniformfee1FocusLost

    private void TF_badgefee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_badgefee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);        // TODO add your handling code here:
    }//GEN-LAST:event_TF_badgefee1FocusLost

    private void TF_monthlyfee1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_monthlyfee1FocusLost

        String admissionfee1 = TF_admissionfee.getText();
        int admissionfee2 = Integer.parseInt(admissionfee1);

        String monthlyfee1 = TF_monthlyfee.getText();
        int monthlyfee2 = Integer.parseInt(monthlyfee1);

        String cardfee1 = TF_cardfee.getText();
        int cardfee2 = Integer.parseInt(cardfee1);

        String badgefee1 = TF_badgefee.getText();
        int badgefee2 = Integer.parseInt(badgefee1);

        String booksfee1 = TF_bookfee.getText();
        int booksfee2 = Integer.parseInt(booksfee1);

        String uniformfee1 = TF_uniformfee.getText();
        int uniformfee2 = Integer.parseInt(uniformfee1);

        String otherfee1 = TF_otherfee.getText();
        int otherfee2 = Integer.parseInt(otherfee1);

        int totalfee1 = admissionfee2 + monthlyfee2 + cardfee2 + badgefee2 + booksfee2 + uniformfee2 + otherfee2;

        String totalfee2 = totalfee1 + "";
        TF_totalfee.setText(totalfee2);
    }//GEN-LAST:event_TF_monthlyfee1FocusLost

    private void TF_otherfee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_otherfee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_otherfee1ActionPerformed

//........................................................BUTTONS CODING ENDS HERE.........................................................................
//.........................................................FUNCTIONS DEFINITION STARTS HERE...................................................................................
    void datereciever(String month3, int year3) {

        //CB_class.setEnabled(false);
        gif.setVisible(false);
        gif2.setVisible(false);
        month2 = month3;
        year2 = year3;
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
                CB_class.addItem(name);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void put_values_to_textfields() {
        TF_formno.setText(form_no);
        TF_session.setText(Session);
        TF_admissiondate.setText(Date);
        TF_firstname.setText(First_Name);
        TF_lastname.setText(Last_Name);
        TF_candidate_bform.setText(C_B_Fromno);
        TF_dob.setText(DOB);
        TF_fathersname.setText(Father_Name);
        TF_fathers_cnic.setText(Father_CNIC);
        TF_fathers_occupation.setText(Father_Occupation);
        TF_religion.setText(Religion);
        TF_contact_home.setText(Contact_home);
        TF_mobile.setText(Mobile);
        TF_postal_address.setText(Postel_Adress);
        TF_permanent_address.setText(Permanent_Adress);
        TF_tehsil.setText(Tehsil);
        TF_district.setText(District);
        TF_elective_subject.setText(Elective_subject);

        lbl_Image1.setIcon(ResizeImage(Picture_address, null));

        TF_admissionfee1.setText(admissionfee);
        TF_monthlyfee1.setText(monthlyfee);
        TF_cardfee1.setText(cardfee);
        TF_badgefee1.setText(badgefee);
        TF_bookfee1.setText(booksfee);
        TF_uniformfee1.setText(uniformfee);
        TF_otherfee1.setText(otherfee);
        TF_totalfee1.setText(totalfee);

    }

//...........................................................FUNCTIONS DEFINITION ENDS HERE...............................................................................
    //.........................................................UN-TOUCHING CODING STARTS HERE...............................................................................................
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
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_class;
    private javax.swing.JFormattedTextField TF_admissiondate;
    private javax.swing.JTextField TF_admissionfee;
    private javax.swing.JTextField TF_admissionfee1;
    private javax.swing.JTextField TF_badgefee;
    private javax.swing.JTextField TF_badgefee1;
    private javax.swing.JTextField TF_bookfee;
    private javax.swing.JTextField TF_bookfee1;
    private javax.swing.JTextField TF_candidate_bform;
    private javax.swing.JTextField TF_cardfee;
    private javax.swing.JTextField TF_cardfee1;
    private javax.swing.JTextField TF_contact_home;
    private javax.swing.JTextField TF_district;
    private javax.swing.JFormattedTextField TF_dob;
    private javax.swing.JTextField TF_elective_subject;
    private javax.swing.JTextField TF_fathers_cnic;
    private javax.swing.JTextField TF_fathers_occupation;
    private javax.swing.JTextField TF_fathersname;
    private javax.swing.JTextField TF_firstname;
    private javax.swing.JTextField TF_formno;
    private javax.swing.JTextField TF_lastname;
    private javax.swing.JTextField TF_mobile;
    private javax.swing.JTextField TF_monthlyfee;
    private javax.swing.JTextField TF_monthlyfee1;
    private javax.swing.JTextField TF_otherfee;
    private javax.swing.JTextField TF_otherfee1;
    private javax.swing.JTextField TF_permanent_address;
    private javax.swing.JTextField TF_postal_address;
    private javax.swing.JTextField TF_religion;
    private javax.swing.JTextField TF_rollno;
    private javax.swing.JTextField TF_session;
    private javax.swing.JTextField TF_tehsil;
    private javax.swing.JTextField TF_totalfee;
    private javax.swing.JTextField TF_totalfee1;
    private javax.swing.JTextField TF_uniformfee;
    private javax.swing.JTextField TF_uniformfee1;
    private javax.swing.JLabel gif;
    private javax.swing.JLabel gif2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_Image1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}

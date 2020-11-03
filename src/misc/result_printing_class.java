package misc;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPRow;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class result_printing_class {

    int day;
    int month;
    int year;
    int timeRun = 0;
    String Month;
    String todaydate;
    
    //constructor
    result_printing_class() {

        
        
        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();

                    day = cal.get(Calendar.DAY_OF_MONTH);
                    month = cal.get(Calendar.MONTH);
                    year = cal.get(Calendar.YEAR);
                    
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

                    todaydate = day + ":" + Month + ":" + year;
          
                }
            }
        }.start();

        
    }

    private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18,
            Font.NORMAL, BaseColor.WHITE);
    private static Font headFont = new Font(Font.FontFamily.HELVETICA, 15,
            Font.BOLD);
    private static Font mainFont = new Font(Font.FontFamily.HELVETICA, 16,
            Font.NORMAL);
    private static Font normFont = new Font(Font.FontFamily.HELVETICA, 12,
            Font.NORMAL);
    private static Font normBFont = new Font(Font.FontFamily.HELVETICA, 12,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallFont = new Font(Font.FontFamily.HELVETICA, 10,
            Font.NORMAL);
    private static Font smallBold = new Font(Font.FontFamily.HELVETICA, 10,
            Font.BOLD);
    private static Font smallBold1 = new Font(Font.FontFamily.HELVETICA, 11,
            Font.BOLD);
    private static Font smallBold2 = new Font(Font.FontFamily.HELVETICA, 11,
            Font.NORMAL);

    void printing3(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add, String roll_no, String name1, String sub1a, String sub1b, String sub2a, String sub2b, String sub3a, String sub3b, String totalmarks, String obtainedmarks, String percentage, String position) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img\\excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img\\Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img\\VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img\\Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img\\Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img\\Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img\\StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = "1024";
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = form_no;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 3;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/
String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;



            subject_1 = subject1_add;
            o_marks_1 = sub1b;
            t_marks_1 = sub1a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b;
            t_marks_1 = sub2a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b;
            t_marks_1 = sub3a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                

            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void printing4(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add,String subject4_add, String roll_no, String name1, String sub1a, String sub1b, String sub2a, String sub2b, String sub3a, String sub3b, String sub4a, String sub4b, String totalmarks, String obtainedmarks, String percentage, String position) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img/excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img/Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img/VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img/Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img/Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img/Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img/StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = "1024";
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = form_no;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 5;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/

String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;



            subject_1 = subject1_add;
            o_marks_1 = sub1b;
            t_marks_1 = sub1a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b;
            t_marks_1 = sub2a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b;
            t_marks_1 = sub3a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject4_add;
            o_marks_1 = sub4b;
            t_marks_1 = sub4a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(4, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void printing5(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add,String subject4_add,String subject5_add, String roll_no, String name1, String sub1a1, String sub1b1, String sub2a1, String sub2b1, String sub3a1, String sub3b1, String sub4a1, String sub4b1, String sub5a1, String sub5b1, String totalmarks, String obtainedmarks, String percentage, String position) {
                             
        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img/excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img/Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img/VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img/Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img/Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img/Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img/StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = form_no;
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = form_no;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 5;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/
            String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;

            
            
            subject_1 = subject1_add;
            o_marks_1 = sub1b1;
            t_marks_1 = sub1a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b1;
            t_marks_1 = sub2a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b1;
            t_marks_1 = sub3a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject4_add;
            o_marks_1 = sub4b1;
            t_marks_1 = sub4a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(4, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                

                subject_1 = subject5_add;
            o_marks_1 = sub5b1;
            t_marks_1 = sub5a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(5, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void printing6(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add,String subject4_add,String subject5_add,String subject6_add, String roll_no, String name1, String sub1a1, String sub1b1, String sub2a, String sub2b, String sub3a, String sub3b, String sub4a, String sub4b, String sub5a, String sub5b, String sub6a, String sub6b, String totalmarks, String obtainedmarks, String percentage, String position) {

        
        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img/excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img/Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img/VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img/Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img/Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img/Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img/StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = form_no;
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = form_no;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

            
            
//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 6;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/
            
String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;



            subject_1 = subject1_add;
            o_marks_1 = sub1b1;
            t_marks_1 = sub1a1;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b;
            t_marks_1 = sub2a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b;
            t_marks_1 = sub3a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject4_add;
            o_marks_1 = sub4b;
            t_marks_1 = sub4a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(4, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
              
                  
                subject_1 = subject5_add;
            o_marks_1 = sub5b;
            t_marks_1 = sub5a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(5, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                  
                subject_1 = subject6_add;
            o_marks_1 = sub6b;
            t_marks_1 = sub6a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(6, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
        

            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void printing7(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add,String subject4_add,String subject5_add,String subject6_add,String subject7_add, String roll_no, String name1, String sub1a, String sub1b, String sub2a, String sub2b, String sub3a, String sub3b, String sub4a, String sub4b, String sub5a, String sub5b , String sub6a, String sub6b, String sub7a, String sub7b, String totalmarks, String obtainedmarks, String percentage, String position) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img/excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img/Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img/VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img/Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img/Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img/Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img/StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = "1024";
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = form_no;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 7;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/
            
String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;



            subject_1 = subject1_add;
            o_marks_1 = sub1b;
            t_marks_1 = sub1a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b;
            t_marks_1 = sub2a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b;
            t_marks_1 = sub3a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject4_add;
            o_marks_1 = sub4b;
            t_marks_1 = sub4a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(4, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
              
                  
                subject_1 = subject5_add;
            o_marks_1 = sub5b;
            t_marks_1 = sub5a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(5, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                  
                subject_1 = subject6_add;
            o_marks_1 = sub6b;
            t_marks_1 = sub6a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(6, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                  
                subject_1 = subject7_add;
            o_marks_1 = sub7b;
            t_marks_1 = sub7a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(7, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

              
                
                
                

            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void printing8(String resulttype, String classname, String subject1_add, String subject2_add, String subject3_add,String subject4_add,String subject5_add,String subject6_add,String subject7_add,String subject8_add, String roll_no, String name1, String sub1a, String sub1b, String sub2a, String sub2b, String sub3a, String sub3b, String sub4a, String sub4b, String sub5a, String sub5b , String sub6a, String sub6b, String sub7a, String sub7b, String sub8a, String sub8b, String totalmarks, String obtainedmarks, String percentage, String position) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Results\\Class_"+ classname + "_Rollno_"+ roll_no +"_Result.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

//            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\result_head.png");
//            head.scaleAbsoluteWidth(359);
//            head.scaleAbsoluteHeight(74);
              Image head =   Image.getInstance("C:\\Program Files\\semicolen\\img\\report_header.png");
              head.scaleAbsoluteWidth(390);
              head.scaleAbsoluteHeight(86);
            head.setAlignment(Element.ALIGN_CENTER);
            //head.setAbsolutePosition(118, 710);

            Image AAA = Image.getInstance("C:\\Program Files\\semicolen\\img/excelent.png");
            Image AA = Image.getInstance("C:\\Program Files\\semicolen\\img/Brilliant.png");
            Image A = Image.getInstance("C:\\Program Files\\semicolen\\img/VGood.png");
            Image B = Image.getInstance("C:\\Program Files\\semicolen\\img/Good.png");
            Image C = Image.getInstance("C:\\Program Files\\semicolen\\img/Average.png");
            Image D = Image.getInstance("C:\\Program Files\\semicolen\\img/Improve.png");
            Image E = Image.getInstance("C:\\Program Files\\semicolen\\img/StriclyImprove.png");

            //main LOGO
            //Student Info
            
            String form_no= null;
            String Session = null;
            String Date= null;
            String C_B_Fromno= null;
            String DOB= null;
            String Father_Name = null;
            String Father_CNIC = null;
            String Father_Occupation = null;
            String Religion=  null;
            String Contact_home = null;
            String Mobile = null;
            String Postel_Adress = null;
            String Permanent_Adress = null;
            String Tehsil = null;
            String District = null;
            
            
            
            String Query = "select * from student_admission where roll_no = " + roll_no + " and class = '" + classname + "';";
               try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                PreparedStatement stmt = con.prepareStatement(Query);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                Session = r1.getString("session");
                Date = r1.getString("date");
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
                
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            String name = name1;
            String F_name = Father_Name;
            String R_num = roll_no;
            String Class = classname;
            String Po_adress = Postel_Adress;
            String Reg = form_no;
//    String Ex_reg  =   "54";
//    String Ex_rnum  =   "05";
            String Session1 = Session;
            
            
            
//    String Term  =   "3rd";
            String Ex_type = resulttype;
//    String fr  =   "10-2-17";
//    String to  =   "17-2-17";
            String date = todaydate;
            
            
            int percentageoverall = Integer.parseInt(percentage);
            
            String overallGrade = null;
                if(percentageoverall == 100){
                    overallGrade = "A++";
                 }else if(percentageoverall >= 90.0 && percentageoverall <= 99.0){
                     overallGrade = "A+";
                 }else if(percentageoverall >= 80.0 && percentageoverall <= 89.0){
                     overallGrade = "A";;
                 }else if(percentageoverall >= 70.0 && percentageoverall <= 79.0){
                     overallGrade = "B";
                 }else if(percentageoverall >= 60.0 && percentageoverall <= 69.0){
                     overallGrade = "C";
                 }else if(percentageoverall >= 50.0 && percentageoverall <= 59.0){
                     overallGrade = "D";
                 }else if(percentageoverall >= 40.0 && percentageoverall <= 49.0){
                     overallGrade = "E";
                 }else{
                     overallGrade = "F";
                 }
            
            
                
                
                
            String overallPosition = position;
            String overallPercentage = percentage + "%";
            String overalltmarks = totalmarks;
            String overall0marks = obtainedmarks;

//    document.add(para);
            document.add(head);
            PdfPTable main_table = new PdfPTable(1);
            main_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            main_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            main_table.setTotalWidth(new float[]{525});
            main_table.setLockedWidth(true);
            main_table.setSpacingBefore(20);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{260, 260});
            table.setLockedWidth(true);
            table.getDefaultCell().setBorder(0);
            table.getDefaultCell().setPadding(5);
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell c = new PdfPCell(new Phrase("Date : " + date, smallFont));
            PdfPCell c1 = new PdfPCell(new Phrase("Name :  " + "           " + name, smallFont));
            PdfPCell c2 = new PdfPCell(new Phrase("Faher Name :   " + F_name, smallFont));
            PdfPCell c3 = new PdfPCell(new Phrase("Address :   " + "       " + Po_adress, smallFont));
            c.setColspan(2);
            c.setBorder(0);
            c.setPadding(10);
            c.setHorizontalAlignment(Element.ALIGN_RIGHT);
//            c1.setColspan(2);
            c1.setBorder(0);
            c1.setPadding(5);
//            c2.setColspan(2);
            c2.setBorder(0);
            c2.setPadding(5);
            c3.setColspan(2);
            c3.setBorder(0);
            c3.setPadding(5);
            table.addCell(c);
            table.addCell(c1);
            table.addCell(c2);
            table.addCell(new Phrase("Roll # :   " + "           " + R_num, smallFont));
            table.addCell(new Phrase("Registration # :  " + Reg, smallFont));
//        table.addCell(new Phrase("Exam Roll # :   "+" "+Ex_rnum , smallFont));
//        table.addCell(new Phrase("Exam Registration # :  "+Ex_reg , smallFont));
            table.addCell(c3);
            table.addCell(new Phrase("Session :   " + "        " + Session1, smallFont));
            table.addCell(new Phrase("Class :   " + "             " + Class, smallFont));
//        table.addCell(new Phrase("Term :   "+"            "+Term , smallFont));
            table.addCell(new Phrase("Exam type :   " + "    " + Ex_type, smallFont));
            table.addCell(" ");
            table.addCell(" ");
            table.addCell(" ");
//        table.addCell(new Phrase("From :   "+"           "+fr , smallFont));
//        table.addCell(new Phrase("To :   "+"                            "+to , smallFont));

            main_table.addCell(table);
            document.add(main_table);

            PdfPTable wrap_table = new PdfPTable(2);
            main_table.getDefaultCell().setBorder(0);
            wrap_table.setTotalWidth(new float[]{400, 120});
            wrap_table.setLockedWidth(true);
            wrap_table.getDefaultCell().setBorder(0);
            wrap_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            wrap_table.setSpacingBefore(10);

            PdfPTable result_table = new PdfPTable(6);
            result_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            result_table.setTotalWidth(new float[]{90, 57, 57, 57, 57, 70});
            result_table.setLockedWidth(true);
            result_table.setHorizontalAlignment(Element.ALIGN_LEFT);
            result_table.getDefaultCell().setPaddingBottom(3);
            result_table.getDefaultCell().setPaddingTop(3);
            result_table.getDefaultCell().setPaddingLeft(5);

            PdfPTable grade_table = new PdfPTable(2);
            //grade_table.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
            grade_table.getDefaultCell().setBorder(0);
            grade_table.setTotalWidth(new float[]{38, 82});
            grade_table.setLockedWidth(true);
            grade_table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            grade_table.getDefaultCell().setPaddingLeft(10);
            grade_table.getDefaultCell().setPaddingBottom(3);
            grade_table.getDefaultCell().setPaddingTop(3);

            PdfPCell r_c1 = new PdfPCell(new Phrase("Subject", smallBold));
            r_c1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c1.setPaddingBottom(5);
            r_c1.setPaddingTop(4);
            PdfPCell r_c2 = new PdfPCell(new Phrase("Max Marks", smallBold));
            r_c2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c2.setPaddingBottom(5);
            r_c2.setPaddingTop(4);
            PdfPCell r_c3 = new PdfPCell(new Phrase("Obt Marks", smallBold));
            r_c3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c3.setPaddingBottom(5);
            r_c3.setPaddingTop(4);
            PdfPCell r_c4 = new PdfPCell(new Phrase("%age", smallBold));
            r_c4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c4.setPaddingBottom(5);
            r_c4.setPaddingTop(4);
            PdfPCell r_c5 = new PdfPCell(new Phrase("Grade", smallBold));
            r_c5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c5.setPaddingBottom(5);
            r_c5.setPaddingTop(4);
            PdfPCell r_c6 = new PdfPCell(new Phrase("Status", smallBold));
            r_c6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c6.setPaddingBottom(5);
            r_c6.setPaddingTop(4);
            PdfPCell r_c7 = new PdfPCell(new Phrase(overalltmarks, smallBold));
            r_c7.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c7.setPaddingBottom(5);
            r_c7.setPaddingTop(4);
            PdfPCell r_c8 = new PdfPCell(new Phrase(overall0marks, smallBold));
            r_c8.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c8.setPaddingBottom(5);
            r_c8.setPaddingTop(4);
            PdfPCell r_c9 = new PdfPCell(new Phrase(overallPercentage, smallBold));
            r_c9.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c9.setPaddingBottom(5);
            r_c9.setPaddingTop(4);
            PdfPCell r_c10 = new PdfPCell(new Phrase(overallGrade, smallBold));
            r_c10.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c10.setPaddingBottom(5);
            r_c10.setPaddingTop(4);
            PdfPCell r_c11 = new PdfPCell(new Phrase(overallPosition, smallBold));
            r_c11.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            r_c11.setPaddingBottom(5);
            r_c11.setPaddingTop(4);

            result_table.addCell(r_c1);
            result_table.addCell(r_c2);
            result_table.addCell(r_c3);
            result_table.addCell(r_c4);
            result_table.addCell(r_c5);
            result_table.addCell(r_c6);

            PdfPCell g_c1 = new PdfPCell(new Phrase("Grade", smallBold));
            g_c1.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c1.setPaddingBottom(2);
            g_c1.setPaddingTop(2);
            PdfPCell g_c2 = new PdfPCell(new Phrase("Percentage", smallBold));
            g_c2.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell g_c3 = new PdfPCell(new Phrase("A++", smallFont));
            g_c3.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c3.setHorizontalAlignment(Element.ALIGN_LEFT);
            g_c3.setPaddingBottom(2);
            g_c3.setPaddingTop(2);
            g_c3.setPaddingLeft(13);
            PdfPCell g_c4 = new PdfPCell(new Phrase("### - 100.0", smallFont));
            g_c4.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c4.setPaddingLeft(13);
            PdfPCell g_c5 = new PdfPCell(new Phrase("A+", smallFont));
            g_c5.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c5.setPaddingBottom(2);
            g_c5.setPaddingTop(2);
            g_c5.setPaddingLeft(13);
            PdfPCell g_c6 = new PdfPCell(new Phrase("90.0 - 99.9", smallFont));
            g_c6.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c6.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c6.setPaddingLeft(13);
            PdfPCell g_c7 = new PdfPCell(new Phrase("A", smallFont));
            g_c7.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c7.setPaddingBottom(2);
            g_c7.setPaddingTop(2);
            g_c7.setPaddingLeft(13);
            PdfPCell g_c8 = new PdfPCell(new Phrase("80.0 - 89.9", smallFont));
            g_c8.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c8.setPaddingLeft(13);
            PdfPCell g_c9 = new PdfPCell(new Phrase("B", smallFont));
            g_c9.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c9.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c9.setPaddingBottom(2);
            g_c9.setPaddingTop(2);
            g_c9.setPaddingLeft(13);
            PdfPCell g_c10 = new PdfPCell(new Phrase("70.0 - 79.9", smallFont));
            g_c10.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c10.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c10.setPaddingLeft(13);
            PdfPCell g_c11 = new PdfPCell(new Phrase("C", smallFont));
            g_c11.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c11.setPaddingBottom(2);
            g_c11.setPaddingTop(2);
            g_c11.setPaddingLeft(13);
            PdfPCell g_c12 = new PdfPCell(new Phrase("60.0 - 69.9", smallFont));
            g_c12.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c12.setPaddingLeft(13);
            PdfPCell g_c13 = new PdfPCell(new Phrase("D", smallFont));
            g_c13.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c13.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c13.setPaddingBottom(2);
            g_c13.setPaddingTop(2);
            g_c13.setPaddingLeft(13);
            PdfPCell g_c14 = new PdfPCell(new Phrase("50.0 - 59.9", smallFont));
            g_c14.setBorderColor(BaseColor.LIGHT_GRAY);
            g_c14.setBackgroundColor(BaseColor.LIGHT_GRAY);
            g_c14.setPaddingLeft(13);
            PdfPCell g_c15 = new PdfPCell(new Phrase("E", smallFont));
            g_c15.setBorderColor(BaseColor.WHITE);
            g_c15.setPaddingBottom(2);
            g_c15.setPaddingTop(2);
            g_c15.setPaddingLeft(13);
            PdfPCell g_c16 = new PdfPCell(new Phrase("0.0 - 49.9", smallFont));
            g_c16.setBorderColor(BaseColor.WHITE);
            g_c16.setPaddingLeft(13);

            grade_table.addCell(g_c1);
            grade_table.addCell(g_c2);
            grade_table.addCell(g_c3);
            grade_table.addCell(g_c4);
            grade_table.addCell(g_c5);
            grade_table.addCell(g_c6);
            grade_table.addCell(g_c7);
            grade_table.addCell(g_c8);
            grade_table.addCell(g_c9);
            grade_table.addCell(g_c10);
            grade_table.addCell(g_c11);
            grade_table.addCell(g_c12);
            grade_table.addCell(g_c13);
            grade_table.addCell(g_c14);
            grade_table.addCell(g_c15);
            grade_table.addCell(g_c16);

            switch (overallGrade) {
                case "A++":
                    PdfPCell cel1 = new PdfPCell(AAA);
                    cel1.setColspan(2);
                    cel1.setBorder(0);
                    cel1.setPaddingTop(10);
                    grade_table.addCell(cel1);
                    break;
                case "A+":
                    PdfPCell cel2 = new PdfPCell(AA);
                    cel2.setColspan(2);
                    cel2.setBorder(0);
                    grade_table.addCell(cel2);
                    break;
                case "A":
                    PdfPCell cel3 = new PdfPCell(A);
                    cel3.setColspan(2);
                    cel3.setBorder(0);
                    grade_table.addCell(cel3);
                    break;
                case "B":
                    PdfPCell cel4 = new PdfPCell(B);
                    cel4.setColspan(2);
                    cel4.setBorder(0);
                    grade_table.addCell(cel4);
                    break;
                case "C":
                    PdfPCell cel5 = new PdfPCell(C);
                    cel5.setColspan(2);
                    cel5.setBorder(0);
                    grade_table.addCell(cel5);
                    ;
                    break;
                case "D":
                    PdfPCell cel6 = new PdfPCell(D);
                    cel6.setColspan(2);
                    cel6.setBorder(0);
                    grade_table.addCell(cel6);
                    break;
                case "E":
                    PdfPCell cel7 = new PdfPCell(E);
                    cel7.setColspan(2);
                    cel7.setBorder(0);
                    grade_table.addCell(cel7);
                    break;
                default:
                    break;
            }

            Integer number = 8;
/*
            String sub = "subject_";
            String t_m = "t_marks_";
            String o_m = "o_marks_";
            String per = "percentage_";
            String gra = "grade_";
            String st = "status";
*/
            
String subject_1, o_marks_1, t_marks_1, percentage1, grade_1, status;
            int tmarks, omarks;
            float percentage_1;



            subject_1 = subject1_add;
            o_marks_1 = sub1b;
            t_marks_1 = sub1a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(1, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
            
                
                
                
                
                
                subject_1 = subject2_add;
            o_marks_1 = sub2b;
            t_marks_1 = sub2a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
           if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(2, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject3_add;
            o_marks_1 = sub3b;
            t_marks_1 = sub3a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            
            if(tmarks == 0){
                tmarks = 1;
            }
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(3, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                
                
                subject_1 = subject4_add;
            o_marks_1 = sub4b;
            t_marks_1 = sub4a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(4, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
              
                  
                subject_1 = subject5_add;
            o_marks_1 = sub5b;
            t_marks_1 = sub5a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(5, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                  
                subject_1 = subject6_add;
            o_marks_1 = sub6b;
            t_marks_1 = sub6a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(6, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

                
                
                  
                subject_1 = subject7_add;
            o_marks_1 = sub7b;
            t_marks_1 = sub7a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(7, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

              
                subject_1 = subject8_add;
            o_marks_1 = sub8b;
            t_marks_1 = sub8a;
            tmarks = Integer.parseInt(t_marks_1);
            omarks = Integer.parseInt(o_marks_1);
            if(tmarks == 0){
                tmarks = 1;
            }
            
            percentage_1 =  omarks * 100 / tmarks;
            percentage1 = percentage_1 + "%";
            
            grade_1 = null;
                
                if(percentage_1 == 100.0){
                    grade_1 = "A++";
                 }else if(percentage_1 >= 90.0 && percentage_1 <= 99.0){
                     grade_1 = "A+";
                 }else if(percentage_1 >= 80.0 && percentage_1 <= 89.0){
                     grade_1 = "A";
                 }else if(percentage_1 >= 70.0 && percentage_1 <= 79.0){
                     grade_1 = "B";
                 }else if(percentage_1 >= 60.0 && percentage_1 <= 69.0){
                     grade_1 = "C";
                 }else if(percentage_1 >= 50.0 && percentage_1 <= 59.0){
                     grade_1 = "D";
                 }else if(percentage_1 >= 40.0 && percentage_1 <= 49.0){
                     grade_1 = "E";
                 }else{
                     grade_1 = "F";
                 }

                    
                status = null;
                if("0".equals(o_marks_1)){
                    status = "Absent";
                }else{
                    status = "Present";
                }
                
                add_row(8, result_table, subject_1, t_marks_1, o_marks_1, percentage1, grade_1, status);

              

            result_table.addCell("");
            result_table.addCell(r_c7);
            result_table.addCell(r_c8);
            result_table.addCell(r_c9);
            result_table.addCell(r_c10);
            result_table.addCell("");
            result_table.addCell(r_c11);
            result_table.addCell("");

            wrap_table.addCell(result_table);
            wrap_table.addCell(grade_table);

            document.add(wrap_table);

            PdfPTable table_bottom = new PdfPTable(3);
            table_bottom.setTotalWidth(new float[]{190, 185, 190});
            table_bottom.setLockedWidth(true);
            table_bottom.getDefaultCell().setBorder(0);
            table_bottom.getDefaultCell().setBorderWidthLeft(1);
            table_bottom.getDefaultCell().setPadding(10);
            table_bottom.setSpacingBefore(30);
            table_bottom.setSplitRows(false);
            table_bottom.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell b_1 = new PdfPCell(new Phrase("Teacher's Signature : ", smallBold1));
            b_1.setBorder(0);
            b_1.setPaddingTop(70);
            PdfPCell b_2 = new PdfPCell(new Phrase("Admin's Signature : ", smallBold1));
            b_2.setBorder(0);
            b_2.setPaddingTop(70);
            PdfPCell b_3 = new PdfPCell(new Phrase("Principal's Signature : ", smallBold1));
            b_3.setBorder(0);
            b_3.setPaddingTop(70);

            table_bottom.addCell(new Phrase("Grade : " + overallGrade, smallBold2));
            table_bottom.addCell(new Phrase("Position : " + overallPosition, smallBold2));
            table_bottom.addCell(new Phrase("Percentage : " + overallPercentage, smallBold2));
            table_bottom.addCell(b_1);
            table_bottom.addCell(b_2);
            table_bottom.addCell(b_3);

            document.add(table_bottom);

            addMetaData(document);

            document.close();
            //String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void add_row(int loop, PdfPTable result_table, String Subject, String t_marks, String o_marks, String percentage, String grade, String status) {

        if (loop % 2 != 0) {
            PdfPCell r_1 = new PdfPCell(new Phrase(Subject, smallFont));
            r_1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            r_1.setPaddingBottom(4);
            r_1.setPaddingTop(4);
            PdfPCell r_2 = new PdfPCell(new Phrase(t_marks, smallFont));
            r_2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_2.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell r_3 = new PdfPCell(new Phrase(o_marks, smallFont));
            r_3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_3.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell r_4 = new PdfPCell(new Phrase(percentage, smallFont));
            r_4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_4.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell r_5 = new PdfPCell(new Phrase(grade, smallFont));
            r_5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_5.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_5.setBackgroundColor(BaseColor.LIGHT_GRAY);
            PdfPCell r_6 = new PdfPCell(new Phrase(status, smallFont));
            r_6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_6.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_6.setBackgroundColor(BaseColor.LIGHT_GRAY);

            result_table.addCell(r_1);
            result_table.addCell(r_2);
            result_table.addCell(r_3);
            result_table.addCell(r_4);
            result_table.addCell(r_5);
            result_table.addCell(r_6);

        } else {
            PdfPCell r_1 = new PdfPCell(new Phrase(Subject, smallFont));
            r_1.setBorderColor(BaseColor.LIGHT_GRAY);
            r_1.setHorizontalAlignment(Element.ALIGN_CENTER);
            r_1.setPaddingBottom(4);
            r_1.setPaddingTop(4);
            PdfPCell r_2 = new PdfPCell(new Phrase(t_marks, smallFont));
            r_2.setBorderColor(BaseColor.LIGHT_GRAY);
            r_2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell r_3 = new PdfPCell(new Phrase(o_marks, smallFont));
            r_3.setBorderColor(BaseColor.LIGHT_GRAY);
            r_3.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell r_4 = new PdfPCell(new Phrase(percentage, smallFont));
            r_4.setBorderColor(BaseColor.LIGHT_GRAY);
            r_4.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell r_5 = new PdfPCell(new Phrase(grade, smallFont));
            r_5.setBorderColor(BaseColor.LIGHT_GRAY);
            r_5.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell r_6 = new PdfPCell(new Phrase(status, smallFont));
            r_6.setBorderColor(BaseColor.LIGHT_GRAY);
            r_6.setHorizontalAlignment(Element.ALIGN_CENTER);

            result_table.addCell(r_1);
            result_table.addCell(r_2);
            result_table.addCell(r_3);
            result_table.addCell(r_4);
            result_table.addCell(r_5);
            result_table.addCell(r_6);
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Fee Slip");
        document.addSubject("www.semicolen.com");
        document.addAuthor("Semicolen Softwares");
    }

}

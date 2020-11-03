/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.BaseColor;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Admission_Fees_Printing {

    private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18,
            Font.NORMAL);
    private static Font headFont = new Font(Font.FontFamily.HELVETICA, 15,
            Font.BOLD);
    private static Font headundeline = new Font(Font.FontFamily.HELVETICA, 15,
            Font.UNDERLINE);
    private static Font mainFont = new Font(Font.FontFamily.HELVETICA, 16,
            Font.NORMAL);
    private static Font normFont = new Font(Font.FontFamily.HELVETICA, 12,
            Font.NORMAL);
    private static Font normBFont = new Font(Font.FontFamily.HELVETICA, 12,
            Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallFont = new Font(Font.FontFamily.HELVETICA, 9,
            Font.NORMAL);
    private static Font normB2Font = new Font(Font.FontFamily.HELVETICA, 13,
            Font.BOLD);

    String admissionfee;
    String monthlyfee;
    String cardfee;
    String badgefee;
    String booksfee;
    String uniformfee;
    String otherfee;
    String totalfee;

    String form_no;
    String First_Name;
    String Father_Name;

    public void Printing(String Classname, String Rollno) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        Paragraph detail = new Paragraph();
        Paragraph head_detail = new Paragraph();
        Paragraph Reg = new Paragraph();
        String pdf = "Fee Statement.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

            Image head_2 = Image.getInstance("C:\\Program Files\\semicolen\\img\\Admission_header_2.png");

            head_2.scaleAbsoluteWidth(480);
            head_2.scaleAbsoluteHeight(93);
            head_2.setAlignment(Element.ALIGN_CENTER);

            String query1;
            String query2;
            query1 = "select * from student_admission where class = '" + Classname + "' and roll_no = '" + Rollno + "';";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/misc", "root", "");
                //here sonoo is database name, root is username and password

                PreparedStatement stmt = con.prepareStatement(query1);
                ResultSet r1 = stmt.executeQuery();

                r1.next();

                form_no = r1.getString("form_no");
                First_Name = r1.getString("first_name");
                Father_Name = r1.getString("fathers_name");
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

            query2 = "select * from fees_" + Classname + " where Rollno = '" + Rollno + "';";

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

            //Student Info
            String name = First_Name;
            String F_name = Father_Name;
            String R_num = Rollno;
            String Reg_num = form_no;
            String Class = Classname;
            String Fee_previous = admissionfee;
            String Fee_monthly = monthlyfee;
            String Fee_card = cardfee;
            String Fee_badge = badgefee;
            String Fee_books = booksfee;
            String Fee_uniform = uniformfee;
            String Fee_other = otherfee;
            String Fee_total = totalfee;

            Reg.add(new Phrase("Reg# " + Reg_num + "\n", smallFont));
            Reg.setAlignment(Element.ALIGN_RIGHT);
            document.add(Reg);

            document.add(head_2);

            PdfPTable table_head = new PdfPTable(2);
            table_head.setTotalWidth(new float[]{450, 150});
            table_head.setLockedWidth(true);
            table_head.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_head.getDefaultCell().setBorder(0);
            table_head.addCell("");
            table_head.addCell(new Phrase("Roll No : 400389", normFont));

            table_head.setSpacingBefore(10);
            document.add(table_head);

            PdfPTable table_s = new PdfPTable(4);
            table_s.setTotalWidth(new float[]{105, 210, 110, 60});
            table_s.setLockedWidth(true);
            table_s.setSpacingBefore(15);
            table_s.setSpacingAfter(40);
            table_s.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_s.getDefaultCell().setBorder(0);
            table_s.getDefaultCell().setPaddingTop(0);
            table_s.getDefaultCell().setPaddingBottom(0);
            table_s.getDefaultCell().setLeading(1, 2);

            PdfPCell info_cell = new PdfPCell(new Phrase("Student Information", headFont));
            info_cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            info_cell.setBorder(PdfPCell.NO_BORDER);
            info_cell.setColspan(4);
            info_cell.setPaddingBottom(8);
            info_cell.setPaddingTop(0);

            table_s.addCell(info_cell);
            table_s.addCell(new Paragraph("Name : ", normFont));
            table_s.addCell(new Paragraph(name, normFont));
            table_s.addCell(new Paragraph("Enrollment Class : ", normFont));
            table_s.addCell(new Paragraph(Class, normFont));
            table_s.addCell(new Paragraph("Father’s Name : ", normFont));
            table_s.addCell(new Paragraph(F_name, normFont));
            table_s.addCell(new Paragraph("", normFont));
            table_s.addCell(new Paragraph("", normFont));

            document.add(table_s);

            PdfPTable table_fee = new PdfPTable(2);
            table_fee.setTotalWidth(new float[]{210, 90});
            table_fee.setLockedWidth(true);
            table_fee.getDefaultCell().setPaddingBottom(4);
            table_fee.getDefaultCell().setPaddingTop(3);
            table_fee.setHorizontalAlignment(Element.ALIGN_CENTER);

            PdfPCell fee_cell_1 = new PdfPCell(new Phrase("    " + "Fees Type", normB2Font));
            fee_cell_1.setHorizontalAlignment(Element.ALIGN_LEFT);
            fee_cell_1.setPaddingBottom(6);
            fee_cell_1.setPaddingTop(4);

            PdfPCell fee_cell_2 = new PdfPCell(new Phrase("    " + "Rupees", normB2Font));
            fee_cell_2.setHorizontalAlignment(Element.ALIGN_LEFT);
            fee_cell_2.setPaddingBottom(6);
            fee_cell_2.setPaddingTop(4);

            PdfPCell fee_cell_3 = new PdfPCell(new Phrase("    " + "Total", normB2Font));
            fee_cell_3.setHorizontalAlignment(Element.ALIGN_LEFT);
            fee_cell_3.setPaddingBottom(6);
            fee_cell_3.setPaddingTop(4);

            PdfPCell fee_cell_4 = new PdfPCell(new Phrase("    " + Fee_total, normB2Font));
            fee_cell_4.setHorizontalAlignment(Element.ALIGN_LEFT);
            fee_cell_4.setPaddingBottom(6);
            fee_cell_4.setPaddingTop(4);

            table_fee.addCell(fee_cell_1);
            table_fee.addCell(fee_cell_2);
            table_fee.addCell(new Phrase("     " + "Previous Dues", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_previous, normFont));
            table_fee.addCell(new Phrase("     " + "Tution Fee", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_monthly, normFont));
            table_fee.addCell(new Phrase("     " + "Fee Card", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_card, normFont));
            table_fee.addCell(new Phrase("     " + "Badge", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_badge, normFont));
            table_fee.addCell(new Phrase("     " + "Books", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_books, normFont));
            table_fee.addCell(new Phrase("     " + "Uniform", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_uniform, normFont));
            table_fee.addCell(new Phrase("     " + "Other Registration Fee", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_other, normFont));
            table_fee.addCell(fee_cell_3);
            table_fee.addCell(fee_cell_4);

            document.add(table_fee);

            para.add(new Phrase("\n\t* All paid fees are non refundable.", smallFont));
            para.add(new Phrase("\n\n\n\nSig. Cashier ", normBFont));
            document.add(para);

            addMetaData(document);

            document.close();
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Fee Statement");
        document.addSubject("www.semicolen.com");
        document.addAuthor("Semicolen Softwares");
    }

}

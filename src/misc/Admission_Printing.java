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

import java.io.FileOutputStream;

public class Admission_Printing {

    
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
    private static Font normB2Font = new Font(Font.FontFamily.HELVETICA, 13,
            Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallFont = new Font(Font.FontFamily.HELVETICA, 9,
            Font.NORMAL);

    void printing(String Imagepath, String First_Name1, String Father_Name1, String Roll_no1, String formno1, String class1, String C_B_Fromno1, String DOB1, String Date1, String Father_CNIC1, String Father_Occupation1, String Religion1, String Contact1, String Mobile1, String Postel_Adress1, String Permanent_Adress1, String Tehsil1, String District1, String admissionfee1, String monthlyfee1, String cardfee1, String badgefee1, String booksfee1, String uniformfee1, String otherfee1, String totalfee1) {

        Document document = new Document();
        Rectangle rect = new Rectangle(PageSize.A4);
        document.setPageSize(rect);
        Paragraph para = new Paragraph();
        Paragraph detail = new Paragraph();
        Paragraph head_detail = new Paragraph();
        Paragraph Reg = new Paragraph();
        String pdf = "C:\\SemicolenSoftwares\\Admisions\\Class_"+ class1 + "_Rollno_"+ Roll_no1 +"_AdmissionForm.pdf";

        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdf));
            document.open();

            Image mark = Image.getInstance("C:\\Program Files\\semicolen\\img\\Admission_background.png");
            Image image = Image.getInstance(Imagepath);
            Image head = Image.getInstance("C:\\Program Files\\semicolen\\img\\Admission_header.png");
            Image head_2 =   Image.getInstance("C:\\Program Files\\semicolen\\img\\Admission_header_2.png");
            Image declaration = Image.getInstance("C:\\Program Files\\semicolen\\img\\Dec_1-2.png");

            mark.setAbsolutePosition(0, 0);

            declaration.scaleAbsoluteWidth(495);
            declaration.scaleAbsoluteHeight(101);
            declaration.setAlignment(Element.ALIGN_CENTER);

    //            head.scaleAbsoluteWidth(436);
//            head.scaleAbsoluteHeight(80);
            head.scaleAbsoluteWidth(480);
            head.scaleAbsoluteHeight(93);
            head.setAlignment(Element.ALIGN_CENTER);
            head_2.scaleAbsoluteWidth(480);
            head_2.scaleAbsoluteHeight(93);
            head_2.setAlignment(Element.ALIGN_CENTER);

            document.add(mark);

            //Student Info
            String name = First_Name1;
            String F_name = Father_Name1;
            String R_num = Roll_no1;
            String Reg_num = formno1;
            String Class = class1;
            String B_form = C_B_Fromno1;
            String DOB = DOB1;
            String DOA = Date1;
            String F_cnic = Father_CNIC1;
            String F_job = Father_Occupation1;
            String Religion = Religion1;
            String P_no = Contact1;
            String M_no = Mobile1;
            String Po_adress = Postel_Adress1;
            String Pr_adress = Permanent_Adress1;
            String Tehsil = Tehsil1;
            String District = District1;
            String Fee_admission = admissionfee1;
            String Fee_monthly = monthlyfee1;
            String Fee_card = cardfee1;
            String Fee_badge = badgefee1;
            String Fee_books = booksfee1;
            String Fee_uniform = uniformfee1;
            String Fee_other = otherfee1;
            String Fee_total = totalfee1;

            Reg.add(new Phrase("Reg# " + Reg_num + "\n", smallFont));
            Reg.setAlignment(Element.ALIGN_RIGHT);
            document.add(Reg);

            document.add(head);

            PdfPTable table_head = new PdfPTable(2);
            table_head.setTotalWidth(new float[]{450, 150});
            table_head.setLockedWidth(true);
            table_head.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_head.getDefaultCell().setBorder(0);
            table_head.addCell("");
            table_head.addCell(new Phrase("Roll No : " + R_num, normFont));

            table_head.setSpacingBefore(10);
            document.add(table_head);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{394, 95});
            table.setLockedWidth(true);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.setSpacingBefore(15);
            table.setSpacingAfter(40);
            table.getDefaultCell().setBorder(0);

            PdfPTable table_s = new PdfPTable(2);
            table_s.setTotalWidth(new float[]{144, 250});
            table_s.setLockedWidth(true);
            table_s.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_s.getDefaultCell().setBorder(0);
            table_s.getDefaultCell().setPaddingTop(0);
            table_s.getDefaultCell().setPaddingBottom(0);
            table_s.getDefaultCell().setLeading(1, 2);

            PdfPCell info_cell = new PdfPCell(new Phrase("Student Information", headFont));
            info_cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            info_cell.setBorder(PdfPCell.NO_BORDER);
            info_cell.setColspan(2);
            info_cell.setPaddingBottom(8);
            info_cell.setPaddingTop(0);

            table_s.addCell(info_cell);
            table_s.addCell(new Paragraph("Name : ", normFont));
            table_s.addCell(new Paragraph(name, normFont));
            table_s.addCell(new Paragraph("Enrollment Class : ", normFont));
            table_s.addCell(new Paragraph(Class, normFont));
            table_s.addCell(new Paragraph("Candidate B-Form : ", normFont));
            table_s.addCell(new Paragraph(B_form, normFont));
            table_s.addCell(new Paragraph("Date of Birth : ", normFont));
            table_s.addCell(new Paragraph(DOB, normFont));
            table_s.addCell(new Paragraph("Date of Admission : ", normFont));
            table_s.addCell(new Paragraph(DOA, normFont));
            table_s.addCell(new Paragraph("Father’s Name : ", normFont));
            table_s.addCell(new Paragraph(F_name, normFont));
            table_s.addCell(new Paragraph("Father’s CNIC : ", normFont));
            table_s.addCell(new Paragraph(F_cnic, normFont));
            table_s.addCell(new Paragraph("Father’s Occupation : ", normFont));
            table_s.addCell(new Paragraph(F_job, normFont));
            table_s.addCell(new Paragraph("Religion : ", normFont));
            table_s.addCell(new Paragraph(Religion, normFont));
            table_s.addCell(new Paragraph("Phone no : ", normFont));
            table_s.addCell(new Paragraph(P_no, normFont));
            table_s.addCell(new Paragraph("Mobile no : ", normFont));
            table_s.addCell(new Paragraph(M_no, normFont));
            table_s.addCell(new Paragraph("Postal Address : ", normFont));
            table_s.addCell(new Paragraph(Po_adress, normFont));
            table_s.addCell(new Paragraph("Permanent Address : ", normFont));
            table_s.addCell(new Paragraph(Pr_adress, normFont));
            table_s.addCell(new Paragraph("Tehsil : ", normFont));
            table_s.addCell(new Paragraph(Tehsil, normFont));
            table_s.addCell(new Paragraph("District", normFont));
            table_s.addCell(new Paragraph(District, normFont));

            table.addCell(table_s);
            table.getDefaultCell().setBorder(0);
            PdfPCell img_cell = new PdfPCell(image, true);
            img_cell.setBorder(0);
            table.addCell(img_cell);

            document.add(table);
            document.add(declaration);

            PdfPTable table_sign = new PdfPTable(3);

            table_sign.setSpacingBefore(40);
            table_sign.setTotalWidth(new float[]{162, 224, 125});
            table_sign.setLockedWidth(true);
            table_sign.setHorizontalAlignment(Element.ALIGN_CENTER);
            table_sign.getDefaultCell().setBorder(0);
            table_sign.addCell(new Phrase("Candidate Signature", normBFont));
            table_sign.addCell(new Phrase("Guardian’s / Parents’s Signature", normBFont));
            table_sign.addCell(new Phrase("Principal’s Signature", normBFont));
            document.add(table_sign);
            
            document.newPage();
            document.add(Reg);
            document.add(head_2);
            document.add(table_head);
            
            PdfPTable table_f = new PdfPTable(2);
        table_f.setTotalWidth(new float[]{ 394, 95 });
        table_f.setLockedWidth(true);
        table_f.setHorizontalAlignment(Element.ALIGN_CENTER);
        table_f.setSpacingBefore(15);
        table_f.setSpacingAfter(40);
        table_f.getDefaultCell().setBorder(0);
        
        PdfPTable table_i = new PdfPTable(2);
        table_i.setTotalWidth(new float[]{ 144, 250 });
        table_i.setLockedWidth(true);
        table_i.setHorizontalAlignment(Element.ALIGN_CENTER);
        table_i.getDefaultCell().setBorder(0);
        table_i.getDefaultCell().setPaddingTop(0);
        table_i.getDefaultCell().setPaddingBottom(0);
        table_i.getDefaultCell().setLeading(1, 2);
        table_i.addCell(info_cell);
        
        table_i.addCell(new Paragraph("Name : ", normFont));
        table_i.addCell(new Paragraph(name, normFont));
        table_i.addCell(new Paragraph("Enrollment Class : ", normFont));
        table_i.addCell(new Paragraph(Class, normFont));
        table_i.addCell(new Paragraph("Candidate B-Form : ", normFont));
        table_i.addCell(new Paragraph(B_form, normFont));
        table_i.addCell(new Paragraph("Date of Birth : ", normFont));
        table_i.addCell(new Paragraph(DOB, normFont));
        table_i.addCell(new Paragraph("Date of Admission : ", normFont));
        table_i.addCell(new Paragraph(DOA, normFont));
        table_i.addCell(new Paragraph("Father’s Name : ", normFont));
        table_i.addCell(new Paragraph(F_name, normFont));
        
        
        table_f.addCell(table_i);
        table_f.addCell(img_cell);
        
        document.add(table_f);
        
            
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
            table_fee.addCell(new Phrase("     " + "Admission Fee", normBFont));
            table_fee.addCell(new Phrase("     " + Fee_admission, normFont));
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
            String fees = "fee.pdf";
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + pdf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Admission Form");
        document.addSubject("www.semicolen.com");
        document.addAuthor("Semicolen Sotwares");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;


import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Element;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.draw.LineSeparator;


import java.io.FileOutputStream;

/**
 *
 * @author Abubakar Manzoor
 */
public class fees_slip_printing {

       private static Font catFont = new Font(Font.FontFamily.HELVETICA, 18,
                        Font.BOLD);
       private static Font headFont = new Font(Font.FontFamily.HELVETICA, 15,
                        Font.BOLD);
       private static Font mainFont = new Font(Font.FontFamily.HELVETICA, 14,
                        Font.UNDERLINE);
       private static Font main1Font = new Font(Font.FontFamily.HELVETICA, 14,
                        Font.NORMAL);
       private static Font main2Font = new Font(Font.FontFamily.HELVETICA, 14,
                        Font.UNDERLINE);
       private static Font newSmall = new Font(Font.FontFamily.HELVETICA, 12,
                        Font.UNDERLINE);
       private static Font normFont = new Font(Font.FontFamily.HELVETICA, 12,
                        Font.NORMAL);
       private static Font normBFont = new Font(Font.FontFamily.HELVETICA, 12,
                        Font.BOLD);
        private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
                        Font.BOLD);
        private static Font smallFont = new Font(Font.FontFamily.HELVETICA, 8,
                        Font.NORMAL);
       
//name, fathername, rollnumber, class, registration, tutionfees, fine        
        
        void printing(String name1, String fathername1, String rollno1, String class1, String totalfees1, String fine1, String tutionfees, String feestype){
               System.out.println("printing");
            Document document   = new Document();
    Rectangle rect  =   new Rectangle(PageSize.A4);
    document.setPageSize(rect);
    Paragraph para  =   new Paragraph();
    Paragraph main  =   new Paragraph();
    Paragraph main_1  =   new Paragraph();
    
            try{
    PdfWriter.getInstance(document, new FileOutputStream("C:\\SemicolenSoftwares\\FeesSlips\\Class_"+ class1 + "_Rollno_"+ rollno1 +"_Fees_"+ feestype +"_Slip.pdf"));
    document.open();
    
//    Image header_1 =   Image.getInstance("C:\\Program Files\\semicolen\\img\\fee_new.png");
//    Image header_2 =   Image.getInstance("C:\\Program Files\\semicolen\\img\\fee_new2.png");
    Image header_1 =   Image.getInstance("C:\\Program Files\\semicolen\\img\\fee_header.png");
    Image header_2 =   Image.getInstance("C:\\Program Files\\semicolen\\img\\fee_header_2.png");
    Image mark =   Image.getInstance("C:\\Program Files\\semicolen\\img\\watermark.png");
    //Image logo =   Image.getInstance("img/Logo_sharp.png");
    //Image logo_1 =   Image.getInstance("img/Logo_sharp.png");
    mark.setAbsolutePosition(1, 1);
    
//    header_1.scaleAbsoluteWidth(350);
//    header_1.scaleAbsoluteHeight(67);
//    header_2.scaleAbsoluteWidth(350);
//    header_2.scaleAbsoluteHeight(67);
    header_1.scaleAbsoluteWidth(390);
    header_1.scaleAbsoluteHeight(76);
    header_2.scaleAbsoluteWidth(390);
    header_2.scaleAbsoluteHeight(76);
        
    document.add(mark);
    //main LOGO
    header_1.setAlignment(Element.ALIGN_CENTER);
    document.add(header_1);
    
    
//name, fathername, rollnumber, class, registration, tutionfees, fine
    //Student Info
    String name =   name1;
    String F_name   =   fathername1;
    String F_month =   feestype;
    String R_num =   rollno1;
    String Class =   class1;
    String Tution_fees  =   tutionfees;
    String Fine  =   fine1;
    
    //Stirng to Integers
    int tutionfees1 = Integer.parseInt(Tution_fees);
    int fine11 = Integer.parseInt(Fine);
    
    int grandtotal = tutionfees1 + fine11;
    
    
    PdfPTable table_info = new PdfPTable(4);
    table_info.setTotalWidth(new float[]{220, 400,260, 400 });
    table_info.getDefaultCell().setBorder(0);
    table_info.setSpacingBefore(15);
    
    PdfPCell info_cell = new PdfPCell(new Phrase("Student Information", headFont));
                info_cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                info_cell.setBorder(PdfPCell.NO_BORDER);
                info_cell.setColspan(4);
                info_cell.setPaddingBottom(6);
    
    PdfPCell c1 = new PdfPCell(new Phrase(" "+"Name :", normFont));
                c1.setHorizontalAlignment(Element.ALIGN_LEFT);
                c1.setBorder(PdfPCell.NO_BORDER);
                c1.setPaddingTop(3);
                c1.setPaddingBottom(3);
    PdfPCell c2 = new PdfPCell(new Phrase(name, normFont));
                c2.setHorizontalAlignment(Element.ALIGN_LEFT);
                c2.setBorder(PdfPCell.NO_BORDER);
                c2.setPaddingTop(3);
                c2.setPaddingBottom(3);
    PdfPCell c3 = new PdfPCell(new Phrase(" "+"Father Name :", normFont));
                c3.setHorizontalAlignment(Element.ALIGN_LEFT);
                c3.setBorder(PdfPCell.NO_BORDER);
                c3.setPaddingTop(3);
                c3.setPaddingBottom(3);
    PdfPCell c4 = new PdfPCell(new Phrase(F_name, normFont));
                c4.setHorizontalAlignment(Element.ALIGN_LEFT);
                c4.setBorder(PdfPCell.NO_BORDER);
                c4.setPaddingTop(3);
                c4.setPaddingBottom(3);
    PdfPCell c5 = new PdfPCell(new Phrase(" "+"Roll No :", normFont));
                c5.setHorizontalAlignment(Element.ALIGN_LEFT);
                c5.setBorder(PdfPCell.NO_BORDER);
                c5.setPaddingTop(3);
                c5.setPaddingBottom(3);
    PdfPCell c6 = new PdfPCell(new Phrase(R_num, normFont));
                c6.setHorizontalAlignment(Element.ALIGN_LEFT);
                c6.setBorder(PdfPCell.NO_BORDER);
                c6.setPaddingTop(3);
                c6.setPaddingBottom(3);
                c6.setColspan(3);
    PdfPCell c7 = new PdfPCell(new Phrase(" "+"Fee Month :", normFont));
                c7.setHorizontalAlignment(Element.ALIGN_LEFT);
                c7.setBorder(PdfPCell.NO_BORDER);
                c7.setPaddingTop(3);
                c7.setPaddingBottom(3);
    PdfPCell c8 = new PdfPCell(new Phrase(F_month, normFont));
                c8.setHorizontalAlignment(Element.ALIGN_LEFT);
                c8.setBorder(PdfPCell.NO_BORDER);
                c8.setPaddingTop(3);
                c8.setPaddingBottom(3);
                c8.setColspan(3);
    PdfPCell c9 = new PdfPCell(new Phrase(" "+"Class :", normFont));
                c9.setHorizontalAlignment(Element.ALIGN_LEFT);
                c9.setBorder(PdfPCell.NO_BORDER);
                c9.setPaddingTop(3);
                c9.setPaddingBottom(3);
    PdfPCell c0 = new PdfPCell(new Phrase(Class, normFont));
                c0.setHorizontalAlignment(Element.ALIGN_LEFT);
                c0.setBorder(PdfPCell.NO_BORDER);
                c0.setPaddingTop(3);
                c0.setPaddingBottom(3);
                c0.setColspan(3);
                
    table_info.setHorizontalAlignment(Element.ALIGN_LEFT);
    table_info.addCell(info_cell);
    table_info.addCell(c1);
    table_info.addCell(c2);
    table_info.addCell(c3);
    table_info.addCell(c4);
    table_info.addCell(c5);
    table_info.addCell(c6);
    table_info.addCell(c7);
    table_info.addCell(c8);
    table_info.addCell(c9);
    table_info.addCell(c0);
    
    
    document.add(table_info);
 
    PdfPTable table = new PdfPTable(2);
table.setTotalWidth(new float[]{ 185, 120 });
table.setLockedWidth(true);
table.setHorizontalAlignment(Element.ALIGN_CENTER);
table.setSpacingBefore(20);
        table.setSpacingAfter(5);
                PdfPCell cel_1 = new PdfPCell(new Phrase("    "+"Particulars", normBFont));
                cel_1.setHorizontalAlignment(Element.ALIGN_LEFT);
//                 cel_1.setBorder(PdfPCell.NO_BORDER);
                cel_1.setPaddingTop(2);
                cel_1.setPaddingBottom(4);
                table.addCell(cel_1);

                PdfPCell cel_2 = new PdfPCell(new Phrase("    "+"PKR", normBFont));
                cel_2.setHorizontalAlignment(Element.ALIGN_LEFT);
//                 cel_2.setBorder(PdfPCell.NO_BORDER);
                cel_2.setPaddingTop(2);
                cel_2.setPaddingBottom(4);
                table.addCell(cel_2);
              
              
                
                table.getDefaultCell().setPaddingTop(2);
                table.getDefaultCell().setPaddingBottom(4);
                table.setHeaderRows(1);
              
                table.addCell("     "+"Tution Fees");
                table.addCell("     "+Tution_fees);
                table.addCell("     "+"Fine");
                table.addCell("     "+Fine);
                
                PdfPCell cel_3 = new PdfPCell(new Phrase("    "+"Total", normBFont));
                cel_3.setHorizontalAlignment(Element.ALIGN_LEFT);
                cel_3.setPaddingTop(2);
                cel_3.setPaddingBottom(4);
                table.addCell(cel_3);
                int newTotalFees = Integer.parseInt(Tution_fees) + Integer.parseInt(Fine);
                PdfPCell cel_4 = new PdfPCell(new Phrase("    "+newTotalFees, normBFont));
                cel_4.setHorizontalAlignment(Element.ALIGN_LEFT);
                cel_4.setPaddingTop(2);
                cel_4.setPaddingBottom(4);
                table.addCell(cel_4);
                
               document.add(table);
               
               para.add(new Paragraph("Office Use Only",normBFont));
               para.setAlignment(Element.ALIGN_CENTER);
               
               //document.add(para);
               
               Paragraph sign   =   new Paragraph();
               sign.add(new Paragraph("Signature :                                                               Stamp : "));
               sign.add(new Paragraph("\nNOTE: Receipt is valid subject to realization of  above amount to our designated account .It is not valid without stamp and authorized signature",smallFont));
               sign.setSpacingBefore(25);
               sign.setSpacingAfter(15);
               document.add(sign);
               
               document.add(new LineSeparator(0.1f, 100, null, 30, 5));
               
               
         //copy
    
    //main LOGO
    header_2.setAlignment(Element.ALIGN_CENTER);
    document.add(header_2);
    document.add(table_info);
    document.add(table);
   // document.add(para);
    document.add(sign);
         //copy
               
    
    
    
                        addMetaData(document);
                        
    document.close();
    String fees =    "fee.pdf";
   Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "fee.pdf");
    }catch(Exception e){
        e.printStackTrace();
    }
        }



        private static void addMetaData(Document document) {
                document.addTitle("Fees Slip");
                document.addSubject("Muslim Ideal Science School and College");
                document.addAuthor("Shahzad Durrani");
        }

    
}

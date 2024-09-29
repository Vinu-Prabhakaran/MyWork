/**
 * 
 */
package com.vinu.springboot.coronavirustracker.pdf;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
 
import jakarta.servlet.http.HttpServletResponse;
 
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.vinu.springboot.coronavirustracker.models.LocationStats;
/**
 * @author Vinu Prabhakaran
 *         on Oct 7, 2020
 *
 */
public class LocationStatsPdfExporter {
	private List<LocationStats> listLocStats;
    
    public LocationStatsPdfExporter(List<LocationStats> listLocStats) {
        this.listLocStats = listLocStats;
    }
 
    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.GRAY);
        cell.setPadding(5);
         
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        cell.setPhrase(new Phrase("State", font));
         
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Country", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("LatestTotalCases", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("DiffFromPreviousDay", font));
        table.addCell(cell);
     
    }
     
    private void writeTableData(PdfPTable table) {
        for (LocationStats locStat : listLocStats) {
            table.addCell(String.valueOf(locStat.getState()));
            table.addCell(locStat.getCountry());
            table.addCell(locStat.getLatestTotalCases().toString());
            table.addCell(locStat.getDiffFromPrevDay().toString());
        }
    }
     
    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());
         
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.ORANGE);
         
        Paragraph p = new Paragraph("CoronaVirus Location Statistics", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
         
        document.add(p);
         
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f,});
        table.setSpacingBefore(10);
         
        writeTableHeader(table);
        writeTableData(table);
         
        document.add(table);
         
        document.close();
         
    }
}
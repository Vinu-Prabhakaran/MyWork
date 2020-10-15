/**
 * 
 */
package com.vinu.springboot.coronavirustracker.xls;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.vinu.springboot.coronavirustracker.models.LocationStats;
import static org.apache.poi.ss.util.CellUtil.*;

/**
 * @author Vinu Prabhakaran
 *         on Oct 14, 2020
 *
 */
public class LocationStatsExcelExporter {
	private List<LocationStats> listLocStats;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
    
    public LocationStatsExcelExporter(List<LocationStats> listLocStats) {
        this.listLocStats = listLocStats;
        workbook=new XSSFWorkbook();
    }
 
    private void writeTableHeader() {
    	sheet = workbook.createSheet("LocStats");
        sheet.setAutoFilter(CellRangeAddress.valueOf("A1:D1"));
        sheet.createFreezePane(0, 1);
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "State", style);      
        createCell(row, 1, "Country", style);       
        createCell(row, 2, "LatestTotalCases", style);    
        createCell(row, 3, "DiffFromPreviousDay", style);
     
    }
     
    private void writeTableData() {
    	int rowCount = 1;
    	 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
         
        for (LocationStats locStat : listLocStats) {
            int columnCount = 0; 
            Row row = sheet.createRow(rowCount++);
            createCell(row, columnCount++, locStat.getState(), style);
            createCell(row, columnCount++, locStat.getCountry(), style);
            createCell(row, columnCount++, locStat.getLatestTotalCases().toString(), style);
            createCell(row, columnCount++, locStat.getDiffFromPrevDay().toString(), style);
           
        }
    }
     
    public void export(HttpServletResponse response) throws IOException {
    	writeTableHeader();
    	writeTableData();
    	for(int columnIndex = 0; columnIndex < 4; columnIndex++) {
   	    	sheet.autoSizeColumn(columnIndex);
    	}
    	ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }
}

/**
 * 
 */
package com.vinu.springboot.coronavirustracker.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;
import com.vinu.springboot.coronavirustracker.models.LocationStats;
import com.vinu.springboot.coronavirustracker.pdf.LocationStatsPdfExporter;
import com.vinu.springboot.coronavirustracker.services.CoronaVirusDataService;
import com.vinu.springboot.coronavirustracker.xls.LocationStatsExcelExporter;

/**
 * @author Vinu Prabhakaran
 *         on May 3, 2020
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService coronaVirusDataService;
	/*
	 * With ThymeLeaf this will return content from home.html in resources/templates
	 */
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
		model.addAttribute("totalCases",coronaVirusDataService.getAllStats()
				.stream().mapToInt(s -> s.getLatestTotalCases()).sum());
		model.addAttribute("totalNewCases",coronaVirusDataService.getAllStats()
				.stream().mapToInt(s -> s.getDiffFromPrevDay()).sum());
		return "home";
	}
	
	@GetMapping("/export/pdf")
	public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=CoronaVirusLocationStats_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
         
        LocationStatsPdfExporter exporter = new LocationStatsPdfExporter(allStats);
        exporter.export(response);
         
    }
	
	@GetMapping("/export/xls")
	public void exportToExcel(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=CoronaVirusLocationStats_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
         
        LocationStatsExcelExporter exporter = new LocationStatsExcelExporter(allStats);
        exporter.export(response);
         
    }
}

/**
 * 
 */
package com.vinu.springboot.coronavirustracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.vinu.springboot.coronavirustracker.services.CoronaVirusDataService;

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
}

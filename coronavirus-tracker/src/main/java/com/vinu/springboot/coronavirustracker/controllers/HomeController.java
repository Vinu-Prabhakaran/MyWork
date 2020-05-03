/**
 * 
 */
package com.vinu.springboot.coronavirustracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Vinu Prabhakaran
 *         on May 3, 2020
 *
 */
@Controller
public class HomeController {
	
	/*
	 * With ThymeLeaf this will return content from home.html in resources/templates
	 */
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("test", "VinuTest");
		return "home";
	}
}

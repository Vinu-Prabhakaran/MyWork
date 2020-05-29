/**
 * Spring Security Controller
 */
package com.vinu.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinu Prabhakaran
 *         on May 27, 2020
 *
 */
@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String home() {
		
		return ("<h1>Welcome...<h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		
		return ("<h1>Welcome User...<h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		
		return ("<h1>Welcome Admin...<h1>");
	}
}

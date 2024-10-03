package br.com.wavebox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	
	public 	String homePage() {
		
		return "redirect:/paginainicial";
	}
		@RequestMapping ("/paginainicial")
		public String home() {
			return "paginainicial";
		}
	}


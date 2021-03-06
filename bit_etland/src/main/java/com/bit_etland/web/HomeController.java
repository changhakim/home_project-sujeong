package com.bit_etland.web;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping(value="/")
	public String home(Locale locale, Model model) {
		logger.info("=========index진입======");
		
		return "index";
	}
	
}
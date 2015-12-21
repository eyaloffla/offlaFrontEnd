package com.offla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping(value= "/welcome")
public class WelcomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String welcomeForm(Model model) {
		
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		
		return "welcome";
	}
	

}

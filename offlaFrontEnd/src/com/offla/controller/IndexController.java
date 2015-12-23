package com.offla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.offla.entities.Email;

@Controller
@RequestMapping(value= "/")
public class IndexController {
	
		
		@RequestMapping(method=RequestMethod.GET)
		public String welcomeForm(Model model) {
			
			model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
			model.addAttribute("email", new Email());
			
			return "email";
		}

}

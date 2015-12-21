package com.offla.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.offla.entities.Email;



@Controller
@RequestMapping(value= "/email")
public class EmailController {
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String emailDataForm(Model model) {
		
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		model.addAttribute("email", new Email());
		return "email";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String emailDataSubmit(@ModelAttribute("email")Email email, Model model) {
		
		String messageValid = "False";
		
		boolean emailValid = false;
		 
		 
		 
		 
		 if(emailValid){
			 messageValid = "True";
		 }
		 
		model.addAttribute("isEmailValid", messageValid);
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		
		return "validateEmail";
	}
	
	
	
	
	



	

}

package com.offla.controller;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.offla.entities.Email;
import com.offla.utils.Util;



@Controller
@RequestMapping(value= "/email")
public class EmailController {
	
	private final String urlEmail = Config.URL_IS_EMAIL_APPROVED;
	private String urlRemote;
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String emailDataForm(Model model) {
		
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		model.addAttribute("email", new Email());
		model.addAttribute("domain" , Config.DOMAIN_FRONT_END);
		return "email";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String emailDataSubmit(@ModelAttribute("email")Email email, Model model) {
		
		String messageValid = Util.BOOLEAN_FALSE_STRING;
		
		
		  if(isEmailAproved(email.getEmail())){
			 messageValid = Util.BOOLEAN_TRUE_STRING;
		 }
		 
		model.addAttribute("isEmailValid", messageValid);
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		
		return "isEmailValid";
	}
	
	private boolean isEmailAproved(String email){
		
		 boolean result = false;
		
		 RestTemplate restTemplate = new RestTemplate();
		 
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		 HttpEntity<?> entity = new HttpEntity<>(headers);

		 urlRemote =  urlEmail + "/" + email;                                  

		 HttpEntity<String> response = restTemplate.exchange(urlRemote, HttpMethod.POST, entity, String.class);
		 String responseFromWS = response.getBody();
		 
		 System.out.print(responseFromWS);
		 
	     if(Util.BOOLEAN_TRUE.equals(responseFromWS)){
			 result = true;
		 }
	 return result;
		
	}
	
	
	
	
	



	

}

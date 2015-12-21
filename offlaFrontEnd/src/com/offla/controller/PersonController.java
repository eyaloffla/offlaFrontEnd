package com.offla.controller;



import javax.servlet.http.HttpServletRequest;

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



import com.offla.entities.PersonData;
import com.offla.utils.Util;

 

@Controller
@RequestMapping(value= "/person")
public class PersonController {
	
	
	private final String url = Config.URL_IS_PERSON_ON_DB_WS;
	private final String urlIp = Config.URL_IS_IP_APROVED;
	private String urlRemote;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String personDataForm(Model model, HttpServletRequest request) {
        
		String referral = request.getRemoteAddr();
		
		System.out.println("The ip is: " + referral);
		
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
		model.addAttribute("referral", referral);
		
		if(!isIpAproved(referral)){
			
			return "locationinvalid";
		}
		
		model.addAttribute("domain" , Config.DOMAIN_FRONT_END);
		model.addAttribute("personData", new PersonData());
				
		return "person";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String personDataSubmit(@ModelAttribute("personData") PersonData personData, Model model) {
         
		 String resulBoolean = "False";
         
         String id = "0";
         String birthDay ="0";
         String finalNumber = "0";
         
         if(Util.isBlankNot(personData.getId())){
        	 id = personData.getId();
         }
         if(Util.isBlankNot(personData.getBirthDay())){
        	 birthDay = personData.getBirthDay();
         }
         if(Util.isBlankNot(personData.getFinalNumber())){
        	 finalNumber = personData.getFinalNumber();
         }
         
		 RestTemplate restTemplate = new RestTemplate();
		 
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		 HttpEntity<?> entity = new HttpEntity<>(headers);

		 urlRemote =  url + "/" + id + "/" + birthDay + "/" +  finalNumber;                                  

		 HttpEntity<String> response = restTemplate.exchange(urlRemote, HttpMethod.GET, entity, String.class);
		 String responseFromWS = response.getBody();
		 
		 System.out.print(responseFromWS);
		 
	if(Util.BOOLEAN_TRUE.equals(responseFromWS)){
			 resulBoolean = "True";
		 }
		
		model.addAttribute("personisindb", resulBoolean);
		model.addAttribute("domainResources" , Config.DOMAIN_RESOURCES);
				
		return "personisindb";
	}
	
	private boolean isIpAproved(String ip){
		
		 boolean result = false;
		
		 RestTemplate restTemplate = new RestTemplate();
		 
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		 HttpEntity<?> entity = new HttpEntity<>(headers);

		 urlRemote =  urlIp + "/" + ip;                                  

		 HttpEntity<String> response = restTemplate.exchange(urlRemote, HttpMethod.GET, entity, String.class);
		 String responseFromWS = response.getBody();
		 
		 System.out.print(responseFromWS);
		 
	     if(Util.BOOLEAN_TRUE.equals(responseFromWS)){
			 result = true;
		 }
	 return result;
		
	}
	
	

}
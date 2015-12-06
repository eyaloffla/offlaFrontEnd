package com.offla.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.client.RestTemplate;

import com.offla.entities.PersonData;
import com.offla.utils.Util;
 

@Controller
@PropertySource("classpath:/com/offla/controller/application.properties")
public class OfflaHelloWorld {
	
	@Value("${url.ispersononDB.ws}")
	private String url;
	
	@RequestMapping(value= "/welcome", method=RequestMethod.GET)
	public String PersonDataForm(Model model) {
 
		model.addAttribute("personData", new PersonData());
				
		return "welcome";
	}
	
	@RequestMapping(value= "/welcome", method=RequestMethod.POST)
	public String PersonDataSubmit(@ModelAttribute PersonData personData, Model model) {
         String resulBoolean = Util.BOOLEAN_FALSE;
         
		 RestTemplate restTemplate = new RestTemplate();
		 String result = restTemplate.getForObject(url, String.class);
		 
		 if(Util.BOOLEAN_TRUE.equals(result)){
			 resulBoolean = Util.BOOLEAN_TRUE;
		 }
		
		model.addAttribute("personisindb", resulBoolean);
				
		return "personisindb";
	}

}

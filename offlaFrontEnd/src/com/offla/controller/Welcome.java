package com.offla.controller;


import org.apache.commons.lang3.StringUtils;
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
@RequestMapping(value= "/welcome")
public class Welcome {
	
	
	private final String url = Config.URL_IS_PERSON_ON_DB_WS;
	private String urlRemote;
	
	@RequestMapping(method=RequestMethod.GET)
	public String PersonDataForm(Model model) {
 
		model.addAttribute("localDomain" , Config.DOMAIN_LOCAL);
		model.addAttribute("personData", new PersonData());
				
		return "welcome";
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String PersonDataSubmit(@ModelAttribute("personData") PersonData personData, Model model) {
         String resulBoolean = Util.BOOLEAN_FALSE;
         
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
		 
		// String result = restTemplate.getForObject(url, String.class);
		 
		 
		 
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		 
		/* UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
				 .queryParam("id", personData.getId())
				 .queryParam("birthDay", personData.getBirthDay())
				 .queryParam("finalNumber", personData.getFinalNumber());

		 
		/* Uri.Builder uriBuilder = Uri.parse(url).buildUpon();
		 uriBuilder.appendQueryParameter(key, value);
		 uriBuilder.appendQueryParameter(key, value);
		 */
		 HttpEntity<?> entity = new HttpEntity<>(headers);

		 urlRemote =  url + "/" + id + "/" + birthDay + "/" +  finalNumber;                                  

		 HttpEntity<String> response = restTemplate.exchange(urlRemote, HttpMethod.GET, entity, String.class);
		 String responseFromWS = response.getBody();
		 
		 System.out.print(responseFromWS);
		 
		 //restTemplate.getForEntity(builder.build().encode().toUri(), String.class);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 if(Util.BOOLEAN_TRUE.equals(true)){  //change true for response true or false*********************************************************************
			 resulBoolean = Util.BOOLEAN_TRUE;
		 }
		
		model.addAttribute("personisindb", resulBoolean);
				
		return "personisindb";
	}
	
	private void parameterSeter(String p){
		
	}

}

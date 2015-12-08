package com.offla.controller;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;



@Configuration
@PropertySources
({
	@PropertySource(value="classpath:application.properties",ignoreResourceNotFound=true)
})
public class AppConfig implements AppConfigI{
	
	
	@Value("${domain.local}")
	private String domain;
	

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	

}

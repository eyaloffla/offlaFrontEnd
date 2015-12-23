package com.offla.controller;

public class Config {
	
	
	public static final String LOCATION = "1";  // 1 local    0 Cloud  
	
	public static final String DOMAIN_LOCAL = "http://localhost:9080";
	
	public static final String DOMAIN_REMOTE_BUSINESS_LOGIC = "";
	
	public static final String DOMAIN_BACKEND_REMOTE = "http://backendoffla.mybluemix.net";
	
	public static final String DOMAIN_REMOTE = "http://offlafrontend.mybluemix.net";                                          
	
	public static final String DOMAIN_RESOURCES_REMOTE = "http://offlaresources.mybluemix.net";
	
	public static final String DOMAIN_RESOURCES_REMOTE_BUSINESS_LOGIC = "";
	
	public static final String DOMAIN_RESOURCES = DOMAIN_RESOURCES_REMOTE + "/resources";
	
	public static final String DOMAIN_FRONT_END = getDomain() + "/offlaFrontEnd";
	
	public static final String DOMAIN_BUSINESS_LOGIC = getBusinessLogicDomain() + "/businessLogic";
	
	public static final String DOMAIN_ROOT_REMOTE_WS = DOMAIN_BACKEND_REMOTE + "/offlaserver01WS";
	
	public static final String URL_IS_PERSON_ON_DB_WS = DOMAIN_ROOT_REMOTE_WS + "/rest/personexist/ispersonondb";
	
	public static final String URL_IS_IP_APPROVED = DOMAIN_ROOT_REMOTE_WS + "/rest/ipaproved/ipwhitelist";
	
	public static final String URL_IS_EMAIL_APPROVED = DOMAIN_BUSINESS_LOGIC + "/rest/email";
	
	
	
	public static String getDomain(){
		
		String domain = "";
		
		if("1".equals(LOCATION)){
			domain = DOMAIN_LOCAL;
		}else{
			domain = DOMAIN_REMOTE;
		}
		return domain;
	}
	
	public static String getBusinessLogicDomain(){
		
        String domain = "";
		
		if("1".equals(LOCATION)){
			domain = DOMAIN_LOCAL;
		}else{
			domain = DOMAIN_REMOTE_BUSINESS_LOGIC;
		}
		return domain;
		
	}

}

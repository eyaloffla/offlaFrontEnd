package com.offla.controller;

public class Config {
	
	
	public static final String LOCATION = "1";  // 1 local    0 Cloud  
	
	public static final String LOCATION_BACK_END = "1";  // 1 local    0 Cloud 
	
	public static final String LOCATION_BUSINESS_LOGIC = "1";  // 1 local    0 Cloud 
	
	public static final String DOMAIN_LOCAL = "http://localhost:9080";
	
	public static final String DOMAIN_LOCAL_BACKEND = "http://localhost:9081";
	
	public static final String DOMAIN_LOCAL_BUSINESS_LOGIC = "http://localhost:9081";
	
	public static final String BACK_END_NAME_APP = "offlaserver01WS";
	
	public static final String DOMAIN_REMOTE = "http://offlafrontend.mybluemix.net"; 
	
	public static final String DOMAIN_BACKEND_REMOTE = "http://backendoffla.mybluemix.net";
	
    public static final String DOMAIN_REMOTE_BUSINESS_LOGIC = "http://offlabusinesslogic.mybluemix.net";  
	
	public static final String DOMAIN_RESOURCES_REMOTE = "http://offlaresources.mybluemix.net";
	
	public static final String DOMAIN_LOCAL_BACK_END = DOMAIN_LOCAL_BACKEND + "/"+ BACK_END_NAME_APP;
	
	public static final String DOMAIN_REMOTE_BACK_END = DOMAIN_BACKEND_REMOTE + "/"+ BACK_END_NAME_APP;
	
	public static final String DOMAIN_RESOURCES = DOMAIN_RESOURCES_REMOTE + "/resources";
	
	public static final String DOMAIN_FRONT_END = getDomain() + "/offlaFrontEnd";
	
	public static final String DOMAIN_BUSINESS_LOGIC = getBusinessLogicDomain() + "/businessLogic";
	
	public static final String DOMAIN_ROOT_REMOTE_WS = getDomainBackend();
	
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
	
	public static String getDomainBackend(){
		
		String domainBackEnd = "";
		
		if("1".equals(LOCATION_BACK_END)){
			domainBackEnd = DOMAIN_LOCAL_BACK_END; 
		}else{
			domainBackEnd = DOMAIN_REMOTE_BACK_END;
		}
		return domainBackEnd;
	}
	
	
	
	public static String getBusinessLogicDomain(){
		
        String domain = "";
		
		if("1".equals(LOCATION_BUSINESS_LOGIC)){
			domain = DOMAIN_LOCAL_BUSINESS_LOGIC;
		}else{
			domain = DOMAIN_REMOTE_BUSINESS_LOGIC;
		}
		return domain;
		
	}

}

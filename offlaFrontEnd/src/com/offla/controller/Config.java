package com.offla.controller;

public class Config {
	
	
	public static final String DOMAIN_BACKEND_REMOTE = "http://backendoffla.mybluemix.net";
	
	public static final String DOMAIN = "http://localhost:9080";
	
	public static final String DOMAIN_RESOURCES = DOMAIN + "/resources";
	
	public static final String DOMAIN_FRONT_END = DOMAIN + "/offlaFrontEnd";
	
	public static final String DOMAIN_ROOT_REMOTE_WS = DOMAIN_BACKEND_REMOTE + "/offlaserver01WS";
	
	public static final String URL_IS_PERSON_ON_DB_WS = DOMAIN_ROOT_REMOTE_WS + "/rest/personexist/ispersonondb";
	
	public static final String URL_IS_IP_APROVED = DOMAIN_ROOT_REMOTE_WS + "/rest/ipaproved/ipwhitelist";

}

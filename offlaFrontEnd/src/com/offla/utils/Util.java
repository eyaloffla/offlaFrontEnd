package com.offla.utils;

import org.apache.commons.lang3.StringUtils;


public class Util {

	public static final String BOOLEAN_TRUE = "1";
	public static final String BOOLEAN_FALSE = "0";
	
	public static final String BOOLEAN_TRUE_STRING = "TRUE";
	public static final String BOOLEAN_FALSE_STRING = "FALSE";
	
	
	public static int stringToInt(String id) {
		int idI = 0;
		if(StringUtils.isNoneBlank(id)){
			try{
			   idI = Integer.parseInt(id);
			}catch(Exception e){
			}
		}
		return idI;
	}
	
	public static boolean isBlankNot(String s){
		boolean b = Boolean.FALSE;
		
		if(StringUtils.isNotBlank(s)){
			b = Boolean.TRUE;
		}
		
		return b;
	}
	
}

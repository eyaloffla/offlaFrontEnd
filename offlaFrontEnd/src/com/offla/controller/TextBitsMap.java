package com.offla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TextBitsMap {
	
	@RequestMapping(value="/TextBitsMap")
	public ModelAndView helloWorld() {
 
		String message = "Hola Offla";
		return new ModelAndView("textbits", "message", message);
	}

}

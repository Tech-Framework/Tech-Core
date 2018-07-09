package com.techoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		return "Hello World!";
	}
	
	@RequestMapping(value = "/template", method = RequestMethod.GET)
	public String template(ModelMap model){
		return "template";
	}
}

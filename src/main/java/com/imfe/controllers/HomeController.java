package com.imfe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	/**
	 * 
	 * @return -> Este mapeo nos lleva al index
	 */
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	

}

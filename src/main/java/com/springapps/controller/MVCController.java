package com.springapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapps.services.DataService;

@Controller
@RequestMapping("/web")
public class MVCController {

	@Autowired
	private DataService dservice;
	
	@RequestMapping("/home")
    public String home(ModelMap m) {
		m.addAttribute("names",dservice.getNames());
		return "index";
	} 	
}

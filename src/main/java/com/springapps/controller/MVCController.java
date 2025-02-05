package com.springapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapps.services.DataService;
import com.springapps.utilities.ApplicationRequestCounter;
import com.springapps.utilities.RequestCounter;

import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("/web")
@Tag(name = "Project List API", description="All the operations of project entity")
public class MVCController {

	@Autowired
	private DataService dservice;
	
	@Autowired
	private RequestCounter session;
	
	@Autowired
	private ApplicationRequestCounter app;
	
	@RequestMapping("/home")
    public String home(ModelMap m) {
		m.addAttribute("names",dservice.getNames());
		session.setCounter();
		app.setCounter();
		m.addAttribute("scounter",session.getCounter());
		m.addAttribute("acounter", app.getCounter());
		return "index";
	} 	
}

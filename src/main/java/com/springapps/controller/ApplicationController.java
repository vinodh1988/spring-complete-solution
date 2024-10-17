package com.springapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.entities.Application;
import com.springapps.services.ApplicationService;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	 @Autowired
	 private ApplicationService aservice;
	 
	 @GetMapping("")
	 public List<Application> getApplications() {
		 return aservice.getApplications();
	 }
}

package com.springapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.entities.Application;
import com.springapps.entities.Project;
import com.springapps.services.ApplicationService;
import com.springapps.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

	 @Autowired
	 private ApplicationService aservice;
	 
	 @GetMapping("")
	 public List<Application> getApplications() {
		 return aservice.getApplications();
	 }
	 
	 @PostMapping("")
		public ResponseEntity<String> addApplication(@RequestBody Application application) {
			try {
				aservice.addApplication(application);
				return new ResponseEntity<String>("Added the record ",HttpStatus.CREATED);
			}
			catch(RecordAlreadyExistsException e) {
				return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
			}
			catch(Exception e)
			{
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}

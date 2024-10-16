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

import com.springapps.entities.Project;
import com.springapps.services.ProjectService;
import com.springapps.utilities.RecordAlreadyExistsException;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired 
	private ProjectService pservice;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return pservice.getProjects();
	}
	//RequestBody would parse json and convert to object
	@PostMapping("")
	public ResponseEntity<String> addProject(@RequestBody Project project) {
		try {
			pservice.addProject(project);
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

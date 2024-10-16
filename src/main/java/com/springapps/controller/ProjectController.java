package com.springapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.entities.Project;
import com.springapps.services.ProjectService;
import com.springapps.utilities.RecordAlreadyExistsException;
import com.springapps.utilities.RecordNotFoundException;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired 
	private ProjectService pservice;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return pservice.getProjects();
	}
	
	@GetMapping("/{projectno}")
	public ResponseEntity<Object> getProject(@PathVariable Integer projectno) {
	 try {
		return new ResponseEntity<>(pservice.getProject(projectno),HttpStatus.OK);
	 }
	 catch(RecordNotFoundException e) {
		 return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	 }
	 
	 catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 
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
	
	@RequestMapping(value="/{projectno}",method = {RequestMethod.PATCH,RequestMethod.PUT})
	public ResponseEntity<String> updateProject(@PathVariable Integer projectno,@RequestBody Project project) {
		try {
			pservice.updateProject(projectno,project);
			return new ResponseEntity<String>("updated the record ",HttpStatus.CREATED);
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}

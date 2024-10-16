package com.springapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.entities.Project;
import com.springapps.services.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired 
	private ProjectService pservice;
	
	@GetMapping("")
	public List<Project> getProjects() {
		return pservice.getProjects();
	}
}

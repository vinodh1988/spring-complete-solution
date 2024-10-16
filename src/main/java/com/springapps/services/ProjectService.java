package com.springapps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.entities.Project;
import com.springapps.repositories.ProjectRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProjectService {
  
	@Autowired
	private ProjectRepository prepo; //implementation of ProjectRepository is injected
	
	@PostConstruct
	public void init() {
		System.out.println("implemented class"+prepo.getClass());
	}
	
	public List<Project> getProjects() {
		return prepo.findAll();
	}
}

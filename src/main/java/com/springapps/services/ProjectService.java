package com.springapps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.entities.Project;
import com.springapps.repositories.ProjectRepository;
import com.springapps.utilities.RecordAlreadyExistsException;

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
	
	public void addProject(Project project) throws RecordAlreadyExistsException {
		 Project p = prepo.findByProjectno(project.getProjectno());
		 if(p!=null)
			 throw new RecordAlreadyExistsException();
		 else
			 prepo.save(project);//save method is used both update and insert
		            //if primary key already exists it will be updated
	}
}

package com.springapps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.entities.Project;
import com.springapps.repositories.ProjectRepository;
import com.springapps.utilities.RecordAlreadyExistsException;
import com.springapps.utilities.RecordNotFoundException;

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
	
	public Project getProject(Integer projectno) throws RecordNotFoundException {
		
		Project p=prepo.findByProjectno(projectno);
		if(p!=null)
			return p;
	    throw new RecordNotFoundException();
	}
	
	public void addProject(Project project) throws RecordAlreadyExistsException {
		 Project p = prepo.findByProjectno(project.getProjectno());
		 if(p!=null)
			 throw new RecordAlreadyExistsException();
		 else
			 prepo.save(project);//save method is used both update and insert
		            //if primary key already exists it will be updated
	}
	
	public void updateProject(Integer projectno,Project project) throws RecordNotFoundException {
		Project p=prepo.findByProjectno(projectno);
		System.out.println(p);
		if(p!=null)
		{
			project.setProjectno(projectno);
			project.setName(project.getName()==null?p.getName():project.getName());
			project.setTechnology(project.getTechnology()==null?p.getTechnology():project.getTechnology());
			project.setTeamsize(project.getTeamsize()==null?p.getTeamsize():project.getTeamsize());
			prepo.save(project);
			return;
		}
	    throw new RecordNotFoundException();
	}
	
}

package com.springapps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.entities.Application;
import com.springapps.entities.Event;
import com.springapps.repositories.ApplicationRepository;
import com.springapps.utilities.RecordAlreadyExistsException;

@Service
public class ApplicationService {

	 @Autowired
	 private ApplicationRepository arepo;
	 
	 public List<Application> getApplications(){
		 return arepo.findAll();
	 }
	 
	 public void addApplication(Application application) throws RecordAlreadyExistsException {
		  Application a= arepo.getByApplicationno(application.getApplicationno());
		  if(a==null) {
			  for(Event e: application.getEvents()) {
				  e.setApplication(application);// we are setting application for event
				                 //this facilitates auto insertion of applcationno
			  }
			  arepo.save(application);
		  }
		  else
			  throw new RecordAlreadyExistsException();
	 }
}

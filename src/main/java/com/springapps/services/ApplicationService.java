package com.springapps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.entities.Application;
import com.springapps.repositories.ApplicationRepository;

@Service
public class ApplicationService {

	 @Autowired
	 private ApplicationRepository arepo;
	 
	 public List<Application> getApplications(){
		 return arepo.findAll();
	 }
}

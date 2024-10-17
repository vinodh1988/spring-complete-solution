package com.springapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.entities.Computer;
import com.springapps.services.DataService;


@RequestMapping("/api/common")
public class CommonAPI {

	@Autowired
	private DataService dservice;
	
	@RequestMapping("")
	public String first() {
		return "spring boot is running";
	}
	

	@RequestMapping("/computers")
	public List<Computer> computers() {
		return dservice.getComputers();
	}
}

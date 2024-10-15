package com.springapps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/common")
public class CommonAPI {

	@RequestMapping("")
	public String first() {
		return "spring boot is running";
	}
}

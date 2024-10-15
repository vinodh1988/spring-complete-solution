package com.springapps.utilities;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="application")
public class ApplicationRequestCounter {
	
	private Integer Counter=0;

	public Integer getCounter() {
		return Counter;
	}

	public void setCounter() {
		Counter++;
	}
	
	

}

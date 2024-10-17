package com.springapps.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="applications")
public class Application {
    @Id
    private Integer applicationno;
    @Column
    private String appname;
    
    public Application() {}
	public Application(Integer applicationno, String appname) {
		super();
		this.applicationno = applicationno;
		this.appname = appname;
	}
	Integer getApplicationno() {
		return applicationno;
	}
	void setApplicationno(Integer applicationno) {
		this.applicationno = applicationno;
	}
	String getAppname() {
		return appname;
	}
	void setAppname(String appname) {
		this.appname = appname;
	}
    
    
}

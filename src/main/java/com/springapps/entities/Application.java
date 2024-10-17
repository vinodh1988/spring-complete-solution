package com.springapps.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="applications")
public class Application {
    @Id
    private Integer applicationno;
    @Column
    private String appname;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "application")
    private Set<Event> events;
    
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
	Set<Event> getEvents() {
		return events;
	}
	void setEvents(Set<Event> events) {
		this.events = events;
	}
    
	
    
}

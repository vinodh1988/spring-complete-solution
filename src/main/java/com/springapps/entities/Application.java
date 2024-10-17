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
	public Integer getApplicationno() {
		return applicationno;
	}
	public void setApplicationno(Integer applicationno) {
		this.applicationno = applicationno;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public Set<Event> getEvents() {
		return events;
	}
	public void setEvents(Set<Event> events) {
		this.events = events;
	}
    
	
    
}

package com.springapps.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Event {
@Id
   private Integer eventno;
@Column   
   private String eventname;
@Column 
   private String  cause;

//many events might belong to one application
//one event is associated utmost one application
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="applicationno")
@JsonIgnore //to avoid cyclic reference in json
   private Application application;//application has applicationno

public Event() {}
public Event(Integer eventno, String eventname, String cause) {
	super();
	this.eventno = eventno;
	this.eventname = eventname;
	this.cause = cause;
}
public Integer getEventno() {
	return eventno;
}
public void setEventno(Integer eventno) {
	this.eventno = eventno;
}
public String getEventname() {
	return eventname;
}
public void setEventname(String eventname) {
	this.eventname = eventname;
}
public String getCause() {
	return cause;
}
public void setCause(String cause) {
	this.cause = cause;
}
public Application getApplication() {
	return application;
}
public void setApplication(Application application) {
	this.application = application;
}
  


   
}

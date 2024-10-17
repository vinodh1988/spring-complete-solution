package com.springapps.entities;

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
   private Application application;//application has applicationno

public Event() {}
public Event(Integer eventno, String eventname, String cause) {
	super();
	this.eventno = eventno;
	this.eventname = eventname;
	this.cause = cause;
}
Integer getEventno() {
	return eventno;
}
void setEventno(Integer eventno) {
	this.eventno = eventno;
}
String getEventname() {
	return eventname;
}
void setEventname(String eventname) {
	this.eventname = eventname;
}
String getCause() {
	return cause;
}
void setCause(String cause) {
	this.cause = cause;
}
Application getApplication() {
	return application;
}
void setApplication(Application application) {
	this.application = application;
}
  


   
}

package com.springapps.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="projects")
public class Project {
@Id
   private Integer projectno;
@Column
   private String name;
@Column
   private String technology;
@Column 
   private Integer teamsize;
  
  
public Project() {
	super();
}
public Project(Integer projectno, String name, String technology, Integer teamsize) {
	super();
	this.projectno = projectno;
	this.name = name;
	this.technology = technology;
	this.teamsize = teamsize;
}
public Integer getProjectno() {
	return projectno;
}
public void setProjectno(Integer projectno) {
	this.projectno = projectno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public Integer getTeamsize() {
	return teamsize;
}
public void setTeamsize(Integer teamsize) {
	this.teamsize = teamsize;
}
   
   
   
}

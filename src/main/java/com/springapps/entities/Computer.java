package com.springapps.entities;

public class Computer {
   private String brand;
   private String ram;
   private String cpu;
   private String disk;
   private double price;
   
public Computer() {
	
}

public Computer(String brand, String ram, String cpu, String disk, double price) {
	super();
	this.brand = brand;
	this.ram = ram;
	this.cpu = cpu;
	this.disk = disk;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getDisk() {
	return disk;
}
public void setDisk(String disk) {
	this.disk = disk;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
   
   
}

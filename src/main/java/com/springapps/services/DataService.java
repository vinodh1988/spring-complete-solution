package com.springapps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springapps.entities.Computer;

@Service
public class DataService {
   public String[] getNames() {
	   String[] names= {"Harry","Nicholas","Gerald","Roger","Vinay","Mahesh"};
	   return names;
   }
   
   public List<Computer> getComputers() {
	   List<Computer> list=new ArrayList<Computer>();
	   list.add(new Computer("Lenovo","16GB","i7","512GB",40403.50));
	   list.add(new Computer("Dell","16GB","i3","512GB",40402.50));
	   list.add(new Computer("HP","16GB","i9","512GB",50103.50));
	   list.add(new Computer("Applie","16GB","i7","512GB",90403.50));
	   return list;
   }
}

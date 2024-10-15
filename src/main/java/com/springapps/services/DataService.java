package com.springapps.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
   public String[] getNames() {
	   String[] names= {"Harry","Nicholas","Gerald","Roger","Vinay","Mahesh"};
	   return names;
   }
}

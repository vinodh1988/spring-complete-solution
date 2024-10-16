package com.springapps.utilities;

public class RecordAlreadyExistsException  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return toString();
	}
	public String toString() {
		return "A record with given id already exists";
	}

}

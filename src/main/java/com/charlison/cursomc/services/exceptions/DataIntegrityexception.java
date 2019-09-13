package com.charlison.cursomc.services.exceptions;

public class DataIntegrityexception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityexception(String msg) {
		super(msg);		
	}
	
	public DataIntegrityexception(String msg, Throwable cause) {
		super(msg);		
	}
	

}

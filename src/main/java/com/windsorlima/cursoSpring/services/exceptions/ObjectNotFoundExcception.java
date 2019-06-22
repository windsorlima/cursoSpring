package com.windsorlima.cursoSpring.services.exceptions;

public class ObjectNotFoundExcception extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExcception(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundExcception (String msg, Throwable cause){
		super(msg, cause);
	}
}

package com.deltax.util.listener;

/**
 * Copyright (C) 1999,2004 dr. Cristiano Sadun
 * 
 * A signal carrying an exception.
 * 
 * @author Cristiano Sadun
 * @version 1.0
 */
public class ExceptionSignal extends Signal {

	protected Exception e;

	/**
	 * Create a signal carrying the given exception from the given source
	 * 
	 * @param exception the exception thrown
	 * @param source the source to be notified
	 */
	public ExceptionSignal(Exception exception, Object source) {
		super(source);
		e = exception;
	}

	/**
	 * Return the carried exception.
	 * 
	 * @return the carried exception.
	 */
	public Exception getException() {
		return e;
	}

}
package com.deltax.util.listener;

/**
 * Copyright (C) 1999,2004 dr. Cristiano Sadun
 * 
 * Classes implementing this interface will explicitly receive
 * {@link com.deltax.util.listener.ExceptionSignal exceptions signals} separately from normal
 * signals.
 * 
 * @author Cristiano Sadun
 * @version 1.0
 */
public interface ExceptionListener extends Listener {

	/**
	 * Receives an exception-related signal
	 * 
	 * @param exceptionsignal the received signal 
	 */
	public abstract void receiveException(ExceptionSignal exceptionsignal);
}
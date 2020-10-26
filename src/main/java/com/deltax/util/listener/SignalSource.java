package com.deltax.util.listener;


/**
 * Copyright (C) 1999,2004 dr. Cristiano Sadun
 * 
 * Classes implementing this interface declare can be programmatically recognized as
 * sources of {@link com.deltax.util.listener.Signal signals} and declare whether or not they
 * support {@link com.deltax.util.listener.ExceptionSignal exception signals}.
 *
 * @author Cristiano Sadun
 * @version 1.0
 */
public interface SignalSource {

	/**
	 * Return <b>true</b> if the source notifies exceptions via {@link com.deltax.util.listener.ExceptionSignal exception signals}.
	 * 
	 * @return <b>true</b> if the source notifies exceptions via {@link com.deltax.util.listener.ExceptionSignal exception signals}.
	 */
	boolean supportsExceptionSignals();
}
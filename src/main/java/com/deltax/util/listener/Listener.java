package com.deltax.util.listener;

/**
 * Copyright (C) 1999,2004 dr. Cristiano Sadun
 * 
 * Classes implementing this interface can receive signals notified via a 
 * {@link com.deltax.util.listener.ListenerSupport}.
 *
 * @author Cristiano Sadun
 * @version 1.0
 */
public interface Listener {

	/**
	 * Invoked when a signal is received.
	 * 
	 * @param signal the received signal.
	 */
    public abstract void receive(Signal signal);
}
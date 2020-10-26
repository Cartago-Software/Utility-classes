package com.deltax.util.listener;

import java.util.Date;

/**
 * Copyright (C) 1999,2004 dr. Cristiano Sadun
 * A signal with a time stamp.
 * 
 * @author Cristiano Sadun
 * @version 1.0
 */
public class TimeStampedSignal extends Signal {

	public TimeStampedSignal(Object obj) {
		super(obj);
		time = (new Date()).getTime();
	}

	public long getTime() {
		return time;
	}

	protected long time;
}
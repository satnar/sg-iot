package com.ericsson.cino.assuredplus.singtel.voice;

/**
 * Represents a Window of time used for time schedule rules for a member to a place.
 * 
 * @author esatnar
 */
public class Schedule {
	
	/**
	 * start of the time window; expressed in milliseconds from the UNIX epoch.
	 */
	private long startTime = 0;
	
	/**
	 * end of the time window; expressed in milliseconds from the UNIX epoch.
	 */
	private long endTime = 0;
}

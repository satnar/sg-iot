package com.ericsson.cino.assuredplus.singtel.voice;

public class GeofenceInfo {
	
	/**
	 * pneumonic alias defined by the user for this place.
	 */
	private String placeName = null;
	
	/**
	 * Exact GPS Coordinates defined by the user to identify the place.
	 */
	private GpsLocation gpsCoordinates = null;
	
	/**
	 * Geofence of that location, expressed in meters from the gpsCoordinates considered as the center.
	 */
	private long fenceRadius = 0;

	/**
	 * set only if there is a geofence time rule set and the time window (repersented by this element) expects the
	 * member to be present at this place now.
	 */
	private Schedule presenceWindow = null;
	
	/**
	 * Optional Element, will be available if the service implementation will
	 * perform geo-decode of GPS coordinates to a postal address.
	 */
	private String postalAddress = null;
}

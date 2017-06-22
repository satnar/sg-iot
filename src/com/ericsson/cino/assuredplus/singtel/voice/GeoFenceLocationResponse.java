package com.ericsson.cino.assuredplus.singtel.voice;

public class GeoFenceLocationResponse {

	/**
	 * will be set to true, only if requested place was indeed defined by the user, and the member is currently located
	 * there.
	 */
	private boolean isMemberAtPlace = false;

	/**
	 * will be set to member's current location, if any of the following conditions are met:
	 * <ul>
	 * <li>If the requested place was not defined by the user</li>
	 * <li>If the place is defined but no geofencing is defined for that place</li>
	 * <li>If the place is defined and the geofence rules indicate the member must be present at the place now, but is
	 * currently not lcoated there.</li>
	 * </ul>
	 */
	private GpsLocation gpsCoordinates = null;
	
	/**
	 * will be set if there is a valid geofence defined for the place and the member is expected to be in that place.
	 */
	private GeofenceInfo geofenceInfo = null;

}

package com.ericsson.cino.assuredplus.singtel.voice;

public class GpsLocation {

	/**
	 * Latitude expressed in numeric form (XXX.xxxxxx) relative in GMT line.
	 * Locations west to GMT will thus have negative value.
	 */
	private float latitude = 0;

	/**
	 * Longtitude expressed in numeric form (XXX.xxxxxx) relative in equator
	 * line. Locations south to equator will thus have negative value.
	 */
	private float longitude = 0;

	public GpsLocation(float latitude, float longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}

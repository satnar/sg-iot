package com.ericsson.cino.assuredplus.singtel.voice;

public class LocationResponse {

	/**
	 * Mandatory element, capturing raw data in the form of GPS Coordinates. Refer {@link GpsLocation} for more details.
	 */
	private GpsLocation gpsCoordinates = null;

	/**
	 * a pneumonic alias defined by the assed plus user.
	 * 
	 * optional in {@link IMemberLocation#locateMember(String, String)} if no places are defined or the member is not
	 * located in any of the places defined.
	 */
	private String assuredPlusPlace = null;

	/**
	 * Optional Element, will be available if the service implementation will perform geo-decode of GPS coordinates to a
	 * postal address.
	 */
	private String postalAddress = null;

	public GpsLocation getGpsCoordinates() {
		return gpsCoordinates;
	}

	public void setGpsCoordinates(GpsLocation gpsCoordinates) {
		this.gpsCoordinates = gpsCoordinates;
	}

	public String getAssuredPlusPlace() {
		return assuredPlusPlace;
	}

	public void setAssuredPlusPlace(String assuredPlusPlace) {
		this.assuredPlusPlace = assuredPlusPlace;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

}

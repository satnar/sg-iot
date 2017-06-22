package com.ericsson.cino.assuredplus.singtel.voice;

/**
 * Blueprint for querying location information pertinent to Assured+ solution and usecases.
 * <p>
 * Assured-Plus will expose this interface as a functional service and Singtel will consume the same thru their voice
 * channel application (potentially Amazon Alexa Skill)
 *
 * @author esatnar
 */
public interface IMemberLocation {

	/**
	 * Invoked on behalf of an AssuredPlus user, the method will fetch the current (or last known) location of a member
	 * in the user's cricle(s).
	 * <p>
	 * The response would attempt to present
	 * <ul>
	 * <li>the pnemonic alias (name defined by the user) to a place, if the member is (or in close proximity) to the
	 * place.</li>
	 * <li>If the member is not located in any of the known places, then GPS coordinates shall be returned</li>
	 * <li>Optionally, in all cases, there would be an attempt to geo-decode the GPS coordinates to a human friendly
	 * text address. Googe Geocoding API can be recommended. If this optional element is missing in response, the
	 * invoker can geo-decode the GPS through any GIS services to resolve the textual address at the client side.</li>
	 * </ul>
	 * 
	 * @param apUserId
	 *            unique identity to the user in assured plus platform (mobile or email, based on their registration)
	 * @param memberName
	 *            name of the member/friend to be located
	 * @return member's location info with 3 possible forms described. Refer {@link LocationResponse} for structure.
	 * @throws ServiceException
	 *             indicates and explains any faults/ errors as to why the request could not be processed functionally.
	 * @see {@link LocationResponse} for response structure.
	 */
	LocationResponse locateMember(String apUserId, String memberName) throws ServiceException;

	/**
	 * Invoked on behalf of an AssuredPlus user, the method will use any geofence info defined for places to respond.
	 * <p>
	 * The implementation must be loosely aligned to the expected behaviour below:
	 * <ul>
	 * <li>If the assured plus user has defined any geofence (and time rules) that is linked to member in
	 * context...</li>
	 * <li>If the member is expected to be in the place (based on geofence info)...
	 * <ul>
	 * <li>and the member is indeed in that geofence, then a positive acknowledgement & geofence info be set in
	 * response</li>
	 * <li>and the member is not in the place, then a negative acknowledgement & geofence info be set in the
	 * response</li>
	 * </ul>
	 * <li>If there are no places or valid geofences (time rules to that member does not apply), then a simple negative
	 * acknowledge in response</li>
	 * </ul>
	 * 
	 * @param apUserId
	 *            unique identity to the user in assured plus platform (mobile or email, based on their registration)
	 * @param memberName
	 *            name of the member/friend to be located
	 * @param place
	 *            a pneumonic alias defined by the assured plus user in context.
	 * @return member's location info with geofence info
	 * @throws ServiceException
	 *             indicates and explains any faults/ errors as to why the request could not be processed functionally.
	 * @see GeoFenceLocationResponse for response structure
	 */
	GeoFenceLocationResponse isMemberAt(String apUserId, String memberName, String place) throws ServiceException;

	/**
	 * Invoked on behalf of an AssuredPlus user, the method will query the definition of the place to be read out to the user.
	 * 
	 * @param apUserId
	 *            unique identity to the user in assured plus platform (mobile or email, based on their registration)
	 * @param place
	 *            a pneumonic alias defined by the assured plus user in context.
	 * @return location info with 3 possible forms described in {@link #locateMember(String, String)}. Refer {@link LocationResponse} for structure.
	 * @throws ServiceException
	 *             indicates and explains any faults/ errors as to why the request could not be processed functionally.
	 * @see {@link LocationResponse} for response structure.
	 */
	LocationResponse definePlace(String apUserId, String place) throws ServiceException;
	
}

package com.jaypee.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.codehaus.jettison.json.JSONArray;

@Path("/v1/logon")
public class V1_logon {

	private static final String api_version = "00.01.00"; // version of the api

	/**
	 * This method sits at the root of the api. It will return the name of this
	 * api.
	 * 
	 * @return String - Title of the api
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}

	/**
	 * This method will return the version number of the api Note: this is
	 * nested one down from the root. You will need to add version into the URL
	 * path.
	 * 
	 * Example: http://localhost:7001/com.jaypee.rest/api/v1/logon/version
	 * 
	 * @return String - version number of the api
	 */
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p>Version:</p>" + api_version;
	}

	// /**
	// * This method will connect to the oracle database and return the
	// date/time stamp.
	// * It will then return the date/time to the user in String format
	// *
	// * This was explained in Part 3 of the Java Rest Tutorial Series on
	// YouTube
	// *
	// * Pre-episode 6, updated because Oracle308tube.java no longer accessible.
	// *
	// * @return String - returns the database date/time stamp
	// * @throws Exception
	// */
	// @Path("/database")
	// @GET
	// @Produces(MediaType.TEXT_HTML)
	// public String returnDatabaseStatus() throws Exception {
	//
	// String myString = null;
	// String returnString = null;
	// JSONArray json = new JSONArray();
	//
	// try {
	//
	// Schema308tube dao = new Schema308tube();
	//
	// json = dao.queryCheckDbConnection();
	// myString = json.toString();
	//
	// returnString = "<p>Database Status</p> " +
	// "<p>Database Date/Time return: " + myString + "</p>";
	//
	// }
	// catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return returnString;
	// }

}
